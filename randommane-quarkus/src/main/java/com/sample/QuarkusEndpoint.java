package com.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/randomname")
public class QuarkusEndpoint {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        final String[] names = { "Liam", "Noah", "William", "James", "Oliver", "Benjamin", "Elijah", "Lucas", "Mason",
                "Logan", "Alexander", "Ethan", "Emma", "Emma", "Olivia", "Ava", "Isabella", "Sophia", "Charlotte",
                "Mia", "Amelia", "Harper", "Evelyn", "Abigail", "Emily" };
        final int nameIndex = (int) (names.length * Math.random());
        return names[nameIndex];

    }
}