/**
* Replace all the spaces in the String with '%20'
*
*/

// T = O(n)

public static String replaceSpace (String s) {

    if (s == null || s.length() == 0) {
        return s;
    }

    char[] charArray = s.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < charArray.length; i++) {
        if (charArray[i] != ' ') {
            sb.append(charArray[i]);
        } else if (i < charArray.length - 1 && charArray[i + 1] != ' '){
            sb.append("%20");
        }
    }
    return sb.toString();
}

// test

public static void main(String[] args) {
    // TODO Auto-generated method stub
    String s = "    Mr John Smith";
    System.out.println(replaceSpace(s));
}
