/*As a security analyst, you need to send a confidential message to your colleague without anyone being able to intercept it. You remember a simple way to encrypt a message by rearranging its characters. You decide to write a program to quickly encrypt your message.
 The program takes the string you entered and applies the encryption method of selecting even-indexed characters first, followed by odd-indexed characters. The encrypted string is displayed on the screen.
Write a program that asks the user for a string and uses this method to encrypt the string
 Input format:
 The program prompts the user to enter a message to encrypt. The input should be a string containing a message to encrypt.
 Output format:
 The program outputs the encrypted message by selecting even-indexed characters first, followed by odd-indexed characters. The output is a string containing the encrypted message.
 Sample Input1:
 message
 Sample Output1:
 msaeesg*/
import java.util.Scanner;
public class Practice5{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Encrypt e=new Encrypt();
    System.out.println("enter the string:");
    String str=sc.nextLine();
    e.encrypt(str);
  }
}
class Encrypt{
  public void encrypt(String s1){
    String s2="";
    for(int i=0;i<s1.length();i++)
      if(i%2==0)
        s2=s2+s1.charAt(i);
    for(int i=0;i<s1.length();i++)
      if(i%2!=0)
        s2=s2+s1.charAt(i);
    
    System.out.println("after encryption:");
    System.out.println(s2);
  }
}