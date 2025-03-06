package com.unicauca.edu.co.BasicCrud.Repostory;

import com.unicauca.edu.co.BasicCrud.Domain.ComicToBuyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryComicToBuy extends JpaRepository<ComicToBuyEntity, String> {
}
