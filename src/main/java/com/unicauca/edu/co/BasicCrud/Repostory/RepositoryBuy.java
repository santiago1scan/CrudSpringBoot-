package com.unicauca.edu.co.BasicCrud.Repostory;

import com.unicauca.edu.co.BasicCrud.Domain.BuyEntity;
import com.unicauca.edu.co.BasicCrud.Domain.ComicToBuyEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    public List<ComicToBuyEntity> getListComicsOfBuy(String idBuy) {
        return List.of();
    }

    @Override
    public BuyEntity makeBuy(String idBuy) {
        return null;
    }
}
