def obtener_texto():
    return "el lenguaje de programacion python"

def convertir_a_mayusculas(texto):
    return texto.upper()

def agregar_exclamacion(texto):
    return texto + "!"

def imprimir_resultado(texto):
    print(f"Resultado final: {texto}")

# Pipeline manual
texto = obtener_texto()
texto = convertir_a_mayusculas(texto)
texto = agregar_exclamacion(texto)
imprimir_resultado(texto)
