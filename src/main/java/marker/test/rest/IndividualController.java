package marker.test.rest;

import marker.test.view.IndividualRequest;
import marker.test.view.IndividualResponse;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component
@Path("/individuals")
public class IndividualController {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public IndividualResponse getIndividualsInfo(IndividualRequest request) {


        return null;

    }

}
