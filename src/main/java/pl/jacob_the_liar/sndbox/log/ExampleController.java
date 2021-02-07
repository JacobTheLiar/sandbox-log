package pl.jacob_the_liar.sndbox.log;


/**
 * * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * * @date : 2021-02-07 16:15
 * *
 * * @className: ExampleController
 * *
 * *
 ******************************************************/

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class ExampleController{

    
    @GetMapping("/")
    public String exampleGet(){
        log.trace("===  This will be printed on trace");
        log.debug("===  This will be printed on debug");
        log.info("===  This will be printed on info");
        log.warn("===  This will be printed on warn");
        log.error("===  This will be printed on error");
        
        return "Hello from log example";
    }
    
}
