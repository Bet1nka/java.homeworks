
    public class Queue<T> {
        private T[] array;
        private int index;

        public Queue (int length) {
            this.index = 0;
            this.array = (T[]) new Object[length];
        }

        public int size() { //размер
            return this.index;
        }
        public boolean empty() {
            return this.size() == 0;
        }
        public void offer(T value) { //конец очереди вставка

                this.array[index++] = value;
        }
        public T peek() { //показыывает из начала
                return this.array[0];
        }
        public T[] poll() {// удаляет из начала
            for (int i = 0; i < array.length-1 ; i++) {
                array[i]=array[i+1];


            }
                return array;
        }
        public static void main(String[] args) {
            Queue<String> queue = new Queue<>(10);
            queue.offer("123");
            queue.offer("1234");
            queue.offer("1233");
            queue.offer("1243");
            System.out.println(queue.peek());
            queue.poll();
            System.out.println(queue.peek());

        }
    }

