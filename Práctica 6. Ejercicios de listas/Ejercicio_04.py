""" Escribe un programa que permita crear una lista de palabras y que,
a continuación, pida una palabra y elimine esa palabra de la lista. """

li=[];lista=""

while (type(lista)==int)==False:
    try:
        lista=int(input("Dime cuántas palabras tiene la lista: "))
    except:
        print "Debe introducir un número entero"
    
for i in range(1,lista+1):
    palabra=raw_input ("Dime la palabra %d: " % i)
    li.append(palabra)

print "La lista creada es: ",li

elimina=raw_input ("Dime la palabra a eliminar: ")

while elimina not in li:
    print "La palabra",elimina,"no se encuentra en la lista"
    elimina=raw_input ("Dime una palabra que exista en la lista: ")
    
while elimina in li:
    li.remove(elimina)
print "La lista es ahora: ",li
