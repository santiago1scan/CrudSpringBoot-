package com.unicauca.edu.co.BasicCrud.Repostory;

import com.unicauca.edu.co.BasicCrud.Domain.BuyEntity;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryBuy implements  InterfaceRepositoryBuy{
    @Override
    public BuyEntity deleteBuy(String idBuy, String idComic) {
        return null;
    }

    @Override
    public BuyEntity addBuy(String idBuy, String idComic) {
        return null;
    }

    @Override
    public BuyEntity makeBuy(String idBuy) {
        return null;
    }
}
