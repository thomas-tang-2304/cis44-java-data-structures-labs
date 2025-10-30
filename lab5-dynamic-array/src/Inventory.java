import java.util.ArrayList;
import java.util.List;
import java.util.Iterator; 

public class Inventory { 
    private List<Item> items; 
    public Inventory() { 
        this.items = new ArrayList<>(); 
    } 
    public void addItem(Item item) { 
        items.add(item);
    } 

    public int getSize() { 
        return items.size(); 
    }

    public void display() { 
        Iterator<Item> iter = items.iterator(); 
        while (iter.hasNext()) { 
            System.out.print(iter.next().getName());
            if (iter.hasNext()) System.out.print( " -> ");
            else System.out.print( "\n");
        } 
    } 

    public void combineItems(String name1, String name2) { 
        boolean found1 = false; 
        boolean found2 = false; 
       

        Iterator<Item> iter = items.iterator(); 
        while (iter.hasNext()) { 
            Item current = iter.next(); 
            // How do you track which item you found? 
            // How do you remove it safely? 
            if (current.getName().equals(name1)) { 
                found1 = true;
                

            } 

            if (current.getName().equals(name2)) { 
                found2 = true;
               
            } 
        } 

        iter = items.iterator(); 
        while (iter.hasNext()) { 
            Item current = iter.next(); 
            if ((found1 && found2) && (current.getName().equals(name1) || current.getName().equals(name2))) {
                iter.remove();
            }
        } 

        if (found1 && found2) { 
            System.out.println(name1 + " " + name2); 
           
        } else { 
            if (!found1) System.out.println(name1 + " not found in inventory."); 
            if (!found2) System.out.println(name2 + " not found in inventory."); 
        }

  
    } 
}