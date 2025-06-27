package Arrays;

import java.util.*;

public class MinMaxNumber {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("Maximum Element is "+maxNumber(a,n));
    System.out.println("Minimum Element is "+minNumber(a,n));

    System.out.println("Minimum Element is "+minArrays(a,n));
    System.out.println("Maximum Element is "+maxArrays(a,n));


    int index=0;
    int max=a[0];
    int min=a[0];
    System.out.println("Maximum Element is "+findMaxElement(a,index,max));
    System.out.println("Minimum Element is "+findMinElement(a,index,min));




  }
  // Finding the min and max element in an array using the Most common and efficient method (O(n) time)
 public static int maxNumber(int arr[], int n){
    int max=arr[0];
    for(int i=1;i<n;i++){
      if(arr[i]>max){
        max=arr[i];
      }
    }
    return max;
  }

  public static int minNumber(int arr[], int n){
    int min=arr[0];
    for(int i=1;i<n;i++){
      if(arr[i]<min){
        min=arr[i];
      }
    }
    return min;
  }
  

  // Using Arrays class to find the min and max number
  public static int minArrays(int arr[], int n){
    Arrays.sort(arr);
    return arr[0];
  }

  public static int maxArrays(int arr[], int n){
    Arrays.sort(arr);
    return arr[n-1];
  }  

  // Using recursion to find the min and max number

  public static int findMaxElement(int arr[], int index, int max){
    
    if (arr.length==index) return max;
    return findMaxElement(arr, index+1, Math.max(max,arr[index]));
  }

   public static int findMinElement(int arr[], int index, int min){
    
    if (arr.length==index) return min;
    return findMinElement(arr, index+1, Math.min(min,arr[index]));
  }


}
