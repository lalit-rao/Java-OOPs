package LabRecord;

public class R_ComplexNumber {
    private double r;
    private double i;

    public R_ComplexNumber() {
        this.r = 0.0;
        this.i = 0.0;
    }

    public R_ComplexNumber(double real, double imag) {
        this.r = real;
        this.i = imag;
    }

    public void setComplexNumber(double real, double imag) {
        this.r = real;
        this.i = imag;
    }

    public void displayComplexNumber() {
        System.out.println(r + " + " + i + "i");
    }

    public R_ComplexNumber add(R_ComplexNumber other) {
        double newReal = this.r + other.r;
        double newImag = this.i + other.i;
        return new R_ComplexNumber(newReal, newImag);
    }

    public R_ComplexNumber subtract(R_ComplexNumber other) {
        double newReal = this.r - other.r;
        double newImag = this.i - other.i;
        return new R_ComplexNumber(newReal, newImag);
    }

    public R_ComplexNumber multiply(R_ComplexNumber other) {
        double newReal = (this.r * other.r) - (this.i * other.i);
        double newImag = (this.r * other.i) + (this.i * other.r);
        return new R_ComplexNumber(newReal, newImag);
    }

    public static void main(String[] args) {
        R_ComplexNumber n1 = new R_ComplexNumber(3.0, 4.0);
        R_ComplexNumber n2 = new R_ComplexNumber(1.0, 2.0);

        System.out.print("Number 1: ");
        n1.displayComplexNumber();
        System.out.print("Number 2: ");
        n2.displayComplexNumber();

        R_ComplexNumber sum = n1.add(n2);
        System.out.print("Sum: ");
        sum.displayComplexNumber();

        R_ComplexNumber difference = n1.subtract(n2);
        System.out.print("Difference: ");
        difference.displayComplexNumber();

        R_ComplexNumber product = n1.multiply(n2);
        System.out.print("Product: ");
        product.displayComplexNumber();
    }
}
