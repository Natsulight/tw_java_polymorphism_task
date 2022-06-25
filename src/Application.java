import model.BlackWhitePrinter;
import model.ColorPrinter;

public class Application {
    public static void main(String[] args) {
        ColorPrinter colorPrinter = new ColorPrinter();
        colorPrinter.printing("Red");
        BlackWhitePrinter blackWhitePrinter = new BlackWhitePrinter();
        blackWhitePrinter.printing();
    }
}
