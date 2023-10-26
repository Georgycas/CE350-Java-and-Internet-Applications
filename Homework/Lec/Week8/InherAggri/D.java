public class D {
    private int d;

    public D(int d) {
        this.d = d;
        trace("D: " + d);
    }

    private void trace(String s) {
        System.out.println(s);
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public boolean isLargeValue() {
        return d > 100;
    }

    public void changetoZero() {
        d = 0;
    }

    @Override
    public String toString() {
        return "D{" + "d=" + d + '}';
    }

    @Override
    protected D clone() throws CloneNotSupportedException {
        return (D) super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        D d1 = (D) obj;
        return d == d1.d;
    }
}
