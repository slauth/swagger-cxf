package sample.endpoint1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Path("/")
@Produces(MediaType.TEXT_PLAIN)
@Api(value = "/endpoint1", description = "Description of endpoint 1")
public class Endpoint1Resource {

	@GET
	@ApiOperation(value = "Enpoint 1 GET")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success"),
	})
	public String get() {
		return getClass().getSimpleName();
	}
}
