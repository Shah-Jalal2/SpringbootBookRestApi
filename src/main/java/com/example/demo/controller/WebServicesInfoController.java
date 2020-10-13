package com.example.demo.controller;

import com.example.demo.model.WebServiceInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WebServicesInfoController {
      @GetMapping("/")
      public WebServiceInfo getWebServicesInfo() {

          WebServiceInfo webServiceInfo= new WebServiceInfo("RestFull book api","api/v1",
                  "Md. Shajalal",2017100000038L);

         webServiceInfo.setSwagger_end_point("/swagger");
         return webServiceInfo;

      }
}
