public class Printer {
    private String queue = "";
    private int pageInQueue;
    private int printedPages;


    public void append(String text, String name, int pageCount) {
        queue = queue + "\n" + text + " - " + name + "\n";
        pageInQueue = pageInQueue + pageCount;
    }

    public void append(String text, String name) {
        queue = queue + "\n" + text + " - " + name;
        pageInQueue += 1;
    }

    public void append(String text) {
        pageInQueue += 1;
        queue = queue  + "\nДокумент без имени " + text;


    }

    public void append(String text, int pageCount) {
        queue = queue + " \n" + "док без имени " + text;
        pageInQueue = pageInQueue + pageCount;

    }
    public void clear() {
        queue = "";
        pageInQueue = 0;
    }

    public void printPrinter() {
        printedPages = printedPages + pageInQueue;
        System.out.println(queue);
        clear();


    }

    public int getPendingQueue() {
        return pageInQueue;
    }

    public int getPrintedPages() {
        return printedPages;
    }
}
