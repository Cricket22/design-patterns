package observer.models;

import observer.enums.RelevanceEnum;

import java.time.LocalDate;

public class Notification {
    private LocalDate date;
    private String description;
    private String publisher;
    private RelevanceEnum relevance;

    public Notification(LocalDate date, String description, String publisher, RelevanceEnum relevance) {
        this.date = date;
        this.description = description;
        this.publisher = publisher;
        this.relevance = relevance;
    }

    public RelevanceEnum getRelevance() {
        return relevance;
    }

    @Override
    public String toString() {
        return "\nPublisher: " + this.publisher + "\nDescription: " + this.description
                + "\nDate: " + this.date.toString() + "\nRelevance: " + this.relevance;
    }
}
