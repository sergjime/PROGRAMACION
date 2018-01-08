""" Escriu un programa que demani un nombre (límit) i després et demani nombres
fins a què la suma dels nombres introduits superi un nombre inicial.
El programa termina escribint la llista de nombres. """ 

lista=[];suma=0

limit=input("Introduce el valor límite: ")
num=input("Introduce un valor: ")
if num>limit:
    while num>limit:
        print "Empieza introduciendo un valor menor o igual al límite, que es",limit,":",
        num=input()
else:
    lista.append(num)

for i in lista:
    suma += i
    if suma<limit:
        num=input("Introduce otro valor: ")
        lista.append(num)
    else:
        print "El límite a superar es",limit,". La lista creada es:",lista

