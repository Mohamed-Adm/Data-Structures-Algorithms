var f = function insertionSort(a){
    for (var itemsSorted = 1; itemsSorted < a.length; itemsSorted++) {
        var temp = a[itemsSorted];
        var loc = itemsSorted-1;
        while(loc>=0 && a[loc]>temp){
            a[loc + 1] = a[loc];
            loc = loc - 1;
        }
        a[loc + 1] = temp;
    }
}
 function selectionSort(A){
    f(A);
    for(var lastPlace = A.length-1;lastPlace>0;lastPlace--){
        var maxLoc = 0;
        for (var j = 1; j <= lastPlace; j++) {
            if (A[j] > A[maxLoc]) {
                maxLoc = j;
           }
       }
       var temp = A[maxLoc];
       A[maxLoc] = A[lastPlace];
       A[lastPlace] = temp;
    }
 }
var arr = new Array(0,3,4,5,7,1,6);
selectionSort(arr);
