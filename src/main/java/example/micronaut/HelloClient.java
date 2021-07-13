package example.micronaut;

import io.micronaut.function.client.FunctionClient;

import javax.inject.Named;
import java.util.Map;

@FunctionClient
public interface HelloClient {
    @Named("helloworld")
    String greet(Map info);
}
