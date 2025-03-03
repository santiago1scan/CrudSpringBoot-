package com.unicauca.edu.co.BasicCrud.Domain;

import java.util.ArrayList;

public class BuyEntity {
    /**
     * Authors:
     * Julian David Meneses
     * Santiago Escandon
     * Miguel Angel Calambaz
     */
    private String idBuy;
    private  ArrayList<ComicToBuyEntity> listComicsTobuy= new ArrayList<ComicToBuyEntity>();
    private String nameClient;
    private String meansPayment;

    /**
     * @brief Cosntructor de compra
     * @param idBuy identificador de la compra
     * @param listComicsTobuy lista de comics que se desa comprar
     * @param nameClient nombre de clientes
     * @param meansPayment metodo de pago
     */
    public BuyEntity(String idBuy, ArrayList<ComicToBuyEntity> listComicsTobuy, String nameClient, String meansPayment) {
        this.idBuy = idBuy;
        this.listComicsTobuy = listComicsTobuy;
        this.nameClient = nameClient;
        this.meansPayment = meansPayment;
    }

    /**
     * @Brief Getter de buy
     * @return idBuy identeificador del buy
     */
    public String getIdBuy() {return idBuy;}

    /**
     * @Brief getter listOfcomics
     * @return lista de los comics a comprar
     */
    public ArrayList<ComicToBuyEntity> getListComicsTobuy() {return listComicsTobuy;}

    public String getNameClient() {return nameClient;}

    public String getMeansPayment() {return meansPayment;}

    public void setIdBuy(String idBuy) {this.idBuy = idBuy;}

    public void setListComicsTobuy(ArrayList<ComicToBuyEntity> listComicsTobuy) {this.listComicsTobuy = listComicsTobuy;}

    public void setNameClient(String nameClient) {this.nameClient = nameClient;}

    public void setMeansPayment(String meansPayment) {this.meansPayment = meansPayment;}
}
