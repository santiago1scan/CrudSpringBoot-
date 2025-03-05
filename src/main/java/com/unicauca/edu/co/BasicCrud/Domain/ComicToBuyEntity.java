package com.unicauca.edu.co.BasicCrud.Domain;

import jakarta.persistence.*;


@Entity
@Table(name="COMICTOBUYENTITY")
public class ComicToBuyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Clave primaria autogenerada
    private Long id; // Agrega un campo para la clave primaria

    @ManyToOne // Relación muchos a uno con ComicEntity
    @JoinColumn(name = "comic_id") // Clave foránea en COMICTOBUYENTITY
    private ComicEntity comicEntity;

    @Column(name = "cant_comics")
    private int cantComics;

    @Column(name = "price_buy")
    private float priceBuy;

    public  ComicToBuyEntity(){

    }

    /**
     * @Brief constructor de  comicToBuy
     * @param cantComics canntidad de comics de esa referencia a comprar
     * @param comicEntity Entidad del comic que se quiere comprar
     * @param price precio de la compra en total del commic en especifico
     */
    public ComicToBuyEntity( int cantComics, ComicEntity comicEntity, float price){
        this.priceBuy = price;
        this.cantComics = cantComics;
        this.comicEntity = comicEntity;
    }

    /**
     * @Brief devuelve la enteidad del comic
     * @return Comic de la compra
     */
    public ComicEntity getComicEntity(){return this.comicEntity;}

    /**
     * @Brief Devuelve cantidad de unidades sosbre la referencia del comic
     * @return cantida de unidades del comic
     */
    public int getCantComics(){return this.cantComics;}

    /**
     * @Brief Devuelve el preecio general sobere la referencia del comic en especial
     * @return precio de la compra sobre los comics de esta referencia
     */
    public  float getPriceBuy(){return this.priceBuy;}
    /**
     * @brief  asigna cantidad de comics que se desa comprar de esa referencia
     * @param cantComics
     */
    public void setCantComics(int cantComics){this.cantComics =  cantComics;}

    /**
     * @Brief  asignar comic a la compra
     * @param comicEntity
     */
    public void setComicEntity(ComicEntity comicEntity){this.comicEntity = comicEntity;}

}
