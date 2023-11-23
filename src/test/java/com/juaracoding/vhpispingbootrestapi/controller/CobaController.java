package com.juaracoding.vhpispingbootrestapi.controller;
/*
Created by IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IC-232.10072.27, built on October 11, 2023
@Author LENOVO a.k.a. Virdha Haniva Pratiwie Ishak
Java Developer
Created on 23/11/2023 19:12
@Last Modified 23/11/2023 19:12
Version 1.0
*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/main")
public class CobaController {
    @GetMapping("/v1/welcome")
    public String welcome(){
        System.out.println("Masuk Kesini");
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
    @GetMapping("/v1/contohdata")
    public Map<String,Object> contohData(){
        Map<String,Object> map = new HashMap<>();
        map.put("nama","virdha");
        map.put("alamat","sidoarjo");
        return map;
    }
}




