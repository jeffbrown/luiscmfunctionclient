package example.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller("/")
public class DemoController {

    private final HelloClient helloClient;

    public DemoController(HelloClient helloClient) {
        this.helloClient = helloClient;
    }

    @Get("/greet/{name}")
    public String greet(String name) {
        Map m = new LinkedHashMap();
        m.put("name", name);
        return helloClient.helloworld(m);
    }
}

