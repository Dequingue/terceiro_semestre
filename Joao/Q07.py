import os


valor=[]
somar:int=0
negativocontador=0
positivocontador=0
SIZE=10
for i in range(SIZE):
    numero = int(input("Digite um número: "))
    valor.append(numero)
    
    if valor[i]<0:
        negativocontador = negativocontador+1   
    elif valor[i]>0:
        positivocontador = positivocontador+1
        somar +=valor[i]
        

print(f"Quantidade negativa: {negativocontador}")
print(f"Quantidade positiva: {positivocontador}")
print(f"Essa é a soma: {somar}")    

                   