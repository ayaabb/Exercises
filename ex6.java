//Search algorithms:
//*******************************************************
//question 1:
public int linear_search(int arr[],int num){
	
	int n=arr.length;
	for(int i=0;i<n;i++)
		if(arr[i]==num)
			return i;
		
	return -1;
	
}

//*******************************************************
//question 2:
public int binary_search(int arr[],int num){
	int l=0,r=arr.length-1,mid=(l+r)/2;
	while(l<=r){
		if(num==arr[mid])
			return mid;
		else if(num<arr[mid]){
		r=mid-1;
		mid=(l+r)/2;
		}
		else{
		l=mid+1;
		mid=(l+r)/2;
		}
		
	}
	return -1;
}
