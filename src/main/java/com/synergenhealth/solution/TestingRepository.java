package com.synergenhealth.solution;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TestingRepository extends CrudRepository<Testing,String>{

}
