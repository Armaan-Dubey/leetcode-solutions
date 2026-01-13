class Solution {
    public String largestOddNumber(String num) {
        for( int i=num.length()-1;i>=0;i--){
        char ch =num.charAt(i);
        if((ch-'0') % 2 !=0){
            return (num.substring(0,i+1));
        } 
           
        
        } return "";
    }//Convert char to digit using ch - '0', check if it’s odd, and return the longest prefix ending there.
}  //string.substring(startIndex, endIndex) 
//we are doing i+1 so that it gets included 











