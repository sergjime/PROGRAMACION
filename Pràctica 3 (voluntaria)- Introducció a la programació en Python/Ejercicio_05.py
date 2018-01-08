""" Escribe un programa que pida una temperatura en grados Fahrenheit y que escriba esa temperatura en grados Celsius.
La relación entre grados Celsius (C) y grados Fahrenheit (F) es la siguiente:
F - 32 = 1,8 * C. """ 

fahrenheit=float(input("Escribe una temperatura en grados Fahrenheit: "))
celsius=(fahrenheit-32)/1.8
print fahrenheit," ºF son ",celsius," ºC"
