/**
* Given 2 sorted integer arrays A and B, merge them, return a new sorted array
* 3 methods
*/


// s1: use Arrays.sort() method
// O(nlogn), O(n)
public static int[] mergeArrays(int[] a, int[] b) {
    if (a == null || a.length == 0) {
        return b;
    }
    if (b == null || b.length == 0) {
        return a;
    }

    int[] result = new int[a.length + b.length];
    for (int i = 0; i < a.length; i++) {
        result[i] = a[i];
    }
    for (int i = 0; i < b.length; i++) {
        result[i + a.length] = b[i];
    }
    Arrays.sort(result);
    return result;
}

// s2: brute force, compare the element in the two arrays one by one
// O(n), O(n)

public static int[] mergeArrays(int[] a, int[] b) {
    if (a == null || a.length == 0) {
        return b;
    }
    if (b == null || b.length == 0) {
        return a;
    }
    int[] result = new int[a.length + b.length];
    int lengthA = a.length;
    int lengthB = b.length;

    int index = 0;
    while (lengthA > 0 && lengthB > 0) {
        if (a[a.length - lengthA] <= b[b.length - lengthB]) {
            result[index] = a[a.length - lengthA];
            lengthA--;
        } else {
            result[index] = b[b.length - lengthB];
            lengthB--;
        }
        index++;
    }

    while (lengthA > 0) {
        result[index] = a[a.length - lengthA];
        lengthA--;
        index++;
    }
    while (lengthB > 0) {
        result[index] = b[b.length - lengthB];
        lengthB--;
        index++;
    }
    return result;
}


// s3: use Collection.sort()
// O(nlogn), O(n)

public static List<Integer> mergerLists(List<Integer> a, List<Integer> b) {
    if (a == null || a.size() == 0) {
        return b;
    }
    if (b == null || b.size() == 0) {
        return a;
    }
    a.addAll(b);
    Collections.sort(a);
    return a;
}
