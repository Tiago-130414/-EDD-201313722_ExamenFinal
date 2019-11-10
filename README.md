# -EDD-201313722_ExamenFinal
Examen Final Estructura de datos USAC 2 semestre 2019 sección: "B"
Implementación de Árbol AVL linealizada.

Flujo de la aplicación:
Se deberá de programar una aplicación en consola o GUI(como el estudiante prefiera), en donde se tendrá un menú.(Carga archivo,generar reportes,salir, etc.) el cual en la opción de carga archivo deberá de pedir la ruta del archivo csv en donde están los datos a cargar separados por comas al árbol implementado de manera linealizada. Esto quiere decir que no se tendrá una estructura de un árbol en si sino solo un arreglo o lista enlazada en donde se almacenaran los datos. Luego la aplicación podrá generar los reportes de este árbol como lo son sus recorridos(Preorden, inorden,postorden) en graphviz se deben de desplegar al momento de generarse y el reporte del árbol en treantjs(HTML). Al momento de cargarse otro csv se deben de limpiar las estructuras para su reutilización.

Estructuras
*Arreglo o lista enlazada para el manejo del árbol.

Especificaciones.
*Lenguaje java
*Uso correcto de github
*la carga de los datos se hará por medio de un archivo csv.
*criterio para insertar en el arbol sera por medio del numero de carne.
*para la cargar del archivo csv es libre pueden o no usar una libreria para sacar esa parte.
*Para la parte de generación del árbol se debe de usar la librería Treantjs. La pueden descargar aqui . https://github.com/fperucic/treant-js

Restricciones.
* Si se utiliza un arreglo el tamaño del arreglo debe de ser 100 espacios libres y se utiliza una lista enlazada deben de tener en consideración que la lista ya tiene que tener los 100 espacios apartados libres en memoria ya que pueden que algunos hijos de los subarboles estén nulos así como pasa en el arreglo(Esto para que cuadre la formula).
*El examen es individual.
*Copias 0 automático.
*No se calificaran exámenes entregados después de la hora establecida.
*Se entrega en esta tarea únicamente el link de github(no archivos de texto con el link).

Entregables.
* Link del repositorio( debe de ser publico)
- Código Fuente
- Reportes generados(Imágenes y Archivos necesarios para ver el árbol en el navegador)

Adjunto el csv que deben de cargar en su aplicación.

Adjunto un ejemplo de los archivos ya configurados lo único que tienen que hacer al usar el ejemplo es generar su archivo js cada que le den a generar el reporte luego abrir el html de esa misma carpeta. Les recomiendo manejar este ejemplo dentro de la carpeta de su proyecto en java para que no tengan problemas para visualizar el mismo.

Esta parte practica valdrá por el 50% de su nota en el examen final.

Saludos
