/**
* String compression using the counts of repeated characters
*
*/

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
