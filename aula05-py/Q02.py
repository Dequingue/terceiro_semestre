import os


def limpar():
    os.system("cls || clear")
    
def calculo(dias,km):
    diasf:int=0
    
    diasf = 60*dias

    kmf = 0.15*km

    total = diasf+kmf

    return total

limpar()
   
dias = int(input("Quantos dias deseja alugar o carro: "))
km = int(input("Digite quantos km ira rodar: "))         


limpar()
totalf = calculo(dias,km)

print("\t==== RESULTADO ====\n")
print(f"Esse é o valor que você ira pagar: {totalf}")