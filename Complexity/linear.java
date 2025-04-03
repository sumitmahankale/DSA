 package Complexity;
 class linear{
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};

        //Task to print the elements of arry 
        for(int i=0;i<=arr.length;i++)  //  T.C---> o(n) S.C ----o(1)
        {
            System.out.println(arr[i]);
        }


        //copy the element of exitng arry
        int newArr[]=new int[arr.length];
        for(int i=0;i<newArr.length;i++) //  T.C---> o(1)  S.C---->o(n)  
        {
            newArr[i]=arr[i];
        }

        for(int num :newArr) //T.C---> o(n)   S.C ----o(1)
        {
            System.out.println(num);
        }
    }

    
}