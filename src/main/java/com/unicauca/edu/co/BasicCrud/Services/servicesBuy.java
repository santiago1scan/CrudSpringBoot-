package com.unicauca.edu.co.BasicCrud.Services;

import com.unicauca.edu.co.BasicCrud.Domain.BuyEntity;
import com.unicauca.edu.co.BasicCrud.Domain.ComicEntity;
import com.unicauca.edu.co.BasicCrud.Domain.ComicToBuyEntity;
import com.unicauca.edu.co.BasicCrud.Repostory.IRepositoryBuy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servicesBuy implements IServiceBuy {

    private final IRepositoryBuy repositoryBuy;

    public servicesBuy(IRepositoryBuy repositoryBuy) {
        this.repositoryBuy = repositoryBuy;
    }

    @Override
    public ComicToBuyEntity addComicToBuy(String idComic, String idBuy) {
        return null;
    }

    @Override
    public ComicToBuyEntity deleteComicToBuy(String idComic, String idBuy) {
        return null;
    }

    @Override
    public List<ComicToBuyEntity> getListComicsOfBuy(String idBuy) {
        return List.of();
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
