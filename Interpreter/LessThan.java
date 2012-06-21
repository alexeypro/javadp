
public class LessThan implements Criteria {
    private String fieldName;
    private int value;
    public LessThan(String fieldName, int value) {
        this.fieldName = fieldName;
        this.value = value;
    }

    @Override
    public String interpret() {
        return "(" + this.fieldName + "<" + this.value + ")";
    }
}
