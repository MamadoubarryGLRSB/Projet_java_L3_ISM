package entities;

public class AffecterClasse{
    private int id;
    private Classe classe;
    private Professeur prof;
    private String annee;
    private static int nbr;
   
    public AffecterClasse() {
        nbr+=1;
        id=nbr;
    }

    public AffecterClasse(int id, Classe classe, Professeur prof, String annee) {
        this.id = id;
        this.classe = classe;
        this.prof = prof;
        this.annee = annee;
    }

    public AffecterClasse(Classe classe, Professeur prof, String annee) {
        this.classe = classe;
        this.prof = prof;
        this.annee = annee;
        nbr+=1;
        id=nbr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Professeur getProf() {
        return prof;
    }

    public void setProf(Professeur prof) {
        this.prof = prof;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }
    
    
    
}
