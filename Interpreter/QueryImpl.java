import java.util.List;

public class QueryImpl implements Query {
    @Override
    public String interpret(List<Criteria> l) {
        String result = "(1)";
        for (Criteria c : l) {
            result += " AND " + c.interpret();
        }
        return result;
    }
}
