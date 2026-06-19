class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sch = s.charAt(i);

            if (smap.containsKey(sch)) {
                smap.put(sch, smap.get(sch) + 1);
            } else {
                smap.put(sch, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char tch = t.charAt(i);

            if (tmap.containsKey(tch)) {
                tmap.put(tch, tmap.get(tch) + 1);
            } else {
                tmap.put(tch, 1);
            }
        }

        return smap.equals(tmap);
    }
}