public class queueimple {
    int queue[]=new int[5];
    int size;
    int rear;
    int front;
    public void enqueue(int data){
        queue[rear]=data;
        rear++;
        size+=1;
    }

    public int dequeue(){
        int data=queue[front];
        front+=1;
        size-=1;
        return data;
    }
    public void display(){
        for(int n: queue){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        queueimple q=new queueimple();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println(q.dequeue()+ " removed");
        q.display();
    }

}
