package org.example.ChainOfResponsibility;

public abstract class Notifer {
    private int priority;
    private Notifer nextNotifer;

    public Notifer(int priority) {
        this.priority = priority;
    }

    public void setNextNotifer(Notifer nextNotifer) {
        this.nextNotifer = nextNotifer;
    }

    public void notifyManager(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        if (nextNotifer != null) {
            nextNotifer.notifyManager(message, level);
        }
    }

    public abstract void write(String message);
}

