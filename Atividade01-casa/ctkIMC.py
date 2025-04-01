import customtkinter as ctk

def calcular_imc():
    try:
        peso = float(entry_peso.get())
        altura = float(entry_altura.get())
        imc = peso / (altura ** 2)
        
        if imc < 18.5:
            resultado = "Magro"
        elif 18.5 <= imc < 24.9:
            resultado = "Peso Ideal"
        elif 25 <= imc < 29.9:
            resultado = "Sobrepeso"
        else:
            resultado = "Obeso"
        
        label_resultado.configure(text=f"IMC: {imc:.2f}\nSituação: {resultado}")
    except ValueError:
        label_resultado.configure(text="Por favor, insira valores válidos.")

# Configuração da janela principal
ctk.set_appearance_mode("dark")  # Modo escuro
ctk.set_default_color_theme("blue")

app = ctk.CTk()
app.title("Calculadora de IMC")
app.geometry("300x300")

# Componentes da interface
titulo = ctk.CTkLabel(app, text="Calculadora de IMC", font=("Arial", 16, "bold"))
titulo.pack(pady=10)

frame = ctk.CTkFrame(app)
frame.pack(pady=10, padx=20, fill="both")

ctk.CTkLabel(frame, text="Peso (kg):").pack()
entry_peso = ctk.CTkEntry(frame)
entry_peso.pack(pady=5)

ctk.CTkLabel(frame, text="Altura (m):").pack()
entry_altura = ctk.CTkEntry(frame)
entry_altura.pack(pady=5)

botao_calcular = ctk.CTkButton(frame, text="Calcular IMC", command=calcular_imc)
botao_calcular.pack(pady=10)

label_resultado = ctk.CTkLabel(app, text="", font=("Arial", 14))
label_resultado.pack(pady=10)

app.mainloop()
