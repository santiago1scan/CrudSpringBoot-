package com.unicauca.edu.co.BasicCrud.Repostory;

import com.unicauca.edu.co.BasicCrud.Domain.BuyEntity;

public interface InterfaceRepositoryBuy {
    /**
     * @Brief  eliminar una unidad del comic a la comra
     *  @param idComic identificador del comic a asignar
     * @param idBuy identificador unico de la compra
     * @return true: borrado de la unindad del comic del coarrito exitosa false: caso contrario
     */
    boolean deleteBuy(String idBuy, String idComic);
    /**
     * @brief añadir una unidad del comic a la  compra s
     * @param idBuy   identificador unico de la compra
     * @param idComic identificador del comic a asignar
     * @return true: añadir la unindad del comic al coarrito exitosa false: caso contrario
     * @brief agregar una unidad del comic al carrito de compras
     */
    boolean addBuy(String idBuy, String idComic);

    /**
     * @Brief realizar compra confirmada
     * @param idBuy identirficador de la compra confirmada
     * @return Retorna la compra existosa o en su defecto  fatidico un nulll
     */
    BuyEntity makeBuy(String idBuy);
}
