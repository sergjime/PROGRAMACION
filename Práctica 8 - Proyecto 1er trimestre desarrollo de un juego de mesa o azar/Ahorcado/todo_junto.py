# -*- coding: cp1252 -*-
from random import choice #La funci�n choice se utiliza para escoger una palabra al azar de una lista.

palabra=choice(['windows','solidaridad','marine','programador','fusil','estudiante','cascada','ahorcado','suavizar','payaso','lenguaje'])
almacenaje="" # Aqu� se almacenar�n las letras que el usuario vaya introduciendo.
vidas=5
vida_main=vidas
sabe=0

while vidas>0:
    guiones=0
    for i in palabra:       
        if i in almacenaje:
            print i,
        else:
            print "-",
            guiones+=1
    print ""
    print 'TIENES',vida,'VIDAS'
    
    sabe=saber() # Esta funci�n preguntar� al usuario si se sabe la palabra o no, devolver� un 1 o un 0 dependiendo de su respuesta.
    if sabe==1:
        resultado=raw_input('Introduce la palabra: ')
        if resultado==palabra:
            print ("ENORABUENA, ADIVINASTE LA PALABRA CON �XITO")
            break
        else:
            print "Se te restar�n 2 vidas por penalizaci�n"
            vidas-=2
            print "Te quedan",vidas,"vidas"
            
    if guiones==0:
        print ("ENORABUENA, COMPLETASTE LA PALABRA")
        
    print ""
    letra=raw_input('Introduce una letra: ')
    
    while letra in almacenaje: #Esto determina si en el almacenaje de letras dichas se encuentra la introducida.
        print "La letra",letra,"ya la has introducido. Prueba con otra letra: ",
        letra=raw_input()
    else:
        almacenaje+=letra
    
    if letra not in palabra:
        vidas-=1
        print "La letra",letra,"no est� en la palabra"
        print "Te quedan",vidas,"/",vida_main,"vidas"

    ImprimirAhorcado(vidas)
    
    if vidas==0:
        QuintoFallo()
        print "PERDISTE, OTRA VEZ SER�, LA PALBRA ERA",palabra
    
