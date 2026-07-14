package API;

public class formation {



    public formation(){};


    public String transforation(int arr[]){
        String str="[";
        for(int i=0;i<arr.length;i++){
            if(i<arr.length-1){
                str=str+arr[i]+",";
            }
            else if(i==arr.length-1)str=str+arr[i]+"]";
        }
        return str;
    }







}
