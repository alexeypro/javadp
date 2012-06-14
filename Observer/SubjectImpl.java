import java.util.HashSet;
import java.util.Set;

public class SubjectImpl implements Subject {
    private final Set<Observer> observers = new HashSet<Observer>();

    @Override
    public void addObserver(Observer o) {
          this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

}