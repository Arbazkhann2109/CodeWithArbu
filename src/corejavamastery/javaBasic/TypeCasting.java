package corejavamastery.javaBasic;

public class TypeCasting {

    public static void main(String[] args) {

        //# Converting Value to one data type to another data type

        //1 Widening casting (implicit)
        int num = 10;
        double value = num;
        System.out.println(value);

        //2 Narrowing casting (explicit)
        double num2 = 10.754;
        int value2 = (int)num;

        System.out.println(value2);

    }
}
