package com.unicauca.edu.co.BasicCrud.Repostory;

import com.unicauca.edu.co.BasicCrud.Domain.BuyEntity;
import com.unicauca.edu.co.BasicCrud.Domain.ComicEntity;
import com.unicauca.edu.co.BasicCrud.Domain.ComicToBuyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InterfaceRepositoryBuy   extends JpaRepository<BuyEntity, Long> {
    /**
     * @Brief  eliminar una unidad del comic a la comra
     *  @param idComic identificador del comic a asignar
     * @param idBuy identificador unico de la compra
     * @return BuyEntity: borrado de la unindad del comic del coarrito exitosa Null: caso contrario
     */
    BuyEntity deleteBuy(String idBuy, String idComic);
    /**
     * @brief añadir una unidad del comic a la  compra s
     * @param idBuy   identificador unico de la compra
     * @param idComic identificador del comic a asignar
     * @return BuyEntity: añadir la unindad del comic al coarrito exitosa Null: caso contrario
     * @brief agregar una unidad del comic al carrito de compras
     */
    BuyEntity addBuy(String idBuy, String idComic);


    /**
     * @Brief Regresa la lista de los comics en la comrpra
     * @param idBuy identificador de la compra
     * @return lista de comics referenciados en la compra
     */
    List<ComicToBuyEntity> getListComicsOfBuy(String idBuy );
    /**
     * @Brief realizar compra confirmada
     * @param idBuy identirficador de la compra confirmada
     * @return Retorna la compra existosa o en su defecto  fatidico un nulll
     */
    BuyEntity makeBuy(String idBuy);
}

