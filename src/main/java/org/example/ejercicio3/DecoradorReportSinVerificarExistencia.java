package org.example.ejercicio3;

import java.io.File;

public class DecoradorReportSinVerificarExistencia implements Registro{
    private Report report;
    public DecoradorReportSinVerificarExistencia(Report report){
        this.report=report;
    }
    @Override
    public void export(File file) {
        if (file.exists()) {
            report.export(file);
            throw new IllegalArgumentException(
                    "El archivo se sobreescribio..."
            );
        }
        System.out.println("El archivo se creo correctamente...");
        report.export(file);


    }
}
