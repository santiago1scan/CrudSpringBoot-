package com.unicauca.edu.co.BasicCrud.Services;

import com.unicauca.edu.co.BasicCrud.Domain.ComicEntity;

import java.util.List;

public interface IServiceComic {

    /**
     * Add the comic in the DB
     * @param comic comic to add
     * @return return de comic added, null if it is any problem
     */
    ComicEntity addComic(ComicEntity comic);

    /**
     * Find by id the comic in the DB
     * @param idComic id of the comic to find
     * @return the find comic, null if it doesn't exist
     */
    ComicEntity findByIdComic(String idComic);

    /**
     * Find all the comics
     * @return all the comics in DB
     */
    List<ComicEntity> findAllComics();

    /**
     * Update the comic
     * @param comic comic to update
     * @return return the comic updated, null if it is imposibble
     */
    ComicEntity updateComic(ComicEntity comic);

    /**
     * Delete a comic in the DB
     * @param idComic id of the comic to delete
     * @return return the comic deleted
     */
    ComicEntity deleteComic(String idComic);
}
