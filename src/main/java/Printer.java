//        Create a class and demonstrate proper encapsulation techniques
//        the class will be called Printer
//        It will simulate a real Computer printer
//        It should have fields for toner level, number of pages printed, and also
//        whether its a duplex printer (capable of printing on both sides of the paper).
//        Add methods to fill up the toner (up to a maximum of 100%), another method to
//        simulate printing a page(which should increase the number of pages printed).
//        Decide on the scope, whether to use constructors, and anything else you think is needed.

public class Printer {
    private int tonerLevel;
    private int numberPrintedPages;
    private int numbersOfPagesforPrinting;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int numberPrintedPages, int numbersOfPagesforPrinting, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.numberPrintedPages = numberPrintedPages;
        this.numbersOfPagesforPrinting = numbersOfPagesforPrinting;
        this.duplexPrinter = duplexPrinter;
    }

    public void tonerState() {
        if (tonerLevel > 0) {
            System.out.println("The printer is ready to work.");
        } else {
            System.out.println("Fill the toner, please.");
        }
    }

    public boolean isTheDuplexPrinter() {
        if (duplexPrinter = true) {
            System.out.println("Would you like print your document in the duplex format?");

        } else {
            System.out.println("This printer has no a duplex option.");
        }
        return isTheDuplexPrinter();
    }

    public void printerPrints() {
        for (int numberPrintedPages = 0; numberPrintedPages < numbersOfPagesforPrinting; numberPrintedPages++) {
            System.out.println("The quantity printed pages is: " + numberPrintedPages);
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getNumberPrintedPages() {
        return numberPrintedPages;
    }

    public void setNumberPrintedPages(int numberPrintedPages) {
        this.numberPrintedPages = numberPrintedPages;
    }

    public int getNumbersOfPagesforPrinting() {
        return numbersOfPagesforPrinting;
    }

    public void setNumbersOfPagesforPrinting(int numbersOfPagesforPrinting) {
        this.numbersOfPagesforPrinting = numbersOfPagesforPrinting;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public void setDuplexPrinter(boolean duplexPrinter) {
        this.duplexPrinter = duplexPrinter;
    }
}
