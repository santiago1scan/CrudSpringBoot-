package com.unicauca.edu.co.BasicCrud.Services;

import com.unicauca.edu.co.BasicCrud.Domain.BuyEntity;
import com.unicauca.edu.co.BasicCrud.Domain.ComicEntity;
import com.unicauca.edu.co.BasicCrud.Domain.ComicToBuyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servicesBuy implements InterfaceServiceBuy {


    @Autowired
    private InterfaceServiceBuy repositoryBuy;

    @Override
    public ComicToBuyEntity addComicToBuy(String idComic, String idBuy) {
        return null;
    }

    @Override
    public ComicToBuyEntity deleteComicToBuy(String idComic, String idBuy) {
        return null;
    }

    @Override
    public ComicEntity searhcComic(String idComic) {
        return null;
    }

    @Override
    public BuyEntity makeBuy(String idBuy) {
        return null;
    }
}
