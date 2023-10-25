package com.edw.controller;

import com.edw.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *     com.edw.controller.UserController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 25 Okt 2023 18:07
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/delete")
    public Map delete(@RequestParam("id") Integer id) {
        userRepository.deleteById(id);
        return new HashMap(){{
            put("status", "success");
        }};
    }
}
