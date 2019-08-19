import java.util.Stack;

class Queue2Stack{
    
    Stack load = new Stack<Integer>();
    Stack unLoad = new Stack<Integer>();

    void QueueJava(int inputQ){
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
    
    
    public static void main(String[] args) {
        System.out.println("Hello Queue made out of 2 stacks!");
        System.out.println(" ");

        System.out.println("Enqueue: 2, 4, 8, 14, 27");
        System.out.println("Dequeue");
        System.out.println("Enqueue: 22, 40");

        Queue2Stack q2s = new Queue2Stack();
        q2s. 
    }
}