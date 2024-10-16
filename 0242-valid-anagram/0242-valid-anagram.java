class Solution {
    public boolean isAnagram(String s, String t) {
       
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        
        if(s.length() != t.length())
            return false;
        
        for(int i = 0 ; i< s.length(); i++){
            
        map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
         
        map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
            
          
        }
           return map1.equals(map2);
        
    }

}


//using HashMap
       //s                 t
    /*
        a -> 3              n -> 1
        n -> 1              a -> 3
        g -> 1              g -> 1
        r -> 1              r -> 1
        m -> 1              m -> 1
    */

/*
using sort 

        if(s.length() != t.length())
            return false;
    

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();

        Arrays.sort(sSort);
        Arrays.sort(tSort);
        
       return Arrays.equals(sSort, tSort);
*/