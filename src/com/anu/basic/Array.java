package com.anu.basic;

public class Array {
    private Array(){}
    public static void sequencing(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int x=arr[i];
                    arr[i]=arr[j];
                    arr[j]=x;
                }
            }
        }
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1)System.out.print(arr[i]+"]");
            else System.out.print(arr[i]+",");
        }
    }
}
