public class Display extends Component 
{
    private int size;
    
     /**
     * Create a Display
     * Set the manufacturer, the cost and size
     */
    public  Display(String manufacturer,int cost, int size)
    {
       super(manufacturer,cost);    
       this.size=size;
    
    }
    public void setSize(int size)
    {
       this.size=size;
    }
    
    public int getSize()
    {
       return size;
    }
    
     /**
     * @return a string with all the infomation about this display
     */
    public String getDescription()
    {
        String componentName="Display:";
        String superClassDetails=super.getDescription();
        String completeDetails=componentName+superClassDetails+"The size is "+getSize();
        return completeDetails;
    }
}