import java.util.*;
public class finddup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int  i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));    
        System.out.println("The duplicate Number is:"+ findduplicate(arr));    
    }

    static int findduplicate(int arr[]){

        int i=0;
        while(i < arr.length){
            if(i != arr[i] -1){
                int correct = arr[i] -1;
                if(arr[correct] != arr[i]){
                    swap(arr, i, correct);
                }
                else{
                    return arr[i];
                }

            }
            else{
                i++;
            }
        }



        return -1;
    }



    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
