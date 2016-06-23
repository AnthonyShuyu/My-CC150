/**
* Replace all the spaces together in the String with '%20'
* 2 method
*/



// s1: 2 for loops to see where to meet space
// O(n^2)

public static String replaceSpace(String s) {
    if (s == null || s.length() == 0) {
        return s;
    }
    // char[] charArray = s.toCharArray();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c != ' ') {
            sb.append(c);
        } else {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) != ' ') {
                    sb.append("%20");
                    i = j - 1;
                    break;
                }
            }
        }
    }
    return sb.toString();
}


// s2: If meet space, check the character next to it, if it is no space, append "%20"
// O(n)

public static String replaceSpace(String s) {
    if (s == null || s.length() == 0) {
        return s;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != ' ') {
            sb.append(s.charAt(i));
        } else if (i < s.length() - 1 && s.charAt(i + 1) != ' ') {
            sb.append("%20");
        }
    }
    return sb.toString();
}







//O(n)

public static String replaceSpace(String s) {
    if (s == null || s.length() == 0) {
        return s;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c != ' ') {
            sb.append(c);
        } else if (i == s.length() - 1){
            continue;
        } else {
            char nextChar = s.charAt(i + 1);
            if (nextChar != ' ') {
                sb.append("%20");
            } else {
                continue;
            }
        }
    }
    return sb.toString();
}


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
