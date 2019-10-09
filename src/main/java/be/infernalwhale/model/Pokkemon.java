package be.infernalwhale.model;

import javax.persistence.*;

@Entity
public class Pokkemon {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @ManyToOne
    private PokkemonType type;

    private Integer level;
    private Integer IVAttack;
    private Integer IVDefense;
    private Integer IVHitpoints;
    private Integer combatPower;

    @Transient
    private Integer dustToMaxLevel;
    @Transient
    private Trainer trainer;

    public Integer getId() {
        return id;
    }

    public Pokkemon setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Pokkemon setName(String name) {
        this.name = name;
        return this;
    }

    public PokkemonType getType() {
        return type;
    }

    public Pokkemon setType(PokkemonType type) {
        this.type = type;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public Pokkemon setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public Integer getIVAttack() {
        return IVAttack;
    }

    public Pokkemon setIVAttack(Integer IVAttack) {
        this.IVAttack = IVAttack;
        return this;
    }

    public Integer getIVDefense() {
        return IVDefense;
    }

    public Pokkemon setIVDefense(Integer IVDefense) {
        this.IVDefense = IVDefense;
        return this;
    }

    public Integer getIVHitpoints() {
        return IVHitpoints;
    }

    public Pokkemon setIVHitpoints(Integer IVHitpoints) {
        this.IVHitpoints = IVHitpoints;
        return this;
    }

    public Integer getCombatPower() {
        return combatPower;
    }

    public Pokkemon setCombatPower(Integer combatPower) {
        this.combatPower = combatPower;
        return this;
    }

    public Integer getDustToMaxLevel() {
        return dustToMaxLevel;
    }

    public Pokkemon setDustToMaxLevel(Integer dustToMaxLevel) {
        this.dustToMaxLevel = dustToMaxLevel;
        return this;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public Pokkemon setTrainer(Trainer trainer) {
        this.trainer = trainer;
        return this;
    }
}
