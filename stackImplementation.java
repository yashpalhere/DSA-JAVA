class stack{
    public int top=-1;
    public int size;
    public int[] arr;
    stack(int size){
        this.size = size;
        arr = new int[size];
    }
    public void push(int val){
        if(top==size-1){
            System.out.println("Stack is full.");
            return;
        }
        else{
            top++;
            arr[top] = val;
        }
    }
    public void pop(){
        if(top ==-1){
            System.out.println("Stack is empty.");
        }
        else{
            top--;
        }
    }
    public int peek(){
        return arr[top];
    }
    public boolean isEmpty(){
        if(top !=-1){
            return  false;
        }
        else{
            return  true;
        }
    }
    public void print(){
        System.out.print("[");
        for(int i =0;i<=top;i++){
            System.out.print(arr[i]);
            if(i!=top){
                System.out.print(", ");
            }

        }
        System.out.print("]");
    }


}
public class stackImplementation {
    public static void main(String[] args) {
        stack s = new stack(5);

//        System.out.println(s.isEmpty());
        s.push(2);
//        System.out.println(s.isEmpty());
//        System.out.println(s.peek());
        s.push(5);
//        System.out.println(s.peek());
        s.push(7);
        s.push(9);
        s.push(10);
        s.pop();
        s.push(11);
//        s.pop();
        s.pop();
//        s.pop();
        s.pop();
//        s.pop();
        s.print();
    }
}
