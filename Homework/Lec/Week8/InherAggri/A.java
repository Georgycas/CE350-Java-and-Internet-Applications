public class A {
    private String name;
    private B b;
    private F f;

    public A(String name, B b, F f) {
        this.name = name;
        this.b = b;
        this.f = f;
        trace("A: " + toString());
    }

    private void trace(String s) {
        System.out.println(s);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public F getF() {
        return f;
    }

    public void setF(F f) {
        this.f = f;
    }

    public boolean isBruceLee() {
        return "Bruce Lee".equals(name);
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public void changetoZero() {
        b.changetoZero();
        f.changetoZero();
    }

    @Override
    public String toString() {
        return "A{" + "name='" + name + '\'' + ", b=" + b + ", f=" + f + '}';
    }

    @Override
    protected A clone() throws CloneNotSupportedException {
        A cloned = (A) super.clone();
        cloned.b = this.b.clone();
        return cloned;
    }
}