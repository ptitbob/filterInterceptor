package org.shipstone.sandbox.rest.ws.rs;

import org.shipstone.sandbox.rest.ws.rs.tools.Intercept;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author François Robert
 */
@Path("user")
public class User {

  @GET
  @Path("hello")
  public String hello() {
    return "hello";
  }

  @GET
  @Intercept
  @Path("bonjour")
  public String bonjour() {
    return "Bonjour le monde";
  }

}
