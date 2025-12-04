package observerPattern;

import java.util.List;

public class NewsAgency implements NewsAgencySubject {
    private String newsHeadline;
    private List<Subscriber> subscriberList;

    public String getNewsHeadline() {
        return newsHeadline;
    }

    public void setNewsHeadline(String newsHeadline) {
        this.newsHeadline = newsHeadline;
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }

    @Override
    public void attach(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void detach(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public String notifySubscribers() {
        String output = new String();
        for (Subscriber subscriber : subscriberList) {
            output += "Hey, " + subscriber.getSubscriberName() + "!\n";
            output += "Breaking News: " + newsHeadline + "!\n\n";
        }
        return output;
    }
}