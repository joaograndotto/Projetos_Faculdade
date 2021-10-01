def mediasMetalicas(n):
  resultado = 0
  if n > 10:
    return resultado
  else:

    resultado = (n + ((4 + n**2)**0.5)) / 2    
    print(f"Variação {n} = {resultado}")
    mediasMetalicas(n + 1)
   

mediasMetalicas(0)


