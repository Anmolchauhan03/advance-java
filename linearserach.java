
public class linearserach {
    public static int linearSearch(int[] arr, int value){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == value){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        int[] arr= {10,20,30,50,70,90};    
        int value = 50;    
        System.out.println(linearSearch(arr, value));    
    }    

    
}