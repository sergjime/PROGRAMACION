""" Escribe un programa que permita crear una lista de palabras y que,
a continuación, cree una segunda lista con las palabras de la primera,
pero sin palabras repetidas (el orden de las palabras en la segunda lista
no es importante). """

li=[];li2=[];lista1="";

while (type(lista1)==int)==False:
    try:
        lista1=int(input("Dime cuántas palabras tiene la primera lista: "))
        if type(lista1)==int:
            for i in range(1,lista1+1):
                palabra=raw_input ("Dime la palabra %d: " % i)
                li.append(palabra)
    except:
        print "Debe introducir un número entero"

print "La lista creada es: ",li

for i in range(lista1):
    if li[i] not in li2:
        li2.append(li[i])

print "La lista sin repeticiones es: ",li2
