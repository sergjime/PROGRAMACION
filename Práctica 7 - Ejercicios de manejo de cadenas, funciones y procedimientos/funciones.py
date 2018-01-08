# -*- coding: cp1252 -*-

""" Ejercicio_01 """
def imprimir(cadena):
    print "El texto en minúsculas es:",cadena.lower()
    print "El texto en mayúsculas es:",cadena.upper()
# ----------------------------------------------------------------------------------------------------------------   
""" Ejercicio_02 """ 
def unir(nom,cognom1,cognom2):
    nombre_final=(nom+" "+cognom1+" "+cognom2)
    return nombre_final
# ---------------------------------------------------------------------------------------------------------------- 
""" Ejercicio_03 """
def caracter(linea):
    for i in range(len(linea)):
        print linea[i]
# ---------------------------------------------------------------------------------------------------------------- 
""" Ejercicio_04 """
def sustituto(cadena):
    nada=""
    for i in range(len(cadena)):
        if cadena[i]==" ":
            nada=nada+"*"
        else:
            nada=nada+cadena[i]
    return nada
# ---------------------------------------------------------------------------------------------------------------- 
""" Ejercicio_05 """
def modificar(cadena,letra):
    text=""
    for i in range(len(cadena)):
        if cadena[i]=="a" or cadena[i]=="e" or cadena[i]=="i" or cadena[i]=="o" or cadena[i]=="u":
            text=text+letra
        else:
            text=text+cadena[i]
    return text
# ---------------------------------------------------------------------------------------------------------------- 
""" Ejercicio_06 """
def estar(cadena,caracter):
    for i in range(len(cadena)):
        if cadena[i]==caracter:
            estar=True
        else:
            estar=False
    return estar
# ---------------------------------------------------------------------------------------------------------------- 
""" Ejercicio_07 """
def contar(sentence):
    vocales=["A", "E", "I","O", "U", "a","e", "i", "o","u"];vocal=0
    for i in range(len(sentence)):
        for j in range(len(vocales)):
            if vocales[j]==sentence[i]:
                vocal=vocal+1
    print "La frase introducida tiene",vocal,"vocales"
# ---------------------------------------------------------------------------------------------------------------- 
""" Ejercicio_08 """
def eliminar_espacios(cadena):
    sentence=""
    for i in range(len(cadena)):
        if not cadena[i]==" ":
            sentence=sentence+cadena[i]
    return sentence
# ---------------------------------------------------------------------------------------------------------------- 
""" Ejercicio_09 """
def coincidir(word1,word2):
    text1="";text2="";probado = False;contador = -1
    
    while not probado:
        if word1[contador] == word2[contador] and contador >= -3:
            text1=word1[contador]
            text2=word2[contador]
            contador=contador-1
        else:
            probado=True

    contador = contador+1
    
    if contador == -1:
        print "La última letra coincide"
    elif contador == -2:
        print "Las dos ultimas letras coinciden"
    elif contador == -3:
        print "Las tres ultimas letras coinciden"
    else:
        print "No coincide ninguna letra de las tres últimas"
# ---------------------------------------------------------------------------------------------------------------- 
""" Ejercicio_10 (Opcional)"""     
def capicua(texto):
    al_reves=""
    for i in range(len(texto)-1,-1,-1):
        al_reves=al_reves+texto[i]
        
    if al_reves==texto:
        print algo,"es capicúa o palíndromo"
    else:
        print algo," no es capicúa o palíndromo"

    return al_reves
# ---------------------------------------------------------------------------------------------------------------- 
""" Ejercicio_11 (Opcional)"""
def palindromo(texto):
    al_reves=""
    for i in range(len(texto)-1,-1,-1):
        al_reves=al_reves+texto[i]
    return al_reves
# ---------------------------------------------------------------------------------------------------------------- 
""" Ejercicio_12 (Opcional)"""
def palabra(frase):
    contador=1
    for i in range(len(frase)):
        if frase[i]==" " or frase[i]=="." or frase[i]=="_" or frase[i]=="-":
            if not frase[i-1]==" " or frase[i-1]=="." or frase[i-1]=="_" or frase[i-1]=="-":
                contador=contador+1
    return contador
