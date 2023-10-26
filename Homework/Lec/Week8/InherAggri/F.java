public class F {
    private int f;

    public F(int f) {
        this.f = f;
        trace("F: " + f);
    }

    private void trace(String s) {
        System.out.println(s);
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public boolean isLargeValue() {
        return f > 100;
    }

    public void changetoZero() {
        f = 0;
    }

    @Override
    public String toString() {
        return "F{" + "f=" + f + '}';
    }

    @Override
    protected F clone() throws CloneNotSupportedException {
        return (F) super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        F f1 = (F) obj;
        return f == f1.f;
    }
}
