import java.util.*;

public class UnsuccessLinear {


    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for(int i=0; i < n ;i++)
        {
           arr[i]=s.nextInt();
        }
        int key = s.nextInt();
       
        System.out.println( Unsucesslinear(arr,key));
 }
 public static int Unsucesslinear( int []arr, int k)
 {
            int count = 0;

    for(int i=0; i<arr.length; i++)
    { 
            count ++;
        
         if(arr[i] == k) 
          {
            return count-1;
          }
        
 }
 return count;
    
}
}

 
    

