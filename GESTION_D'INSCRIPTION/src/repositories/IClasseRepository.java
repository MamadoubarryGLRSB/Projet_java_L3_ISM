package repositories;

import java.util.List;

import entities.Classe;
public interface IClasseRepository {
    public Classe insert(Classe classe);
    public Classe  update(Classe classe);
    public Classe findById(int id);
    public List<Classe> findAll();
    public Classe findByLibelle(String libelle);
    
}
