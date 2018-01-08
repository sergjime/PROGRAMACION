""" Escriu un programa que demani notes i les guardi en una llista.
Per a terminar d'introduir notes, escriu una nota que no estigui entre 0 i 10.
El programa termina escrivint la llista de notes. """ 

notas=[]
num=float(raw_input("Introduce una nota: "))
if num>=0 and num<=10:
    notas.append(num)

while num>=0 and num<=10:
    num=float(raw_input("Introduce una nota: "))
    if num>=0 and num<=10:
        notas.append(num)
print notas
