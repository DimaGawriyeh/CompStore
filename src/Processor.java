
public class Processor extends Component
{
    private double clockspeed;
    
   /**
    * Create a Processor 
    * Set the manufacturer, the clock speed and cost
    */ 
    public Processor(String manufacturer, double clockspeed,int cost)
    {
       super(manufacturer,cost);
       this.clockspeed=clockspeed;
    
    }
    
    public void setClockSpeed(double clockspeed)
    {
       this.clockspeed=clockspeed;
    }
    
    
    public double getClockSpeed()
    {
        return clockspeed;
    }
    
    /**
     * @return a string with all the infomation about this processor
     */
    public String getDescription()
    {   String componentName="Processor:";
        String superClassDetails=super.getDescription();
        String completeDetails=componentName+superClassDetails+"The clock speed is "+getClockSpeed();
        return completeDetails;
    }
}

