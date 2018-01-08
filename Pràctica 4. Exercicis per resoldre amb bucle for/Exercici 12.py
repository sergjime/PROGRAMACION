# -*- coding: cp1252 -*-
""" Escriu un programa que demani un nombre i escrigui si és primer o no. """

num=int(input("Inserta un número:"))
contador = 0
verificar= False

for i in range(1,num+1):
    if (num% i)==0:
       contador = contador + 1
    if contador >= 3:
        verificar=True
        break

if contador==2 or verificar==False:
    print "el número",num,"es primo"
else:
    print "el número",num," no es primo"
