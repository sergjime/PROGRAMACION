from funciones import *

""" Escribe un programa que te pida una frase, y pase la frase como par�metro a una funci�n. �sta
debe devolver si es pal�ndroma o no , y el programa principal escribir� el resultado por pantalla: """

frase=raw_input("Escribe una frase: ")

cuenta=palabra(frase)

if cuenta>1:
    print "La frase tiene",cuenta,"palabras"
else:
    print "La frase tiene s�lo una palabra"
