package DSA.Array.Easy;

public class UpdateElement {

    public  static void main(String[] args){

        int[] arr = { 3 ,5,7,0, 4 };
        int n = arr.length;

        for(int i =0; i<n; i++){

            System.out.print(arr[i]);

        }
        System.out.println(" ");

        arr[3] = 5;
        for (int j : arr) {

            System.out.print(j);

        }


    }

}
