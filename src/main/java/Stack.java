public class Stack<T> {
    private T[] array;
    private int index;

    public Stack(int length) {
        this.index = 0;
        this.array = (T[]) new Object[length];
    }

    public int size() {
        return this.index;
    }
    public boolean empty() {
        return this.size() == 0;
    }
    public void push(T value) {
        if (array.length>index){
            this.array[index++] = value;
        }
        else
            System.out.println("размер стека переполнен");
    }
    public T peek() {
        if (this.empty() == false)
            return this.array[index - 1];
        else {
            System.out.println("добавьте эллемент");
            return null;
        }
    }
    public T pop() {
        if (this.empty() == true){
            System.out.println("добавьте эллемент");
            return null;
        }
        else
            return this.array[--index];


    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(2);
        stack.push("123");
        System.out.println(stack.peek());
        stack.push("1234");
        System.out.println(stack.peek());
        stack.push("1233");

    }
}