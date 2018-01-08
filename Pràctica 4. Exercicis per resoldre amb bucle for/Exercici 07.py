# -*- coding: cp1252 -*-
""" Escriu un programa que demani l'alçada d'un trangle i ho dibuixi """

alto=int(input("Alçada del triangle: "))
descender=alto

for i in range(alto):
    for j in range(descender):
        print "*",
    descender=descender-1
    print ""
