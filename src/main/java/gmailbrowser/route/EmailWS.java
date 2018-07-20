package gmailbrowser.route;

import gmailbrowser.model.Email;
import org.apache.commons.lang3.exception.ExceptionUtils;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/email")
public class EmailWS {
    // TODO This is a hack. There should be instance variable which should be injected into this class.
    // There is way to do that, will figure out soon.
    public static String emailsDirectory;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Email getEmailById(@PathParam("id") String id) {
        try {
            return new Email(id, emailsDirectory);
        } catch (Exception e) {
            return ExceptionUtils.rethrow(e);
        }
    }
}
