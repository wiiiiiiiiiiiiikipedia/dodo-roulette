package com.example.fortuna.service.crud;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

public abstract class AbstractCrudService<E, P> implements CrudService<E, P> {

    private final JpaRepository<E, P> jpaRepository;

    public AbstractCrudService(
            JpaRepository jpaRepository
    ) {
        this.jpaRepository = jpaRepository;
    }

    @NotNull
    @Override
    public E save(
            @NotNull E entity) {
        return jpaRepository.save(entity);
    }

    @Override
    public boolean existsById(@NotNull P id) {
        return jpaRepository.existsById(id);
    }

    @NotNull
    @Override
    public Optional<E> findById(@NotNull P id) {
        return jpaRepository.findById(id);
    }

    @Override
    public @NotNull
    List<E> findAll() {
        return jpaRepository.findAll();
    }

    @Override
    public void deleteById(@NotNull P  id) {
        delete(findById(id).orElseThrow(EntityNotFoundException::new));
    }

    @Override
    public void delete(@NotNull E entity) {
        jpaRepository.delete(entity);
    }
}