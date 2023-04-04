package com.example.scl.service;

import com.example.scl.model.entity.Editora;
import com.example.scl.model.repository.EditoraRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EditoraService {
    private EditoraRepository repository;

    public EditoraService (EditoraRepository repository) {this.repository = repository; }

    public List<Editora> getEditoras() {
        return repository.findAll();
    }

    public Optional<Editora> getEditoraById(Long id) {
        return repository.findById(id);
    }



    @Transactional
    public void excluir(Editora editora) {
        Objects.requireNonNull(editora.getId());
        repository.delete(editora);
    }
}
