public class MissingInArray {
    
    public static int findMissingElement(int[] arr)
    {
        int n=arr.length+1;  

        int total=n*(n+1)/2;

        int sum=0;
        for(int num:arr)
        {
            sum=sum+num;
        }
        return total-sum;
    }
    public static void main(String args[]){
        int arr[]={3,5,2,7};
        System.out.println(findMissingElement(arr));
    }
}

 /* toal=n*(n+1)/2 
    total=5x(5+1)/2
    total=5x3=15
    sum=1+2+3+5=11
    total-sum=4*/