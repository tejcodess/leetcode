class Solution {
    public int maxVowels(String s, int k) {
        
        int max=0;
        int temp=0;
        for(int i=0; i<s.length() && i<k; i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                temp+=1;
            }
        }
        max=temp;
        for(int i=k; i<s.length(); i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                temp++;
            }

            if(s.charAt(i-k)=='a'||s.charAt(i-k)=='e'||s.charAt(i-k)=='i'||s.charAt(i-k)=='o'||s.charAt(i-k)=='u'){
                temp--;
            }
            if(max<temp){
                max=temp;
            }
        }
        return max;
    }
}