""" Escribe un programa que permita crear una lista de palabras.
Para ello, el programa tiene que pedir un n�mero y luego solicitar ese n�mero de palabras para crear la lista.
Por �ltimo, el programa tiene que escribir la lista. """

li=[]
lista=""

while (type(lista)==int)==False:
    try:
        lista=int(input("Dime cu�ntas palabras tiene la lista: "))
    except:
        print "Debe introducir un n�mero entero"
        
for i in range(1,lista+1):
    palabra=raw_input ("Dime la palabra %d :" % i)
    li.append(palabra)

print li
