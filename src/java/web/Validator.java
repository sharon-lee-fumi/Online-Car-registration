/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Xiaowen Li
 */
public class Validator extends HttpServlet
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
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        
        // get login data from the mylogin.html
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String status = request.getParameter("status");
 
        // validate the data
        String msg;
        // check if the username is not null
        if(username.trim().length() == 0) // trim() is to remove spaces
        {
            msg = "The username cannot be empty. Please enter username！";
            request.setAttribute("msg", msg);
            RequestDispatcher rd1 = request.getRequestDispatcher("/myLogin.jsp");
            rd1.include(request, response);
        }
        
        // check if the password is not null
        else if(password.trim().length() == 0) // trim() is to remove spaces
        {
            msg = "The password cannot be empty. Please enter password！";
            request.setAttribute("msg", msg);
            RequestDispatcher rd2 = request.getRequestDispatcher("/myLogin.jsp");
            rd2.include(request, response);
        }
       
        else if(username.equals("srv") && password.equals("Sheridan") && status.equals("admin"))
        {
            // forwared the request to the adminMenu.jsp
            RequestDispatcher rd3 = request.getRequestDispatcher("/adminMenu.jsp");
            rd3.forward(request, response);
        }
        else if(username.equals("root") && password.equals("sesame") && status.equals("sales"))
        {
            //forwared the request to the salesMenu.jsp
            RequestDispatcher rd4 = request.getRequestDispatcher("/salesMenu.jsp");
            rd4.forward(request, response);
        }
        else
        {
            // include an error message in a dialog box
            msg = "The username or password or status is wrong. Please enter valid user data！";
            request.setAttribute("msg", msg);
            RequestDispatcher rd5 = request.getRequestDispatcher("/myLogin.jsp");
            rd5.include(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
