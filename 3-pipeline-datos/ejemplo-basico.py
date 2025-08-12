import csv

def leer_datos(path):
    with open(path, newline='') as f:
        return list(csv.DictReader(f))

def limpiar_datos(filas):
    return [f for f in filas if f['edad'].isdigit()]

def calcular_promedio(filas):
    edades = [int(f['edad']) for f in filas]
    return sum(edades) / len(edades)

datos = leer_datos("3-pipeline-datos/datos.csv")
datos_limpios = limpiar_datos(datos)
promedio = calcular_promedio(datos_limpios)

print(f"Promedio de edad: {promedio}")
