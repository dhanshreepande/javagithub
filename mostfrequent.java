import java.util.*;

public  class mostfrequent

{
    public static int mostFrequentElement(int[] arr)
    {
       HashMap<Integer , Integer> H = new HashMap<>();
       int maxFreq = 1;
       int mostFrequent = -1;
       for(int i =0 ; i< arr.length;i++)
       {
         if(H.containsKey(arr[i]))
         {
            H.put(arr[i],H.get(arr[i]) + 1);
            if(maxFreq < H.get(arr[i]))
            {
                maxFreq = H.get(arr[i]);
                mostFrequent = arr[i];
            }
            else if( maxFreq == H.get(arr[i]))
            mostFrequent = Math.min(mostFrequent , arr[i]);
         }
         else
          H.put(arr[i],1);
       }
       return mostFrequent;

    }

    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n; i++)
        {
             arr[i]=sc.nextInt();
        }
        System.out.println(mostFrequentElement(arr));
    }

}