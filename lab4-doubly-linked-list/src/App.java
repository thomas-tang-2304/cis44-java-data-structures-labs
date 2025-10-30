public class App {
    public static void main(String[] args) throws Exception {


        TextEditor editor = new TextEditor();
        
        editor.add("Hi, there!");
        editor.add("My name is Joe");
        editor.printCurrent(); 
        editor.add("Nice to meet you");
        editor.printCurrent(); 

        System.out.println(editor.undo()); 
        editor.add("My name is Alina");
        editor.printCurrent(); 
        System.out.println(editor.undo()); 
    }
}
