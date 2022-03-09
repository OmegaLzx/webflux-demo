package pri.omega.webfluxdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author zexuan.Li  2022/3/9
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public Mono<String> test() {
        return Mono.just("test");
    }
}
