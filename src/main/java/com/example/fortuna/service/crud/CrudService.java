package com.example.fortuna.service.crud;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;

public interface CrudService<E, I> {

    @NotNull
    E save(@NotNull E entity);

    boolean existsById(@NotNull I p);

    @NotNull
    Optional<E> findById(@NotNull I id);

    @NotNull
    List<E> findAll();

    void deleteById(@NotNull I id);

    void delete(@NotNull E entity);
}
