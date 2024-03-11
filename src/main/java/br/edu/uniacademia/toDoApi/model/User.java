package br.edu.uniacademia.toDoApi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@NoArgsConstructor // constructor vazio
@AllArgsConstructor // constructor com todos os parametros
@Data // ele faz todos os gets e sets
public class User {
    private String nome, login, senha, email;

    protected double saldo;

    private LocalDateTime ultimoAcesso;

    public User(String nome) {
        this.nome = nome;
    }
}
