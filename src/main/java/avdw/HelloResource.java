package avdw;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by IntelliJ IDEA.
 * User: Andrew
 * Date: 2012/01/30
 * Time: 12:19 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("/hello")
public class HelloResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes({"text/xml", "text/plain", "text/html", MediaType.TEXT_HTML})
    public String sayHello() {
        return "<html><title>Hello World HTML</title><body><h1>Hello World HTML JRebel Rules!</body></h1></html>";
    }
    
    @GET
    @Produces(MediaType.TEXT_XML)
    public String sayXMLHello() {
        return "<?xml version=\"1.0\"?><hello> Hello World XML, YAY!!!</hello>";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello() {
        return "<html><title>Hello World HTML</title><body><h1>Hello World HTML JRebel Rules!</body></h1></html>";
    }
    
    @POST
    @Consumes({"text/xml", "text/plain", "text/html", MediaType.TEXT_HTML})
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPostHello() {
        return "Hello World Post!";
    }
}
