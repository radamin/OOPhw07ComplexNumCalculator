package OOPhw07ComplexNumCalculator.Calculator;

import OOPhw07ComplexNumCalculator.ComplexNum;

public interface ICalculableFactory {
    Calculable create(ComplexNum primaryArg);
}