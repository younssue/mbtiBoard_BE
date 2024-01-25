package org.mbti.boardproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;
import java.util.TreeMap;

@RestController
public class HealthCkeckController {

    @Value("${server.env}")
    private String env;

    @Value("${server.port}")
    private String port;

    @Value("${server.address}")
    private String ServerAddress;

    @Value("${serverName}")
    private String ServerName;



    @GetMapping("/hc")
    public ResponseEntity<?> test(){
        Map<String,String> reponseData = new TreeMap<>();
        reponseData.put("serverName",ServerName);
        reponseData.put("serverAddress",ServerAddress);
        reponseData.put("serverPort",port);
        reponseData.put("env",env);
        return ResponseEntity.ok(reponseData);
    }

    @GetMapping("/env")
    public ResponseEntity<?> getTest(){
        System.out.printf("deploy success");
        return ResponseEntity.ok(env);
    }
}
