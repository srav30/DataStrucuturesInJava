import java.util.EmptyStackException;

public class mystack {
	char arr[];
	int size;
	int index=0;
	
	public mystack(){
		
	}
	
	public mystack(int size){
		this.size = size;
		arr = new char[size];
		this.arr = arr;
	}
	
	public void push(char c){
		if(isFull()){
			throw new StackOverflowError("Stack is full");
		}
		arr[index] = c;
		index++;
		
	}
	
	public char pop(){
		if(isEmpty()){
			throw new EmptyStackException();
			
		}
		return arr[--index];
		
	}

	private boolean isEmpty() {
		
		if(index==0){
			return true;
		}
		else 
		{return false;}
	}

	private boolean isFull() {
		if(index == size){
			return true;
		}
		
		
		return false;
	}
	
	public int size(){
		return index;
	}
	
	public void print(){
		arr = this.arr;
		for(int i=0;i<arr.length;i++){
			System.out.print(","+arr[i]);
		}
	}
    public static void main(String args[]){
    	mystack s = new mystack(5);
        s.push('a');
        s.push('a');
        s.push('a');
        s.push('q');
    	char k = s.pop();
    	s.print();
    	System.out.println(k);
    }

}
