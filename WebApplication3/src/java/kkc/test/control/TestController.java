/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkc.test.control;

import javax.validation.Valid;
import kkc.test.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author 1
 */
@Controller
public class TestController {

//    @RequestMapping(value = "test", method = RequestMethod.GET)
//    public String showForm(ModelMap model) {
//        model.addAttribute("test",new Test());
//        return "test";
//    }
    
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public ModelAndView user() {
        return new ModelAndView("test", "test", new Test());
    }

    @RequestMapping(value = "addTest", method = RequestMethod.POST)
    public String submit(@ModelAttribute("test") Test employee,
            ModelMap model) {
//        if (result.hasErrors()) {
//            return "error";
//        }
        model.addAttribute("name", employee.getName());
        return "result";
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public String helloWorld(ModelMap modelMap) {
//        System.out.println("on method");
//        modelMap.put("printme", "Hello Spring !!");
//        return "index";
//    }
}
