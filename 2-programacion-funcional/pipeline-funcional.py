def pipeline(valor_inicial, funciones):
    for fn in funciones:
        valor_inicial = fn(valor_inicial)
    return valor_inicial

# Etapas del pipeline
etapas = [
    lambda x: x.strip(),
    lambda x: x.lower(),
    lambda x: x.replace(" ", "-")
]

resultado = pipeline("  Hola Mundo desde Python  ", etapas)
print("Resultado del pipeline:", resultado)
