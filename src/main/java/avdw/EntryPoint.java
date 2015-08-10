package avdw;

/**
 * Created by waw on 10.08.2015.
 */


import com.sun.xml.internal.ws.client.sei.ResponseBuilder;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/entry-point")
public class EntryPoint {

    @GET
    @Path("test/{x}")
    @Produces(MediaType.TEXT_PLAIN)
    public String test(@PathParam("x") String x, @QueryParam("y") String y) {
        return "Test: x= " + x + " y = " + y;
    }

    @POST
    @Path("test1/{x}")
    @Produces(MediaType.TEXT_PLAIN)
    public String test1(@PathParam("x") String x, @QueryParam("y") String y, String Body) {
        return "Test: x= " + x + " y = " + y +" " +Body;

    }
}