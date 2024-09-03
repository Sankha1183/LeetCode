class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp=new HashMap<>();
        for(String word:strs){
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            // mp.put(strs[i]);
            String sortedWord=new String(charArray);

            if(!mp.containsKey(sortedWord)){
                mp.put(sortedWord,new ArrayList<>());
            }
            mp.get(sortedWord).add(word);
        }
        return new ArrayList<>(mp.values());

        
    }
}