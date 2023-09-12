package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.lang.management.ManagementFactory;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }


    @GET
    @Path("/compiletime")
    @Produces(MediaType.TEXT_PLAIN)
    public String compiletime() {
        var time = "Total Compilation time: " + ManagementFactory.getCompilationMXBean().getTotalCompilationTime() + "ms";
        System.out.println(time);
        return time;
    }
}
