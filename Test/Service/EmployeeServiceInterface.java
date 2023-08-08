package com.springTurotrial.Test.Service;

import java.util.List;

import com.springTurotrial.Test.Payload.EmployeedataTransfer;
/**
 * It is an interface that contains all the methods which contains logics to operate on the data sent to and from the DAO and the client.
 */
public interface EmployeeServiceInterface {
public EmployeedataTransfer create(EmployeedataTransfer obj);
public EmployeedataTransfer update(EmployeedataTransfer obj,Integer id);
public EmployeedataTransfer getById(Integer id);
public List<EmployeedataTransfer >getAll( );
public void delete(Integer id);

}
