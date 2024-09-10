package observer.models;

import observer.enums.RelevanceEnum;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NewsPublisher {
    private List<NewsSubscriber> subscribers = new ArrayList<>();
    private List<Notification> notifications = new ArrayList<>();
    private String name;

    public NewsPublisher(String name) {
        this.name = name;
    }

    public void addSubscriber(NewsSubscriber subscriber){
        subscribers.add(subscriber);
        welcomeSubscriber(subscriber);
    }

    public void removeSubscriber(NewsSubscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void addNews(Notification notification){
        notifications.add(notification);
        notifySubscribers(notification);
    }

    public void notifySubscribers(Notification notification){
        for (NewsSubscriber subscriber:
             subscribers) {
            if(notification.getRelevance().equals(subscriber.getRelevanceEnum())){
                subscriber.update(notification);
            }
        }
    }

    private void welcomeSubscriber(NewsSubscriber subscriber){
        Notification welcome
                = new Notification(LocalDate.now(),
                "Dear "+subscriber.getName() + ", welcome to " + name + ". Stay tuned!!",
                name, RelevanceEnum.LOW);
        subscriber.update(welcome);
    }
}
