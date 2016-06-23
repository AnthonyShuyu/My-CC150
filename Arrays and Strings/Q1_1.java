/**
* Determine if a string has all unique characters
* 5 methods
*/

// s1: brute force
// O(n^2), O(1)

public static boolean isUnique(String s) {
    if (s == null || s.length() == 0) {
        return true;
    }
    for (int i = 0; i < s.length(); i++) {
        for (int j = i + 1; j < s.length(); j++) {
            if (s.charAt(i) == s.charAt(j)) {
                return false;
            }
        }
    }
    return true;
}

// s2: HashSet
// O(n), O(n)

public static boolean isUnique(String s) {
    if (s == null || s.length() == 0) {
        return true;
    }
    Set<Character> hashSet = new HashSet<Character>();
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (hashSet.contains(c)) {
            return false;
        } else {
            hashSet.add(c);
        }
    }
    return true;
}


// s3: boolean array
// O(n), O(n)

public static boolean isUnique(String s) {
    if (s == null || s.length() == 0) {
        return true;
    }

    boolean[] bArray = new boolean[256];
    for (int i = 0; i < s.length(); i++) {
        int index = s.charAt(i);
        if (bArray[index]) {
            return false;
        } else {
            bArray[index] = true;
        }
    }
    return true;
}

// char to int do not need add (int)c
// the String is Ascii String or UniCode String?
// should judge if the s.length() > 256, if it is, return false

// s4: bitwise
// O(n), O(1)
// !!!

public static boolean isUnique(String s) {
    if (s == null || s.length() == 0) {
        return true;
    }
    int checker = 0;
    for (int i = 0; i < s.length(); i++) {
        int val = s.charAt(i) - 'a';
        if ((checker & (1 << val)) > 0) {
            return false;
        } else {
            checker = checker | (1 << val);
        }
    }
    return true;
}
// bitwise operation, arithmatic left shift << and right shift >>, logic right shift >>>
// Assume that the String only contains lower case letters a to z;


// s5: String to Char Array, and order the array, compare the neighboring characters
// O(nlogn), O(n)
public static boolean isUnique(String s) {
    if (s == null || s.length() == 0) {
        return true;
    }
    char[] charArray = s.toCharArray();
    Arrays.sort(charArray);

    for (int i = 0; i < charArray.length - 1; i++) {
        if (charArray[i] == charArray[i + 1]) {
            return false;
        }
    }
    return true;
}
