""" Escriu un programa que demani primer dos nombres(màxim i mínim) i que
després te demani 2 nombres situats entre ells. Per a terminar d'escriure nombres,
escriu un nombre que no sigui comprès entre els dos valors inicials.
El programa termina escribint la llista de nombres. """ 

lista=[]

num1=input("Introduce un número: ")
print "Introduce un número mayor que" ,num1,":",
num2=input()

while num1>num2 or num2-num1==1:
    if num2-num1==1:
        print "Introduce un número con al menos un número entre ellos:",
        num2=input()
    else:
        print num2,"no es mayor que",num1,". Vuelve a probarlo:",
        num2=input()
 
print "Introduce un número entre",num1,"y",num2,":",
entre=input()

if entre>num1 and entre<num2:
    lista.append(entre)
    while entre>num1 and entre<num2:
        print "Introduce otro número entre",num1,"y",num2,":",
        entre=input()
        if not entre>num1 or not entre<num2:
            print "Los números introducidos entre",num1,"y",num2,"son:",lista
            break
        else:
            lista.append(entre)
else:
    print "El usuario no introdujo ningún número entre",num1,"y",num2
