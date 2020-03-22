
Aplicación de ejemplo en OpenLiberty.

Para poder adaptar el Gestor de Peticiones del IMQ a un servidor de este tipo.

22/03/2020
He creado un módulo para el WS (IndicePeticionesWS).  
Me compila paero no me despliega. Creo que es por el fichero server.xml que no me lo está cogiendo.
En el fichero server.xml se definen las features del proyecto (he puesto JEE8) y también el contexto y los puertos.


## Run Sample application (press [ENTER] key to run tests])
    mvn liberty:dev

### Open URL in browser
    http://localhost:9080

### Stop server (quit)
    q [ENTER]
    
### Url del servicio web de Indice de peticiones
    http://localhost:9080/IndicePeticionesService/IndicePeticionesService.wsdl
    
    
   