/**
* Given two strings, write a method to decide if one is a permutation of the other
*
*/

// Arrays.sort method and to see if they are equal

public boolean isPermutation(String s1, String s2) {
    char[] charArray1 = s1.toCharArray();   //String to charArray
    char[] charArray2 = s2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    String string1 = String.valueOf(charArray1);    // charArray to String
    String string2 = String.valueOf(charArray2);
    if (!string1.equals(string2)) {
        return false;
    } else {
        return true;
    }

}
