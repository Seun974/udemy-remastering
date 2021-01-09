package se.lexicon.samuel;

public class ComplexNumber {
    private double real;
    private double imaginary;
    //the fields defined here are the the first set of number, basically you will take in fresh set of numbers...
    //...with the methods and just compute
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }
    //take note, already the real and imaginary has been declared, the method below takes a new set of values
    //simply add the real parts and the imaginary
    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }
    //another thing to note, your method is not supposed to return anything and it should be void
    //just do the calculation
    public void add(ComplexNumber one){
        this.real += one.real;
        this.imaginary += one.imaginary;
    }
    //methods voids because you are not returning anything
    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract(ComplexNumber number){
        this.real -= number.real;
        this.imaginary -= number.imaginary;
    }
}
