package cn.thread.publish;

public class Escape {
    private int thisCanBeEscape = 0;
    public Escape() {
        new inner();
    }
    private class inner{
        public inner() {
            System.out.println(Escape.this.thisCanBeEscape);
        }
    }

    public static void main(String[] args) {
        new Escape();
    }
}
