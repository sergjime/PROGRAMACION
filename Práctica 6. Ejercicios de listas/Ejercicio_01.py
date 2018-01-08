""" Escribe un programa que permita crear una lista de palabras.
Para ello, el programa tiene que pedir un número y luego solicitar ese número de palabras para crear la lista.
Por último, el programa tiene que escribir la lista. """

li=[]
lista=""

while (type(lista)==int)==False:
    try:
        lista=int(input("Dime cuántas palabras tiene la lista: "))
    except:
        print "Debe introducir un número entero"
        
for i in range(1,lista+1):
    palabra=raw_input ("Dime la palabra %d :" % i)
    li.append(palabra)

print li
