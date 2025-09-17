

public class Array {
    public static void main(String[] args) {
        int a [] = {1 ,2 ,3 ,4 ,5, 6, 7};
        SumArray(a);
    }
    
    public static void SumArray(int myArray[]){
        int sum = 0 ;
        for (int i = 0; i < myArray.length; i++) {
            sum=sum+myArray[i];
            // System.out.println(sum);
            // return sum ;
        }
    }

}