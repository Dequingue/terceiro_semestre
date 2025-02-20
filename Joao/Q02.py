import os


numeros=[]
somar:int=0

while True:
    valor = int(input("Digite um número: "))
    numeros.append(valor)
    
    
    if valor ==0:
        somar = sum(numeros)
        print(f"essa é a soma: {somar}")   
        break
