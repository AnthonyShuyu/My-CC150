/**
* Determine if a string has all unique characters
*/

public static boolean isUnique(Stirng s) {
    if (s == null || s.length() == 0) {
      return true;
    }
    int n = s.length();
    Set<Character> hashSet = new HashSet<Character>();
    for (int i = 0; i < n; i++) {
        if (hashSet.contains(s.charAt(i))) {
            return false;
        }
        hashSet.add(s.charAt(i));
    }
    return true;
}
