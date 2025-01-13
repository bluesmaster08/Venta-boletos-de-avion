# Reservación de Vuelos

Este proyecto es una aplicación de escritorio desarrollada en Java para la reservación y venta de boletos de avión. Combina una interfaz gráfica de usuario (GUI) intuitiva con el manejo de hilos para procesar operaciones concurrentes, como la gestión de destinos y asientos disponibles.

## Características principales

- **Interfaz gráfica de usuario (GUI):**
  - Tres barras de progreso que muestran el avance de operaciones relacionadas con la venta de boletos.
  - Controles para ingresar información como destino, cantidad de boletos y precios.

- **Gestión de hilos:**
  - La clase `VentaBoletos` implementa `Runnable` para procesar tareas concurrentes.
  - Manejo eficiente de múltiples destinos y sus respectivas reservaciones.

- **Configuración visual:**
  - Uso del tema "Nimbus" para mejorar la experiencia del usuario.

## Introducción a los hilos en Java

### ¿Qué es un hilo (thread)?

Un hilo es un flujo de control dentro de un programa que permite ejecutar múltiples tareas simultáneamente. Los hilos en Java se implementan utilizando:

- **La clase `Thread`**.
- **La interfaz `Runnable`**.

Los hilos pueden controlarse y sincronizarse mediante métodos específicos en Java, lo que permite realizar operaciones concurrentes de manera eficiente.

### Tipos de hilos en Java

1. **Hilos creados mediante la implementación de la interfaz `Runnable`:**
   - Se implementa la interfaz `Runnable` y se define el método `run`.
   - Se crea un objeto `Thread` pasando como argumento una instancia de la clase que implementa `Runnable`.

2. **Hilos creados mediante la herencia de la clase `Thread`:**
   - Se hereda directamente de la clase `Thread` y se sobrescribe el método `run`.
   - El hilo se inicia llamando al método `start`.

### Sincronización y control de hilos

En Java, existen métodos específicos para manejar la ejecución de hilos y garantizar que las operaciones concurrentes se ejecuten de manera sincronizada, evitando conflictos entre tareas.

## Requisitos previos

- **Entorno de desarrollo:**
  - [NetBeans](https://netbeans.apache.org/) o cualquier IDE compatible con proyectos Java.
- **JDK:**
  - Java Development Kit 8 o superior.

## Instalación y ejecución

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/tuusuario/ReservacionVuelos.git
   ```

2. **Importar el proyecto al IDE:**
   - Abre NetBeans o tu IDE preferido.
   - Selecciona la opción para importar proyectos existentes y selecciona la carpeta `ReservacionVuelos`.

3. **Compilar y ejecutar:**
   - Compila el proyecto en el IDE.
   - Ejecuta la clase principal `ReservacionVuelos.java`.

## Estructura del proyecto

- `src/reservacionvuelos`: Contiene las clases principales:
  - `FormularioVentaBoletos.java`: Implementa la interfaz gráfica del sistema.
  - `VentaBoletos.java`: Maneja la lógica de reservación y venta de boletos utilizando hilos.
  - `ReservacionVuelos.java`: Punto de entrada principal del proyecto.

- `nbproject`: Archivos de configuración del proyecto NetBeans.

- `build`: Carpeta de compilación generada automáticamente.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir:
1. Haz un fork del proyecto.
2. Crea una rama para tu funcionalidad (`git checkout -b feature/mi-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -m 'Añadir nueva funcionalidad'`).
4. Haz push a tu rama (`git push origin feature/mi-funcionalidad`).
5. Abre un pull request.

## Licencia

Este proyecto se distribuye bajo la [MIT License](LICENSE).

## Autor
Sergio Meneses Hernández
