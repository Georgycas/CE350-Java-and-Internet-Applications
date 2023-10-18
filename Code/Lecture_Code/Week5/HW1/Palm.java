class Palm implements Cloneable {
    private int size;

    public Palm(int size1) {
        this.size = size1;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public boolean isLarge() {
        return size > 50;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Palm palm = (Palm) obj;
        return size == palm.size;
    }

    public String toString() {
        return "Size of palm is " + size;
    }

    public void setSize(int i) {
    }
}
