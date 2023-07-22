package com.iamneo.security.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iamneo.security.entity.Model;
import com.iamneo.security.repository.ModelRepository;
import com.iamneo.security.repository.UserRepository;
import com.iamneo.security.service.AuthenticationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/demo")
@RequiredArgsConstructor
@CrossOrigin(origins = "*",allowedHeaders ="*")


public class DemoController {

	
	 private UserRepository userRepository;
	  private ModelRepository modelRepository;

	    @Autowired
	    public void UserController(UserRepository userRepository, ModelRepository modelRepository) {
	        this.userRepository = userRepository;
	        this.modelRepository = modelRepository;
	    }
	
	@Autowired
	AuthenticationService ser;
	
    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello! Siva Prasanna");
    }
    
    @PostMapping("/post")
    public Model create(@RequestBody Model models) {
        return userRepository.save(models);
        
        
    }
    
    
    @GetMapping("/get/{ins_Id}")
    public ResponseEntity<Model> getEmployeeById(@PathVariable String ins_Id) {
        Optional<Model> model = modelRepository.findById(ins_Id);
        return model.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
}
