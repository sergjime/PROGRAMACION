""" Escribe un programa que permita crear una lista de palabras y que,
a continuaci�n, ordene la lista por orden alfab�tico. """

li=[];lista1="";

while (type(lista1)==int)==False:
    try:
        lista1=int(input("Dime cu�ntas palabras tiene la primera lista: "))
        if type(lista1)==int:
            for i in range(1,lista1+1):
                palabra=raw_input ("Dime la palabra %d: " % i)
                li.append(palabra)
    except:
        print "Debe introducir un n�mero entero"
print "La lista creada es: ",li
li.sort()
print "La lista ordenada es: ",li
