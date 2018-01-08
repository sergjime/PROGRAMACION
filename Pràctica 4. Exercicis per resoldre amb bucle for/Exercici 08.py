# -*- coding: cp1252 -*-
""" Escriu un programa que demani l'alçada d'un trangle i ho dibuixi """

alto=int(input("Alçada del triangle: "))
descender=alto
empezar=0

for i in range(alto):
    empezar=empezar+1
    for j in range(empezar):
        print "*",
    print ""
    
for k in range(alto):
    for l in range(descender-1):
        print "*",
    descender=descender-1
    print ""



