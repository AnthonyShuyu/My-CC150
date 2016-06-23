/**
* Replace all the spaces in the String with '%20'
* 1 method
*/

public static String replaceSpace(String s) {
    if (s == null || s.length() == 0) {
        return s;
    }
    StringBuilder sb = new StringBuilder();
    int index = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
        if (s.charAt(i) != ' ') {
            index = i;
            break;
        }
    }

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != ' ') {
            sb.append(s.charAt(i));
        } else if (i < index){
            sb.append("%20");
        }
    }
    return sb.toString();
}
