from funciones import *

""" Escribe un programa que lea el nombre de una persona y un car�cter, le pase estos datos a una
funci�n que comprobar� si dicho car�cter est� en su nombre. El resultado de dicha funci�n lo
imprimir� el programa principal por pantalla. """

nombre=raw_input("Escribe un nombre: ")
caracter=raw_input("Escribe un car�cter: ")

v_estar=estar(nombre,caracter)

if v_estar:
    print "El car�cter s� est� en la cadena introducida"
else:
    print "El car�cter no est� en la cadena introducida"
