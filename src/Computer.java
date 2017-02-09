import java.util.HashMap;

public class Computer 
{
    private HashMap<String, Component>  configuration; // Hash map to store computer´s hardware
    private int totalCost;
    
    /**
     * Create a Computer
     */
    public Computer()
    {
       configuration=new HashMap<>();
       totalCost=0;
    }
    
    /**
     * The addComponent method adds a component to the computer
     * @param name component´s name
     * @param c the component to be added
     */
    public void addComponent(String name, Component c)
    {
        configuration.put(name, c);
    }
    
    /**
     * The removeComponent method removes a component from the computer
     * @param name component´s name
     * @return the component that has been removed
     */
    public Component removeComponent(String name)
    {
        return configuration.remove(name);
    }
    
    /**
     * The getTotalValue method calculates the cost of all the components in the computer
     * @return the total cost of the components
     */
    public int getTotalValue()
    {
        int componentCost;
        for(Component component: configuration.values())
        {
            componentCost=component.getCost();
            totalCost+=componentCost;
        }
        return totalCost;
    }
    
    /**
     * The printComputerDetails method prints information about the computer´s components
     */
    public void printComputerDetails()
    {
         for(Component component: configuration.values())
        {
           
            String ComponentDescription= component.getDescription();
            System.out.println(ComponentDescription);
       
        }
    }
    
    /**
     * The printTotalValue method prints the cost of all the components in the computer
     */
    public void printTotalValue()
    {
        System.out.println("The total cost is "+getTotalValue());
    }
    
    public void printDetails()
    {
        printComputerDetails();
        printTotalValue();
    }
}
