/**
* Given two strings, write a method to decide if one is a permutation of the other
* 3 methods
*/

// s1: Arrays.sort();
// O(nlogn)

public static boolean isPermutation(String s1, String s2) {
    if (s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0) {
        return false;
    }

    char[] charArray1 = s1.toCharArray();
    char[] charArray2 = s2.toCharArray();

    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    return new String(charArray1).equals(new String(charArray2));
}

// char array to String
// String s = new String(charArray);
// or
// String s = String.valueOf(charArray);



// s2: check if two strings have same character counts
// O(n)

public static boolean isPermutation(String s1, String s2) {
    if (s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0) {
        return false;
    }

    if (s1.length() != s2.length()) {
        return false;
    }
    int[] intArray = new int[256];
    char[] charArray1 = s1.toCharArray();
    for (int i = 0; i < charArray1.length; i++) {
        intArray[(int)charArray1[i]]++;
    }

    char[] charArray2 = s2.toCharArray();
    for (int i = 0; i < charArray2.length; i++) {
        intArray[(int)charArray2[i]]--;
        if (intArray[(int)charArray2[i]] < 0) {
            return false;
        }
    }


    return true;
}

// if comapre the length() of 2 strings at first, don't need the last for loop to check if it is > 0, because if it is, there is another one < 0
// for (int i = 0; i < intArray.length; i++) {
//     if (intArray[i] > 0) {
//         return false;
//     }
// }




// s3: use hashMap to check if two strings have same character counts
// O(n)

public static boolean isPermutation(String s1, String s2) {
    if (s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0) {
        return false;
    }

    if (s1.length() != s2.length()) {
        return false;
    }
    Map<Character, Integer> map1 = new HashMap<Character, Integer>();
    Map<Character, Integer> map2 = new HashMap<Character, Integer>();

    for (int i = 0; i < s1.length(); i++) {
        char c = s1.charAt(i);
        if (map1.containsKey(c)) {
            map1.put(c, map1.get(c) + 1);
        } else {
            map1.put(c, 1);
        }
    }

    for (int i = 0; i < s2.length(); i++) {
        char c = s2.charAt(i);
        if (map2.containsKey(c)) {
            map2.put(c, map2.get(c) + 1);
        } else {
            map2.put(c, 1);
        }
    }

    if (map1.size() != map2.size()) {
        return false;
    }

// iterate the hashMap to see if the two hashMap have the same contents

    for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
        Character c = entry.getKey();
        int v1 = entry.getValue();
        if (!map2.containsKey(c)) {
            return false;
        }
        if (map2.get(c) != v1) {
            return false;
        }
    }

    return true;
}

// Map iteration
