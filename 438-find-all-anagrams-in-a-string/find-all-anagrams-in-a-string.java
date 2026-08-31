class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        int k = p.length();
        if(k > s.length()){
            return list;
        }
        for(int i =0;i<k;i++){
            map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
        }
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0;i<k;i++){
            map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = k;i<s.length();i++){ 
            if(map.equals(map2)){
                list.add(i-k);
            }
            map2.computeIfPresent(s.charAt(i-k), (key, val) -> val > 1 ? val - 1 : null);
            map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
             
        }
        if(map.equals(map2)){
            list.add(s.length()-k);
        }
        return list;
    }
}