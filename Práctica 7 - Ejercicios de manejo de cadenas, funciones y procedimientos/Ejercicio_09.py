from funciones import *

""" Escribe un programa que pida dos palabras las pase como parámetro
a un procedimiento y diga de las tres últimas letras de cada palabra
cuántas de ellas coinciden. """

palabra1=raw_input("Escribe una primera palabra: ")
palabra2=raw_input("Escribe una segunda palabra: ")

while len(palabra1)<=3:
    print "Escribe la primera palabra con longitud mayor a 3:",
    palabra1=raw_input()
    while len(palabra2)<=3:
        print "Escribe la segunda palabra con longitud mayor a 3:",
        palabra2=raw_input()

coincidir(palabra1,palabra2)
