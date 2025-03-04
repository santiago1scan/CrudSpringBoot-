package com.unicauca.edu.co.BasicCrud.Domain;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name= "BUYENTITY")
public class BuyEntity {
    /**
     * Authors:
     * Julian David Meneses
     * Santiago Escandon
     * Miguel Angel Calambaz
     */
    @Id
    @Column(name = "id_buy")
    private String idBuy;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "buy_id")
    private List<ComicToBuyEntity> listComicsTobuy;

    @Column(name = "name_client")
    private String nameClient;

    @Column(name = "means_payment")
    private String meansPayment;

    @Column(name = "buy_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date buyhDate;

    // Constructor sin argumentos (requerido por JPA)
    public BuyEntity() {
    }

    /**
     *  Cosntructor de compra
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
     * Getter de buy
     * @return idBuy identeificador del buy
     */
    public String getIdBuy() {return idBuy;}

    /**
     *  getter listOfcomics
     * @return lista de los comics a comprar
     */
    public List<ComicToBuyEntity> getListComicsTobuy() {return listComicsTobuy;}

    /**
     *  obtener nombre del cliente
     * @return nombre cliente (String)
     */
    public String getNameClient() {return nameClient;}

    /**
     *  Obtener metodod de pago
     * @return Metodo de pago (String)
     */
    public String getMeansPayment() {return meansPayment;}

    /**
     *  Obtener fecha de compra
     * @return fecha de compra (Date)
     */
    public Date getBuyhDate() {return buyhDate;}

    /**
     *  Asignar fecha de compra
     * @param buyhDate fecah de compra
     */
    public void setBuyhDate(Date buyhDate) {this.buyhDate = buyhDate;}

    /**
     *  Asignar  id de la compra
     * @param idBuy id de la compra
     */
    public void setIdBuy(String idBuy) {this.idBuy = idBuy;}

    /**
     *  asignar comics a comprar
     * @param listComicsTobuy lista de comics a comprar
     */

    public void setListComicsTobuy(ArrayList<ComicToBuyEntity> listComicsTobuy) {this.listComicsTobuy = listComicsTobuy;}

    /**
     *  Asignar nombre del cliente
     * @param nameClient nombre del cliente
     */
    public void setNameClient(String nameClient) {this.nameClient = nameClient;}

    /**
     * Asignar metodod de pago
     * @param meansPayment metodo de pago
     */
    public void setMeansPayment(String meansPayment) {this.meansPayment = meansPayment;}
}
