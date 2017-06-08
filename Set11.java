import java.util.*;
class ArrayRange{
    public static void main(String args[])
    { int i;
    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int[] arr=new int[size];
        for(i=0;i<size;i++)
        {
            arr[i]=in.nextInt();
        }
        for(i=0;i<size;i++)
        {
                if(hm.containsKey(arr[i]))
                    hm.put(arr[i],hm.get(arr[i])+1);
                else
                 hm.put(arr[i],1);
        }
        Set<Integer> ss=hm.keySet();
        for(int s:ss){
            if(hm.get(s)>1)
            System.out.print(s+" ");
        }
    }
}
