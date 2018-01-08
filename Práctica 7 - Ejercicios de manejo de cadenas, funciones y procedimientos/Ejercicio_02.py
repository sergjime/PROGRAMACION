from funciones import *

""" Escribe un programa que lea el nombre y los dos apellidos de una persona
(en tres cadenas de caracteres diferentes), los pase como parámetros a una función,
y ésta debe unirlos y devolver una única cadena. La cadena final la imprimirá el
programa por pantalla. """

nombre=raw_input("Escribe tu nombre: ")
apellido1=raw_input("Escribe tu primer apellido: ")
apellido2=raw_input("Escribe tu segundo apellido: ")

final=unir(nombre,apellido1,apellido2)

print "Tu nombre es:",final
