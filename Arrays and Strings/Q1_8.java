/**
* check if s2 is a rotation of s1 using only one call to isSubstring
* 2 methods
*/

// s1: use the isSubString method
// O(n), O(n)

public static boolean isRotation(String s1, String s2) {
    if (s1 == null || s2 == null) {
        return false;
    }
    if (s1.length() == 0 && s2.length() == 0) {
        return true;
    }

    if (s1.length() != s2.length()) {
        return false;
    }

    StringBuilder sb = new StringBuilder(s1);
    sb.append(s1);
    String newString = sb.toString();
    return isSubString(newString, s2);
}

public static boolean isSubString(String s1, String s2) {
    if (s1 == null || s2 == null) {
        return false;
    }
    if (s2.length() > s1.length()) {
        return false;
    }
    for (int i = 0; i < s1.length() - s2.length() + 1; i++) {
        if (s1.substring(i, i + s2.length()).equals(s2)) {
            return true;
        }
    }
    return false;
}



// s2: call isSubstring many times
// O(n^2), O(n)

public static boolean isSubstring(String s1, String s2) {
    if (s1 == null || s2 == null) {
        return false;
    }
    int n = s2.length();
    for (int i = 0; i < s1.length() - n + 1; i++) {
        if (s1.substring(i, i + n).equals(s2)) {
            return true;
        }
    }
    return false;
}

public static boolean isRotation(String s1, String s2) {
    if (s1 == null || s2 == null) {
        return false;
    }
    if (s1.length() != s2.length()) {
        return false;
    }
    for (int i = 0; i < s1.length(); i++) {
        if (isSubstring(s2, s1.substring(0, i)) && isSubstring(s2, s1.substring(i, s1.length()))) {
            return true;
        }
    }
    return false;
}


// test

public static void main(String[] args) {
    // TODO Auto-generated method stub
    String s1 = "abcdefg";
    String s2 = "efgabcd";
    System.out.println(isRotation(s1, s2));
}




// call isSubstring only one time

public static boolean isRotation(String s1, String s2) {
    if (s1 == null || s2 == null) {
        return false;
    }
    if (s1.length() != s2.length()) {
        return false;
    }

    String s = s1 + s1;
    return isSubstring(s, s2);

}
