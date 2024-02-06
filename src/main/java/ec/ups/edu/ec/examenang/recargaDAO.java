package ec.ups.edu.ec.examenang;


import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/recargas")
public class recargaDAO {

 @POST
 @Path("/realizarRecarga")
 @Consumes(MediaType.APPLICATION_JSON)
 @Produces(MediaType.TEXT_PLAIN)
 
 public String realizarRecarga(Recargas recarga) {
     // Lógica para procesar la recarga
     if (esRecargaValida(recarga)) {
         // Simulación de transacción exitosa
         return "Recarga exitosa";
     } else {
         // Simulación de fallo en la recarga
         return "Fallo en la recarga";
     }
 }

 private boolean esRecargaValida(Recargas recarga) {
     // Verificar si los campos necesarios están presentes
     return recarga.getMonto() > 0
             && recarga.getNumeroTelefono() != null && !recarga.getNumeroTelefono().isEmpty()
             && recarga.getOperador() != null && !recarga.getOperador().isEmpty();
 }
}
