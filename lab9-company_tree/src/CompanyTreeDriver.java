
public class CompanyTreeDriver {
    public static void main(String[] args) {
        // 1. Build the Tree
        // Create the root node (e.g., "CEO")
        GeneralTreeNode root = new GeneralTreeNode("CEO");

        // Create department heads (children of root)
        GeneralTreeNode vpSales = new GeneralTreeNode("VP of Sales");
        GeneralTreeNode vpEngineering = new GeneralTreeNode("VP of Engineering");
        root.addChild(vpSales);
        root.addChild(vpEngineering);



        // --- TO BE COMPLETED BY STUDENT ---
        // Add more nodes to build the following hierarchy:
        //
        // CEO
        //  |-- VP of Sales
        //  |    |-- Sales Manager (NA)
        //  |    |-- Sales Manager (EU)
        //  |
        //  |-- VP of Engineering
        //       |-- Dev Team Lead
        //       |    |-- Developer 1
        //       |    |-- Developer 2
        //       |
        //       |-- QA Team Lead

        // Example for "VP of Sales" children:
        // GeneralTreeNode salesNA = new GeneralTreeNode("Sales Manager (NA)");
        // GeneralTreeNode salesEU = new GeneralTreeNode("Sales Manager (EU)");
        // vpSales.addChild(salesNA);
        // vpSales.addChild(salesEU);
        
        // ... add children for "VP of Engineering" ...


        // Create 2 sales Managers
        GeneralTreeNode saleMng1 = new GeneralTreeNode("Sales Manager (NA)");
        GeneralTreeNode saleMng2 = new GeneralTreeNode("Sales Manager (EU)");
        // Add 2 sales Managers to VP of Sales's children list
        vpSales.addChild(saleMng1);
        vpSales.addChild(saleMng2);

        // Create Dev Team Lead
        GeneralTreeNode devLead = new GeneralTreeNode("Dev Team Lead");


        // Add to Dev Team Lead's Children list
        devLead.addChild(new GeneralTreeNode("Developer 1"));
        devLead.addChild(new GeneralTreeNode("Developer 2"));

        // Create QA team lead
        GeneralTreeNode QA = new GeneralTreeNode("QA Team Lead");
        

        // Add QA team lead and dev team lead to VP of Engineering
        vpEngineering.addChild(devLead);
        vpEngineering.addChild(QA);


        // 2. Perform Traversals
        System.out.println("--- Preorder Traversal (Company Hierarchy) ---");
        root.traversePreorder();

        System.out.println("\n--- Postorder Traversal (Staff Roll Call) ---");
        root.traversePostorder();
    }
}