import java.util.*;

public class BinaryRecursive
{
    public static int binarysearch(int[] array ,int left,int right ,int target)
    {
        if(left > right)
        return -1;

        int mid = left + (right - left)/ 2;

        if(target== array[mid])
        {
            return mid;
        }
        else if( target < array[mid])
        {
            return binarysearch(array,left,mid - 1,target);
        }
        else 
        {
            return binarysearch(array,mid + 1,right,target);
        }

    }


public static void main(String args[])
{
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int arr[] = new int [n];

for(int i =0;i< arr.length;i++)
{
    arr[i] = s.nextInt();
}
int key = s.nextInt();
int start = 0;
int end = arr.length-1;
int index = binarysearch(arr,start,end,key);
if(index != -1)
{
    System.out.println("element found at index" + " "+ index);
}
else
{
    System.out.println("element not found in the array");
}
}
}