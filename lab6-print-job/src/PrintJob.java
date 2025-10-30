
class PrintJob  {
    private String documentName;
    private int pageCount;

    // TODO: Implement the constructor
    public PrintJob(String documentName, int pageCount) {
        // Your code here
        this.documentName = documentName;
        this.pageCount = pageCount;
    }


    @Override
    public String toString() {
        return documentName + " with " + pageCount + " pages"; 
    }
}