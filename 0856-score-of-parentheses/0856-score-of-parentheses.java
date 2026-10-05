class Solution {
    public int scoreOfParentheses(String s) {
        int n = s.length()-1;
        String str = "";
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(' && s.charAt(i+1)=='(')
            {
                str += "2*(";
            }
            else if(s.charAt(i)=='(' && s.charAt(i+1)==')')
            {
                str += "1";
            }
            else if(s.charAt(i)==')' && s.charAt(i+1)==')')
            {
                str += ")";
            }
            else if (s.charAt(i) == ')' && s.charAt(i + 1) == '(')
            {
                str += "+";
            }
        }
        int res = convertToNumber(str);
        return res;
    }
    public static int convertToNumber(String str)
    {
        Deque<Integer> values = new ArrayDeque<>();
        Deque<Character> operators = new ArrayDeque<>();

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
            {
                values.push(ch-'0');
            }
            else if(ch=='(')
            {
                operators.push(ch);
            }
            else if(ch==')')
            {
                while(!operators.isEmpty() && operators.peek()!='(')
                {
                    int top1 = values.pop();
                    int top2 = values.pop();
                    
                    char op = operators.pop();
                    if(op=='*')
                    {
                        values.push(top2*top1);
                    }
                    else if(op=='+')
                    {
                        values.push(top2+top1);
                    }
                }
                operators.pop();
            }
            else{
                while(!operators.isEmpty() && operators.peek()!='(' && precedence(operators.peek())>precedence(ch))
                {
                    int top1 = values.pop();
                    int top2 = values.pop();
                    char op = operators.pop();
                    if(op=='*')
                    {
                        values.push(top2*top1);
                    }
                    else if(op=='+')
                    {
                        values.push(top2+top1);
                    }
                }
                operators.push(ch);
            }
        }
        while(!operators.isEmpty())
        {
            int top1 = values.pop();
            int top2 = values.pop();
            char op = operators.pop();
            if(op=='*')
            {
                values.push(top2*top1);
            }
            else if(op=='+')
            {
                values.push(top2+top1);
            }
        }
        return values.pop();
    }
    public static int precedence(char op) {

        if (op == '*') {
            return 2;
        }

        if (op == '+') {
            return 1;
        }

        return 0;
    }
}