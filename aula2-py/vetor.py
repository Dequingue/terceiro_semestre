import os



def limpar():
    os.system("cls || clear")

limpar()
valor = []
soma= 0
mult = 0
div=0
se = 0



for i in range(2):    
    numero = int(input(f"Digite o {i+1}º valor: "))
    valor.append(numero)    
     
    se = valor[i] + valor[i]
     
    if se <= 10:
        soma = valor[i] + valor[i] 
    if se <=20:
        mult = valor[i] * valor[i]
    if se <= 30:
        div = valor[i] / valor[i]  

limpar()    
print("\n------ RESULTADO ------\n")    

for i in range(len(valor)):
    print(f"O {i+1}º valor desse numero: {valor[i]}")
print(f"se ={se}")    
print(f"\nA soma deu: {soma}")
print(f"A multiplicação deu: {mult}")
print(f"A divisão deu: {div}")
 