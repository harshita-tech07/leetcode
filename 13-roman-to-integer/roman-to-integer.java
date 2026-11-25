class Solution {
    public int romanToInt(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                if(i+1<s.length() && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X')){
                    count--;
                }
                else{
                    count++;
                }
                
            }
            else if(s.charAt(i)=='V'){
                    count=count+5;
            }
            else if(s.charAt(i)=='X'){
                if(i+1<s.length() && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C')){
                    count=count-10;
                }
                else count=count+10;
            }
            else if(s.charAt(i)=='L') count=count+50;
            else if(s.charAt(i)=='C'){
                if(i+1<s.length() && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M')){
                    count=count-100;
                }
                else count=count+100;
            }
            else if(s.charAt(i)=='D') count=count+500;
            else count=count+1000;
                
        }
        return count;
    }
            
}