package org.example.homework7.task3;

import org.example.homework7.task3.employee.Employee;
import org.example.homework7.task3.employee.manager.Accountant;
import org.example.homework7.task3.employee.manager.CEO;
import org.example.homework7.task3.employee.worker.Caster;
import org.example.homework7.task3.employee.worker.MillingOperator;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать цепочку наследования (минимум 3 звена) классов, описывающих должностную структуру на заводе. Реализовать методы по начислению зарплаты в зависимости от
 * должности (почасовая, процентная, смешанная). Иерархния должна иметь хотя бы 3 уровня.
 */

public class Main {

    public static void main(String[] args) {

        Factory factory = new Factory(65000, 176);
        CEO ceo = new CEO(true, false, true, 80);
        ceo.setPercentage(11);
        Accountant accountant = new Accountant(true, false, false, 13, true);
        accountant.setPercentage(7);
        Caster caster = new Caster(true, true, 80, true);
        caster.setPercentage(4);
        caster.setHourlyRate(19);
        MillingOperator millingOperator = new MillingOperator(false, true, 48, true);
        millingOperator.setHourlyRate(25);
        List<Employee> employees = new ArrayList<>();
        employees.add(ceo);
        employees.add(accountant);
        employees.add(caster);
        employees.add(millingOperator);
        employees.forEach(e -> SalaryCalc.calculateSalary(e, factory));
        employees.forEach(e -> System.out.println(e.getBalance() + " " + e.getClass().getSimpleName()));

    }

}
