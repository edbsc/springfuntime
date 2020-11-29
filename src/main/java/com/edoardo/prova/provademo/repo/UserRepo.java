package com.edoardo.prova.provademo.repo;

import com.edoardo.prova.provademo.entita.Utente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<Utente,Long>
{
    List<Utente> find_by_last_name(String username);
    Utente find_by_id(long id);
}
aa