package com.example.agenda;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryContatoRepository implements ContatoRepository {
    private Map<Long, Contato> database = new HashMap<>();

    @Override
    public void save(Contato contato) {
        database.put(contato.getId(), contato);
    }

    @Override
    public Contato findById(Long id) {
        return database.get(id);
    }

    @Override
    public List<Contato> findAll() {
        return new ArrayList<>(database.values());
    }
}