package com.interview.preparation.spring;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //This annotation combines @Controller and @ResponseBody.
// It’s used to create RESTful web services by handling HTTP requests and returning data directly as JSON or XML.
@RequestMapping("/api/vi")
public class Controller {

    @PutMapping("{tableName}/data")
    public ResponseEntity<String> putDataIntoDB(@PathVariable String tableName, @RequestBody Employee emp){

        return new ResponseEntity<>("Success ", HttpStatus.OK);
    }

    @PostMapping("{tableName}/data")
    public ResponseEntity<String> postDataIntoDB(@PathVariable String tableName, @RequestBody Employee emp){

        return new ResponseEntity<>("Success ", HttpStatus.OK);
    }

    @DeleteMapping("{tableName}/data")
    public ResponseEntity<String> DeleteDataFromDB(@PathVariable String tableName, @RequestBody Employee emp ){

        return new ResponseEntity<>("Success ", HttpStatus.OK);
    }


}
