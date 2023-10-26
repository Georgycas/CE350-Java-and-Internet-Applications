import java.util.Objects;

public class E {
    private int e;
    private D d;
    private A a;

    public E(int e, D d, A a) {
        this.e = e;
        this.d = d;
        this.a = a;
        trace("E: " + toString());
    }

    private void trace(String s) {
        System.out.println(s);
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public D getD() {
        return d;
    }

    public void setD(D d) {
        this.d = d;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public boolean isLargeValue() {
        return e > 100 && d.isLargeValue() && a.getB().isLargeValue() && a.getF().isLargeValue();
    }

    public void changetoZero() {
        e = 0;
        d.changetoZero();
        a.changetoZero();
    }

    @Override
    public String toString() {
        return "E{" + "e=" + e + ", d=" + d + ", a=" + a + '}';
    }

    @Override
    protected E clone() throws CloneNotSupportedException {
        E cloned = (E) super.clone();
        cloned.d = this.d.clone();
        cloned.a = this.a.clone();
        return cloned;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        E e1 = (E) obj;
        return e == e1.e && Objects.equals(d, e1.d) && Objects.equals(a, e1.a);
    }
}

