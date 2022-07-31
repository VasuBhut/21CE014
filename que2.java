
/*Given a string, return a string made of the first 2 chars (if present), however 
include first char only if it is 'o' and include the second only if it is 'z', so 
"ozymandias" 
 yields "oz". 
 startOz("ozymandias") → "oz" 
 startOz("bzoo") → "z" 
 startOz("oxx") → "o" */
// 21CE014_VasuBhut 
import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        // String str = "example";
        char[] ch = a.toCharArray(); // To convert String from array
        for (int i = 0; i < 2; i++) { // To check first two character
            if (ch[i] == 'o') {
                System.out.println("o");
            } else if (ch[i] == 'z') {
                System.out.println("z");
            }
        }
    }
}
