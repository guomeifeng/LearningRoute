/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testproject.Controller;

import com.example.testproject.mybatismapper.Transaction;
import com.example.testproject.mybatismapper.Transaction_I;

import com.utilibill.market.type.CATSChangeReasonCode;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author kelly
 */
@RestController
@RequestMapping("/api")
public class TestController {

//    @Value("${mymessage}")
    private String message = "messagePlaceHolder";

    @Autowired
    private Transaction_I transaction_I;

    @GetMapping("/transfers")
    public List<Transaction> getMessage(Model model) {

        model.addAttribute("message", message);

        List<Transaction> transactions = transaction_I.findByServiceIdAndTransGroup("QFFF0000LV", "CATS");

        ArrayList<CATSChangeReasonCode> crCodesList = new ArrayList<>();
        crCodesList.add(CATSChangeReasonCode.CR1000);
        List<Transaction> transactionsOfSameServiceId = new ArrayList<>();

        transactions.addAll(transactionsOfSameServiceId.stream()
                .filter(s -> crCodesList.toString().indexOf(s.getTranCode()) > 0)
                .filter(y -> y.getDateAdded().before(new Timestamp(System.currentTimeMillis())))
                .collect(Collectors.toList()));

        return transactions;
    }

    @GetMapping("/add")
    public String getMessage() {

        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", message);
        mav.setViewName("index");

        return "{\"serviceId\":\"aaaaaaaaaaaaa\",\"participantId\":\"POWERCLUB\",\"crcodes\":[{\"label\":\"code1\",\"value\":\"1000\"},{\"label\":\"code2\",\"value\":\"1010\"}]}";
    }

    @GetMapping("/getMessageAndTime")
    public String getMessageAndTime(ModelMap map) {

        LocalDateTime ldt = LocalDateTime.now();

        DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDateTime(
                FormatStyle.MEDIUM);
        fmt.withLocale(new Locale("sk", "SK"));
        fmt.withZone(ZoneId.of("CET"));
        String time = fmt.format(ldt);

        map.addAttribute("message", message).addAttribute("time", time);

        return "show";
    }
}
