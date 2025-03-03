package com.unicauca.edu.co.BasicCrud.Domain;

public class ComicToBuyEntity {
    /**
     * Authors:
     * Julian David Meneses
     * Santiago Escandon
     * Miguel Angel Calambaz
     */
    private String idComic;
    private String nameComic;
    private int editionComic;
    private int cantComics;


    /**
     * @Brief constructor de  comic
     * @param idComic idCoimic String identificador del comic
     * @param nameComic  Stirng nombre del comic
     * @param editionComic editionComic edicion del comic
     * @param cantComics canntidad de comics de esa referencia a comprar
     */
    public ComicToBuyEntity(String idComic, String nameComic, int editionComic, int cantComics){
        this.editionComic = editionComic;
        this.nameComic = nameComic;
        this.idComic = idComic;
        this.cantComics = cantComics;
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

    /**
     * @brief  asigna cantidad de comics que se desa comprar de esa referencia
     * @param cantComics
     */
    public void setIdComic(int cantComics){this.cantComics =  cantComics;}
}
