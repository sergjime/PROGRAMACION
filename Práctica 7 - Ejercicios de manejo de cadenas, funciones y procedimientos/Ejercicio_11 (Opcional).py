from funciones import *

""" Escribe un programa que te pida una frase, y pase la frase como par�metro a una funci�n. �sta
debe devolver si es pal�ndroma o no , y el programa principal escribir� el resultado por pantalla: """

algo=raw_input("Escribe algo: ")

reves=palindromo(algo)

if reves==algo:
    print "El resultado es",reves,": Es pal�ndromo"
else:
    print "El resultado es",reves,": No es pal�ndromo"

