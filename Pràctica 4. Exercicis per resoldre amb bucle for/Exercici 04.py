""" Escriu un programa que demani un nombre i calculi el seu factorial. """

num=int(input("Introduce un numero "))
factorial=1
    
for i in range(1,num+1):
    factorial=factorial*i
print "El factorial de",num,"es: ",factorial
