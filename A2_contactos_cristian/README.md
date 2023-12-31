
# AE-2: Aplicación de gestión de contactos

Desarrollo de Interfaces.
Grupo 4 :
+ Cristian David Quiceno Laverde
+ Gabriela Prieto Herrera
+ Libertad Gamarra La Rosa
Repositorio Git:
https://github.com/LibertadDiana/AE2_AplicaciondeContactos.git

# Metodología.
En esta actividad se ha requerido crear un aplicación con varias ventanas a través de JavaSwing. Se
ha tenido en cuenta la importancia de que cada alumno pudiera conseguir realizar la actividad
completa, ya que es importante a la hora de entender el funcionamiento de esta clase de Java, la
interacción entre las distintas clases y la composición tanto del conector como de la clase Main.
Cumpliendo con el modelo MVC, adquiriendo así un profundo conocimiento de las particularidades y
dificultades de cada estructura de esta tecnología.
Por lo tanto cada participante del grupo ha subido a su rama propia dentro del github colaborativo la
actividad y partiendo de este punto, se ha decidido conjuntamente una solución final. En este caso, se
han integrado ciertas partes del código de Cristian y la creatividad de Gabriela que individualmente
tuvieron mejor resultado, dentro de la estructura final elegida por consenso.

# Contenido
1. Se ha creado una ventana principal que muestra una lista de contactos en una tabla de dos columnas y con tres botones(Añadir contactos, editar, eliminar) . 
La tabla dispone de una barra de desplazamiento por si hay desbordamientos de filas.

2. Se ha agregado un botón, un icono (+) "Añadir contacto" en la ventana principal. Al hacer clic en el botón "Añadir contacto", se abre una nueva ventana emergente:

Esta ventana emergente permite al usuario ingresar los datos del contacto: nombre y número de teléfono. Después de ingresar los datos del contacto y hacer clic en check, el contacto se agrega a la lista en la ventana principal.

Nota: En la ventana emergente en caso de no ingresar ningún dato en las cajas de texto, y le
demos al check el sistema nos mostrará una alerta.

3. Se agrega un botón "Editar". Al hacer clic en este botón, se abre otra ventana emergente que nos permite editar los datos del contacto seleccionado previamente para modificarlos. Al hacer clic en check la tabla de la ventana principal se actualiza con los datos modificados.
Queremos actualizar los datos de Godofredo agregando el apellido.

La ventana principal nos muestra los datos actualizados.
Nota: Para darle al botón editar debemos previamente seleccionar un contacto de la tabla, en
caso contrario nos mostrará la siguiente alerta.

4. Se ha agregado un botón "Eliminar". Al hacer clic en este botón, se elimina el contacto de la
lista que se haya seleccionado. En caso de no haber seleccionado nos muestra el siguiente
mensaje.

# Conclusión.
Para realizar esta actividad hemos puesto en práctica lo aprendido en la Unidad UF4, la creación de interfaces gráficas de usuario(GUI) mediante java y la librería swing, que nos ha permitido crear ventanas con una serie de controles o componentes como son las cajas de texto, etiquetas, botones, cuadros de diálogo, listas desplegables y barras de herramientas.etc… 

Con la ayuda de estos componentes por un lado hemos creado la interfaz y por otro hemos definido el comportamiento o la
interacción con el usuario a través de la gestión de eventos.
Para facilitar el trabajo colaborativo, se ha utilizado un repositorio Github, que facilita la cooperación, de las contribuciones individuales y en última instancia, la elección consensuada de la mejor solución.

Se han tenido en cuenta en la entrega final, la claridad del código, la creatividad, la modularidad y la eficiencia de los algoritmos. Para documentar finalmente en este ensayo la metodología utilizada y el funcionamiento idóneo de las aplicaciones