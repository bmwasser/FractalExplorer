public class Mandelbrot {

    public static int IterationLimit;

    public static int testPoint(Complex c){
        Complex z = new Complex(0, 0);
        for (int i = 1; i <= IterationLimit; i++){
            Complex result = z.square().add(c);
            if (result.abs() > 2.0){
                return i;
            }
            z = result;
        }
        return -1;
    }

}
