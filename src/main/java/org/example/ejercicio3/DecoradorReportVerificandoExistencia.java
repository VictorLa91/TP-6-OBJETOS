package org.example.ejercicio3;

import java.io.File;

public class DecoradorReportVerificandoExistencia implements Registro{
    private Report report;

    public DecoradorReportVerificandoExistencia(Report report){
        this.report=report;
    }
    @Override
    public void export(File file) {
        if (file.exists()) {
            throw new IllegalArgumentException(
                    "El archivo ya existe..."
            );
        }
        report.export(file);

    }
}
