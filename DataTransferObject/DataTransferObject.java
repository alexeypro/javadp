
public class DataTransferObject {
    private String fieldA;
    private String fieldB;

    public DataTransferObject(DomainModel1 m1, DomainModel2 m2) {
        this.fieldA = String.valueOf(m1.getField1());
        this.fieldB = m2.getField3() + " = " + String.valueOf(m1.getField2());
    }

    public String getFieldA() {
        return fieldA;
    }

    public void setFieldA(String fieldA) {
        this.fieldA = fieldA;
    }

    public String getFieldB() {
        return fieldB;
    }

    public void setFieldB(String fieldB) {
        this.fieldB = fieldB;
    }

    public String toXML() {
        return "<xml><flda>" + this.fieldA + "</flda><fldb>" + this.fieldB + "</fldb></xml>";
    }

    public String toJSON() {
        return "{ 'flda': '" + this.fieldA + "', 'fldb': '" + this.fieldB + "' }";
    }
}
