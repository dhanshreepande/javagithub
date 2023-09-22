import java.util.*;
public class BinarySearch
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int []ar = new int[n];
        for(int i = 0 ; i< n ;i++)
        {
            ar[i]=s.nextInt();
        }
        int key = s.nextInt();
         int result=Binarysearch(ar,key);
        System.out.println(result);
    }
    public static int Binarysearch( int[] array,int k )
    {
        int start = 0;
        int end = array.length - 1;
        while(start<=end)
        {
           int mid = start + (end-start)/2;
         if( k == array[mid])
        {
            return mid;
        }
        if(k < array[mid])
        {
            end = mid-1;
        }
        else
        start = mid + 1;


    }
    return -1;

}
}
