# -*- coding: cp1252 -*-
""" Escriu un programa que demani un nombre i escrigui si �s primer o no. """

num=int(input("Inserta un n�mero:"))
contador = 0
verificar= False

for i in range(1,num+1):
    if (num% i)==0:
       contador = contador + 1
    if contador >= 3:
        verificar=True
        break

if contador==2 or verificar==False:
    print "el n�mero",num,"es primo"
else:
    print "el n�mero",num," no es primo"
