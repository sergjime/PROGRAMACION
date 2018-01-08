""" Escribe un programa que pida una cantidad de segundos y que escriba cuántos minutos son. """

segundos=int(input("Escribe una cantidad de segundos: "))
minutos=segundos/60
segundos_actual=segundos-(minutos*60)
print segundos," segundos son ",minutos," minutos y ",segundos_actual," segundos"
