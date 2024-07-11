public class Frequency {
    public static void main(String[] args) {
        int arr[] ={10,20,70,50,70,10,70,10,90};
        for(int i=0;i<arr.length; ++i)
        {
            int x =arr[i];
            int count=0;
            if(x==-1) continue;
            for(int j=0;j<arr.length; ++j)
            {
                if(arr[j]==x)
                {
                    ++count;
                    arr[j] = -1;
                }
            }
            System.out.println("The Frequency of "+x+" is "+count);
        }

    }
    
}
