package Complexity;
public class Log {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9};

        //Linear way of searching the target.
        long startTime=System.nanoTime();
         for(int i=0;i<arr.length;i++)
         {
            if(arr[i]==5)
            {
                System.out.println("Linear Search found element at index "+i);
            }
         }
         long endTime=System.nanoTime();
         System.out.println("Linear Search Took: "+(endTime-startTime));


         //Binary Search

         startTime=System.nanoTime();
         int start= 0;
         int end=arr.length-1;

         while (start<=end) {
            int mid=(start+end)/2;
            if(arr[mid]==5)
            {
                System.out.println("Binary Search found at index "+mid);
                break;
            }

            else if(arr[mid]<40)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
         }
         endTime=System.nanoTime();
         System.out.println("Binary Search Took: "+(endTime-startTime));

    }
}
