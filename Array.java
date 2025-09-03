// Reverse a sub array of an given array of length k
import java.util.ArrayList;
public class Array {

    static void reverseInGroups(int[] arr, int k){
        int n = arr.length; 

        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1); 

            // reverse the sub-array
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    


    public static ArrayList<Integer> findDuplicates(int arr[]){
        ArrayList<Integer> ans =new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            int c=0;
            for(int it :ans){
                if(arr[i]==it){
                    c++;
                    break;
                }

            }
            if(c>0){continue;}
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    c++;
                    break;
                }
            }

            // if duplicate found, add to result
            if (c > 0) ans.add(arr[i]);
        }

        return ans;
        

    }
    // sorted wave form 
    public void waveform(int arr[]){
         int n=arr.length;

         for(int i=0;i<n-1;i=i+1){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
         }
        return;
    }

    // roatate the array along clockwise using k times 
    public static void rotateArray(int arr[],int k){
        int n=arr.length;
        if(k==0||arr.length==0){
            return;
        }
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        rotateArray(arr,k);
        

    }
    public static int  MaxSumArray(int arr[]){
        int n=arr.length;
        int currsum=0;
         int res=arr[0];
        for(int i=0;i<n;i++){
           
            for(int j=i;j<n;j++){
                 currsum=res+arr[j];
                 res=Math.max(res, j);
            }
            
        }
        return res;
    }


    public static int KadaneMaxSumArray(int arr[]){
         int res = arr[0];
        
        // Maximum sum of subarray ending at current position
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {
            
            // Either extend the previous subarray or start 
            // new from current element
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
          
            // Update result if the new subarray sum is larger
            res = Math.max(res, maxEnding);
        }
        return res;
    }
    public int[] rotateclockwise(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // handle k > n
        int i, j, temp;

        // Step 1: reverse the whole array
        for (i = 0, j = n - 1; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Step 2: reverse first k elements
        for (i = 0, j = k - 1; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Step 3: reverse remaining n-k elements
        for (i = k, j = n - 1; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;

        reverseInGroups(arr, k);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}