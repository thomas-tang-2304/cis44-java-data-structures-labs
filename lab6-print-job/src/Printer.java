
public class Printer {
    private LinkQueue<PrintJob> jobQueue;

    public Printer() {
        // TODO: Initialize the jobQueue with a LinkedQueue
        jobQueue = new LinkQueue<>();
    }

    /**
     * Adds a new print job to the rear of the queue.
     * @param job The print job to add.
     */
    public void addJob(PrintJob job) {
        System.out.println("Adding to queue: " + job);
        jobQueue.add(job);
    }



    /**
     * Processes the job at the front of the queue.
     */
    public void processNextJob() {
        if (jobQueue.peek() != null){
            System.out.println("Working at: " + jobQueue.peek());
            jobQueue.remove();
            // System.out.println("Process to next job: " + (jobQueue.peek() == null ? "" : jobQueue.peek()));
        } else {
            System.out.println("Waiting for new print documents......");
        }
    }

    public static void main(String[] args) {
        Printer officePrinter = new Printer();

        officePrinter.addJob(new PrintJob("Annual_Report.pdf", 25));
        officePrinter.addJob(new PrintJob("Meeting_Agenda.docx", 2));
        officePrinter.addJob(new PrintJob("Presentation_Slides.pptx", 30));
        System.out.println("\n--- Starting to Print ---");
        officePrinter.processNextJob(); // Should print Annual_Report.pdf
        officePrinter.processNextJob(); // Should print Meeting_Agenda.docx

        System.out.println("\nNew high-priority job arrives...");
        officePrinter.addJob(new PrintJob("Urgent_Memo.pdf", 1));

        officePrinter.processNextJob(); // Should print Presentation_Slides.pptx
        officePrinter.processNextJob(); // Should print Urgent_Memo.pdf
        officePrinter.processNextJob(); // Should say the queue is empty
    }
}
