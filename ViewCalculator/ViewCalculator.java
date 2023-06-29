package OOPhw07ComplexNumCalculator.ViewCalculator;

import OOPhw07ComplexNumCalculator.Calculator.Calculable;
import OOPhw07ComplexNumCalculator.Calculator.ICalculableFactory;
import OOPhw07ComplexNumCalculator.ComplexNum;

import java.util.Scanner;

public class ViewCalculator {

    private final ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public ComplexNum createComplexNum() {
        double primaryArgValid = promtDouble("Enter the valid part for new complex number: \t");
        double primaryArgImage = promtDouble("Enter the imaginary part for new complex number: \t");
        return new ComplexNum(primaryArgValid, primaryArgImage);
    }

    public void run() {
        while (true) {
            Calculable calculator = calculableFactory.create(createComplexNum());
            while (true) {
                String cmd = promt("Enter your command (+, *, = ) \t");
                if (cmd.equals("+")) {
                    calculator.sum(createComplexNum());
                    continue;
                }
                if (cmd.equals("*")) {
                    calculator.multi(createComplexNum());
                    continue;
                }
                if (cmd.equals("=")) {
                    System.out.println("Result: \t" + calculator.getResult());
                    break;
                }
            }
            String cmd = promt("Let's count some more! Y/N \t");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String promt(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.print(message);
        return scan.nextLine().toUpperCase();
    }

    private double promtDouble(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.print(message);
        return scan.nextDouble();
    }
}