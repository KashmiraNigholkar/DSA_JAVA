package OOPS.PRset;

class Complex {
    int real;
    int img;

    public Complex(int r, int i) {
        real = r;
        img = i;
    }

    
    public static Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.img + b.img);
    }


    public static Complex diff(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.img - b.img);
    }

    public static Complex product(Complex a,Complex b){
        return new Complex(a.real *b.real,a.img*b.img );


    }

    public static Complex div(Complex a, Complex b) {
        return new Complex(a.real / b.real, a.img / b.img);
    }

    
    public void display() {
        System.out.println(real + " + " + img + "i");
        System.out.println(real + " - " + img + "i");
        System.out.println(real + " * " + img + "i");
        System.out.println(real + " / " + img + "i");
    }
}

public class ComplexNumberOperation {
    public static void main(String[] args) {
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(3, 7);

        Complex result = Complex.add(c1, c2);
        Complex result1 = Complex.diff(c1, c2);
        Complex result3 = Complex.product(c1, c2);
        Complex result4 = Complex.div(c1, c2);

        System.out.print("Sum = ");
         System.out.print("diff=");
          System.out.print("product = ");
           System.out.print("div = ");
        result.display();
        result1.display(); 
        result3.display();
        result4.display();
    }
}
