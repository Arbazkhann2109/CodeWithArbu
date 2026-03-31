package DSA.logicBuilding;

public class SwapTwoNumber {
    public static void main(String[] args){

        int a = 1;
        int b = 2;

//        int temp = a;
//        a = b;
//        b = temp;

        a = a + b; // 1 + 2 = 3
        b = a - b ;// 3 - 2 = 1
        a = a - b;// 3 - 5 = 2

        System.out.println("a "+ a +" b " + b );

    }
}
