""" Escribe un programa que pida una distancia en pies y pulgadas y que escriba esa distancia en centímetros.
Recuerda que un pie son doce pulgadas y una pulgada son 2,54 cm. """

pies=float(input("Escribe una cantidad de pies: "))
pulgadas=float(input("Escribe una cantidad de pulgadas: "))
pies_pulgadas=pies*12
cm=(pies_pulgadas+pulgadas)*2.54
print pies," pies y ", pulgadas," son ",cm," cm"
