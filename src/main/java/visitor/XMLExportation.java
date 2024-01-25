package visitor;

import java.io.*;
import java.util.List;

// CLASE OPERACION: Clase que queremos añadir las operaciones extras.
public class XMLExportation implements AccountVisitor {

    public String export(Account... a) {
        StringBuilder xml = new StringBuilder();
        xml.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");

        for (Account acc : a) {
            xml.append(acc.accept(this)).append("\n");
        }

        this.save(xml.toString(), "src/main/resources/output.xml");

        return xml.toString();
    }

    @Override public String visit(User u) {
        List<Account> a = u.getListFollowers();
        StringBuilder xml = new StringBuilder();

        xml.append("<User>" + "\n");
        for (Account account : a) {
            xml.append("<name>" + account.getAccountName() + "</name>\n");
        }
        xml.append("</User>");

        return xml.toString();
    }

    @Override public String visit(Artist a) {
        List<Account> l = a.getListFollowers();
        StringBuilder xml = new StringBuilder();

        xml.append("<Artist>" + "\n");
        for (Account account : l) {
            xml.append("<name>" + account.getAccountName() + "</name>\n");
        }
        xml.append("</Artist>");

        return xml.toString();
    }

    /**
     * Guardar el resultado de salida, en un fichero "output.xml", ubicado en "resources"
     */
    protected static void save(String texto, String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            // Escribir
            writer.write(texto);

            System.out.println("Texto guardado exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo XML: " + e.getMessage());
        }
    }
}
