class Queue
{
int max=6;
int front=-1;
int rear=-1;
int a[]=new int[max];
 public int enqueue(int x)
{
if(rear==max-1)
{
System.out.println("queue is full");
return 0;
}
if(front==-1 && rear==-1)
{
front++;
}
a[++rear]=x;
return 0;
}
public int dequeue()
{
if(front==-1)
{
System.out.println("queue is empty");
return 0;
}
if(front>rear)
{
front=rear=-1;
System.out.println("queue is empty");
return 0;
}
return a[front++];
}
public void display()
{
for(int i=front;i<=rear;i++)
{
System.out.println(a[i]);
}
} 
public int peek()
{
if(front==-1)
{
System.out.println("queue is empty");
return 0;
}
return a[front];
}
}
class Test
{
public static void main(String[] args)
{
Queue q=new Queue();
q.enqueue(1);
q.enqueue(2);
q.enqueue(3);

System.out.println(q.dequeue()+"enqueued from queue");
}
}


