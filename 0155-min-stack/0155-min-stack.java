class MinStack {
    int top;
    int[] arrStack;
    int[] minStack;
    public MinStack() {
        top=-1;
        arrStack=new int[10000];
        minStack=new int[10000];
    }
    
    public void push(int val) {
        arrStack[++top]=val;
        if(top==0){
            minStack[top]=val;
        }else{
            minStack[top]= Math.min(val,minStack[top-1]);
        }
    }
    
    public void pop() {
        if(top==-1) return;
        top--;

    }
    
    public int top() {
        if(top==-1) return -1;
        return arrStack[top];
    }
    
    public int getMin() {
        if(top==-1)return -1;
        return minStack[top];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */