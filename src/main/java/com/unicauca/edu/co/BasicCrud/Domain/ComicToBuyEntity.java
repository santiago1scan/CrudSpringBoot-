/**
 * Authors:
 * Julian David Meneses
 * Santiago Escandon
 * Miguel Angel Calambas
 */

package com.unicauca.edu.co.BasicCrud.Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name="COMICTOBUYENTITY")
public class ComicToBuyEntity {

    /**
     * ID of the table
     * Autogenerated
     */
    @Id
    private String id;

    /**
     * Relation with comic many to one
     * It has a relation with the comic
     */
    @ManyToOne
    @JoinColumn(name = "comic_id")
    @JsonIgnore
    private ComicEntity comicEntity;

    /**
     * Quantity of comics
     */
    @Column(name = "cant_comics")
    private int cantComics;

    /**
     * Relation with BuyEntity
     * It has a relation with the buy
     */
    @ManyToOne
    @JoinColumn(name = "buy_id", nullable = false)
    @JsonIgnore
    private BuyEntity buyEntity;

    /**
     * Relation with the buy
     */
    @Column(name = "price_buy")
    private float priceBuy;

    public  ComicToBuyEntity(){

    }

    @PrePersist
    public void generateId() {
        this.id = UUID.randomUUID().toString();
    }
}
