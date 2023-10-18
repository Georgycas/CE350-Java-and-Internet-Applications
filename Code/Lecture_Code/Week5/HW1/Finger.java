class Finger implements Cloneable {
    private int len;

    public Finger(int len1) {
        this.len = len1;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public boolean isLong() {
        return len > 30;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Finger finger = (Finger) obj;
        return len == finger.len;
    }

    public String toString() {
        return "Length of finger is " + len;
    }
}
