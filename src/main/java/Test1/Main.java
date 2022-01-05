package Test1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        //save employee in my_db
        try{
//            Session session=sessionFactory.getCurrentSession();
//            Employee employee=new Employee("Kolya", "Sidorov", "Sales", 600);
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();
//            System.out.println(employee);


        //get employees from my_db

//            Session session1=sessionFactory.getCurrentSession();
//            session1.beginTransaction();
//            List<Employee> employees1=session1.createQuery("from Employee", Employee.class).getResultList();
//            session1.getTransaction().commit();
//            System.out.println(employees1);

            //get employees from my_db with one condition
//        Session session2 = sessionFactory.getCurrentSession();
//        session2.beginTransaction();
//        List<Employee> employees2 = session2.createQuery("from Employee where department=:department", Employee.class).setParameter("department", "HR").getResultList();
//        session2.getTransaction().commit();
//            System.out.println(employees2);

            //get employees from my_db with two conditions
//            Session session3=sessionFactory.getCurrentSession();
//            session3.beginTransaction();
//            List<Employee> employees3=session3.createQuery("from Employee where name=:name and salary=:salary", Employee.class)
//                    .setParameter("name", "Oleg").
//                    setParameter("salary",750).getResultList();
//            session3.getTransaction().commit();
//            System.out.println(employees3);

            //get employee from my_db with id
//            Session session4=sessionFactory.getCurrentSession();
//            session4.beginTransaction();
//            Employee empl4=session4.get(Employee.class, 1);
//            session4.getTransaction().commit();
//            System.out.println(empl4);

            //update employee with id
//            Session session5=sessionFactory.getCurrentSession();
//            session5.beginTransaction();
//            Employee empl5=session5.get(Employee.class, 3);
//            empl5.setSalary(900);
//            session5.getTransaction().commit();
//            System.out.println(empl5);

            //update employee with condition
//            Session session6=sessionFactory.getCurrentSession();
//            session6.beginTransaction();
//           session6.createQuery("update Employee set salary=:salary where name=:name", Employee.class)
//                   .setParameter("salary", 500).setParameter("name", "Ivan").executeUpdate();
//           session6.getTransaction().commit();

            //delete employee with id
//            Session session7=sessionFactory.getCurrentSession();
//            session7.beginTransaction();
//            Employee empl7=session7.get(Employee.class,3);
//            session7.delete(empl7);
//            session7.getTransaction().commit();

            //delete employee with condition
//            Session session8=sessionFactory.getCurrentSession();
//            session8.beginTransaction();
//            session8.createQuery("delete Employee where name='Kolya'", Employee.class).executeUpdate();
//            session8.getTransaction().commit();
    }finally{
            sessionFactory.close();
        }
    }
}
