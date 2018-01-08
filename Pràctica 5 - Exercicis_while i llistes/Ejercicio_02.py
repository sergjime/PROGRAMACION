""" Escriu un programa que te demani nombres i els guardi en una llista.
Per a terminar d'introduir nombres, simplement pitja Enter.
 El programa termina escrivint la llista de nombres. """ 

lista=[]
num=raw_input("Introduce un número: ")
lista.append(num)

while num!='':
    num=raw_input("Introduce otro número: ")
    lista.append(num)
lista.remove('')
print lista
