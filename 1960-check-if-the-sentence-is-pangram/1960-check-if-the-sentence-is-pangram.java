class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            hs.add(ch);
        }
        if(hs.size()==26){
    return true;
} 
return false;


   }
}