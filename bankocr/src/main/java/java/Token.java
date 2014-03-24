package java;

public class Token {
    private final String line0;
    private final String line1;
    private final String line2;

    public Token(String line0, String line1, String line2) {
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
    public String toString() {
        return String.format("%s\n%s\n%s",line0, line1, line2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Token token = (Token) o;

        if (line0 != null ? !line0.equals(token.line0) : token.line0 != null) return false;
        if (line1 != null ? !line1.equals(token.line1) : token.line1 != null) return false;
        if (line2 != null ? !line2.equals(token.line2) : token.line2 != null) return false;

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