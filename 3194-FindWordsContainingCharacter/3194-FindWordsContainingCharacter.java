// Last updated: 9/17/2025, 9:28:11 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> out = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x) != -1){
                out.add(i);
            }
        }
        return out;
        
    }
}