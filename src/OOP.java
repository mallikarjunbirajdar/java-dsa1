class OOP{
    public static void printarry(int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");

        }
        System.out.print(" ");
    }
    public static void main(String[] args) {
        int arr[]={100,90,80,70};
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[i];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printarry(arr);
    }
}