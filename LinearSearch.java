import java.util.Scanner;
public class LinearSearch 

{
 public static void main(String args[])
{
try (Scanner input = new Scanner(System.in)) {
    int n = input.nextInt();
     int []arr = new int[n];
       for( int i=0; i< n ;i++)
        {
           arr[i]=input.nextInt();
        }

     int a =input.nextInt();
     System.out.println(linearsearch( arr,a));
}
}

public static int linearsearch(int[] array,int key)
{
    for(int i= 0; i < array.length; i++)
    {
        if(array[i]== key)
        {
            return i;
        }
    }
       return -1;
}

}
