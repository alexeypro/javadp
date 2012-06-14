public class ConcatUsingStringImpl implements StringConcatStrategy {
    @Override
    public String concat(String a, String b) {
        return "Algorithm using String = " + (a + b);
    }
}
