package rest_client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rest_client.communication.Communication;
import rest_client.configuration.MyConfig;
import rest_client.entity.Employee;
import rest_client.entity.Gender;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = applicationContext.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployee();
//        System.out.println(allEmployees);
//
//        Employee empById = communication.getEmployee(1);
//        System.out.println(empById);


        Employee employee = new Employee("Елена", "Малышева", 1, "Sales", Gender.FEMALE, new Date(1994-11-23));
        communication.saveEmployee(employee);

//        communication.deleteEmployee(10);
    }
}
