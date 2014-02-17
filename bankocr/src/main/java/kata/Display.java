package kata;

public class Display {
    private final String line0;
    private final String line1;
    private final String line2;

    public Display(String line0, String line1, String line2) {
        this.line0 = line0;
        this.line1 = line1;
        this.line2 = line2;
    }

    public String getLine0() {
        return line0;
    }

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Display display = (Display) o;

        if (line0 != null ? !line0.equals(display.line0) : display.line0 != null) return false;
        if (line1 != null ? !line1.equals(display.line1) : display.line1 != null) return false;
        if (line2 != null ? !line2.equals(display.line2) : display.line2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = line0 != null ? line0.hashCode() : 0;
        result = 31 * result + (line1 != null ? line1.hashCode() : 0);
        result = 31 * result + (line2 != null ? line2.hashCode() : 0);
        return result;
    }
}
