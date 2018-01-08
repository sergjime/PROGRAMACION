# -*- coding: cp1252 -*-
""" Escriu un programa que demani un nombre i retorni els seus divisors. """

num=int(input("Dona'm un nombre: "))
print "Els divisors de",num,"són:",
for i in range(1,num+1):
    if num%i==0:
        print i,
