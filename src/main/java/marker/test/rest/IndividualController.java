package marker.test.rest;

import marker.test.service.CorpService;
import marker.test.view.IndividualRequest;
import marker.test.view.IndividualResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/individuals")
public class IndividualController {

    @Autowired
    private CorpService corpService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<IndividualResponse> getIndividualsInfo(IndividualRequest request) {

        return corpService.getIndividualsInfo(request);

    }

}
