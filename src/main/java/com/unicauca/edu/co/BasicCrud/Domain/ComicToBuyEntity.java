package com.unicauca.edu.co.BasicCrud.Domain;

public class ComicToBuyEntity {
    /**
     * Authors:
     * Julian David Meneses
     * Santiago Escandon
     * Miguel Angel Calambaz
     */
    private ComicEntity comicEntity;
    private int cantComics;
    private float priceBuy;


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
    public void setIdComic(int cantComics){this.cantComics =  cantComics;}

    /**
     * @Brief  asignar comic a la compra
     * @param comicEntity
     */
    public void setCantComics(ComicEntity comicEntity){this.comicEntity = comicEntity;}

}
