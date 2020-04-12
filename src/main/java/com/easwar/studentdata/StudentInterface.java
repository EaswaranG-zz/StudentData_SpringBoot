package com.easwar.studentdata;

import org.springframework.data.repository.CrudRepository;

public interface StudentInterface extends CrudRepository<Student,Integer> {

}
