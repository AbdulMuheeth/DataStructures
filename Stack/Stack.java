class Stack_new {
	private int max;
	private int top;
	private int[] arr;
	public Stack_new(int max){
		top=-1;
		this.max = max;
		arr = new int[max];
	} 
	public boolean isEmpty(){
		return top<0;
	}
	public boolean isFull(){
		return top==max-1;
	}
	public void push(int num){
		if(!isFull()){
			arr[++top]=num;
			System.out.println(num+" added to the stack at last");
		}
		else{
			System.out.println("stack overflow");
		}
	}
	public int pop(){
		if(!isEmpty()){
			int x= arr[--top];
			return x;
			
		}
		else{
			System.out.println("Stack underflow");
			return -1;
		}
	}
	public int peek(){
		if(!isEmpty()){
			return arr[top];
		}
		else{
			
			System.out.println("stack underflow");
			return -1;
		}

	}
	public void display(){
		if (!isEmpty()){
			System.out.println("stack is ");
			for(int i=0;i<arr.length;i++){
    				System.out.println(arr[i]);
			}
		}
		else{
			System.out.println("stack underflow");
		}
	}

}


public class Stack {
	public static void main(String args[]){
		
		Stack_new St1 = new Stack_new(4);
		St1.push(1);
		St1.push(2);
		St1.push(3);
		St1.push(4);
		
		St1.display();

		int re = St1.pop();
		St1.push(5);


		St1.display();
		

	}
}