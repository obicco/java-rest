package dev.obicco.javarest.domain;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
@Table("stock")
public class Stock {

    @Id
    @Column("stock_id")
    private Integer id;
    @NotNull
    @Column("stock_ticker")
    @NotEmpty(message = "The ticker of the stock cannot be empty")
    private String ticker;
    @NotNull
    @Column("stock_name")
    @NotEmpty(message = "The name of the stock cannot be empty")
    private String name;
}
