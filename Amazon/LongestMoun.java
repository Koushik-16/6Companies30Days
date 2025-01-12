package Amazon;

public class LongestMoun {
    public int longestMountain(int[] arr) {
        int i = 0;
        int j = 0;
        int length = 0;
      
        while(i < arr.length){
            if( i + 1 < arr.length && arr[i +1] > arr[i]){
                j = i;
                 int count = 0; 
               while(i + 1 < arr.length && arr[i +1] > arr[i] ) i++;
               if(i < arr.length){
                   
                    while(i + 1 < arr.length && arr[i + 1] < arr[i]){          
                     count++;
                        i++;
                    }
                   if(count !=  0)  
                     length = Math.max(length , i -j + 1);
               } 
            }else {
                i++;
            }
        }
        return length;
    }
}
