package business;

/**
 *
 * @author Xiaowen Li
 */
public class Car 
{
    // 1. no public instance veriable
    private int carId; 
    private String model; 
    private int year; 
    private String color; 
    
    // 2. no argument constructor
    public Car(){}
    
    // optional constructor
    public Car(int carId, String model, int year, String color)
    {
        this.carId = carId; 
        this.model = model; 
        this.year = year;
        this.color = color;
    }

    // 3. a setter and a getter per each attribute
    public int getCarId()
    {
        return carId;
    }

    public void setCarId(int carId)
    {
        this.carId = carId;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

}
