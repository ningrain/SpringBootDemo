package com.gta.controller;

import com.gta.model.Girl;
import com.gta.util.Message;
import com.gta.util.MessageUtil;
import org.springframework.web.bind.annotation.*;

/**
 * HelloController
 * Created by ningning.jiang on 2017/8/3.
 */

@RestController
public class HelloController {

    @GetMapping("/hello/{id}/{cupSize}/{age}")
    public Message hello(@PathVariable("id") int id,
                         @PathVariable("cupSize") String cupSize,
                         @PathVariable("age") int age) {
        if (age == 0){
            return MessageUtil.exception();
        }
        return MessageUtil.success(new Girl(id, cupSize, age));
    }

    @GetMapping("/hi/{id}")
    public String hi(@PathVariable("id") int id) {
        return "id :" + id;
    }

}
