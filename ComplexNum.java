package OOPhw07ComplexNumCalculator;

public class ComplexNum {
    double validPart;
    double imagePart;

    public ComplexNum(double validPart, double imagePart) {
        this.validPart = validPart;
        this.imagePart = imagePart;
    }

    public double getValidPart() {
        return validPart;
    }

    public double getImagePart() {
        return imagePart;
    }

    @Override
    public String toString() {
        return String.format("%.3f + %.3fi", validPart, imagePart);
    }
}