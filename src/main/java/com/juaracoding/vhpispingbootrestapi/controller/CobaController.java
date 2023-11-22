package com.juaracoding.vhpispingbootrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/main")
public class CobaController {
    @GetMapping("/v1/welcome")
    public String welcome(){
        return "Hello World!!";
    }
    @GetMapping("/v1/save")
    public String save(){
        System.out.println("Save Disini");
        return "Sudah Tersimpan";
    }
    @GetMapping("/v1/update")
    public String update(){
        System.out.println("Update Disini");
        return "Sudah Terubah";
    }
    @GetMapping("/v1/delete")
    public String delete(){
        System.out.println("Delete Disini");
        return "Sudah Terhapus";
    }


}

