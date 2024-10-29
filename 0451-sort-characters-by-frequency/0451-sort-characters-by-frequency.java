class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        for (char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        List<Character>[] l1 = new List[s.length() + 1];
        for (int i = 0; i <= s.length(); i++) {
            l1[i] = new ArrayList<>();
        }
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            int freq = entry.getValue();
            char ch = entry.getKey();
            l1[freq].add(ch);
        }

        StringBuilder res = new StringBuilder();
        for (int i = s.length(); i >= 1; i--) {
            for (char ch : l1[i]) {
                // for (int j = 0; j < i; j++) {
                //     res.append(ch);
                // }
                res.append(String.valueOf(ch).repeat(i));


            }
        }
        return res.toString();
    }
}