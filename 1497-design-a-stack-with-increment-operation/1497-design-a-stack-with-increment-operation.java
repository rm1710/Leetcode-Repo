import java.util.Stack;

class CustomStack {
    Stack<Integer> s1;
    int size;

    public CustomStack(int maxSize) {
        this.size = maxSize;
        s1 = new Stack<>();
    }

    public void push(int x) {
        if (s1.size() < size) s1.push(x);
    }

    public int pop() {
        if (s1.isEmpty()) return -1;
        return s1.pop();
    }

    public void increment(int k, int val) {
        Stack<Integer> temp = new Stack<>();
        int total = s1.size();
        int limit = Math.min(k, total);

        while (!s1.isEmpty()) {
            temp.push(s1.pop());
        }


        while (!temp.isEmpty()) {
            int ele = temp.pop();
            int processed = total - temp.size();
            if (processed <= limit) {
                s1.push(ele + val);
            } else {
                s1.push(ele);
            }
        }
    }
}
