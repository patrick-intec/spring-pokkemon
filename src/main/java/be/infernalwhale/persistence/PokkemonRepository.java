package be.infernalwhale.persistence;

import be.infernalwhale.model.Pokkemon;

import java.util.List;

public interface PokkemonRepository {
    Pokkemon savePokkemon(Pokkemon pokkemon);

    List<Pokkemon> getAllPokkemon();
}
