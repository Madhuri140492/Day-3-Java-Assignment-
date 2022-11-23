

//Write a Java Program to print the smallest element in an array.

package Day3_PracticeProblem;
public class SmallestElement {
    public static void main(String[] args) {

        int[] arr={6, 5, 4, 9, 8, 7, 3, 2, 11};
        int smallest=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest element present in given array: " + smallest );
    }
}
