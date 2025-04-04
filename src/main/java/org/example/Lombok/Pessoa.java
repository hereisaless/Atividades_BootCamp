package org.example.Lombok;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
    private long id;
    private String nome;
    private Integer idade;
}