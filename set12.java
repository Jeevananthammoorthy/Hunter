import java.util.*;
public class set12 {
    public static void main(String[] args) {
        int i,flag=0;
         Scanner in=new Scanner(System.in);
    int size=in.nextInt();
    int[] arr=new int[size];
    for(i=0;i<size;i++) 
        arr[i]=in.nextInt();
    Arrays.sort(arr);
    System.out.print(Arrays.toString(arr));
    for(i=1;i<size;i+=2){
        if(arr[i-1]!=arr[i]){
            flag=1;
            System.out.print(arr[i-1]);
    break;} if(flag!=1){
        System.out.print(arr[size-1]);
        break;}
    }   
    }   
}
