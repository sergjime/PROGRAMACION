""" Escribe un programa que permita crear una lista de palabras y que,
a continuación, cree una segunda lista igual a la primera, pero al revés
(no se trata de escribir la lista al revés, sino de crear una lista distinta). """

li=[];inversa=[];lista=""

while (type(lista)==int)==False:
    try:
        lista=int(input("Dime cuántas palabras tiene la lista: "))
    except:
        print "Debe introducir un número entero"
    
for i in range(1,lista+1):
    palabra=raw_input ("Dime la palabra %d: " % i)
    li.append(palabra)

for j in range((len(li)-1),-1,-1):
    inversa.append(li[j])

print "La lista creada es: ",li
print "La lista inversa es: ",inversa
