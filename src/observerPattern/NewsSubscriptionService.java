package observerPattern;
import java.util.*;

public class NewsSubscriptionService {
    public static void main(String[] args) {
        // 1. Create Subscribers
        Subscriber djem = new Subscriber();
        djem.setSubscriberName("Djem");

        Subscriber jm = new Subscriber();
        jm.setSubscriberName("JM");

        Subscriber jace = new Subscriber();
        jace.setSubscriberName("Jace");

        // 2. Initialize the subscriber list
        List<Subscriber> subscriberList = new ArrayList<>();
        subscriberList.add(djem);
        subscriberList.add(jm);
        subscriberList.add(jace);

        // 3. Create the NewsAgency and set initial state
        NewsAgency agency = new NewsAgency();
        agency.setNewsHeadline("Typhoon Uwan exits PAR");
        agency.setSubscriberList(subscriberList);

        // 4. Notify initial subscribers
        System.out.println("--- Morning News Update ---");
        System.out.println(agency.notifySubscribers());

        // 5. Demonstrate Dynamic Subscription (Decoupling)
        // Djem unsubscribes
        agency.detach(djem);

        // A new user, Ricky, subscribes
        Subscriber ricky = new Subscriber();
        ricky.setSubscriberName("Ricky");
        agency.attach(ricky);

        // 6. Update the News Headline
        agency.setNewsHeadline("Classes suspended in QC due to heavy rains");

        // 7. Notify the new list of subscribers
        System.out.println("--- Afternoon Breaking News ---");
        System.out.println(agency.notifySubscribers());
    }
}