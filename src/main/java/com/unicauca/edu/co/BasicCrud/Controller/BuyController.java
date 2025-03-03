package com.unicauca.edu.co.BasicCrud.Controller;

import com.unicauca.edu.co.BasicCrud.Domain.BuyEntity;
import com.unicauca.edu.co.BasicCrud.Services.InterfaceServiceBuy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/buy")
public class BuyController {

    private  InterfaceServiceBuy serviceyBuy;

    /**
     *
     * @param serviceBuy inteface de los serviicos de compra
     */
    @Autowired
    public BuyController(InterfaceServiceBuy serviceBuy){
        this.serviceyBuy = serviceBuy;
    }

    /**
     * Brief crea la compra
     * @param idBuy identrficador de la compra
     * @return ResponseEntity<BuyEntity>
     */
    @PostMapping("/buy/makeBuy/{idBuy}")
    public ResponseEntity<BuyEntity> makeBUy(
            @PathVariable String idBuy
    ){
        return null;
    }

    /**
     * @Brief Devuelve una compra en especifico
     * @param idBuy identificador de la compra
     * @return ResponseEntity<BuyEntity>
     */
    @GetMapping("/buy/getBuy/{idBuy}")
    public ResponseEntity<BuyEntity> getBuy(
            @PathVariable String idBuy
    ){
        return null;
    }

    /**
     * @Brief Elimina una referencia d  comic de  una compra en especifico
     * @param idBuy identificador de la compra
     * @param idComic identificado del comic a eliminar
     * @return ResponseEntity<BuyEntity>
     */
    @DeleteMapping("buy/comic/delete/{idBuy}/")
    public ResponseEntity<BuyEntity> deleteComicOfBuy(
            @PathVariable String idBuy,
            @RequestBody String idComic
    ){
        return null;
    }

    /**
     * @Brief Agrega una unidad de la referencia de un comic en espeficio a la compra indicada
     * @param idBuy identificaodr de la compra
     * @param idComic identificador del comic a eliminar unidad de la compra
     * @return
     */
    @PutMapping("/buy/comic/addComic/{idBuy}")
    public  ResponseEntity<BuyEntity> addComicToBUy(
            @PathVariable String idBuy,
            @RequestBody String idComic
    ){
        return null;
    }

}
