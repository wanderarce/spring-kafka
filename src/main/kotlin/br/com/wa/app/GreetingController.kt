package br.com.wa.app;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.PathVariable;
import java.util.concurrent.atomic.AtomicLong;

import br.com.wa.app.Greeting;

@RestController
class GreetingController {
 
    val counter: AtomicLong = AtomicLong();

    @RequestMapping("/greeting")
   fun greeting(@RequestParam(value="name", defaultValue="World") name: String?): Greeting {
    return Greeting(counter.incrementAndGet(), "Hello, $name!")
   } 
}