package com.example.agenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contatos")
public class ContatoController {
    private final AgendaFacade agendaFacade;

    @Autowired
    public ContatoController(AgendaFacade agendaFacade) {
        this.agendaFacade = agendaFacade;
    }

    @PostMapping
    public void criarContato(@RequestBody Contato contato) {
        agendaFacade.adicionarContato(contato.getId(), contato.getNome(), contato.getTelefone());
    }

    @GetMapping("/{id}")
    public Contato obterContato(@PathVariable Long id) {
        return agendaFacade.obterContato(id);
    }

    @GetMapping
    public List<Contato> listarContatos() {
        return agendaFacade.listarContatos();
    }
}