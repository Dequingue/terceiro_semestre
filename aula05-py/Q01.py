import os

def limpar():
    os.system("cls || clear ")


def menu():    
    print("\t==== MENU_PARA-VOTOS ====\n")
    print("1.OBAMA")
    print("2.PEDRINHO")
    print("3.JUSE")
    print("4.APRESENTAR VOTOS")
    print("5.FECHAR SYSTEMA")
    
limpar()

votor=[]
contador1:int = 0
contador2:int=0
contador3:int=0

while True:

    menu()
        
    opcao = int(input("Digite qual deseja votar: "))   
    votor.append(opcao)
    
    if opcao == 5:
        limpar()
        print("fechando systema....")
        break
    else:
        if opcao == 1:
            contador1 = contador1 +1
        elif opcao == 2:
            contador2 = contador2 +1
        elif opcao == 3:
            contador3 = contador3 +1
        elif opcao == 4:
            limpar()
            print(f"Candidato OBAMA tem: {contador1} votos")       
            print(f"Candidato PEDRINHO tem: {contador2} votos")
            print(f"Candidato JUSE tem: {contador3} votos\n")
            if contador1 > contador2 & contador3:
                print(f"\nOBAMA ganhou eleição!!!!")
            if contador2 > contador1 & contador3:
                print(f"\nPEDRINHO ganhou eleição!!!!")
            if contador3 > contador1 & contador2:
                print(f"\nJUSE ganhou eleição!!!!")