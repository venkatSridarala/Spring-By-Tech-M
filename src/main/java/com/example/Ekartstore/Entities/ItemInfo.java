package com.example.Ekartstore.Entities;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "items_info")
public class ItemInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private long itemId;

    @Column(name = "item_name", nullable = false)
    private String itemName;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "weight")
    private double weight;

    @Column(name = "is_avail")
    private boolean isAvailable;

    @Column(name = "description")
    private String description;

    @Column(name = "avail_quantity")
    private int availableQuantity;

    @OneToMany
    @JoinColumn(name = "item_id")
    private List<ItemURL> itemUrlList;

    // Getters and Setters

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public List<ItemURL> getItemUrlList() {
        return itemUrlList;
    }

    public void setItemUrlList(List<ItemURL> itemUrlList) {
        this.itemUrlList = itemUrlList;
    }
}
