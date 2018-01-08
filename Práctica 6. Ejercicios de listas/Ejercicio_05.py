""" Escribe un programa que permita crear dos listas de palabras y que,
a continuación, elimine de la primera lista los nombres de la segunda lista. """

li=[];li2=[];lista="";elimina=""

while (type(lista)==int)==False:
    try:
        lista=int(input("Dime cuántas palabras tiene la lista: "))
    except:
        print "Debe introducir un número entero"
    

for i in range(1,lista+1):
    palabra=raw_input ("Dime la palabra %d: " % i)
    li.append(palabra)

print "La lista creada es: ",li

while (type(elimina)==int)==False:
    try:
        elimina=int(input("Dime cuántas tiene la lista de palabras a eliminar: "))
    except:
        print "Debe introducir un número entero"


for j in range(1,elimina+1):
    palabra=raw_input ("Dime la palabra %d: " % j)
    while palabra not in li:
        print "La palabra seleccionada no existe en la lista"
        palabra=raw_input ("Dime la palabra %d: " % j)
    li2.append(palabra)

print "La lista de palabras a eliminar es: ",li2

for k in range(elimina):
    while li2[k] in li:
        li.remove(li2[k])

print "La lista es ahora: ",li
