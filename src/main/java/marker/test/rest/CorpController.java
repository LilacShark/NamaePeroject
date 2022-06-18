package marker.test.rest;

import marker.test.business.CorpManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Service("controller")
@Path("/2c")
public class CorpController {

    @Autowired
    @Qualifier("corpManager")
    private CorpManager corpManager;

    @GET
    public void findIndiv() {
        corpManager.findIndividuals();
    }
}
