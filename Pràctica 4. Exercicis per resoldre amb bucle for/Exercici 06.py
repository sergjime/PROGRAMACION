# -*- coding: cp1252 -*-
""" Escriu un programa que demani l'alçada d'un trangle i ho dibuixi """

alto=int(input("Alçada del triangle: "))

for i in range(alto):
    for j in range(i+1):
        print "*",
    print ""
