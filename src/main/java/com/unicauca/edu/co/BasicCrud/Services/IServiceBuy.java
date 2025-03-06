package com.unicauca.edu.co.BasicCrud.Services;

import com.unicauca.edu.co.BasicCrud.Domain.BuyEntity;
import com.unicauca.edu.co.BasicCrud.Domain.ComicEntity;
import com.unicauca.edu.co.BasicCrud.Domain.ComicToBuyEntity;

import java.util.List;

public interface IServiceBuy {
    /**
    ¨* @breaf añadir una uniad a un comic en especifico
     * @param idComic id del comic a agregar
     * @param idBuy id de la compra
     * @return ComicEntity: Se asingo el comci a la compra o Null en caso contario
    * */
    ComicToBuyEntity addComicToBuy(String idComic, String idBuy );
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
     * @Bief buscar el comic por medio dde su identificador
     * @param idComic identificador unic del commic
     * @return ComicEntity comic entity buscado, en caso contario null
     */
    ComicEntity searhcComic(String idComic);
    /**
     * @Brief realizar compra confirmada
     * @param idBuy identirficador de la compra confirmada
     * @return Retorna la compra existosa o en su defecto  fatidico un nulll
     */
    BuyEntity makeBuy(String idBuy);
}
