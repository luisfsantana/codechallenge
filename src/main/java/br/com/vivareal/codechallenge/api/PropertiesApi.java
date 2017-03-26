package br.com.vivareal.codechallenge.api;

import br.com.vivareal.codechallenge.model.Error;
import br.com.vivareal.codechallenge.model.Properties;
import br.com.vivareal.codechallenge.model.Property;
import br.com.vivareal.codechallenge.model.PropertyCreated;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-03-26T13:01:29.413Z")

@Api(value = "properties", description = "the properties API")
public interface PropertiesApi {

    @ApiOperation(value = "Gets some properties", notes = "Returns a list containing all properties.", response = Properties.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of Properties", response = Properties.class),
        @ApiResponse(code = 500, message = "An unexpected error occured.", response = Properties.class) })
    @RequestMapping(value = "/properties",
        method = RequestMethod.GET)
    ResponseEntity<Properties> propertiesGet( @ApiParam(value = "Top right ax") @RequestParam(value = "ax", required = false) Integer ax,
         @ApiParam(value = "Top right ay") @RequestParam(value = "ay", required = false) Integer ay,
         @ApiParam(value = "Lower left bx") @RequestParam(value = "bx", required = false) Integer bx,
         @ApiParam(value = "Lower left by") @RequestParam(value = "by", required = false) Integer by);


    @ApiOperation(value = "Gets a property", notes = "Returns a single property for its id.", response = Property.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A property", response = Property.class),
        @ApiResponse(code = 404, message = "Property does not exist.", response = Property.class),
        @ApiResponse(code = 500, message = "An unexpected error occured.", response = Property.class) })
    @RequestMapping(value = "/properties/{id}",
        method = RequestMethod.GET)
    ResponseEntity<Property> propertiesIdGet(@ApiParam(value = "The id's property",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "Creates a property", notes = "Adds a new property to the properties list.", response = PropertyCreated.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = PropertyCreated.class),
        @ApiResponse(code = 400, message = "Property does not exist.", response = PropertyCreated.class),
        @ApiResponse(code = 500, message = "An unexpected error occured.", response = PropertyCreated.class) })
    @RequestMapping(value = "/properties",
        method = RequestMethod.POST)
    ResponseEntity<PropertyCreated> propertiesPost(@ApiParam(value = "The property to create."  ) @RequestBody Property property);

}
