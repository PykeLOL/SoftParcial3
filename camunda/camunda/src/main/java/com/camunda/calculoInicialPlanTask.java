package com.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class calculoInicialPlanTask implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {
        // Obtener el precio de las variables
        double precio = (double) execution.getVariable("precio");

        // Calcular el 5% del precio
        double cuotaInicial = precio * 0.05;

        // Guardar el resultado en una variable local "cuotaInicial"
        execution.setVariableLocal("cuotaInicial", cuotaInicial);
    }
}