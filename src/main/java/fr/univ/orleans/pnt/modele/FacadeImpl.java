package fr.univ.orleans.pnt.modele;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FacadeImpl implements Facade{

    private Map<Long, Personne> personnes;

    public FacadeImpl() {
        this.personnes = new HashMap<>();
    }

    @Override
    public long creerPersonne(String nom, String prenon, String login, String password) {
        Personne personne = Personne.creer(nom, prenon, login, password);
        this.personnes.put(personne.getId(), personne);
        return personne.getId();
    }

    @Override
    public Personne getPersonneById(Long id) throws PersonneNotFoundException {
        if (this.personnes.containsKey(id)) {
            return this.personnes.get(id);
        } else {
            throw new PersonneNotFoundException();
        }
    }

    @Override
    public Collection<Personne> getAlLPersonnes() {
        return this.personnes.values();
    }
}

