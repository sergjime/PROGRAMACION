""" Escribe un programa que permita crear dos listas de palabras y que, a continuación,
escriba las siguientes listas (en las que no debe haber repeticiones):

• Lista de palabras que aparecen en las dos listas
• Lista de palabras que aparecen en la primera lista, pero no en la segunda
• Lista de palabras que aparecen en la segunda lista, pero no en la primera
• Lista de palabras que aparecen en ambas listas

"""

li=[];li2=[];ambas=[];primera=[];segunda=[];todas=[];lista1="";lista2=""

while (type(lista1)==int)==False:
    try:
        lista1=int(input("Dime cuántas palabras tiene la primera lista: "))
        if type(lista1)==int:
            for i in range(1,lista1+1):
                palabra=raw_input ("Dime la palabra %d: " % i)
                li.append(palabra)
        print "La primera lista es: ",li
    except:
        print "Debe introducir un número entero"
    
while (type(lista2)==int)==False:
    try:
        lista2=int(input("Dime cuántas palabras tiene la segunda lista: "))
        if type(lista2)==int:
            for j in range(1,lista2+1):
                palabra=raw_input ("Dime la palabra %d: " % j)
                li2.append(palabra)
            print "La segunda lista es: ",li2
    except:
        print "Debe introducir un número entero"
        
for k in range(lista1):
    if li[k] in li2:
        ambas.append(li[k])
        todas.append(li[k])
print "Palabras que aparecen en las dos listas: ",ambas

for l in range(lista1):
    if li[l] not in li2:
        primera.append(li[l])
        todas.append(li[l])
print "Palabras que sólo aparecen en la segunda lista: ",primera

for m in range(lista1):
    if li2[m] not in li:
        segunda.append(li2[m])
        todas.append(li2[m])
print "Palabras que sólo aparecen en la primera lista: ",segunda
print "Todas las palabras: ",todas
