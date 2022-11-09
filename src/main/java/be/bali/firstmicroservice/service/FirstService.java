package be.bali.firstmicroservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FirstService {

    public String getName(){
        log.info("The getName function is being called!");
        return "MicroService 1";
    }
}
