package org.indicepeticiones.ws;


import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;


/**
 * Implementación del servicio web con las operaciones de consulta
 * (consultarPeticiones) y alta y modificación (tratarPeticion) para mensajes
 * ER7 y XML.
 */
@Stateless
@WebService(targetNamespace = "http://org.indicepeticiones.ws/")
public class IndicePeticiones {

    private static final Logger logger = Logger.getLogger(IndicePeticiones.class);


    /**
     * Método que realiza el alta y modificación de una solicitud para los
     * mensajes ORM_O01, OMG_O19 y OML_O21. También para informar los resultados
     * desde el SID (mensaje tipo ORU_R01).
     *
     * @param textoHL7
     *            Mensaje HL7 con la solicitud en formato ER7.
     * @return Mensaje HL7 de tipo ACK en formato ER7 con el resultado de la
     *         invocación.
     */
    @WebMethod(operationName = "tratarPeticionER7")
    public @WebResult(name = "output")
    String tratarPeticionER7(@WebParam(name = "input") String textoHL7) {
        logger.info(String.format("Dentro de tratarPeticionER7 : %s" ,textoHL7));
        return "tratarPeticionER7";
    }

    /**
     * Método que realiza el alta y modificación de una solicitud para los
     * mensajes ORM_O01, OMG_O19 y OML_O21. También para informar los resultados
     * desde el SID (mensaje tipo ORU_R01).
     *
     * @param textoHL7
     *            Mensaje HL7 con la solicitud en formato XML.
     * @return Mensaje HL7 de tipo ACK en formato XML con el resultado de la
     *         invocación.
     */
    @WebMethod(operationName = "tratarPeticionXML")
    public @WebResult(name = "output")
    String tratarPeticionXML(@WebParam(name = "input") String textoHL7) {
        return "tratarPeticionXML";
    }

    /**
     * Método que realiza la consulta de peticiones.
     *
     * @param textoHL7
     *            Mensaje HL7 de tipo QBP_Q11 en formato XML.
     * @return Mensaje HL7 de tipo RSP_Z82 en formato XML con los datos
     *         obtenidos.
     */
    @WebMethod(operationName = "consultarPeticionesXML")
    public @WebResult(name = "output")
    String consultarPeticionesXML(@WebParam(name = "input") String textoHL7) {
        return "consultarPeticionesXML";
    }

    /**
     * Método que realiza la consulta de peticiones.
     *
     * @param textoHL7
     *            Mensaje HL7 de tipo QBP_Q11 en formato ER7.
     * @return Mensaje HL7 de tipo RSP_Z82 en formato ER7 con los datos
     *         obtenidos.
     */
    @WebMethod(operationName = "consultarPeticionesER7")
    public @WebResult(name = "output")
    String consultarPeticionesER7(@WebParam(name = "input") String textoHL7) {
        logger.debug("Dentro de consultarPeticionesER7: " + textoHL7);
        return "consultarPeticionesER7";
    }


    @WebMethod(operationName = "procesarMensaje")
    public String procesarMensaje(@WebParam(name = "input") String textoHL7) {
        logger.debug("Dentro de consultarPeticionesER7: " + textoHL7);
        return "procesarMensaje";
    }

}
