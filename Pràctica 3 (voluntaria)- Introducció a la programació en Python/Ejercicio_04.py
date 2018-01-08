""" Escribe un programa que pida una temperatura en grados Celsius y que escriba esa temperatura en grados Fahrenheit.
La relación entre grados Celsius (C) y grados Fahrenheit (F) es la siguiente: 
F - 32 = 1,8 * C. """

celsius=float(input("Escribe una temperatura en grados Celsius: "))
fahrenheit=(1.8*celsius)+32
print celsius," ºC son ",fahrenheit," ºF"
