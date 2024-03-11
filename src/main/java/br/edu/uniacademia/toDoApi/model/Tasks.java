package br.edu.uniacademia.toDoApi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tasks {
    private  String description;

    private LocalDateTime dateCriation, dataPrev, dataEnd;
    private User owner;
    private Ecategoria categoria;
}
