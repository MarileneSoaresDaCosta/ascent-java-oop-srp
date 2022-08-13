package com.galvanize;

public class Publisher {
    private String publisherName;
    private String publisherCity;

    public Publisher() {
    }

    public Publisher(String publisherName, String publisherCity) {
        this.publisherName = publisherName;
        this.publisherCity = publisherCity;
    }

    public String getName() {
        return publisherName;
    }

    public void setName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getCity() {
        return publisherCity;
    }

    public void setCity(String publisherCity) {
        this.publisherCity = publisherCity;
    }

    public String getFormattedName() {
        return String.format("%s, %s", getName(), getCity());
    }
}
