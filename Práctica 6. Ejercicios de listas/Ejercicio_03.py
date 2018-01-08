""" Escribe un programa que permita crear una lista de palabras y que,
a continuación,pida dos palabras y sustituya la primera por la segunda
en la lista. """

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
sustituye=raw_input ("Sustituir la palabra: ")
palabra_sus=raw_input ("por la palabra: ")

for j in range(lista):
    if li[j]==sustituye:
        li.insert(j,palabra_sus)
        li.remove(sustituye)
        

print "La lista es ahora: ",li
        
