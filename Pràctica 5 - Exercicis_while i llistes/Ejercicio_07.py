""" Escriu un programa que demani un nombre (l�mit) i despr�s et demani nombres
fins a qu� la suma dels nombres introduits superi un nombre inicial.
El programa termina escribint la llista de nombres. """ 

lista=[];suma=0

limit=input("Introduce el valor l�mite: ")
num=input("Introduce un valor: ")
if num>limit:
    while num>limit:
        print "Empieza introduciendo un valor menor o igual al l�mite, que es",limit,":",
        num=input()
else:
    lista.append(num)

for i in lista:
    suma += i
    if suma<limit:
        num=input("Introduce otro valor: ")
        lista.append(num)
    else:
        print "El l�mite a superar es",limit,". La lista creada es:",lista

