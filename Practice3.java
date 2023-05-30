/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 Note that you must do this in-place without making a copy of the array.
 Example 1:
 Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]*/
import java.util.Scanner;
public class Practice3{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the range of array");
    int range=sc.nextInt();
    int a[]=new int[range];
    System.out.println("enter the array");
    for(int i=0;i<a.length;i++)
      a[i]=sc.nextInt();
    int temp=0;
    for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length;j++){
        if(a[j]!=0){
          temp=a[i];
         a[i]=a[j];
         a[j]=temp;
        break;
        }  
      }
    } 
      System.out.println("the array elements after sorting:");
       for(int i=0;i<a.length;i++)
         System.out.print(a[i]+" ");
    
  }
}