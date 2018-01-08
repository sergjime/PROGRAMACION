""" Escriu un programa que te demani paraules i les guardi en una llista.
Per a terminar d'introduir paraules, simplement pitja Enter.
El programa termina escribint la llista de paraules. """ 

lista=[]
palabra=raw_input("Introduce una palabra: ")
lista.append(palabra)

while palabra!='':
    palabra=raw_input("Introduce otra palabra: ")
    lista.append(palabra)
lista.remove('')
print lista
    
