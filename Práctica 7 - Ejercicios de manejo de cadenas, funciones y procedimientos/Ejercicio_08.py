from funciones import *

""" Escribe un programa que lea una frase, y la pase como parámetro a
un procedimiento. El procedimiento contará el número de vocales (de cada una)
que aparecen, y lo imprimirá por pantalla. """

frase=raw_input("Escribe una frase: ")

blanco=eliminar_espacios(frase)

print blanco
