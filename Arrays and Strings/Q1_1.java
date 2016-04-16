/**
* Determine if a string has all unique characters
*
*/

// Use HashSet, T = O(n), S = O(n), n is the length of s.

public static boolean isUnique(Stirng s) {
    if (s == null || s.length() == 0) {
      return true;
    }
    int n = s.length();
    Set<Character> hashSet = new HashSet<Character>();
    for (int i = 0; i < n; i++) {
        if (hashSet.contains(s.charAt(i))) {
            return false;
        }
        hashSet.add(s.charAt(i));
    }
    return true;
}

// Use boolean array, T = O(n), S = O(n)

public static boolean isUnique(String s) {
    if (s == null || s.length() == 0) {
        return true;
    }
    int n = s.length();
    boolean[] uniqueChars = new boolean[256];
    for (int i = 0; i < n; i++) {
        int index = s.charAt(i);    //char to int, ASCII
        if (uniqueChars[index]) {
            return false;
        } else {
            uniqueChars[index] = true;
        }
    }
    return true;
}



/**
* Follow up: what if you can not use additional data structure?
*/

// Use 2 level for loop,  T = O(n^2), S = O(1)

public static boolean isUnique(String s) {
    if (s == null || s.length() == 0) {
        return true;
    }
    int n = s.length();
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (s.charAt(i) == s.charAt(j)) {
                return false;
            }
        }
    }
    return true;
}
