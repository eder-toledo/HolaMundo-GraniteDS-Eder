Pequeña aplicacion de Hola-Mundo utilizando GraniteDS.

Para la realizacion de este proyecto nos hemos guiado de la documentacion oficial del sitio:
http://www.graniteds.org/public/docs/3.0.0/docs/reference/flex/en-US/html/graniteds.gettingstarted.html#gettingstarted.helloworld.flex

Hemos realizado unos modificaciones de ese archivo en la parte de FLEX para poder ejecutarlo sin ningun problema.

Si desea ver este ejemplo en su computador debera contar con los siguientes elementos.

    * Java 5+ (6+ working).

    * Eclipse 3.3+.

    * Flex 3+ SDK.

    * JBoss 4.2.3.GA.

    * Archivosarchivos (granite.jar, granite-hibernate.jar ay granite-essentials.swc).

    * Plugin GraniteDS Eclipse Builder. 

En el archivo que contiene las variables FLEX_HOME y JBOSS_HOME favor de poner la ruta de JBOSS y FLEX-SDK en su computador por ejemplo:

	* Para windows "C:\Documents\Flex-SDK\" y "C:\Documents\Jboss-4.2.3.GA\"
	* Para linux   "/home/user/Flex-SDK/" y "/home/user/Jboss-4.2.3.GA"

1.- Para poner en marcha abrir el IDE eclipse e importar el archivo como un proyecto general.

2.- En el IDE eclipse ir a e menu windows-show-ant y agregar el archivo build.xml

3.- Click en play.

4.- Si todo esta correcto generara una carpeta llamada build con los archivos generados incluido un archivo .ear, ademas se agregara el mismo archivo en elservidor Jboss en la ruta: Jboss/server/default/deploy/.

5.- Ejecutar el servidor Jboss a travez del archivo run.bat o run.sh segun su S.O. que se encuentra en la ruta Jboss/bin esperar a que se inicie.

6.- Puede abrir su navegador e ir a la direccion "localhost:8080/helloworld" y podra ver el ejemplo.