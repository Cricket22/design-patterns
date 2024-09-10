package observer.models;

import observer.enums.RelevanceEnum;

import java.util.ArrayList;
import java.util.List;

public class NewsSubscriber {
    private NewsPublisher newsPublisher;
    private List<Notification> notifications = new ArrayList<>();
    private RelevanceEnum relevanceEnum;
    private String name;

    public NewsSubscriber(RelevanceEnum relevanceEnum, String name) {
        this.relevanceEnum = relevanceEnum;
        this.name = name;
    }

    public RelevanceEnum getRelevanceEnum() {
        return relevanceEnum;
    }


    public String getName() {
        return name;
    }


    public void addSubscription(NewsPublisher newsPublisher){
        this.newsPublisher = newsPublisher;
        newsPublisher.addSubscriber(this);
    }

    public void update(Notification notification){
        notifications.add(notification);

        System.out.println("\nSubscriber: " + this.name + notification.toString());
    }

    public void removeSubscription(){
        this.newsPublisher.removeSubscriber(this);
    }
}
