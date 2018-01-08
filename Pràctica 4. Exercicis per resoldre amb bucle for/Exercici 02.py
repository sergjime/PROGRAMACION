""" Escriu un programa que demani dos nombres i escrigui quins nombres son parells
i quins són senars (=”impares”) des del primer fins al segon. """

num1=int(input("Introduce un numero "))
num2=int(input("Introduce un numero "))

for i in range(num1,num2+1):
    if i%2==0:
        print i," es par"
    else:
        print i," es impar"
