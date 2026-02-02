public class Complex {

    private double real;
    private double imaginary;
    
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex add(Complex c2) {
        return new Complex(this.real + c2.real, this.imaginary + c2.imaginary);
    }

    public Complex add(double real) {
        return new Complex(this.real + real, this.imaginary);
    }

    public Complex subtract(Complex c2) {
        return new Complex(this.real - c2.real, this.imaginary - c2.imaginary);
    }

    public Complex subtract(double real) {
        return new Complex(this.real - real, this.imaginary);
    }

    public Complex multiply(Complex c6) {
        return new Complex((this.real * c6.real) + ( -1 * (this.imaginary * c6.imaginary)), (this.imaginary * c6.real) + (this.real * c6.imaginary));
    }

    public Complex multiply(double real) {
        return new Complex(real * this.real, real * this.imaginary);
    }

    public Complex divide(Complex c6) {
        double c = c6.real;
        double d = c6.imaginary;
        double denominator = c * c + d * d;

        double newReal = (this.real * c + this.imaginary * d) / denominator;
        double newImaginary = (this.imaginary * c - this.real * d) / denominator;

        return new Complex(newReal, newImaginary);
    }

    public Complex divide(double real) {
        return new Complex(this.real / real, this.imaginary / real);
    }

    public Complex square() {
        return new Complex((this.real * this.real) - (this.imaginary * this.imaginary), 2 * this.real * this.imaginary);
    }

    public double abs() {
        return Math.sqrt((this.real * this.real) + (this.imaginary * this.imaginary));
    }

    public boolean equals(Complex c7){
        return (this.real == c7.real) && (this.imaginary == c7.imaginary);
    }

    public String toString() {
        if (imaginary == 0) {
            return String.valueOf(real);
        }
        if (real == 0) {
            return String.valueOf(imaginary) + "i";
        }
        if (imaginary < 0) {
            return real + " - " + Math.abs(imaginary) + "i";
        }
        return real + " + " + imaginary + "i";
    }

}
