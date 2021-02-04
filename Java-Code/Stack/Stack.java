import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.Arrays;

public class Stack {
    private int []items = new int[5];
    private  int top = 0;

    public  void push(int data){
        if(top == items.length){
            items = Arrays.copyOf(items, 2*items.length);
        }
        items[top]=data;
        top++;
    }
    public int pop(){
        if(top == 0){
            throw new IllegalStateException("Stack is empty");
        }
        int newTop = items[top-1];
        top--;
        return newTop;
    }
    public boolean isEmpty(){
        return (top==0);
    }
}
