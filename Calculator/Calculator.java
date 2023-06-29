package OOPhw07ComplexNumCalculator.Calculator;

import OOPhw07ComplexNumCalculator.ComplexNum;

public class Calculator implements Calculable {

    private ComplexNum primaryArg;

    public Calculator(ComplexNum primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable sum(ComplexNum complexNum) {
        primaryArg = new ComplexNum(primaryArg.getValidPart() + complexNum.getValidPart()
                , primaryArg.getImagePart() + complexNum.getImagePart());
        return this;
    }

    @Override
    public Calculable multi(ComplexNum complexNum) {
        primaryArg = new ComplexNum(primaryArg.getValidPart() * complexNum.getValidPart()
                + primaryArg.getImagePart() * complexNum.getImagePart() * -1
                , primaryArg.getValidPart() * complexNum.getImagePart()
                + primaryArg.getImagePart() * complexNum.getValidPart());
        return this;
    }

    @Override
    public ComplexNum getResult() {
        return primaryArg;
    }

}