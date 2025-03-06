package com.unicauca.edu.co.BasicCrud.Services;

import com.unicauca.edu.co.BasicCrud.Domain.BuyEntity;
import com.unicauca.edu.co.BasicCrud.Domain.ComicEntity;
import com.unicauca.edu.co.BasicCrud.Domain.ComicToBuyEntity;
import com.unicauca.edu.co.BasicCrud.Repostory.IRepositoryBuy;
import com.unicauca.edu.co.BasicCrud.Repostory.IRepositoryComic;
import com.unicauca.edu.co.BasicCrud.Repostory.IRepositoryComicToBuy;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ServicesBuy implements IServiceBuy {

    private final IRepositoryBuy repositoryBuy;
    private final IRepositoryComic repositoryComic;
    private final IRepositoryComicToBuy repositoryComicToBuy;

    public ServicesBuy(IRepositoryBuy repositoryBuy, IRepositoryComic repositoryComic, IRepositoryComicToBuy repositoryComicToBuy) {
        this.repositoryBuy = repositoryBuy;
        this.repositoryComic = repositoryComic;
        this.repositoryComicToBuy = repositoryComicToBuy;
    }

    @Override
    public BuyEntity createBuy(BuyEntity buyEntity) {
        return repositoryBuy.save(buyEntity);
    }

    @Override
    public ComicToBuyEntity addComicToBuy(String idComic, String idBuy, int quantity) {
        Optional<BuyEntity> optionalBuy = repositoryBuy.findById(idBuy);
        Optional<ComicEntity> optionalComic = repositoryComic.findById(idComic);

        if (optionalBuy.isPresent() && optionalComic.isPresent()) {
            BuyEntity buy = optionalBuy.get();
            ComicEntity comic = optionalComic.get();

            ComicToBuyEntity comicToBuy = new ComicToBuyEntity();
            comicToBuy.setBuyEntity(buy);
            comicToBuy.setComicEntity(comic);
            comicToBuy.setCantComics(quantity);
            comicToBuy.setPriceBuy(comic.getPrice() * quantity);

            repositoryComicToBuy.save(comicToBuy);

            buy.getListComicsToBuy().add(comicToBuy);
            repositoryBuy.save(buy);
            return comicToBuy;
        }
        return null;
    }

    @Override
    public ComicToBuyEntity deleteComicToBuy(String idComic, String idBuy) {
        Optional<BuyEntity> optionalBuy = repositoryBuy.findById(idBuy);
        if (optionalBuy.isPresent()) {
            BuyEntity buy = optionalBuy.get();
            List<ComicToBuyEntity> comicsToBuy = buy.getListComicsToBuy();

            ComicToBuyEntity toRemove = comicsToBuy.stream()
                    .filter(ctb -> ctb.getComicEntity().getIdComic().equals(idComic))
                    .findFirst()
                    .orElse(null);

            if (toRemove != null) {
                comicsToBuy.remove(toRemove);
                repositoryComicToBuy.delete(toRemove);
                repositoryBuy.save(buy);
                return toRemove;
            }
        }
        return null;
    }

    @Override
    public List<ComicToBuyEntity> getListComicsOfBuy(String idBuy) {
        Optional<BuyEntity> optionalBuy = repositoryBuy.findById(idBuy);
        return optionalBuy.map(BuyEntity::getListComicsToBuy).orElse(Collections.emptyList());
    }

    @Override
    public BuyEntity getBuy(String idBuy) {
        return repositoryBuy.findById(idBuy).orElse(null);
    }

}
