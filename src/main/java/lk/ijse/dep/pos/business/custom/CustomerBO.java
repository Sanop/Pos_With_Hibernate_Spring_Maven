package lk.ijse.dep.pos.business.custom;

import lk.ijse.dep.pos.business.SuperBO;
import lk.ijse.dep.pos.util.CustomerTM;

import java.util.List;

public interface CustomerBO extends SuperBO {
    public String getNewCustomerId()throws Exception;

    public List<CustomerTM> getAllCustomers()throws Exception;

    public void saveCustomer(String id, String name, String address)throws Exception;

    public void deleteCustomer(String customerId)throws Exception;

    public void updateCustomer( String customerId ,String name, String address)throws Exception;
}
