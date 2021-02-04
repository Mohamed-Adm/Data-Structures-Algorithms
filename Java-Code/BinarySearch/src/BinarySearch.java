public class BinarySearch {
    //Linear search
    public static int LinearSearch(int [] A, int value){
        for(int i=0;i<A.length;++i){
            if (A[i]==value)
                return i;
        }
        return -1;
    }
    public static int BSearch(int [] A, int N){
        int low = 0;
        int high = A.length-1;
        while(high>=low) {
            int mid = (low+high)/2;
            if(A[mid]==N) {
                return mid;
            }else if(A[mid]>N) {
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
       return -1;
    }
    //Binary Search using recursive
    public static int binarySearch(int [] A, int l, int h, int N){
        if (l>h){
            return -1;
        }else{
        int mid = (l+h)/2;
        if(N==A[mid])
            return mid;
        else if(N < A[mid])
            return binarySearch(A,l, mid-1, N);
        else
            return binarySearch(A, mid+1, h, N);
        }

    }

    public static void main(String[] args) {
        int []arr = {2,3,4,5,6,7,9};
        System.out.println("Using Linear Search:: " +LinearSearch(arr, 9));
        System.out.println("Using Recursive BinarySearch:: " +binarySearch(arr, 0,arr.length-1, 6));
        System.out.println("Using BinarySearch:: " +BSearch(arr, 6));
    }
}
