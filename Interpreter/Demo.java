import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Criteria> crits = new ArrayList<Criteria>();
        crits.add(new EqualsTo("fullname", "Alexey"));
        crits.add(new LessThan("age", 25));

        Query q = new QueryImpl();
        System.out.println("Built half-assed SQL query = " + q.interpret(crits));
    }
}
