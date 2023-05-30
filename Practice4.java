/*You are working on a project that involves analyzing data from sensors installed on a wind turbine. The data is stored in an array, and you have noticed that the data has a periodic pattern that repeats every n data points, where n is a positive integer. To better analyze the data, You need to shift the elements in the array to the left by m positions, such that the first m elements are moved to the end of the array, and the remaining elements are shifted to the left by m positions, such that the original mth element becomes the first element in the new array.Implement a Java program to achieve above?
 Input Format
 The input consists of Three lines  
 The first line contains integer n, where n is the length of the array (1 ≤ n ≤ 10^5)  
 The Second line contains n space-separated integers a1, a2, ..., an representing the array of integers (-10^9 ≤ ai ≤ 10^9).
 The Third line contains integer  m(1 ≤m ≤ 10^5),
 Output Format
 The output is the modified Array satisfying the above requirements.
 Sample Input1 :
 10
 1 2 3 4 5 6 7 8 9 10
 4
 Sample Output1:
 5 6 7 8 9 10 1 2 3 4
 Sample Input2 :
 10
 1 2 3 4 5 6 7 8 9 10
 2
 Sample Output2
 3 4 5 6 7 8 9 10 1 2*/
import java.util.Scanner;

public class Practice4{
  public static void main(String args[]){
    ShiftEle s=new ShiftEle();
   Scanner sc=new Scanner(System.in);
   
    System.out.println("enter the range of array");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter array elements");
    for(int i=0;i<a.length;i++)
      a[i]=sc.nextInt();
    System.out.println("enter how many positions to be shifted");
    int m=sc.nextInt();
    s.shift(a,m);
  }
}
class ShiftEle{
  public void shift(int arr[],int m){
   int a1[]=new int[arr.length]; 
    for(int i=0;i<a1.length;i++){
      if(i<m)
        a1[(i+a1.length)-m]=arr[i];
      else
        a1[i-m]=arr[i];
   }
    System.out.println("array after shifting:");
    for(int j=0;j<a1.length;j++)
      System.out.print(a1[j]+" ");
  }
}