from funciones import *

""" Escribe un programa que te pida una frase, y pase la frase como parámetro a una función. Ésta
debe devolver si es palíndroma o no , y el programa principal escribirá el resultado por pantalla: """

algo=raw_input("Escribe algo: ")

reves=palindromo(algo)

if reves==algo:
    print "El resultado es",reves,": Es palíndromo"
else:
    print "El resultado es",reves,": No es palíndromo"

