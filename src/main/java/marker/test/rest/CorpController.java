package marker.test.rest;

import marker.test.business.CorpManager;
import marker.test.view.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Service("controller")
@Path("/mc")
public class CorpController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CorpController.class);

    @Autowired
    @Qualifier("corpService")
    private CorpManager corpManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findIndiv() {

        if (corpManager.equals(null)) {
            System.out.println("============ corpManager.equals(null)");
            LOGGER.info("============ corpManager.equals(null)");
        }

        LOGGER.info("========== findIndiv called");

        return corpManager.findIndividuals();
    }
}
