package com.example.agenda;

import java.util.List;

public interface ContatoRepository {
    void save(Contato contato);
    Contato findById(Long id);
    List<Contato> findAll();
}