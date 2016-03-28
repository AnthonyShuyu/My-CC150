/**
* check if s2 is a rotation of s1 using only one call to isSubstring
*
*/

// call isSubstring many times

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
