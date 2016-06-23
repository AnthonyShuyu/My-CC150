/**
* String compression using the counts of repeated characters
* 2 methods
*/



// s1: brute force, meet one character, check the next character
// O(n^2)

public static String compressString(String s) {
    if (s == null || s.length() == 0) {
        return s;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        int count = 1;
        while (i + count < s.length() && s.charAt(i + count) == c) {
            count++;
        }
        sb.append(c);
        sb.append(count);
        i = i + count - 1;
    }
    if (sb.length() == s.length()) {
        return s;
    }
    return sb.toString();
}



// s2: use current Character and current index
// O(n)

public static String compressString(String s) {
    if (s == null || s.length() == 0) {
        return s;
    }
    StringBuilder sb = new StringBuilder();
    char currentC = s.charAt(0);
    int count = 1;
    for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i) == currentC) {
            count++;
        } else {
            sb.append(currentC);
            sb.append(count);
            currentC = s.charAt(i);
            count = 1;
        }
    }
    sb.append(currentC);
    sb.append(count);

    if (sb.length() >= s.length()) {
        return s;
    }
    return sb.toString();
}

























public static String compressString(String s) {
    if (s == null || s.length() == 0) {
        return s;
    }
    StringBuilder sb = new StringBuilder();
    char currentC = s.charAt(0);
    int index = 0;

    for (int i = 0; i < s.length(); i++) {
        if (currentC != s.charAt(i)) {
            sb.append(currentC);
            sb.append(i - index);
            currentC = s.charAt(i);
            index = i;
        }
    }
    sb.append(currentC);
    sb.append(s.length() - index);
    if (sb.length() >= s.length()) {
        return s;
    }
    return sb.toString();
}













// two pointers, T = O(n^2)

public static String stringCompression(String s) {
    if (s == null || s.length() == 0) {
        return s;
    }
    int i = 0;
    int j = 0;
    StringBuilder sb = new StringBuilder();
    while (i < s.length()) {
        j = i + 1;
        char c = s.charAt(i);
        while ( j != s.length() && s.charAt(j) == c) {
            j++;
        }
        sb.append(c);
        sb.append(j - i);
        i = j;
    }
    if (sb.length() >= s.length()) {
        return s;
    }
    return sb.toString();
}




// one pointer, T = O(n)

public static String stringCompression(String s) {
    if (s == null || s.length() == 0) {
        return s;
    }
    char c = s.charAt(0);
    int count = 1;
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i) != c) {
            sb.append(c);
            sb.append(count);
            c = s.charAt(i);
            count = 1;
        } else {
            count++;
        }
        if (i == s.length() - 1) {
            sb.append(c);
            sb.append(count);
        }
    }
    if (sb.length() >= s.length()) {
        return s;
    }
    return sb.toString();
}

// test

public static void main(String[] args) {
    // TODO Auto-generated method stub
    String a = "aaabbcccc";
    System.out.println(stringCompression(a));
}
