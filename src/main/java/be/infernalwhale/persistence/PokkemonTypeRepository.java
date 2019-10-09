package be.infernalwhale.persistence;

import be.infernalwhale.model.PokkemonType;

public interface PokkemonTypeRepository {
    PokkemonType saveType(PokkemonType type);

    PokkemonType getType(Integer id);
}
