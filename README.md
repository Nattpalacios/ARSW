# Laboratorio 2

## BBP Formula

### Part I - Introduction to Java Threads
![](https://raw.githubusercontent.com/Nattpalacios/ARSW-Lab2/master/Imagenes/1.JPG "Thread de números entre A y B")

Esta es la forma en la que se completó la clase que define el ciclo de vida del hilo que imprime los números entre un A y B determinado.

![](https://raw.githubusercontent.com/Nattpalacios/ARSW-Lab2/master/Imagenes/2.JPG)

Se crearon los hilos asignando los intervalos dados y se ejecutó el programa, primero con run() y luego con start(). Se pudo observar que al ejecutarlo con run() los números se imprimían en total orden y cuando se ejecutaba con start(), la impresión no tenía un orden determinado. 

![](https://raw.githubusercontent.com/Nattpalacios/ARSW-Lab2/master/Imagenes/3.jpg)

![](https://raw.githubusercontent.com/Nattpalacios/ARSW-Lab2/master/Imagenes/4.jpg)

Esta diferencia se debe a que cuando usamos run() el programa se va a ejecutar en orden, hilo por hilo, y cuando usamos start() los tres hilos comienzan a ejecutarse al mismo tiempo, el proceso lo hacen en paralelo y por lo tanto, la impresión no va a tener un orden específico, éste puede variar.

## Dogs Race case

### Part I 
En las imágenes se muestra el uso de la CPU cuando solo se trabaja con un hilo y cuando se trabaja con tres hilos. La primera imagen representa un hilo y la segunda representa los tres hilos. Cuando se le asignaba el trabajo a un solo hilo, el porcentaje de uso de la CPU era de máximo 65% y cuando trabajaban los tres hilos, el porcentaje de uso variaba entre 70% y 90%.

![](https://raw.githubusercontent.com/Nattpalacios/ARSW-Lab2/master/Imagenes/5.JPG)

![](https://raw.githubusercontent.com/Nattpalacios/ARSW-Lab2/master/Imagenes/6.JPG)

### Part III
