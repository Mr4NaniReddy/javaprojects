import java.util.*;
public class findmanydup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int  i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));  
        System.out.println("DUPS ARE:" + Arrays.toString(findmanydup(arr)));
            
    }

    public static int[] findmanydup(int[] arr){
        int[] arr1 = new int[arr.length];
        int i=0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct])
            {
                swap(arr,i,correct);
            }
            else{
                 i++;
            }
        }
        int m = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[j] == j+1){
                continue;
            }
            else{
                arr1[m] = arr[j];
                m++;
            }
        }
        int[] dup = new int[m];
        for(int k=0;k<m;k++){
            dup[k] = arr1[k];
        }


        return dup;

    }



    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
