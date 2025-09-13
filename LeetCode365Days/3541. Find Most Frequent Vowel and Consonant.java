class Solution {
    public int maxFreqSum(String s) {
        if(s.length()==0) return 0;
        HashMap<Character,Integer> freqMap= new HashMap<>();
        char[]characterArray=s.toCharArray();
        int maxVowel=0;
        int maxConsonant=0;
        for(Character c : characterArray){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
           if(entry.getKey()== 'a' || entry.getKey()== 'e' ||entry.getKey()== 'i' ||entry.getKey()=='o' || entry.getKey()== 'u'){
            if(entry.getValue()>maxVowel){
                maxVowel=entry.getValue();
            }
           }
           else{
            if(entry.getValue() > maxConsonant){
                maxConsonant=entry.getValue();
            }
           }
}

       
return maxVowel + maxConsonant;
    }
}
