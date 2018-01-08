# -*- coding: cp1252 -*-
""" Escriu un programa que imprimeixi les taules de multiplicar del 0 al 9."""

for i in range(10):
    for j in range(1,11):
        print i,"por",j,"es igual a:",i*j
        if j==10:
            print "----------------------\n",
