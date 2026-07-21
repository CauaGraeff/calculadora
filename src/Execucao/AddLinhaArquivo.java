package Execucao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AddLinhaArquivo {
    private String caminhoArquivo = "historico.txt";
    public void addLinha(String linha) throws IOException {
        Files.write(
                Paths.get(caminhoArquivo),
                linha.getBytes(),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    }
}
