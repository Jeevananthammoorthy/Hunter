import java.util.*;
public class set19{
    public static void main(String[] args) {
        int i,j;
         Scanner in=new Scanner(System.in);
    int size=in.nextInt();
    int[] arr=new int[size];
    for(i=0;i<size;i++) 
        arr[i]=in.nextInt();
    for(i=0;i<size;i++)
    for(j=0;j<size;j++){
        int ans=arr[i]+arr[j];
                if(ans==0){
            System.out.println(arr[i]+" "+arr[j]);
    }
    }   
    }   
}
