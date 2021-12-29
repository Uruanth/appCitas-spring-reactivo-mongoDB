package com.springBajo8.springBajo8.domain;

public class PadecimientoTratamiento {
    private final String padecimiento;
    private final String Tratamiento;

    public PadecimientoTratamiento(String padecimiento, String tratamiento) {
        this.padecimiento = padecimiento;
        Tratamiento = tratamiento;
    }

    public String getPadecimiento() {
        return padecimiento;
    }

    public String getTratamiento() {
        return Tratamiento;
    }

    @Override
    public String toString() {
        return "padecimiento = '" + padecimiento + '\'' +
                ", Tratamiento = '" + Tratamiento + '\'';
    }
}
