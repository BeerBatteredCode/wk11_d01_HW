import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 200);
    }

    @Test
    public void checkPaperTotal() {
        assertEquals(100, printer.paperTotal());
    }

    @Test
    public void checkTonerTotal() {
        assertEquals(200, printer.tonerTotal());
    }

    @Test
    public void printPossible() {
        printer.print(10, 2);
        assertEquals(80, printer.paperTotal());
    }

    @Test
    public void printNotPossible() {
        printer.print(30, 4);
        assertEquals(100, printer.paperTotal());
        assertEquals(200, printer.tonerTotal());
    }

    @Test
    public void checkPaperRefill() {
        printer.print(10, 2);
        printer.refillPaper();
        assertEquals(100, printer.paperTotal());
    }

    @Test
    public void checkTonerRefill() {
        printer.print(30, 3);
        printer.refillToner();
        assertEquals(200, printer.tonerTotal());
    }

    @Test
    public void checkTonerDepletion() {
        printer.print(10, 2);
        assertEquals(180, printer.tonerTotal());
    }
}
