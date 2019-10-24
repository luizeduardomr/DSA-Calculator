import java.io.IOException;
import java.nio.*;
import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Lerarquivo {

    public Pilha Lerarquivo(String nomeArq) {
        Path p1 = Paths.get(nomeArq);
        Pilha pilha1 = new Pilha();
        Calculadora c1 = new Calculadora(pilha1);
        try (BufferedReader reader = Files.newBufferedReader(p1, Charset.forName("utf8"))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                switch (line) {
                    case "+":
                        c1.sum();
                        break;

                    case "-":
                        c1.sub();
                        break;

                    case "/":
                        c1.div();
                        break;

                    case "*":
                        c1.mult();
                        break;

                    case "pop":
                        c1.pop();
                        break;

                    case "dup":
                        c1.dup();
                        break;

                    case "swap":
                        c1.swap();
                        break;

                    case "chs":
                        c1.chs();
                        break;

                    case "sqrt":
                        c1.sqrt();
                        break;

                    default:
                        pilha1.push(Double.parseDouble(line));
                }

            }
        }catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
        }
        if(pilha1.size() >= 2) { throw new IllegalArgumentException("A pilha atual não está de acordo com as normas estabelecidas.");}
        return pilha1;
    }
}