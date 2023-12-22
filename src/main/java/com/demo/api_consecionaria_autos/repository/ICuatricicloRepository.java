package com.demo.api_consecionaria_autos.repository;

import com.demo.api_consecionaria_autos.model.Cuatriciclo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICuatricicloRepository extends JpaRepository<Cuatriciclo, Long> {
}
