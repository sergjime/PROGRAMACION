from funciones import *

""" Escribe un programa que lea el nombre de una persona y un carácter, le pase estos datos a una
función que comprobará si dicho carácter está en su nombre. El resultado de dicha función lo
imprimirá el programa principal por pantalla. """

nombre=raw_input("Escribe un nombre: ")
caracter=raw_input("Escribe un carácter: ")

v_estar=estar(nombre,caracter)

if v_estar:
    print "El carácter sí está en la cadena introducida"
else:
    print "El carácter no está en la cadena introducida"
