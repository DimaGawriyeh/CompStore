import java.lang.String;

public abstract class Component
{
    private String manufacturer;
    private int cost;
    
    /**
     * Create a Component
     */
    public Component()
    {    
    }
    
    /**
     * Create a Component 
     * Set the manufacturer and cost
     */ 
    public Component(String manufacturer,int cost)
    {
        this.manufacturer=manufacturer;
        this.cost=cost;
    }
    
    public void setCost(int cost)
    {
        this.cost=cost;
    }
    
    public int getCost()
    {
        return cost;
    }
    
    /**
     * @return a string with all the infomation about this component
     */
    public String getDescription()
    {
        String str=" The cost is "+getCost()+" The manufacturer is "+getManufacturer()+" ";
        return str;
    }
    
    public String getManufacturer() 
    {
        return manufacturer;
    }
    
    public void setManufacturer(String manufacturer)
    {
        this.manufacturer=manufacturer;
    }
}
