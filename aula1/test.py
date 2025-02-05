import os

def limpar():
    os.system("cls||clear")

salario = int(input("Digite seu salario: "))    

limpar()

if(salario < 3000 and salario >2000):
    print("Voçê é classe media")
elif(salario > 3000 ):    
    print("Voçê é rico")
if(salario < 2000):
    print("Voçê é pobre")        

