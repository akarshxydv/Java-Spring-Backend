package com.example.springboot.intro.controller;

import com.example.springboot.intro.models.Holidays;
import com.example.springboot.intro.models.Type;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Slf4j
@Controller
public class HolidaysController {


    //  this is done by requestParam

//    @GetMapping("/holidays")
//    public String holidays(@RequestParam(required = false) boolean festival,
//                           @RequestParam(required = false) boolean federal,Model model){
//
//        model.addAttribute("festival",festival);
//        model.addAttribute("federal",federal);
//
//        List<Holidays>  holidaysList= Arrays.asList(
//                new Holidays(" Jan 1 ","New Year's Day", Type.FESTIVAL),
//                new Holidays(" Oct 31 ","Halloween", Type.FESTIVAL),
//                new Holidays(" Nov 24 ","Thanksgiving Day", Type.FESTIVAL),
//                new Holidays(" Dec 25 ","Christmas", Type.FESTIVAL),
//                new Holidays(" Jan 17 ","Martin Luther King Jr. Day", Type.FEDERAL),
//                new Holidays(" July 4 ","Independence Day", Type.FEDERAL),
//                new Holidays(" Sep 5 ","Labor Day", Type.FEDERAL),
//                new Holidays(" Nov 11 ","Veterans Day", Type.FEDERAL)
//        );
//        Type[] types = Type.values();
//        for (Type type : types) {
//            model.addAttribute(type.toString(),
//                    (holidaysList.stream().filter(holiday -> holiday.type().equals(type)).collect(Collectors.toList())));
//        }
//        return "holidays.html";
//    }


    //  this is done using Pathparam

    @GetMapping("/holidays/{display}")
    public String holidays(@PathVariable String display, Model model){

        if(display !=null && display.equals("all")){
            model.addAttribute("festival",true);
            model.addAttribute("federal",true);
        } else if (display !=null && display.equals("festival")) {
            model.addAttribute("festival",true);
            model.addAttribute("federal",false);
        }else {
            model.addAttribute("festival",false);
            model.addAttribute("federal",true);
        }


        List<Holidays>  holidaysList= Arrays.asList(
                new Holidays(" Jan 1 ","New Year's Day", Type.FESTIVAL),
                new Holidays(" Oct 31 ","Halloween", Type.FESTIVAL),
                new Holidays(" Nov 24 ","Thanksgiving Day", Type.FESTIVAL),
                new Holidays(" Dec 25 ","Christmas", Type.FESTIVAL),
                new Holidays(" Jan 17 ","Martin Luther King Jr. Day", Type.FEDERAL),
                new Holidays(" July 4 ","Independence Day", Type.FEDERAL),
                new Holidays(" Sep 5 ","Labor Day", Type.FEDERAL),
                new Holidays(" Nov 11 ","Veterans Day", Type.FEDERAL)
        );
        Type[] types = Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString(),
                    (holidaysList.stream().filter(holiday -> holiday.type().equals(type)).collect(Collectors.toList())));
        }
        return "holidays.html";
    }
}


