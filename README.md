# Practica-01-2

Utilizamos el ProcessBuilder 
para generar un proceso nuevo. Seguido de 
ello también definimos un ArrayList que lo utilizaremos
posteriormente en dos bucles.

Comenzamos abriendo un try-catch para controlar
posibles errores, dentro de este creamos un scanner
que ejecutará el comando pasado como parámetro
en la variable processBuilder.

Nos encontramos con un bucle for, el cual ejecuta el comando
las veces introducidas por teclado, hay una línea que indica la hora 
con precisión de milisegundos cuando el proceso comenzó.

initProcess es una variable tipo String, la hice string para así 
poder poner los decimales que por así decirlo "importaban", 
ya que el retraso eran de 500ms, así que mostré 3 decimales.

Por último por cada proceso que comenzó lo añadimos al ArrayList con
el método .add().

La línea siguiente hace esperar al programa 500ms.

En el siguiente bucle for definimos una variable proceso de 
tipo Process que será igual a cada uno de los procesos que se 
encuentran en el ArrayList. Cada vez que ese proceso se obtiene 
es destruido por el método .destroyForcibly().

En las siguientes dos líneas hacemos el mismo procedimiento
con el tiempo en el que ha terminado cada uno de los procesos.

