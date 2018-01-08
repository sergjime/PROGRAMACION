from funciones import *

""" Escribe un programa que te pida una frase, y pase la frase como parámetro a una función. Ésta
debe devolver si es palíndroma o no , y el programa principal escribirá el resultado por pantalla: """

frase=raw_input("Escribe una frase: ")

cuenta=palabra(frase)

if cuenta>1:
    print "La frase tiene",cuenta,"palabras"
else:
    print "La frase tiene sólo una palabra"
