public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
           
           long whole = n/s.length();  
           long remainder = n % s.length(); 
           long numFound = 0;
           long numTotal = 0;  

            //   if(s.length() == 1). //I dont understand why this doesn't matter 
            //      return n; 

            //first occurence of original string 
                for(int i = 0; i < s.length(); i++){
                    if(s.charAt(i) == 'a'){
                        numFound++; 
                    }
                }

           numTotal += whole * numFound; 
           
            for(int j = 0; j < remainder; j++){
                if(s.charAt(j) == 'a')
                    numTotal++; 
            }
           
           return numTotal; 

        }
