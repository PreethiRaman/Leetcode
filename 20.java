class Solution 
{
    public boolean isValid(String s) 
    {
       Stack<Character> st = new Stack<>();
        int i=0;
        char tmp;
        while(i<s.length())
        {
            switch(s.charAt(i))
            {       
                case'(' :
                case'[' :
                case'{' :
                st.add(s.charAt(i));
                break;
                case')' :
                if(st.isEmpty())
                    return false;
                tmp=st.pop();
                if(tmp!='(')
                    return false;
                break;
                case']' :
                if(st.isEmpty())
                    return false;
                tmp=st.pop();
                if(tmp!='[')
                    return false;
                break;
                case'}':
                if(st.isEmpty())
                    return false;
                tmp=st.pop();
                if(tmp!='{')
                    return false;
                break;     
    }
        i++;
    }
        if(!st.isEmpty())
            return false;
        return true;
    }
}