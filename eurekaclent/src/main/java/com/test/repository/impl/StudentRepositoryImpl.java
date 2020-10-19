package com.test.repository.impl;

import com.test.entity.Student;
import com.test.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wx
 * @date 2020/10/10 15:49
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long,Student> studentMap;
    static {
        studentMap=new HashMap<Long,Student>();
        studentMap.put(1L,new Student(1L,"张三",22));
        studentMap.put(2L,new Student(2L,"李四",33));
        studentMap.put(3L,new Student(3L,"王五",44));
    }

    public Collection<Student> findAll() {
        return studentMap.values();
    }

    public Student findById(long id) {
        return studentMap.get(id);
    }

    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
