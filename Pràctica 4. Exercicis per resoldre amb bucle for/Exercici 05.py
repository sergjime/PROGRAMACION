# -*- coding: cp1252 -*-
""" Escriu un programa que demani l'amplada i alçada d'un rectangle i ho dibuixi """

ancho=int(input("Amplada del rectangle: "))
alto=int(input("Alçada del rectangle: "))

for i in range(alto):
    for j in range(ancho):
        print "*",
    print ""
