package Arrays;

import java.util.*;

public class ReverseArray {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }

  // Using recursion to reverse an array
  reverseRecursionArray(a, 0,n-1);
  
  // Using for loop to reverse an array
  a=reverseArray(a,n);

  System.out.println(Arrays.toString(a));

  
    
  
    

  
}


public static int[] reverseArray(int a[],int n){
  int j=n-1;
  for(int i=0;i<n/2;i++){
    if(i==j)
    break;
    int swap=a[i];
    a[i]=a[j];
    a[j]=swap;
    j--;

  }
 return a;
}

public static void reverseRecursionArray(int a[], int start, int end) {
  if (start == end){
  System.out.println("\n"+Arrays.toString(a)); 
  return;
}
  int swap =a[start];
  a[start]=a[end];
  a[end]=swap;
  reverseRecursionArray(a, start+1, end-1);
}

  
}
