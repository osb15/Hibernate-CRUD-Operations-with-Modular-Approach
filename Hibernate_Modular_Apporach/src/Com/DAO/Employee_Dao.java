package Com.DAO;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import Com.Entity.Employee;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class Employee_Dao {

    public void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your details");

        System.out.print("Enter the ID: ");
        int id = sc.nextInt();
        System.out.print("Enter the name: ");
        String name = sc.next();
        System.out.print("Enter the address: ");
        String address = sc.next();
        System.out.print("Enter the salary: ");
        int salary = sc.nextInt();

        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Employee.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();

        Employee e = new Employee(id, name, address, salary);
        ss.persist(e);
        System.out.println("Data is inserted...");

        tr.commit();
        ss.close();
    }

    public void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee ID to delete: ");
        int emp_id = sc.nextInt();

        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Employee.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();

        Employee e1 = ss.get(Employee.class, emp_id);
        if (e1 != null) {
            ss.remove(e1);
            System.out.println("Data is deleted...");
        } else {
            System.out.println("Employee not found.");
        }

        tr.commit();
        ss.close();
    }

    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee ID to update: ");
        int emp_id = sc.nextInt();

        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Employee.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();

        Employee e2 = ss.get(Employee.class, emp_id);
        if (e2 != null) {
            System.out.print("Enter new name: ");
            e2.setEmp_name(sc.next());
            System.out.print("Enter new address: ");
            e2.setAddress(sc.next());
            System.out.print("Enter new salary: ");
            e2.setSalary(sc.nextInt());

            ss.merge(e2);
            System.out.println("Data is updated...");
        } else {
            System.out.println("Employee not found.");
        }

        tr.commit();
        ss.close();
    }

    public void fetch() {
        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Employee.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();

        CriteriaBuilder br = ss.getCriteriaBuilder();
        CriteriaQuery<Employee> cq = br.createQuery(Employee.class);
        Root<Employee> root = cq.from(Employee.class);
        cq.select(root);

        Query<Employee> q = ss.createQuery(cq);
        List<Employee> list = q.getResultList();

        for (Employee employee : list) {
            System.out.println(employee);
        }

        ss.close();
    }
}
