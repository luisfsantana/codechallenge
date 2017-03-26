package br.com.vivareal.codechallenge.api;

import br.com.vivareal.codechallenge.model.Error;
import br.com.vivareal.codechallenge.model.Properties;
import br.com.vivareal.codechallenge.model.Property;
import br.com.vivareal.codechallenge.model.PropertyCreated;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-03-26T13:01:29.413Z")

@Controller
public class PropertiesApiController implements PropertiesApi {



    public ResponseEntity<Properties> propertiesGet( @ApiParam(value = "Top right ax") @RequestParam(value = "ax", required = false) Integer ax,
         @ApiParam(value = "Top right ay") @RequestParam(value = "ay", required = false) Integer ay,
         @ApiParam(value = "Lower left bx") @RequestParam(value = "bx", required = false) Integer bx,
         @ApiParam(value = "Lower left by") @RequestParam(value = "by", required = false) Integer by) {
        // do some magic!
        return new ResponseEntity<Properties>(HttpStatus.OK);
    }

    public ResponseEntity<Property> propertiesIdGet(@ApiParam(value = "The id's property",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Property>(HttpStatus.OK);
    }

    public ResponseEntity<PropertyCreated> propertiesPost(@ApiParam(value = "The property to create."  ) @RequestBody Property property) {
        // do some magic!
        return new ResponseEntity<PropertyCreated>(HttpStatus.OK);
    }

}
