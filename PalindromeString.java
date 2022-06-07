import java.util.Arrays;
import java.util.Scanner;

public class PalindromeString {

    static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String str= input.next();
        if(isPalindrome(str)){
            System.out.println(str+" kelimesi palindromik kelimedir...");
        }else{
            System.out.println(str+" kelimesi palindromik kelime değildir...");
        }
    }
}
