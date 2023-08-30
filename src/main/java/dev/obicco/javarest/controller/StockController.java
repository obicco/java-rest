package dev.obicco.javarest.controller;

import dev.obicco.javarest.domain.Stock;
import dev.obicco.javarest.repository.IStockRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("stocks")
@Slf4j
@RequiredArgsConstructor
public class StockController {

    private final IStockRepository stockRepository;

    @GetMapping
    public Flux<Stock> listAll() {
        return stockRepository.findAll();
    }
}
