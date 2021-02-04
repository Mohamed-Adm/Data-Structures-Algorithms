var myObject = {
    Insertion: function insertion_sort(a) {
        for (var j = 1; j < a.length; j++) {
            var key = a[j];
            var i = j - 1;
            while (i >= 0 && a[i] > key) {
                a[i + 1] = a[i];
                i = i - 1;
            }
            a[i + 1] = key;
        }
    },
    Bubble: function bubble_sort(a) {
        for (var i = 1; i <= a.length; ++i) {
            for (var j = a.length; j >= i; j--) {
                if (a[j] < a[j - 1]) {
                    var temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    },
    Merge: function merge(a, l, m, r) {
        var k = l;
        var n1 = m - l + 1;
        var n2 = r - m;
        var L = new Array();
        var R = new Array();
        for (var i = 0; i < n1; ++i)
            L[i] = a[l + i];
        for (var j = 0; j < n2; ++j)
            R[j] = a[m + 1 + j];
        var i = 0;
        var j = 0;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i += 1;
            } else {
                a[k] = R[j];
                j += 1;

            }
            k += 1;
        }
        while (i < n1) {
            a[k] = L[i];
            i += 1;
            k += 1;
        }
        while (j < n2) {
            a[k] = R[j];
            j += 1;
            k += 1;
        }

    },
    MergeSort: function mergesort(a, left, right) {
        if (left < right) {
            var mid = (left + right) / 2;
            mergesort(a, left, mid);
            mergesort(a, mid + 1, right);
            myObject.Merge(a, left, mid, right);
        }

    }


};
var arr1 = [5, 2, 4, 6, 1, 3];
var arr2 = [6, 2, 5, 7, 1, 4, 0, 3];
var arr3 = [8, 34, 2, 0, 6, 1];
myObject.Insertion(arr1);
myObject.Bubble(arr2);
console.log('Insertion sort::');
for (var i = 0; i < arr1.length; ++i) {
    console.log(arr1[i]);
}
console.log('Bubble sort::');
for (var j = 0; j < arr2.length; ++j) {
    console.log(arr2[j]);
}
myObject.MergeSort(arr3, 0, arr3.length - 1);
console.log('MergeSort::');
for (var j = 0; j < arr3.length; ++j) {
    console.log(arr3[j]);
}





