// HashTable

public static Map<Integer, Integer> buildMap(int[] array) {
    if (array == null || array.length == 0) {
        return null;
    }
    Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    for (int i = 0; i < array.length; i++) {
        hashMap.put(i, array[i]);
    }
    return hashMap;
}

// method name!
// Java mechanism



// ArrayList eg1
public static List<Integer> buildList(int[] array) {
    if (array == null || array.length == 0) {
        return null;
    }
    List<Integer> arrayList = new ArrayList<Integer>();
    for (int i = 0; i < array.length; i++) {
        arrayList.add(array[i]);
    }
    return arrayList;
}

// ArrayList eg2
public List<String> mergeList(String[] firstNames, String[] lastNames) {
    List<String> arrayList = new ArrayList<String>();
    for (String s1: firstNames) {
        arrayList.add(s1);
    }
    for (String s2: lastNames) {
        arrayList.add(s2);
    }
    return arrayList;
}

// StringBuilder

public static String useStringBuffer(String[] words) {
    if (words == null || words.length == 0) {
        return null;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
        sb.append(words[i]);
    }
    return sb.toString();
}
