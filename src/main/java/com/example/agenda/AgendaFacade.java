package com.example.agenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AgendaFacade {
    private final SingletonService singletonService;
    private final ContatoRepository contatoRepository;

    @Autowired
    public AgendaFacade(SingletonService singletonService, ContatoRepository contatoRepository) {
        this.singletonService = singletonService;
        this.contatoRepository = contatoRepository;
    }

    public void adicionarContato(Long id, String nome, String telefone) {
        Contato contato = new Contato(id, nome, telefone);
        contatoRepository.save(contato);
        singletonService.log("Contato adicionado: " + nome);
    }

    public Contato obterContato(Long id) {
        return contatoRepository.findById(id);
    }

    public List<Contato> listarContatos() {
        return contatoRepository.findAll();
    }
}