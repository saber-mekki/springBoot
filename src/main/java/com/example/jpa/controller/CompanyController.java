package com.example.jpa.controller;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.jpa.model.Company;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import com.example.jpa.reprository.CompanyReprository;

@RestController
public class CompanyController {
	/* 	 @Autowired
	/*    private CompanyReprository companyReprository;
	                                    
	    @GetMapping("/posts")
	    public Page<Company> getAllComPage(Pageable pageable) {
	        return companyReprository.findAll(pageable);
	    }
	  @PostMapping("/company")
	    public Company createCompany(@Valid @RequestBody Company company) {
	        return companyReprository.save(company);
	   }
	   
	   
	   
	   
	      @PutMapping("/posts/{postId}")
    public Post updatePost(@PathVariable Long postId, @Valid @RequestBody Post postRequest) {
        return postRepository.findById(postId).map(post -> {
            post.setTitle(postRequest.getTitle());
            post.setDescription(postRequest.getDescription());
            post.setContent(postRequest.getContent());
            return postRepository.save(post);
        }).orElseThrow(() -> new ResourceNotFoundException("PostId " + postId + " not found"));
    }
	   
	   
	   
	   
    @DeleteMapping("/posts/{postId}")
    public ResponseEntity<?> deletePost(@PathVariable Long postId) {
        return postRepository.findById(postId).map(post -> {
            postRepository.delete(post);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("PostId " + postId + " not found"));
    }
	   
	   
	   
	   
	   
	   
	   *
	   *
	   *
	   *
	   *
	   *
	   *
	   *
	   *
	   *
	   *
	   *
	   */
	  
	  
	  
	  
	  @RequestMapping(value = "/")
	  public String name() {
		  
		return "hello saber";
	}
	  
	  
	  @GetMapping (value = "/{name}")
	  public String namge(@PathVariable String name) {
		return String.format("welclom %s to our app",name);
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
