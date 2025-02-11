import os
import time

def limpar():
    os.system("cls||clear")
    
limpar()

numeros=[]

while True:
    
    opcao =int(input("Digite um numero: "))
    if(opcao == -1):
        limpar()        
        print("Aguarde o Systema.....")
        time.sleep(2)
        break
    else:    
        numeros.append(opcao)

limpar()
for i in numeros:
    if(i %2 ==0):
        print(i)        
        
    

    
        