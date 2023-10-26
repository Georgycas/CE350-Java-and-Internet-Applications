public class B {
    private int b;

    public B(int b) {
        this.b = b;
        trace("B: " + b);
    }

    private void trace(String s) {
        System.out.println(s);
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public boolean isLargeValue() {
        return b > 100;
    }

    public void changetoZero() {
        b = 0;
    }

    @Override
    public String toString() {
        return "B{" + "b=" + b + '}';
    }

    @Override
    protected B clone() throws CloneNotSupportedException {
        return (B) super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        B b1 = (B) obj;
        return b == b1.b;
    }
}
