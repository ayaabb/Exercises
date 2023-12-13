//exercise 1:
//*******************************************************
//qustion 1:
 
    public void reverseString(char[] s) {
        char tmp;
        int n=s.length;
        int l=n-1;
        for(int i=0;i<l;i++)
        {
            tmp=s[i];
            s[i]=s[l];
            s[l]=tmp;
            l--;
        }

//*******************************************************
//qustion 2:
 
public static int[] find_minmax(int[] arr)
    {
    int max=arr[0];
    int min=arr[0];
    int[] minmax=new int[2];
    for(int i=1;i<arr.length;i++)
    {
       if(arr[i]>max)
          max=arr[i];
       if(arr[i]<min)
         min=arr[i];
    }
    
    minmax[0]=min;
    minmax[1]=max;
    return minmax;
    }
 

//*******************************************************
//qustion 3:
 
   public int removeDuplicates(int[] nums) {
        int i=0,j=1;  
        
        while(i<nums.length&&j<nums.length)
        {
           if(nums[i]==nums[j])
                j++;
            else 
              {   
                  nums[++i]=nums[j++];
              }
        }

        return i+1;
    }

 