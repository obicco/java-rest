package dev.obicco.javarest.repository;

import dev.obicco.javarest.domain.Stock;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStockRepository extends R2dbcRepository<Stock, Integer> {
}
