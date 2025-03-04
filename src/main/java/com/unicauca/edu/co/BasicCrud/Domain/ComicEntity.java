package com.unicauca.edu.co.BasicCrud.Domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name= "COMICENTITY")
public class ComicEntity {
    @Id
    @Column(name = "id_comic")
    private String idComic;

    @Column(name = "name_comic")
    private String nameComic;

    @Column(name = "edition_comic")
    private int editionComic;

    @Column(name = "description_comic")
    private String descriptionComic;

    @Column(name = "publish_date")
    @Temporal(TemporalType.DATE)
    private Date publishDate;

    @Column(name = "price")
    private float price;


    public ComicEntity(){

    }
    /**
     * @Brief constructor de comic Entity
     * @param idComic identificador del comic
     * @param nameComic nombre del comic
     * @param editionComic edicion del comi
     * @param descriptionComic descricpcion larga del comic
     * @param publishDate fecha de publicacion del comic
     * @param price precio unitario del comic
     */
    public ComicEntity(String idComic, String nameComic, int editionComic, String descriptionComic, Date publishDate, float price) {
        this.idComic = idComic;
        this.nameComic = nameComic;
        this.editionComic = editionComic;
        this.descriptionComic = descriptionComic;
        this.publishDate = publishDate;
        this.price = price;
    }

    /**
     * @Brief  devuelve el nombre del comic
     * @return nameComic (String)
     */
    public String getNameComic() {return nameComic;}
    /**
     * @Brief  devuelve la edicion del comic
     * @return nameComic (String)
     */
    public int getEditionComic() {return editionComic;}

    /**
     * @Brief Obtener el id del comic
     * @return idComic (String )
     */
    public String getIdComic() {
        return idComic;
    }

    /**
     * @Brief Obtener descricpion del comic
     * @return descripcion del comi (String)
     */
    public String getDescriptionComic() {
        return descriptionComic;
    }

    /**
     * @Brief Obtiene la fecha de publicacion del coomic
     * @return fecha de publicacion del comic (Date)
     */
    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    /**
     * @Brief OBtener precio unitario del comic
     * @return price precio del comic  (float)
     */
    public float getPrice() {
        return price;
    }

    /**
     * @Brief Asignar descripcion larga del comic
     * @param descriptionComic descripcion larga del comic (String)
     */
    public void setDescriptionComic(String descriptionComic) {
        this.descriptionComic = descriptionComic;
    }

    /**
     * @Brief asitgnar precio unitario del comic
     * @param price precio unitario del comic
     */

    public void setPrice(float price) {
        this.price = price;
    }
    /**
     * @Brief Asignar id del comic
     * @param idComic id del comic a asignar
     */

    public void setIdComic(String idComic) {
        this.idComic = idComic;
    }


    /**
     * @Brief  asigana el nombre del comic
     * @Param nameComic String  nombre del comic
     * @return void
     */
    public void setNameComic(String nameComic) {this.nameComic = nameComic;}
    /**
     * @Brief  Asigna la edicion del comic
     * @Param editionComic edicion del comic
     */
    public void setEditionComic(int editionComic) {this.editionComic = editionComic;}

}
