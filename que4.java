
// Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears 
//in the array somewhere. 
// array123([1, 1, 2, 3, 1]) → true 
// array123([1, 1, 2, 4, 1]) → false 
// array123([1, 1, 2, 1, 2, 3]) → true
// 21CE014_VasuBhut
import java.util.Scanner;

public class que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt(); // Taking size of array user wants
        int[] a = new int[i];
        for (int j = 0; j < i; j++) {
            a[j] = sc.nextInt();
        }
        for (int j = 0; j < i;) {
            if (a[j] == 1 && a[j + 1] == 2 && a[j + 2] == 3) { // Check continuous 3 array index whether it is 1,2 and 3
                                                               // or not
                System.out.println("true");
                break;
            } else {
                System.out.println("false");
                break;
            }
        }

    }

}