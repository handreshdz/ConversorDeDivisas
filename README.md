
# 💸 Conversor de Divisas en Java

Una aplicación de consola simple, moderna y funcional que convierte divisas usando datos en tiempo real desde una API de tasas de cambio. Este proyecto es ideal para quienes desean practicar consumo de APIs en Java, manejo de `HttpURLConnection` y arquitectura modular.

---

## ✨ Características Principales

🔁 Conversión entre monedas (por ejemplo: USD ↔️ EUR)  
🌍 Datos actualizados en tiempo real desde una API REST  
🧩 Estructura modular y código limpio  
🔎 Interfaz de consola amigable y clara  

---

## 🧰 Tecnologías Utilizadas

- 💻 **Java 17 o superior**
- 🌐 **API REST pública** (ej. [ExchangeRate API](https://www.exchangerate-api.com/) u otra similar)
- 📡 **HTTP (HttpURLConnection)**
- 🔠 **JSON Parsing Manual**

---

## 🗂️ Estructura del Proyecto

```
ConversorDivisas/
│
├── Main.java                // Punto de entrada del programa
├── ConversorDeMoneda.java  // Lógica principal de conversión
├── HttpClientService.java  // Lógica de conexión HTTP y manejo de JSON
└── CurrencyResponse.java   // Representa la respuesta JSON
```

---

## 🚀 ¿Cómo Ejecutar el Proyecto?

1. 📥 Clona el repositorio:

```bash
git clone https://github.com/tu_usuario/ConversorDivisas.git
cd ConversorDivisas
```

2. 🛠️ Compila los archivos Java:

```bash
javac *.java
```

3. ▶️ Ejecuta la aplicación:

```bash
java Main
```

---

## 📌 Ejemplo de Uso

```
🌐 Bienvenido al Conversor de Monedas

Introduce la moneda base (ej: USD): USD
Introduce la moneda destino (ej: EUR): EUR
Introduce la cantidad: 100

💱 Resultado: 100.0 USD son equivalentes a 92.47 EUR
```

---

## ⚠️ Notas Importantes

- La API utilizada puede requerir una **clave de autenticación (API Key)**.
- Asegúrate de revisar y actualizar la URL de la API en `HttpClientService.java` según el proveedor que elijas.
- Si la API tiene límites de uso gratuito, el sistema podría dejar de responder tras cierto número de solicitudes.

---

## 🌟 Posibles Mejoras Futuras

- 🖥️ Interfaz gráfica (GUI) con JavaFX o Swing  
- 💾 Almacenamiento local del historial de conversiones  
- 🔁 Conversión en lote o múltiple sin reiniciar el programa  
- 📦 Integración de GSON o Jackson para manejo más robusto de JSON  

---

## 👨‍💻 Autor

Desarrollado con pasión por **Andrés Hernández** 🚀  
[💼 GitHub](https://github.com/handreshdz)

---

## 📄 Licencia

Distribuido bajo la licencia MIT. Consulta el archivo [`LICENSE`](LICENSE) para más información.

---

> 💬 *"El conocimiento no se gasta al compartirlo. ¡Que este proyecto te inspire a seguir aprendiendo!"*
