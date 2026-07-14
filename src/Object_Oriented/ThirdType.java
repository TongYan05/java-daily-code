package Object_Oriented;

public class ThirdType {

    private ThirdType(){}
    public static void maxarray(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int x=arr[i];
                    arr[i]=arr[j];
                    arr[j]=x;
                }
            }
        }
        System.out.println("the max number is:"+arr[arr.length-1]);
    }

    public static void showing(int arr[]) {
        System.out.print("the array is:"+"[");
        for (int i = 0; i < arr.length; i++){
            if(i==arr.length-1)System.out.print(arr[i]+"]");
            else System.out.print(arr[i]+",");
        }
        System.out.println();
    }



}
