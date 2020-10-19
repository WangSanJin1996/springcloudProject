package com.test.repository;

import com.test.entity.Student;

import java.util.Collection;

/**
 * @author wx
 * @date 2020/10/10 15:43
 */
public interface StudentRepository {
    public Collection<Student> findAll();
    public  Student findById(long id);
    public  void saveOrUpdate(Student student);
    public void  deleteById(long id);
}
