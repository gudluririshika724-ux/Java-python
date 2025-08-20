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

    // roatate the array along clockwise using k times 
    public static void rotateArray(int arr[],int k){
        int n=arr.length;
        if(n==0||arr.length==0){
            return;
        }
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        rotateArray(arr,k);
        

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