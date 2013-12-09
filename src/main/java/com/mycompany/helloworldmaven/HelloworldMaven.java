/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.helloworldmaven;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author Philip
 */
@Path("helloworldMaven")
public class HelloworldMaven {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of HelloworldMaven
     */
    public HelloworldMaven() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.helloworldmaven.HelloworldMaven
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/html")
    public String getHtml() {
         /**
         * Retrieves representation of an instance of helloWorld.HelloWorld
         * @return an instance of java.lang.String
         */
           return "<html lang=\"en\"><body><h1>Hello, World!!</h1></body></html>";
        
   }

    /**
     * PUT method for updating or creating an instance of HelloworldMaven
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/html")
    public void putHtml(String content) {
    }
}
