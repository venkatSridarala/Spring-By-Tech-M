package com.example.Ekartstore.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ordered_items")
public class OrderedProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ordered_item_id")
    private long orderedItemId;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "item_id", referencedColumnName = "item_id")
    private ItemInfo item;

    @Column(name = "quantity")
    private int quantity;

    // Getters and Setters

    public long getOrderedItemId() {
        return orderedItemId;
    }

    public void setOrderedItemId(long orderedItemId) {
        this.orderedItemId = orderedItemId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ItemInfo getItem() {
        return item;
    }

    public void setItem(ItemInfo item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
