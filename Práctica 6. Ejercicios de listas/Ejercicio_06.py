""" Escribe un programa que permita crear una lista de palabras y que,
a continuaci�n, cree una segunda lista igual a la primera, pero al rev�s
(no se trata de escribir la lista al rev�s, sino de crear una lista distinta). """

li=[];inversa=[];lista=""

while (type(lista)==int)==False:
    try:
        lista=int(input("Dime cu�ntas palabras tiene la lista: "))
    except:
        print "Debe introducir un n�mero entero"
    
for i in range(1,lista+1):
    palabra=raw_input ("Dime la palabra %d: " % i)
    li.append(palabra)

for j in range((len(li)-1),-1,-1):
    inversa.append(li[j])

print "La lista creada es: ",li
print "La lista inversa es: ",inversa
