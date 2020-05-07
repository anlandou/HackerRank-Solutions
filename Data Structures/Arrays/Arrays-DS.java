/*Given an array, , of  integers, print each element in reverse order as a single line of space-separated integers.*/

static int[] reverseArray(int[] a) {
          int[] myArray = new int[a.length]; 
          
          int j = 0; 
          for(int i = a.length-1; i >= 0; i--){
              myArray[j] = a[i]; 
              j++; 
          }

          return myArray; 
    }
