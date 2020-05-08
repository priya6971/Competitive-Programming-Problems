class Solution {
    
    int No_Of_Chars = 256;
    char count[] = new char[No_Of_Chars];
    
    public void getCountArray(String s){
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
        }
    }
    
    public int firstUniqChar(String s) {
        getCountArray(s);
        
        int index = -1, i;
        for(i=0;i<s.length();i++){
            if(count[s.charAt(i)] == 1){
                index = i;
                break;
            }
        }
        return index;
    }
}