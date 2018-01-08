"""Escribe un programa que pida una cantidad de segundos y que escriba cuántas horas y minutos son. """

segundos=int(input("Escribe una cantidad de segundos: "))
horas=(segundos/60)/60
minutos=segundos/60
minutos_actual=minutos-(horas*60)
segundos_actual=segundos-(minutos*60)
print segundos," segundos son ",horas," horas, ",minutos_actual," minutos y ",segundos_actual," segundos"
