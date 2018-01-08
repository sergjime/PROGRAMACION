# -*- coding: cp1252 -*-

def imprimir(palabra,almacenaje,vida):
    guiones=0
    for i in palabra:       
        if i in almacenaje:
            print i,
        else:
            print "-",
            guiones+=1
    print ""
    print 'TIENES',vida,'VIDAS'
    return guiones
      
def saber():
    saber=""
    while ((type(saber)==int)==False or saber>1 or saber<0):
        try:
            saber=int(input('¿Te sabes la palabra?(1:Sí 0:No): '))
            if saber==1:
                return 1
            elif saber==0:
                return 0
            else:
                print "El número no es 1 ni 0"
        except:
            print "No es un número entero"

def ImprimirAhorcado(vidas):
    if vidas==4:
        PrimerFallo()
    elif vidas==3:
        SegundoFallo()
    elif vidas==2:
        TercerFallo()
    elif vidas==1:
        CuartoFallo()
        
def PrimerFallo():
    print '          '
    print '  |---+---+'
    print '  |   |'
    print '  O   |'
    print '      |'
    print '      |'
    print '      |'
    print '========='
    print '          '

def SegundoFallo():
    print '          ' 
    print '  |---+---+'
    print '  |   |'
    print '  O   |'
    print '  |   |'
    print '      |'
    print '      |'
    print '========='
    print '          '

def TercerFallo():
    print '          '
    print '  |---+---+'
    print '  |   |'
    print '  O   |'
    print ' /|\  |'
    print '      |'
    print '      |'
    print '========='
   
def CuartoFallo():
    print '          '
    print '  |---+---+'
    print '  |   |'
    print '  O   |'
    print ' /|\  |'
    print ' /    |'
    print '      |'
    print '========='
    print '          '

def QuintoFallo():
    print '          '
    print '  |---+---+'
    print '  |   |'
    print '  O   |'
    print ' /|\  |'
    print ' / \  |'
    print '      |'
    print '========='
    print '          '
