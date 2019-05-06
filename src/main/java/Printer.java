public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public int paperTotal() {
        return paper;
    }

    public int tonerTotal() {
        return toner;
    }

    public void print(int pages, int copies) {
        int totalPaper = pages * copies;
        int totalToner = pages * copies;

        if (totalPaper <= paper && totalToner <= paper) {
            paper -= totalPaper;
            toner -= totalToner;
            System.out.println("Printing " + totalPaper + " copies");
        } else {
            System.out.println("Printer out of paper");
        }
    }

    public void refillPaper() {
        paper = 100;
    }

    public void refillToner() {
        toner = 200;
    }
}
