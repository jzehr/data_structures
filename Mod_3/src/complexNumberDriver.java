public class complexNumberDriver {
    public static void main(String[] args) {

        ComplexNumber one = new ComplexNumber(2.3, 4.5);
        ComplexNumber two = new ComplexNumber(3.4, 5.5);

        ComplexNumber three = one.add(two);
        three.printString();

        ComplexNumber four = one.subtract(two);
        four.printString();

        ComplexNumber five = one.multiply(two);
        five.printString();

        ComplexNumber six = one.divide(two);
        six.printString();


    }
}
