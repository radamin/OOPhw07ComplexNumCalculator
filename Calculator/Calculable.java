package OOPhw07ComplexNumCalculator.Calculator;

import OOPhw07ComplexNumCalculator.ComplexNum;

public interface Calculable {
    Calculable sum(ComplexNum complexNum);

    Calculable multi(ComplexNum complexNum);

    ComplexNum getResult();
}