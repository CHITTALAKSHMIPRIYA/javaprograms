class Stack
{
    int MAX = 3;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
 
    boolean isEmpty()
    {
        return (top < 0);
    }
    Stack()
    {
        top = -1;
    }
 
    boolean push(int x)
    {
        if (top >= MAX)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[++top] = x;
            return true;
        }
    }
int peek()
{
if(top==-1)
{
System.out.println("stack empty");
return 0;
}
else
return a[top];
}
 
    int pop()
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int x = a[top--];
            return x;
        }
    }
}
 
// Driver code
class Main
{
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(50);
        System.out.println(s.pop() + " Popped from stack");
System.out.println(s.push(1) + " Popped from stack");
System.out.println(s.peek() + " Popped from stack");
    }
}
