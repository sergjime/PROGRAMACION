""" Escriu un programa que te demani dos nombres cada vegada m�s grans i els guardi en una llista.
Per a terminar d'escriure els nombres, escriu un nombre que no sigui major a l'anterior. El
programa termina escribint la llista de nombres. """ 

lista=[]
contador=0
num=input("Introduce un n�mero: ")
lista.append(num)
print "Introduce un n�mero mayor que" ,num,":",
num=input()
if lista[contador]<num:
    lista.append(num)
    while lista[contador]<lista[contador+1]:
        print "Introduce un n�mero mayor que" ,num,":",
        num=input()
        contador=contador+1
        if lista[contador]<num:
            lista.append(num)
        else:
            break
print "Los n�meros introducidos son",lista
