package observer;

import observer.enums.RelevanceEnum;
import observer.models.NewsPublisher;
import observer.models.NewsSubscriber;
import observer.models.Notification;

import java.time.LocalDate;

public class ObserverPattern {

    public ObserverPattern() {
        System.out.println("\n\n*** Observer pattern. ***\n");
    }

    public void example1(){
        System.out.println("* Example 1. *");

        NewsPublisher newsPublisher = new NewsPublisher("Daily news");

        NewsSubscriber subscriber1 = new NewsSubscriber(RelevanceEnum.LOW, "Jhon Doe");
        subscriber1.addSubscription(newsPublisher);

        NewsSubscriber subscriber2 = new NewsSubscriber(RelevanceEnum.LOW, "Jane Doe");
        subscriber2.addSubscription(newsPublisher);

        Notification notification = new Notification(LocalDate.now(), "", "", RelevanceEnum.LOW);
        newsPublisher.addNews(notification);
    }

    public void example2(){
        System.out.println("\n* Example 2. *");

        NewsPublisher newsPublisher = new NewsPublisher("Daily news");

        NewsSubscriber subscriber1 = new NewsSubscriber(RelevanceEnum.HIGH, "Jhon Doe");
        subscriber1.addSubscription(newsPublisher);

        NewsSubscriber subscriber2 = new NewsSubscriber(RelevanceEnum.HIGH, "Jane Doe");
        subscriber2.addSubscription(newsPublisher);

        Notification notification
                = new Notification(LocalDate.now(), "An unexpected compilation error may occure at any moment!",
                "!FakeNews", RelevanceEnum.HIGH);
        newsPublisher.addNews(notification);

        subscriber2.removeSubscription();

        notification
                = new Notification(LocalDate.now(), "Breaking news! Jane Doe unsubscribed :(", "!FakeNews",
                RelevanceEnum.HIGH);
        newsPublisher.addNews(notification);
    }
}
