import os
import time

def limpar():
    os.system("cls|| clear")

limpar()

lista=[]

while True:
    
    nome= input("Digite um nome: ").lower()
    if(nome == "exit"):
        limpar()
        print("Agurade o Systema...")
        time.sleep(2)
        break
    else:
        lista.append(nome)
        
limpar()
print("==== RESULTADO ====\n")
for i in lista:
    if i.startswith("a"):
        print(i.capitalize())        
        