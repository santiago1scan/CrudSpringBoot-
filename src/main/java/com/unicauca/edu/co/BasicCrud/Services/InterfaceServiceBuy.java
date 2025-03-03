package com.unicauca.edu.co.BasicCrud.Services;

import com.unicauca.edu.co.BasicCrud.Domain.BuyEntity;

public interface InterfaceServiceBuy {
    /**
    ¨*@breaf añadir una uniad a un comic en especifico
    * @param idComic id del comic a agregar
    * */
    boolean addComic(String idComic);
    /**
    *@Breaf deleteComirc eliminar una unidad en la referencia de comic del carrrito de compras
    *@param idComic id del comic a eliminar  una unidad del pedido
     */
    boolean deleteComic(String idComic);

    /**
     * @Brief realizar compra confirmada
     * @param idBuy identirficador de la compra confirmada
     * @return Retorna la compra existosa o en su defecto  fatidico un nulll
     */
    BuyEntity makeBuy(String idBuy);
}
