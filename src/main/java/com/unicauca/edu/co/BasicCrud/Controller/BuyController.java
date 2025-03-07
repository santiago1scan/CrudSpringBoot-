package com.unicauca.edu.co.BasicCrud.Controller;

import com.unicauca.edu.co.BasicCrud.Domain.BuyEntity;
import com.unicauca.edu.co.BasicCrud.Domain.ComicToBuyEntity;
import com.unicauca.edu.co.BasicCrud.Services.IServiceBuy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/buy")
public class BuyController {

    private IServiceBuy serviceyBuy;

    /**
     *
     * @param serviceBuy inteface de los serviicos de compra
     */
    public BuyController(IServiceBuy serviceBuy){
        this.serviceyBuy = serviceBuy;
    }


    /**
     * Create a buy in db
     * @param buyEntity buy to create
     * @return return the entity created
     */
    @PostMapping
    public BuyEntity createBuy(
            @RequestBody BuyEntity buyEntity
    ){
        return serviceyBuy.createBuy(buyEntity);
    }

    /**
     * @Brief Devuelve una compra en especifico
     * @param idBuy identificador de la compra
     * @return ResponseEntity<BuyEntity>
     */
    @GetMapping("/{idBuy}")
    public BuyEntity getBuy(
            @PathVariable String idBuy
    ){
        return serviceyBuy.getBuy(idBuy);
    }

    /**
     * @Brief Elimina una referencia d  comic de  una compra en especifico
     * @param idBuy identificador de la compra
     * @param idComic identificado del comic a eliminar
     * @return ResponseEntity<BuyEntity>
     */
    @DeleteMapping("/comic/{idBuy}/{idComic}")
    public ComicToBuyEntity deleteComicOfBuy(
            @PathVariable String idBuy,
            @PathVariable String idComic
    ){
        ComicToBuyEntity response = serviceyBuy.deleteComicToBuy(idComic, idBuy);
        if(response == null)
            throw new RuntimeException("Comic with id " + idBuy + " was deleted");
        return response;
    }

    /**
     * @Brief Agrega una unidad de la referencia de un comic en espeficio a la compra indicada
     * @param idBuy identificaodr de la compra
     * @param idComic identificador del comic a eliminar unidad de la compra
     * @return
     */
    @PutMapping("/comic/{idBuy}/{idComic}/{quantity}")
    public  ComicToBuyEntity addComicToBUy(
            @PathVariable String idBuy,
            @PathVariable String idComic,
            @PathVariable int quantity
    ) throws Exception {
        ComicToBuyEntity response = serviceyBuy.addComicToBuy(idComic, idBuy,quantity);
        if( response== null){
            throw new Exception("Impossible to save");
        }
        return response;
    }

}
