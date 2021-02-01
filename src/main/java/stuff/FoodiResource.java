package stuff;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/foodies")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FoodiResource {

  @POST
  @Path("entity")
  public void postFoodiEntity(@Valid Foodi foodi) {
    // validation fails for empty `foodi`.
    if (foodi.name.isEmpty()) {
      System.out.println("no npe");
    }
  }

  @POST
  @Path("view")
  public void postFoodiView(@Valid FoodiCreateView foodi) {
    // NPE for foodi.getName()
    if (foodi.getName().isEmpty()) {
      System.out.println("npe");
    }
  }

}
