public class ConcatorImpl implements Concator {
    private StringConcatStrategy strategy;

    @Override
    public void setStrategy(StringConcatStrategy s) {
        this.strategy = s;
    }

    @Override
    public String concat(String a, String b) {
        return this.strategy.concat(a, b);
    }
}
