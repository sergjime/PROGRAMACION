""" Escribe un programa que pida un número y a continuación escriba la lista
de todos los divisores del número (incluidos el uno y él mismo). """

li=[];num="";

while (type(num)==int)==False:
    try:
        num=int(input("Dime un número: "))
        for i in range(1,num+1):
            if num%i==0:
                li.append(i)
    except:
        print "Debe introducir un número entero"

print num,"tiene",len(li),"divisores: ",li
