package Dados;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    private Queue<Integer> queue;

    public Fila() {
        queue = new LinkedList<>();
    }

    public void add(int element) {
        queue.add(element);
    }

    public Integer remove() {
        if (!queue.isEmpty()) {
            return queue.poll();
        } else {
            return null;
        }
    }

    public int size() {
        return queue.size();
    }

    public void shift() {
        if (!queue.isEmpty()) {
            Integer element = queue.poll();
            queue.add(element);
        }
    }

    @Override
    public String toString() {
        return queue.toString();
    }

    public void clear() {
    }
}
