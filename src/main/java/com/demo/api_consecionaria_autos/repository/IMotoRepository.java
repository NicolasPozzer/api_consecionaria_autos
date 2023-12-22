package com.demo.api_consecionaria_autos.repository;

import com.demo.api_consecionaria_autos.model.Moto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMotoRepository extends JpaRepository<Moto, Long> {
}
