/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import business.Car;
import data.CarDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Xiaowen Li
 */
public class AddCar extends HttpServlet
{

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        response.setContentType("text/html;charset=UTF-8");
        
        // get data from the carForm.jsp
        String carId = request.getParameter("carId");
        String model = request.getParameter("model");
        String year = request.getParameter("year");
        String color = request.getParameter("color");

        // validate the data
        String msg;
        if (carId.trim().length() == 0)
        {
            msg = "The car ID cannot be empty. Please enter a car ID.";
            request.setAttribute("msg", msg);
            RequestDispatcher rd1 = request.getRequestDispatcher("/carForm.jsp");
            rd1.include(request, response);
        } else if (model.trim().length() == 0) 
        {
            msg = "The car model cannot be empty. Please enter a car model.";
            request.setAttribute("msg", msg);
            RequestDispatcher rd2 = request.getRequestDispatcher("/carForm.jsp");
            rd2.include(request, response);
        } else if (year.trim().length() == 0) 
        {
            msg = "The car year cannot be empty. Please enter a car year.";
            request.setAttribute("msg", msg);
            RequestDispatcher rd3 = request.getRequestDispatcher("/carForm.jsp");
            rd3.include(request, response);
        } else if (color.trim().length() == 0) 
        {
            msg = "The car color cannot be empty. Please enter a car color.";
            request.setAttribute("msg", msg);
            RequestDispatcher rd4 = request.getRequestDispatcher("/carForm.jsp");
            rd4.include(request, response);
        } else
        {
            //create a car object to keep these data
            Car myCar = new Car(Integer.parseInt(carId), model, Integer.parseInt(year), color);

            // inject (insert) myCar object into the request object
            //send the object to the insert method to insert it into the car table
            int c = CarDB.insert(myCar);
                        
            // to be ready for the forward process to the JSP page
            request.setAttribute("myCarHolder", myCar);
            // forward the object to the jsp page
            RequestDispatcher rd = request.getRequestDispatcher("/jspAddCar.jsp");
            rd.forward(request, response);
        
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        try
        {
            processRequest(request, response);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(AddCar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            Logger.getLogger(AddCar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            Logger.getLogger(AddCar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        try
        {
            processRequest(request, response);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(AddCar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            Logger.getLogger(AddCar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            Logger.getLogger(AddCar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
