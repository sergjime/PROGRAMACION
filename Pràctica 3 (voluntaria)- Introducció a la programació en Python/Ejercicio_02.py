""" Escribe un programa que pida el peso y la altura de una persona y que calcule su índice de masa corporal (imc).
El imc se calcula con la fórmula imc = peso / altura2. """

peso=float(input("¿Cuanto pesas? "))
altura=float(input("¿Cuanto mides en metros?"))
imc= peso/(altura*altura)
print "Tu imc es: ",imc
