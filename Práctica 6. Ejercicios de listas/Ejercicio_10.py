""" Escribe un programa que pida un n�mero y a continuaci�n escriba la lista
de todos los divisores del n�mero (incluidos el uno y �l mismo). """

li=[];num="";

while (type(num)==int)==False:
    try:
        num=int(input("Dime un n�mero: "))
        for i in range(1,num+1):
            if num%i==0:
                li.append(i)
    except:
        print "Debe introducir un n�mero entero"

print num,"tiene",len(li),"divisores: ",li
