import io.quarkus.security.Authenticated;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/reports")
@Authenticated
public class ReportController {

    @GET
    @Path("")
    @RolesAllowed("prothetic_user")
    public int download() {
        return (int) (Math.random() * 50 + 1);
    }

}
