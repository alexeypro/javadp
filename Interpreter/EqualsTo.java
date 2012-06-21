
public class EqualsTo implements Criteria {
    private String fieldName;
    private String value;
    public EqualsTo(String fieldName, String value) {
        this.fieldName = fieldName;
        this.value = value;
    }

    @Override
    public String interpret() {
        return "(" + this.fieldName + "='" + this.value + "')";
    }
}
