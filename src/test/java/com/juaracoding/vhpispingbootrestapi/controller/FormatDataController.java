package com.juaracoding.vhpispingbootrestapi.controller;
/*
Created by IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IC-232.10072.27, built on October 11, 2023
@Author LENOVO a.k.a. Virdha Haniva Pratiwie Ishak
Java Developer
Created on 23/11/2023 19:34
@Last Modified 23/11/2023 19:34
Version 1.0
*/

import com.juaracoding.vhpispingbootrestapi.model.CalonPeserta;
import com.juaracoding.vhpispingbootrestapi.model.FormatData;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/formdata")
public class FormatDataController {
    @PostMapping("/v1/convertjson")
    //Map<String,Object>
    /*
        1. validaasi content type
        2. bongkar isi boody
        3. mapping field dari body ke penadah
        4. bungkus lalu jadikan format utuh class Object nya
     */
    public Object getDataJSON(@RequestBody FormatData formatData){
        System.out.println("Masuk kesini");
        return formatData;
    }
    @GetMapping("/v1/cubacuba")
    public void bikinapi(){
        System.out.println("Masuk Cuba Cuba");
    }

    @PostMapping("/seleksi")
    public String seleksiCalonPeserta(@RequestBody CalonPeserta calon) {
        if (calon.getNilai() > 80 && calon.getUmur() >= 18 && calon.getUmur() <= 60) {
            return calon.getNama() + " lolos seleksi";
        } else {
            return calon.getNama() + " tidak lolos seleksi";
        }
    }
}

