import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class ArraysExample {

    public static int search(int []N, int x){
        for(int index=0;index<N.length;index++){
            if(N[index]==x)
                return index;
        }
        return -1;
    }
    public static int binaryS(int[]A, int n){
        int low = 0;
        int high = A.length;
        while(high>=low){
            int mid = (low+high)/2;
            if(A[mid] == n){
                return mid;
            }else if(A[mid] > n){
                high = mid-1;
            }else {
                low = mid+1;
            }

        }
        return -1;
    }
    public static int BinarySearchRec(int[]Array, int lo, int hi, int N){
        if(lo>hi){
            return -1;
        }else{
            int mid = (lo+hi)/2;
            if(Array[mid]==N)
                return mid;
            else if(Array[mid] < N)
                return BinarySearchRec(Array,mid+1,hi,N);
            else
                return BinarySearchRec(Array, lo,mid-1, N);
        }
    }
    public static void main(String[] arg){
        int []a = {1,2,3,5,6};
        System.out.println("Linear Search:: " +search(a,3));
        System.out.println("Binary Search:: " +binaryS( a,5));
        System.out.print("Binary Search Recursive:: " +BinarySearchRec(a,0,a.length-1,6));
        /*ArrayList<String> names = new ArrayList<String>();
        names.add("Mohamed");
        names.add("Adam");
        System.out.println(names.size());
        names.set(0, "Ibrahim");
        names.remove(1);
        System.out.println(names.get(0));
        System.out.println(names.size());
        //create a set of objects(no array index)
        TreeSet<String>students = new TreeSet<String>();
        students.add("Adam");
        students.add("Fayza");
        System.out.println(students.size());
        System.out.println(students.last());

        //HashMap
        HashMap<String, Integer> name = new HashMap<>();
        name.put("Adam", 24);
        name.put("Ahmed", 20);
        System.out.println(name.size());
        System.out.println(name.get("Adam"));*/



    }
}
