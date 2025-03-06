package com.unicauca.edu.co.BasicCrud.Services;

import com.unicauca.edu.co.BasicCrud.Domain.BuyEntity;
import com.unicauca.edu.co.BasicCrud.Domain.ComicEntity;
import com.unicauca.edu.co.BasicCrud.Domain.ComicToBuyEntity;

import java.util.List;

public interface IServiceBuy {

    /**
     * Create a Buy in db
     * @param buyEntity buy to create
     * @return the buyEntity created
     */
    BuyEntity createBuy(BuyEntity buyEntity);

    /**
    ¨* @breaf añadir una uniad a un comic en especifico
     * @param idComic id del comic a agregar
     * @param idBuy id de la compra
     * @param quantity how much comics
     * @return ComicEntity: Se asingo el comci a la compra o Null en caso contario
    * */
    ComicToBuyEntity addComicToBuy(String idComic, String idBuy, int quantity );
    /**
    *@Breaf deleteComirc eliminar una unidad en la referencia de comic del carrrito de compras
    *  @param idComic id del comic a eliminar  una unidad del pedido
     * @param idBuy id de la compra a la que se le va a eliminar una unidad del comic
     * @return ComicEntity: Se elimico el comic de la compra o Null en caso contario
     */
    ComicToBuyEntity deleteComicToBuy(String idComic, String idBuy);

    /**
     * @Brief Regresa la lista de los comics en la comrpra
     * @param idBuy identificador de la compra
     * @return lista de comics referenciados en la compra
     */
    List<ComicToBuyEntity> getListComicsOfBuy(String idBuy );

    /**
     * Get to buy by ID
     * @param idBuy id to get
     * @return the buy in db
     */
    BuyEntity getBuy(String idBuy);
}
