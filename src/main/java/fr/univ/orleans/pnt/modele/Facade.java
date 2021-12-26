package fr.univ.orleans.pnt.modele;

import java.util.Collection;

public interface Facade {
    long creerPersonne (String nom, String prenom, String login, String password);
    Personne getPersonneById(Long id) throws PersonneNotFoundException;
    Collection<Personne> getAlLPersonnes();

}
