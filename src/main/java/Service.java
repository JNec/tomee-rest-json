import java.util.Collections;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;
import javax.ws.rs.core.MediaType;

@Path("/test")
@Produces({MediaType.APPLICATION_JSON})
public class Service {

    @GET
    public List<String> list() {
        return Collections.singletonList("hello");
    }

}
