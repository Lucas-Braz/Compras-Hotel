package com.compras.hoteis.repository;

import com.compras.hoteis.model.M_Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Hotel extends JpaRepository<M_Hotel,Long> {
}
