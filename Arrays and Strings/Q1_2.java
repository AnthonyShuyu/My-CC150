/**
* Reverse a string
* 3 methods
*/

// s1: StringBuilder, append
// O(n)

public static String reverseString(String s) {
    if (s == null) {
        return null;
    }
    if (s.length() == 0) {
        return "";
    }

    StringBuilder sb = new StringBuilder();
    for (int i = s.length() - 1; i >= 0; i--) {
        sb.append(s.charAt(i));
    }
    return sb.toString();
}


// s2: use StringBuilder reverse() method
// O(n)

public String reverseString(String s) {
    StringBuilder sb = new StringBuilder(s);
    sb.reverse();
    return sb.toString();
}

// s3: char array, exchange start and end
// O(n), O(n)

public static String reverseString(String s) {
    if (s == null) {
        return null;
    }
    if (s.length() == 0) {
        return "";
    }
    char[] charArray = s.toCharArray();
    for (int i = 0; i < charArray.length / 2; i++) {
        char temp = charArray[i];
        charArray[i] = charArray[charArray.length - i - 1];
        charArray[charArray.length - i - 1] = temp;
    }
    String s = new String(charArray);
    return s;
}

// test

public static void main(String[] args) {
    // TODO Auto-generated method stub
    String s="abcdefg"+"\\0";   //"\0 means blank, but not a space"
    System.out.println(s);
    System.out.println(reverse(s));

}
