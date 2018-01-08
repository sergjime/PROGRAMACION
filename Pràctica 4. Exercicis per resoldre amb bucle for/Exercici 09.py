# -*- coding: cp1252 -*-
""" Escriu un programa que demani l'amplada i l'alçada
d'un rectangle i ho dibuixi """

anchura=int(input("Dame la anchura: "))
altura=int(input("Dame la altura: "))

for i in range(altura):
    if i==0 or i==altura-1:
        for j in range(anchura-1):
            print "*",
    else:
        for k in range(anchura-1):
            if k==0 or k==anchura-1:
                print "*",
            else:
                print " ",
    print "*","\n",
