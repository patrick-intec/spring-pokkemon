package be.infernalwhale.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Trainer {
    @Id
    @GeneratedValue
    private Integer idTrainer;

    private String name;
    private Integer level;

    public Integer getIdTrainer() {
        return idTrainer;
    }

    public Trainer setIdTrainer(Integer idTrainer) {
        this.idTrainer = idTrainer;
        return this;
    }

    public String getName() {
        return name;
    }

    public Trainer setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public Trainer setLevel(Integer level) {
        this.level = level;
        return this;
    }
}
