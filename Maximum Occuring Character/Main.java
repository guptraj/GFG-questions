//QUESTION LINK
// https://practice.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution {
    // Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String s)
    {
       HashMap<Character,Integer> hm = new HashMap<>();
       for(int i=0;i<s.length();i++)
       {
           char c= s.charAt(i);
           if(hm.containsKey(c)){
               int val = hm.get(c);
               hm.put(c,val+1);
           }
           else{
               hm.put(c,1);
           }
       }
       char max= s.charAt(0);
       for(char key : hm.keySet())
       {
           if(hm.get(key)==hm.get(max){
               max=
           }
           if(hm.get(key)>hm.get(max)){
               max=key;
           }
       }
       return max;
    }
}