package org.example.LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class ExemploLocalDate {
    public static void main(String[] args) {

        LocalDateTime data = LocalDateTime.now();
        System.out.println("Dia da Semana: " + data.getDayOfWeek().name());
        System.out.println("Mês: " + data.getMonth());
        System.out.println("Mês: " + data.getMonthValue());
        System.out.println("Ano: " + data.getYear());
        System.out.println("Hora: " + data.getHour());
        System.out.println("Minutos: " + data.getMinute());
        System.out.println("Segundos: " + data.getSecond());

        LocalDate outraData = LocalDate.of(2025, Month.APRIL, 03);
        System.out.println("Data: " + outraData);
        System.out.println(outraData.isLeapYear());
        System.out.println(outraData.lengthOfMonth());

    }
}
