package Day3_PracticeProblem;

//Write a Java Program to print the elements of an array

public class ElementsOfArray {
    public static void main(String[] args) {

        int [] arr = new int [] {10, 20, 30, 40, 50};

        System.out.println("Elements of given array : "); //Loop through the array by incrementing value of i

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}