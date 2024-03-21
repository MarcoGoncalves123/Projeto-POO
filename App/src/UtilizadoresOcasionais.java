import java.util.ArrayList;
import java.util.List;

public class UtilizadoresOcasionais {

    private List<UtilizadorOcasional> users;
    public UtilizadoresOcasionais(){
        this.users = new ArrayList<>();
    }

    public UtilizadoresOcasionais(List<UtilizadorOcasional> utilizador){
        this.users = new ArrayList<>();
        for (UtilizadorOcasional i : utilizador){
            this.users.add(i.clone_utilizador_ocasional());
        }
    }

   // public UtilizadoresOcasionais(UtilizadoresOcasionais lista){

   // }

    /**Getters*/

    public List<UtilizadorOcasional> getUsers(){
        List<UtilizadorOcasional> utilizadores = new ArrayList<>();

        for (UtilizadorOcasional i : this.users){
            utilizadores.add(i.clone_utilizador_ocasional());
        }
        return  utilizadores;
    }

    /**Setter*/
    public void setUsers(List<UtilizadorOcasional> utilizador){
        this.users = new ArrayList<>();
        for (UtilizadorOcasional i : utilizador){
            this.users.add(i.clone_utilizador_ocasional());
        }
    }

}
