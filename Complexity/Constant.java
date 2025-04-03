package Complexity;

class Constant {public static void main(String[] args) 
    {
        int arr[]=new int[]{1,2,3,4,5};

        //add 10 to the first element of arr
        arr[0]=arr[0]+10; // T.C   -> o(1) 

        int num= arr[arr.length-1]; // S.C ->  int (4 bytes) o(4) 
        System.out.println(arr[0]); // T.C   -> o(1) 

        //o(1)+o(1)== o(2) --> o(2) --> o(1) Constant time complexity
}
}