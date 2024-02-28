package com.day5.classexcersice1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.day5.classexcersice1.model.Children;
import com.day5.classexcersice1.service.ChildrenService;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class ChildrenController
{
    private ChildrenService childrenService;
    public ChildrenController(ChildrenService childrenService)
    {
        this.childrenService=childrenService;
    }
    @PostMapping("/api/children")
    public ResponseEntity<Children> postChildrenDetails(@RequestBody Children children) 
    {
        Children child=childrenService.postChildren(children);
        if(child!=null)
        {
            return new ResponseEntity<>(child,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(child,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/api/children/sortBy/{field}")
    public ResponseEntity<List<Children>> getListOfChildren(@PathVariable("field") String field)
     {
        List<Children> list=childrenService.getChildren(field);
        if(list!=null)
        {
            return new ResponseEntity<>(list,HttpStatus.OK);
        }
        return new ResponseEntity<>(list,HttpStatus.NOT_FOUND);
    }
    @GetMapping("/api/children/{offset}/{pagesize}")
    public ResponseEntity<Page<Children>> getPaginationChildren(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize) 
    {
        Page<Children> children=childrenService.paginationChildren(offset,pagesize);
        if(children!=null)
        {
            return new ResponseEntity<>(children,HttpStatus.OK);
        }
        return new ResponseEntity<>(children,HttpStatus.NOT_FOUND);
    }
    @GetMapping("/api/children/{offset}/{pagesize}/{field}")
    public ResponseEntity<Page<Children>> getpageSortChildren(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize,@PathVariable("field") String field) {
        Page<Children> sort=childrenService.pageSortChildren(offset,pagesize,field);
        if(sort!=null){
            return new ResponseEntity<>(sort,HttpStatus.OK);
        }
        return new ResponseEntity<>(sort,HttpStatus.NOT_FOUND);
    }
    
    
    
}