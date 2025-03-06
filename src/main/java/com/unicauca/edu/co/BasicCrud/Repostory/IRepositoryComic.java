package com.unicauca.edu.co.BasicCrud.Repostory;

import com.unicauca.edu.co.BasicCrud.Domain.ComicEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRepositoryComic extends JpaRepository<ComicEntity, Long> {
    /**
     * Custom Find By ID - To find by id of the comic
     * @param idComic ID of the comic
     * @return return the comic if it exists
     */
    Optional<ComicEntity> findByIdComic(String idComic);

    /**
     * Custom deleteComic
     * @param idComic id of the comic to delete
     * @return the comic deleted
     */
    default Optional<ComicEntity> deleteComic(String idComic) {
        Optional<ComicEntity> comicToDelete = findByIdComic(idComic);
        comicToDelete.ifPresent(this::delete);
        return comicToDelete;
    }
}
