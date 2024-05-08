package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int STACK_CAPACITY = 12;
    public static final int EMPTY_STACK_MARKER = -1;
    private final int[] numbers = new int[STACK_CAPACITY];

    public int total = EMPTY_STACK_MARKER;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_STACK_MARKER;
    }

    public boolean isFull() {
        return total == STACK_CAPACITY - 1;
    }

    protected int getTopElement() {
        if (callCheck())
            return EMPTY_STACK_MARKER;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_STACK_MARKER;
        return numbers[total--];
    }

}
