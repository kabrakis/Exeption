package Sem3.task2;

import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        try (Counter cntr = new Counter()) {
            cntr.add();
            cntr.close();
            cntr.add();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Counter implements AutoCloseable {
    private int num = 0;
    private boolean closed = false;

    public void add() throws IOException {
        if (closed) {
            throw new IOException("Счетчик закрыт");
        }
        num += 1;
    }

    @Override
    public void close() throws Exception {
        num = 0;
        closed = true;
    }
}

