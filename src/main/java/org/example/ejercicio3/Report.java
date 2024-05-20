package org.example.ejercicio3;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Report implements Registro {
    private String reporte ;

    public Report(String reporte) {
        this.reporte = reporte;
    }

    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }

        try {
            FileWriter writer = new FileWriter(file);
            writer.write(reporte);
            writer.close();
            System.out.println("Reporte exportado exitosamente a: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error al exportar el reporte: " + e.getMessage());
        }
    }
}