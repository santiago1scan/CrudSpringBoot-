package com.unicauca.edu.co.BasicCrud.Domain;


import java.util.ArrayList;
import java.util.Date;


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
    private Date buyhDate;

    /**
     * @brief Cosntructor de compra
     * @param idBuy identificador de la compra
     * @param listComicsTobuy lista de comics que se desa comprar
     * @param nameClient nombre de clientes
     * @param meansPayment metodo de pago
     * @param buyDate fecha de compra
     */
    public BuyEntity(String idBuy, ArrayList<ComicToBuyEntity> listComicsTobuy, String nameClient, String meansPayment, Date buyDate) {
        this.idBuy = idBuy;
        this.listComicsTobuy = listComicsTobuy;
        this.nameClient = nameClient;
        this.meansPayment = meansPayment;
        this.buyhDate= buyDate;
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

    /**
     * @Brief obtener nombre del cliente
     * @return nombre cliente (String)
     */
    public String getNameClient() {return nameClient;}

    /**
     * @Brief Obtener metodod de pago
     * @return Metodo de pago (String)
     */
    public String getMeansPayment() {return meansPayment;}

    /**
     * @Brief Obtener fecha de compra
     * @return fecha de compra (Date)
     */
    public Date getBuyhDate() {return buyhDate;}

    /**
     * @Brief Asignar fecha de compra
     * @param buyhDate fecah de compra
     */
    public void setBuyhDate(Date buyhDate) {this.buyhDate = buyhDate;}

    /**
     * @Brief Asignar  id de la compra
     * @param idBuy id de la compra
     */
    public void setIdBuy(String idBuy) {this.idBuy = idBuy;}

    /**
     * @Brief asignar comics a comprar
     * @param listComicsTobuy lista de comics a comprar
     */

    public void setListComicsTobuy(ArrayList<ComicToBuyEntity> listComicsTobuy) {this.listComicsTobuy = listComicsTobuy;}

    /**
     * @Brief Asignar nombre del cliente
     * @param nameClient nombre del cliente
     */
    public void setNameClient(String nameClient) {this.nameClient = nameClient;}

    /**
     * @Brief Asignar metodod de pago
     * @param meansPayment metodo de pago
     */
    public void setMeansPayment(String meansPayment) {this.meansPayment = meansPayment;}
}
