
import java.util.List;

public class Main {

public static boolean validaLista(List<ObjetoTeste> lista, StatusTeste status) {
        return lista.stream().allMatch(item -> item.getStatusTeste() == status);
    }

    public static void main(String[] args) {

        List<ObjetoTeste> listaAtivos = List.of(
                new ObjetoTeste(StatusTeste.ATIVO),
                new ObjetoTeste( StatusTeste.ATIVO),
                new ObjetoTeste( StatusTeste.ATIVO),
                new ObjetoTeste(StatusTeste.ATIVO)
        );

        List<ObjetoTeste> listaMisturada = List.of(
                new ObjetoTeste(StatusTeste.INATIVO),
                new ObjetoTeste(StatusTeste.INATIVO),
                new ObjetoTeste(StatusTeste.INATIVO),
                new ObjetoTeste(StatusTeste.INATIVO),
                new ObjetoTeste(StatusTeste.INATIVO),
                new ObjetoTeste(StatusTeste.ATIVO)
        );

        List<ObjetoTeste> listaInativos = List.of(
                new ObjetoTeste(StatusTeste.INATIVO),
                new ObjetoTeste(StatusTeste.INATIVO),
                new ObjetoTeste(StatusTeste.INATIVO),
                new ObjetoTeste(StatusTeste.INATIVO),
                new ObjetoTeste(StatusTeste.INATIVO)
        );

        System.out.println("\nVerificando se todos na lista são ATIVO");
        boolean todosAtivos = validaLista(listaAtivos, StatusTeste.ATIVO);
        System.out.println("Resultado: " + todosAtivos);

        System.out.println("\nVerificando se todos na 'listaMista' são ATIVO");
        boolean mistosSaoAtivos = validaLista(listaMisturada, StatusTeste.INATIVO);
        System.out.println("Resultado: " + mistosSaoAtivos);

        System.out.println("\nVerificando se todos na lista são INATIVO");
        boolean todosInativos = validaLista(listaInativos, StatusTeste.INATIVO);
        System.out.println("Resultado: " + todosInativos);

    }
}