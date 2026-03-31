package DSA.logicBuilding;

public class EvenOdd {

    public static boolean isEven(int n){

     int rem = n%2;

     if(rem ==0){
         return true;
     }else{
         return false;
     }
    }


public static  void main(String[] args){

        int n =5;
       if(isEven(n)==true ){
          System.out.println("True");
       }
       else
           System.out.println("False");
}

}
