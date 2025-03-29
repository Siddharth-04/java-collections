package bridgelabz.queueInterface;

import java.util.LinkedList;
import java.util.Queue;

class CircularBuffer {
    private Queue<Integer> queue;
    private int capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.queue = new LinkedList<>();
    }

    public void insert(int value) {
        if (queue.size() == capacity) {
            queue.poll(); // Remove oldest element
        }
        queue.offer(value);
    }

    public Queue<Integer> getBuffer() {
        return new LinkedList<>(queue);
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);

        for (int num : cb.getBuffer()) {
            System.out.print(num + " ");
        }
    }
}

//2 3 4