import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorNomesArquivos  implements GerenciadorNomes {
    String arquivo = "nome.txt";
    BufferedWriter br;
    BufferedReader br2;

    @Override
    public List<String> obterNomes() {
        try{
            List<String> nomes = new ArrayList<>();
            br2 = new BufferedReader(new FileReader(arquivo));
            br2.lines().forEach(nomes::add);
            return nomes;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void adicionarNome(String nome) {
        try{
            br = new BufferedWriter(new FileWriter(arquivo,true));
            br.write(nome);
            br.newLine();
            br.flush();
        }catch(IOException ioex){
            ioex.printStackTrace();
        }
    }
}
