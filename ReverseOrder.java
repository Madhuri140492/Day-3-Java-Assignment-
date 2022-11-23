package Day3_PracticeProblem;

//Write a Java Program to print the elements of an array in reverse order.


public class ReverseOrder {
    public static void main(String[] args) {

        int[ ] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " " );
    }
}
