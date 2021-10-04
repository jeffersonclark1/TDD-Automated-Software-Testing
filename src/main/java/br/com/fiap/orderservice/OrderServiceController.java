package br.com.fiap.orderservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderServiceController {

    @GetMapping("/exemplo/{first}")
    public ResponseEntity getF(@PathVariable("first") String first){
        return new ResponseEntity<>(first,HttpStatus.ACCEPTED);
    }

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody Order order){

        return new ResponseEntity<>(order,HttpStatus.ACCEPTED);
    }

}
