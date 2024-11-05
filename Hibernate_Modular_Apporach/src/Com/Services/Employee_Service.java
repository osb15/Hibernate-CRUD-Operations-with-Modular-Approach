package Com.Services;

import Com.DAO.Employee_Dao;

public class Employee_Service {

    public void insertData() {
        Employee_Dao e1 = new Employee_Dao();
        e1.insert();
    }

    public void updateData() {
        Employee_Dao e1 = new Employee_Dao();
        e1.update();
    }

    public void deleteData() {
        Employee_Dao e1 = new Employee_Dao();
        e1.delete();
    }

    public void fetchData() {  // Renamed from FletchData to FetchData
        Employee_Dao e1 = new Employee_Dao();
        e1.fetch();
    }
}
