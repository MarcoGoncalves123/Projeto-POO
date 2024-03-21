import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UtilizadorOcasional user1 = new UtilizadorOcasional();
        user1.setCodigo_utilizador("00001");
        user1.setNome("Marco");
        user1.setEmail("marcodosbalos0303@gmail.com");
        user1.setMorada("Rua de Bacelos Nº 48");
        user1.setFrequencia_cardiaca(80);

        UtilizadorOcasional user2 = new UtilizadorOcasional();
        user2.setCodigo_utilizador("00002");
        user2.setNome("Leonardo");
        user2.setEmail("leonardogomesalves@gmail.com");
        user2.setMorada("Turiz");
        user2.setFrequencia_cardiaca(70);

        // Create a list of UtilizadorOcasional objects
        List<UtilizadorOcasional> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        // Create UtilizadoresOcasionais object using the list
        UtilizadoresOcasionais users = new UtilizadoresOcasionais(userList);
        System.out.println(users.getUsers());

    }
}
