package observerPattern;

public interface NewsAgencySubject {
    public void attach(Subscriber subscriber);
    public void detach(Subscriber subscriber);
    public String notifySubscribers();
}