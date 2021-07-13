package example.micronaut;

import io.micronaut.function.client.FunctionClient;

import java.util.Map;

@FunctionClient
public interface HelloClient {
    String helloworld(Map info);
}
