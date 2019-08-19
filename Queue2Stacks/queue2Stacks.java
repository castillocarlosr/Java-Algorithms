import java.util.Stack;

class Queue2Stack{
    
    Stack<Integer> load = new Stack<Integer>();
    Stack<Integer> unLoad = new Stack<Integer>();

    void EnqueueJava(int inputQ){
        while(!unLoad.isEmpty()){
            load.push(unload.pop());
        }
        load.push(inputQ);
    }

    void DequeueJava(){
        while(!load.isEmpty()){
            unLoad.push(load.pop());
        }
        unLoad.pop();
    }

    int PeekJava(){
        while(!load.isEmpty()){
            unLoad.push(load.pop());
        }
        return unLoad.peek();
    }
    
    
    public static void main(String[] args) {
        System.out.println("Hello Queue made out of 2 stacks!");
        System.out.println(" ");

        System.out.println("Enqueue: 2, 4, 8, 14, 27");
        Queue2Stack q2s = new Queue2Stack();
        q2s.EnqueueJava(2);
        q2s.EnqueueJava(4);
        q2s.EnqueueJava(8);
        q2s.EnqueueJava(14);
        q2s.EnqueueJava(27);

        q2s.DequeueJava();
        System.out.println("Dequeue");

        q2s.EnqueueJava(22);
        q2s.EnqueueJava(40);
        System.out.println("Enqueue: 22, 40");

        System.out.println(q2s.PeekJava());
        System.out.println("Dequeue");
        System.out.println(q2s.PeekJava());
        
    }
}