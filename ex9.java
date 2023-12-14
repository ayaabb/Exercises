//Bit manipulation:
//*****************************************
//question 1:
 
 public String odd_even(int n) {
         
        if((int)(n&1)==1)
           return "odd";
        return "even";

    }
	
//*****************************************
//question 2:
 
 public int setbits(int n) {
        int c=0;
        while(n!=0)
        {
            c=c+(int)(n&1);
            n=(int)(n>>1);
        }
        return c;
    }
