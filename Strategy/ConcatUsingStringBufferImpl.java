public class ConcatUsingStringBufferImpl implements StringConcatStrategy {
    @Override
    public String concat(String a, String b) {
        StringBuffer buf = new StringBuffer("Algorithm using StringBuffer = ");
        buf.append(a);
        buf.append(b);
        return buf.toString();
    }
}
