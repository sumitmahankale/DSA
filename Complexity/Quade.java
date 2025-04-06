package Complexity;

public class Quade {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
    int target=9;

    //Find pairs whose sum is the target (9)
    //Run in O(n^2) Complexity
    for(int i=0;i<=arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]+arr[j]==target)
            {
                System.out.println("Pair:"+arr[i]+ " "+ arr[j]);
            }
        }
    }
    }
    
}
