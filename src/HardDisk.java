

    public class HardDisk extends Component
{
    private int size;
    
    /**
     * Create a Hard disk
     * Set the manufacturer, the cost and size
     */
    public  HardDisk(String manufacturer,int cost, int size)
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
     * @return a string with all the infomation about this hard disk
     */
    public String getDescription()
    {
        String componentName="HardDisk:";
        String superClassDetails=super.getDescription();
        String completeDetails=componentName+superClassDetails+"The size is "+getSize();
        return completeDetails;
    }
}
    

