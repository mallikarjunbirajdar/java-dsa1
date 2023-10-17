import java.util.*;


public class bubble_sort {
    public static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={100,90,40,25,85,69,36,59,60,85};
        for (int i=0;i<arr.length-1;i++)
        {
            int  smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[smallest]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

        }

printArray(arr);
    }

}
