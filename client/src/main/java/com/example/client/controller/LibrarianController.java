package com.example.client.controller;

import com.example.client.entity.Librarian;
import com.example.client.service.LibrarianService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibrarianController {
    @Autowired
    private LibrarianService librarianService;
    @GetMapping("/getLibrarian")
    public List<Librarian> getALibrarianInfo(@RequestParam(defaultValue = "1") Integer pageIndex) {
        //System.out.println("test :id: "+id);
        PageHelper.startPage(pageIndex, 1);
        return librarianService.selectLibrarian();
    }

    @GetMapping("/addLibrarian")
    public int addALibrarianInfo(@RequestParam(required = true) Long id,
                                 @RequestParam(defaultValue = "默认数据") String name,
                                 String desc) {
        return librarianService.insertLibrarian(id, name, desc);
    }


    @GetMapping("/updateLibrarian")
    public int updateALibrarianInfo(@RequestParam(required = true) Long id,
                                 @RequestParam String name,
                                 String desc) {
        return librarianService.updateLibrarian(id, name, desc);
    }

    @GetMapping("/deleteLibrarian")
    public int deleteALibrarianInfo(@RequestParam(required = true) Long id) {
        return librarianService.deleteLibrarian(id);
    }
}