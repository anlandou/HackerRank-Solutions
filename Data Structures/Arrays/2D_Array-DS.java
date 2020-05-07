/*Given a  2D Array, Print the largest (maximum) hourglass sum found in . */

static int hourglassSum(int[][] arr) {
      
      int sum1 = 0;   
      int maxNum = Integer.MIN_VALUE;
      
      int row = arr.length;
      int col = arr[0].length;

           for(int i = 0; i < row-2; i++){
               for(int j = 0; j < col-2; j++){
            sum1 = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1]+arr[i+2][j+2];             
                maxNum = Math.max(maxNum,sum1);  
               }

           }
           return maxNum;  

    }
    
    //Notes: 
    /* This problem was quite interesting. I remember working on it 
    /* a while ago and I almost banged my head on the wall lol, but today
    /* it wasn't that bad. I was able to come up with a solution but unfortunately 
    /* I kept on getting an error out of bounds exception. I wish I had saved my previous 
    /* to show what the problem was, but anywho the main thing is that I had my for loop
    /* iterate through the enitre array failing to realize that j and i could go up to two at 
    /* a time, so naturally if there are no values below i or to the right j, it won't work.
    /* Big ups to Nick White on YouTube for helping me understand the logic behind this! 
    /* Reminder: Always [ay attention toyour constraints, they make things easier */
