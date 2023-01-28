/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.ipnet.university.pharmacie.controller;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import tg.ipnet.university.pharmacie.ejb.MedicamentIDAO;
import tg.ipnet.university.pharmacie.entity.Medicament;
import tg.ipnet.university.pharmacie.utility.Message;

/**
 *
 * @author kpizia
 */
@Path("/medicaments")
public class MedicamentController {

    @EJB
    private MedicamentIDAO dao;

    @GET
    public Response lister() {
        List<Medicament> medicaments= new ArrayList<>();
        try {
            medicaments = dao.lister();
            return Response.ok().entity(medicaments).build();
        } catch (Exception e) {
            return Response.status(javax.ws.rs.core.Response.Status.NOT_FOUND)
					.build();
        }
        
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response ajouter(@PathParam("id") int id) {
        Medicament medicament= null;
        try {
            medicament = dao.rechercher(id);
            return Response.ok().entity(medicament).build();
        } catch (Exception e) {
            return Response.status(javax.ws.rs.core.Response.Status.NOT_FOUND)
					.build();
        }
        
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response editer(Medicament medicament) {
        try {
            medicament = dao.ajout(medicament);
            return Response.status(201).entity(medicament).build();
        } catch (Exception e) {
            return Response.status(javax.ws.rs.core.Response.Status.BAD_REQUEST)
					.entity(new Message("Ajout ejoué"))
					.build();
        }
        
    }
}
