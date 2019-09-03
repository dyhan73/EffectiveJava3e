public class TestComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(3, 2);

        System.out.println(c1.plus(c2));
        System.out.println(c1.minus(c2));
        System.out.println(c1.times(c2));
        System.out.println(c1.dividedBy(c2));
    }
}
