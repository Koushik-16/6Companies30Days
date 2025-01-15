package Goldmansachs;

import java.util.ArrayList;

public class MissingAndRepeating {
     ArrayList<Integer> findTwoElement(int arr[]) {
        int i = 0;
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i < n) {
            if(arr[i] != arr[arr[i] - 1]) swap(arr , i , arr[i] - 1);
            else i++;
        }
        for(int k = 0 ; k < n ; k++) {
            if(arr[k] != k + 1) {
                ans.add(arr[k]);
                ans.add(k +1);
                break;
            }
        }
        return ans;
    }
    
    public void swap(int arr [] , int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
