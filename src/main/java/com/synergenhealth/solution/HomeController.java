package com.synergenhealth.solution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;

@RestController
public class HomeController {

    static Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    TestingRepository testingRepository;

    @GetMapping("/")
    public String getAllTesting(){

        logger.info("App is working");

       // Iterable<Testing> testings = testingRepository.findAll()

        return "COUNT :: "+testingRepository.count();
    }

    @GetMapping("/add")
    public String addingDummyValues(){
        testingRepository.save(Arrays.asList(
                new Testing("Josh Long",LocalDate.of(1984,12,07),null,Arrays.asList("C++","Java","Spring")),
                new Testing("Rod Johnson",LocalDate.of(1984,12,07),null,Arrays.asList("DI","Java","Spring")),
                new Testing("Peter Cravin",LocalDate.of(1984,12,07),null,Arrays.asList("REST","Java","NIO")),
                new Testing("Rayan Dhal",LocalDate.of(1984,12,07),null,Arrays.asList("JS","Node Js","Google"))

        ));

        return "SUCCESSFULLY ADDED";
    }


}
