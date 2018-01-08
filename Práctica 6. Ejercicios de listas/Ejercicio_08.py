""" Escribe un programa que permita crear una lista de palabras y que,
a continuación, ordene la lista por orden alfabético. """

li=[];lista1="";

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
li.sort()
print "La lista ordenada es: ",li
