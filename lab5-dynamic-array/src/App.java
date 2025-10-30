

public class App {
    public static void main(String[] args) throws Exception {
        Inventory inventory = new Inventory();
        inventory.addItem(new Item("Sword"));
        inventory.addItem(new Item("Shield"));         
        inventory.addItem(new Item("Health Potion"));
        inventory.addItem(new Item("Magic Staff"));
        inventory.addItem(new Item("Dragon Ball"));

        // System.out.println(inventory.getSize());
        inventory.display();

        inventory.combineItems("Sword", "Magic Staff" );

        inventory.display();

        inventory.combineItems("Dragon Ball", "Health Potion" );

        inventory.display();

        inventory.combineItems("Shield", "Magic Staff" );

        inventory.display();
    }
}
