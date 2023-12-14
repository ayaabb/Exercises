//Stacks and queues:
//*******************************************************
//question 1:
class MyStack {
  Queue<Integer>s;
   Queue<Integer>f;
    public MyStack() {
        f=new LinkedList<>();
        s=new LinkedList<>();;
    }
    
    public void push(int x) {
        if(f.isEmpty())
            f.add(x);
        else{
            s.add(x);
            while(!f.isEmpty())
               { s.add(f.peek());
                f.remove();
                }
           
                
             while(!s.isEmpty())
               { f.add(s.peek());
                s.remove();
                }
   
           }
    }
    
    public int pop() {
        if(f.isEmpty())
           return -1;
        int x=f.peek();
        f.remove();
        return x;
    }
    
    public int top() {
        if(f.isEmpty())
           return -1;
        return f.peek();
    }
    
    public boolean empty() {
        if(f.isEmpty())
           return true;
        return false;
    }
}

//*******************************************************
//question 2:
class MyQueue {
    Stack<Integer>f;
    Stack<Integer>s;
    public MyQueue() {
        f=new Stack<Integer>();
        s=new Stack<Integer>();
    }
    
    public void push(int x) {
        if(f.empty())
           f.push(x);
        else{
           while(!f.empty())
             {
                 s.push(f.pop());
             }
             f.push(x);
               while(!s.empty())
             {
                f.push(s.pop());
             }
            
        }
    }
    
    public int pop() {
        if(f.empty())
          return -1;
        int x=f.peek();
        f.pop();
        return x;
    }
    
    public int peek() {
       if(f.empty())
          return -1;
        return f.peek();
    }
    
    public boolean empty() {
          if(f.empty())
              return true;
           return false;
    }
}

//*******************************************************
//question 3:
 public boolean isValid(String s) {
        Stack<Character>st=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='[')
               st.push(s.charAt(i));
            else
            {
            if(st.empty()||s.charAt(i)=='}'&&st.peek()!='{'||s.charAt(i)==']'&&st.peek()!='['||s.charAt(i)==')'&&st.peek()!='(')
                return false;

            st.pop();
            }
        }
        if(st.empty())
           return true;
        return false;
    }
