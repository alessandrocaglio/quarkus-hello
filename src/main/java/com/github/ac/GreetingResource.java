package com.github.ac;

import java.util.Optional;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;



@Path("/hello")
public class GreetingResource {

    @ConfigProperty(name = "NAME")
    Optional<String> name;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from " + name.orElse("RestEasy");
    }
}
