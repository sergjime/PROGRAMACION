""" Exercici que demani a l'usuari l'espai recorregut per un cotxe (en km)
i el temps que ha tardat (en hores) i que calculi a quina velocitat anava. """

km=int(input("Introduce el recorrido (en km): "))
horas=int(input("Introduce el tiempo que tarda (en horas): "))
porhora=km/horas
print "El coche iba a una velocidad de ",porhora,"km/h"
