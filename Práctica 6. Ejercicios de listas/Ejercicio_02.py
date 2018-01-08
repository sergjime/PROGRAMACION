""" Escribe un programa que permita crear una lista de palabras y que,
a continuación, pida una palabra y diga cuántas veces aparece esa palabra
en la lista.  """

li=[]
repe=0
lista=""

while (type(lista)==int)==False:
    try:
        lista=int(input("Dime cuántas palabras tiene la lista: "))
    except:
        print "Debe introducir un número entero"
        
lista2=lista+1

for i in range(1,lista2):
    palabra=raw_input ("Dime la palabra %d:" % i)
    li.append(palabra)

print "La lista creada es: ",li

palabra_repe=raw_input ("Dame la palabra: ")

for j in range(lista):
    if li[j]==palabra_repe:
        repe=repe+1
        
if repe==0:
    print "La palabra ",palabra_repe,"no aparece en la lista."
else:
    if repe==1:
        print "La palabra ",palabra_repe,"aparece una sola vez en la lista."
    else:
        print "La palabra ",palabra_repe,"aparece",repe,"veces en la lista."
    

