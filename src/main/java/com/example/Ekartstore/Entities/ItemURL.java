package com.example.Ekartstore.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "item_url_details")
public class ItemURL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_url_id")
    private long itemUrlId;

    @Column(name = "url_link")
    private String url;

    // Getters and Setters

    public long getItemUrlId() {
        return itemUrlId;
    }

    public void setItemUrlId(long itemUrlId) {
        this.itemUrlId = itemUrlId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
