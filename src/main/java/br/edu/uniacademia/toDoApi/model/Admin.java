package br.edu.uniacademia.toDoApi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Admin extends User{

    private Etipo tipoAdmin;

    public Admin(String nome, String login, String senha) {
        setNome(nome);
        setLogin(login);
        setSenha(senha);
    }
}
