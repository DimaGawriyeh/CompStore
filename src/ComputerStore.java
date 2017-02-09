import java.util.ArrayList;
import java.util.Iterator;

public class ComputerStore 
{
    private ArrayList<Computer> computers; //Array list to store the computers
    private ArrayList<Component> components; //Array list to store the components

    /**
     * Create a Computer store
     */
    public ComputerStore() 
    {
       computers=new ArrayList<>();    
       components= new ArrayList<>();   
    }

    /**
     * The addComputer method adds a computer to the store
     * @param computer is the computer to be added
     * @return true if the computer has been added, false otherwise
     */
    public boolean addComputer(Computer computer)
    { 
       return computers.add(computer);
    }

    /** 
     * The removeComputer method removes a computer from the store 
     * @param computer is the computer to be removed
     * @return true if the computer has been removed, false otherwise
     */
    public boolean removeComputer(Computer computer) 
     { 
       boolean removed=computers.isEmpty();
       if(removed)
       {   
             System.out.println("There is already no computers in the store");
       }
       else
       {
            computers.remove(computer);
       }
    
       return removed;
    }

    /**
     * The printAllComputers method prints the details of every computer in the store
     */
    public void printAllComputers() 
    {
       for(Computer computer:computers)
       {
            computer.printComputerDetails();
       }
    }

    /**
     * The printTotalValue method prints the total value of all the computers in the store
     */
    public void printTotalValue() 
    {
      int sum=0;
      for(Computer computer:computers)
      {
          sum+=computer.getTotalValue();
      }
     System.out.println("Total value is: "+sum); 
    }

   /** 
    * The findMostExpensive method finds the most expensive computer in the store 
    * @return the most expensive computer in the store 
    */
    public Computer findMostExpensiveComputerV1() 
    { 
       Computer computer= new Computer();    
       int currentMostExpensive=0;
       int index=0;
       for(int i=0;i<computers.size();i++)
       {
           computer=computers.get(i);
           int value=computer.getTotalValue();
           if(value>currentMostExpensive)
           {
               currentMostExpensive=value;
               index=i;
           }
        
        }
    return     computers.get(index);
    } 

   /** 
    * The findMostExpensive method finds the most expensive computer in the store 
    * @return the most expensive computer in the store 
    */
    public Computer findMostExpensiveComputerV2() 
    { 
        Computer computer= new Computer();    
        int currentMostExpensive=0;
        int index=0;
        while(index<computers.size())
        {   
            Computer computer1=computers.get(index);
            int value=computer1.getTotalValue();
            if(value>currentMostExpensive)
            {
                computer=computers.get(index);
                currentMostExpensive=value;
            }
            index++;
        }
        return computer;
    } 

    /**
     * The findMostExpensive method method finds the most expensive computer in the store 
     * @return the most expensive computer in the store 
     */
    public Computer findMostExpensiveComputerV3()
    { 
        Computer computer1= new Computer();    
        int currentMostExpensive=0;
        int index=0;
        for(Computer computer: computers)
        {
            int value=computer.getTotalValue();
            if(value>currentMostExpensive)
            {
                computer1=computers.get(index);
                currentMostExpensive=value;
            }
           index++;
        }
        return computer1;
     } 

    /** 
     * The findMostExpensive method method finds the most expensive computer in the store 
     * @return the most expensive computer in the store 
     */
    public Computer findMostExpensiveComputerV4()
    {     
        int currentMostExpensive=0;
        Iterator<Computer> it= computers.iterator();
        Computer computer1= new Computer();
        while(it.hasNext())
        {
            Computer computer=it.next();
            int value=computer.getTotalValue();
            if(value>currentMostExpensive)
            {
                computer1=computer;
                currentMostExpensive=value;
            } 
        }
        return computer1;
    }

    /**
     * The totalCostOfComponents calculates and prints the cost of all the components in the store
     * @return the total cost of the components
     */
    public int totalCostOfComponents() 
    { 
        int totalValue=0;
        for(Component component: components)
        {
            totalValue+=component.getCost();
        }  
        System.out.println("The total value of the components is "+totalValue);
        return totalValue;
    }

    /**
     * The addComponent method adds a component to the store
     * @param component is the component to be added
     */
     public void addComponent(Component component)
    {
        components.add(component);
    }

    /** 
     * The removeComponent method removes a component from the store 
     * @param component is the component to be removed
     * @return true if the component has been removed, false otherwise
     */
    public boolean removeComponent(Component component) 
    { 
        boolean removed=components.isEmpty();
        if(removed)
        {   
            System.out.println("There is already no components in the store");
        }
        else
        {
            components.remove(component);
        }
    
        return removed;
    }

    /**
    * The totalCostOfComponents calculates and prints the cost of all the components of a specific type in the store
    * @param component_type the specific type of component
    * @return the total cost of the components
    */
    public int totalCostOfComponents(String component_type)
    {   
        int totalValue=0;
        for(Component component: components)
        {
            if(component.getClass().getName().contains(component_type))
            {
                totalValue+=component.getCost();
                    
            }  
        }
        System.out.println("The total value of the "+component_type+ " is "+totalValue);
        return totalValue;
    }

    }
