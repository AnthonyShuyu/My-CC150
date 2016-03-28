/**
* Reverse a string
*
*/

// use StringBuilder reverse() method
public String reverseString(String s) {
    StringBuilder sb = new StringBuilder(s);
    sb.reverse();
    return sb.toString();
}

// use StringBuilder append() method, T = O(n), n is the length of s

public String reverseString(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = s.length() - 1; i >= 0; i--) {
        sb.append(s.charAt(i));
    }
    return sb.toString();
}


// test

public static void main(String[] args) {
    // TODO Auto-generated method stub
    String s="abcdefg"+"\\0";   //"\0 means blank, but not a space"
    System.out.println(s);
    System.out.println(reverse(s));

}