//Recursion:
//*******************************************************
//question 1:

public int factorial(int num)
{
   if(num==1)
		return num;
   return num*factorial(num-1);
}
 
//*******************************************************
//question 2:

//we init left to be 0 and right to str.length()-1

public static void permutation(String str,Vector<String> per_list,int left,int right){
	if(right==left){	
	per_list.add(str);
	return;
	}
	else{
		for(int i=left;i<=right;i++){
			str=swap(str,left,i);
			permutation(str,per_list,left+1,right);
			str=swap(str,left,i);
	    }
    }

}
 public static String swap(String a, int i, int j) { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i]; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
