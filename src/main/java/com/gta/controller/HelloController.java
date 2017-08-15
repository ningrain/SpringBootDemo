package com.gta.controller;

import com.gta.enums.MessageEnum;
import com.gta.exception.GirlException;
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
        if (age <= 0){
            throw new GirlException(MessageEnum.MIN_AGE);
        } else if (age > 120){
            throw new GirlException(MessageEnum.MAX_AGE);
        }
        return MessageUtil.success(new Girl(id, cupSize, age));
    }

    @PostMapping("/hi/{id}")
    public String hi(@PathVariable("id") int id) {
        return "id :" + id;
    }

}
