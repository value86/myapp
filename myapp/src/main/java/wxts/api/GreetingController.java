/**
 * myapp
 *
 * Copyright(c) 2018 NTT DATA INTELLILINK CORPORATION. All rights reserved.
 *
 * This product produced by Contact Center Solution Group in Blue cube Division.
 *
 * Since 2018-05-14
 */
package wxts.api;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import wxts.model.responce.Greeting;
import wxts.service.GreetingService;

@RestController
public class GreetingController {

  @Autowired
  private GreetingService greetingservice;

  private static final String template = "Hello, %s!";
  private final AtomicInteger counter = new AtomicInteger();

  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam(value = "id", defaultValue = "World") Integer id) {

    return new Greeting(counter.incrementAndGet(), String.format(template, greetingservice.getGreeting(id).getContent()));

  }
}