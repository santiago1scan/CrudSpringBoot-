package com.unicauca.edu.co.BasicCrud.Repostory;

import com.unicauca.edu.co.BasicCrud.Domain.BuyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfaceRepositoryBuy extends JpaRepository<BuyEntity, Long> {
}

