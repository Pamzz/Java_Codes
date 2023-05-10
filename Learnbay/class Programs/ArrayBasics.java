public class ArrayBasics {
    public static void main(String[] args) {
        int arr[] = {10,20,60,90,160,40};
        PrintArray(arr);
        PrintArrayReverse(arr);
        isPalindrome(arr);
        ReverseElementsArray(arr);
    }

    public static void PrintArray(int[] arr)
    {
        System.out.println("Printing the Array ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void PrintArrayReverse(int[] arr)
    {
        System.out.println("Printing the Array in Reverse oder");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }


    public static void isPalindrome(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int flag= 0;
        while(start < end){
            if(arr[start] != arr[end]){
                flag = 1;
                break;
            }
            start++;
            end--;
        }
        if(flag == 1){
            System.out.println("Array is not palindrome");
        }
        else {
            System.out.println("Array is Palindrome");
        }
    }


    public static void ReverseElementsArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        PrintArray(arr);
    }
}
