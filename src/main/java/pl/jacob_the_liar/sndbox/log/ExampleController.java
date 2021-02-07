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
        log.info("Hello!");
        return "Hello from log example";
    }
    
}
