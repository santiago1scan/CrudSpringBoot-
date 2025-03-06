package com.unicauca.edu.co.BasicCrud.Services;

import com.unicauca.edu.co.BasicCrud.Domain.ComicEntity;
import com.unicauca.edu.co.BasicCrud.Repostory.IRepositoryComic;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceComic implements IServiceComic{

    private  final IRepositoryComic  repositoryComic;
    public ServiceComic(IRepositoryComic repositoryComic) {
        this.repositoryComic = repositoryComic;
    }

    @Override
    public ComicEntity addComic(ComicEntity comic) {
        if(comic.getNameComic() == null)
            return null;

        return repositoryComic.save(comic);
    }

    @Override
    public ComicEntity findByIdComic(String idComic) {
        if (idComic == null)
            return null;

        Optional<ComicEntity> comicEntity = repositoryComic.findByIdComic(idComic);

        return comicEntity.orElse(null);
    }

    @Override
    public List<ComicEntity> findAllComics() {
        return repositoryComic.findAll();
    }

    @Override
    public ComicEntity updateComic(ComicEntity comic) {
        if(comic.getIdComic() == null)
            return null;

        return repositoryComic.findByIdComic(comic.getIdComic())
                .map(oldComic -> {
                    oldComic.setNameComic(comic.getNameComic());
                    oldComic.setEditionComic(comic.getEditionComic());
                    oldComic.setDescriptionComic(comic.getDescriptionComic());
                    oldComic.setPublishDate(comic.getPublishDate());
                    oldComic.setPrice(comic.getPrice());
                    return repositoryComic.save(oldComic);
                })
                .orElse(null); // if it doesn't exist return null
    }

    @Override
    public ComicEntity deleteComic(String idComic) {
        if( idComic == null)
            return null;

        return repositoryComic.deleteComic(idComic).orElse(null);
    }
}
