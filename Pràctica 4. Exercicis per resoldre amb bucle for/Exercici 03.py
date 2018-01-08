""" Escriu un programa que demani 2 nombres i escrigui la suma de
sencers des del primer nombre fins al segon. """

num1=int(input("Introduce el primer numero "))
num2=int(input("Introduce el segundo numero "))
while num1>=num2:
    print "El segundo numero es igual o mayor que el primer numero"
    num2=int(input("Introduce el segundo numero "))
    
for i in range(num1,num2+1):
    
    print i,"",
