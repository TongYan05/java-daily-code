package API;


import java.util.concurrent.CountDownLatch;

public class pingJie {
    private int arr[];


    public pingJie() {
    }
    public pingJie(int arr[]) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int arr[]) {
        this.arr = arr;
    }

    public String tranformation(int arr[]){
        String str="[";
        for(int i=0;i<arr.length;i++){
            if(i<arr.length-1) {
                str=str+arr[i]+", ";
            }
            else {
                str=str+arr[i]+"]";
            }
        }
        return str;
    }













}
