class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        // if(ransomNote == NULL && magazine == NULL) return true
        // if(ransomNote.length() > magazine.length()) return false
        // if(ransomNote == null ) return true
        // if(magazine == null ) return false
        
        
        // Create a frequency Map inorder to map every character of Magazine string to its frequency
        Map<Character,Integer> freq = new HashMap<>();
        for(char c: magazine.toCharArray()){
            if(freq.containsKey(c)){
                freq.put(c,freq.get(c)+1);
            }else{
                freq.put(c,1);
            }
        }
        
        for(char c:ransomNote.toCharArray()){
            if(freq.containsKey(c)){
                if(freq.get(c)>1){
                    freq.put(c,freq.get(c)-1);
                }else{
                    freq.remove(c);
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}