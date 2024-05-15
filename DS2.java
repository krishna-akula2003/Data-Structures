//sorting an array or commonly known as merging sorted arrays
// i/p:5 6 7 8 1 9
// o/p:1 5 6 7 8 9
import java.util.*;
class Main{
    public static void main(String[] args){
        int n[]={5,6,7,8,1,9}; //  in this two sorted arrays are given as one array
        int low=0;
        int mid=3;
        int high=5;
        sort(n,low,mid,high);
    }
    public static void sort(int n[],int low,int mid,int high){
        int m=mid-low+1;
        int n1=high-mid;
        int[] a1=new int[m];
        int[] b1=new int[n1];
        for(int i=0;i<m;i++){
            a1[i]=n[low+i];
        }
        for(int j=0;j<n1;j++){
            b1[j]=n[mid+j+1];
        }
        int k=0;
        int i=0,j=0;
        while(i<m && j<n1){
            if(a1[i]<=b1[j]){
                n[k]=a1[i];
                i++;
                k++;
            }
            else{
                n[k]=b1[j];
                j++;
                k++;
            }
        }
        while(i<m){
            n[k]=a1[i];
            i++;
            k++;
        }
        while(j<n1){
            n[k]=b1[j];
            j++;
            k++;
        }
        for(int w=0;w<k;w++){
            System.out.print(n[w]+" ");
        }
    }
}
