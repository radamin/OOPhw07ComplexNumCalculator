package OOPhw07ComplexNumCalculator;

import OOPhw07ComplexNumCalculator.Calculator.ICalculableFactory;
import OOPhw07ComplexNumCalculator.Logs.Log;
import OOPhw07ComplexNumCalculator.Logs.LogCalculableFactory;
import OOPhw07ComplexNumCalculator.ViewCalculator.ViewCalculator;

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new Log());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}