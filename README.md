# Design-Pattern-Java

- Patron Estrategia
- Patron Estado
- Patron Plantilla
- Patron Prototipo

# Diagramas
- ### Patron Estrategia
    [![Patron Estrategia](/public/Strategy.png)](https://github.com/jesuj/Design-Pattern-Java/tree/main/src/Estrategia)
- ### Patron Estado
    [![Patron Estado](/public/state.png)](https://github.com/jesuj/Design-Pattern-Java/tree/main/src/Estado)
- #### Diagrama de Estado
    ![Patron Estado](/public/Estado.png)
- ### Patron Plantilla
    [![Patron Plantilla](/public/Plantilla.png)](https://github.com/jesuj/Design-Pattern-Java/tree/main/src/Plantilla)
- ### Patron Estrategia y Prototipo
    [![Patron Estrategia y Plantilla](/public/EstrategiayPrototipo.png)](https://github.com/jesuj/Design-Pattern-Java/tree/main/src/PrototipoYEstrategia)
- ### Mini Proyecto

1. Patron Composite
2. Patron Estrategia
3. Patron Plantilla

> ### Descripcion
>
> Se necesita gestionar un pedido de un laboratorio de análisis clínicos, se está tomando en cuenta el precio extra que obtiene cada servicio que se le hace a la muestra para el laboratorio ya que para realizar dicho análisis se necesitan diferentes materiales con diferentes costos, para solucionar esta problema se está utilizando el patrón de diseño template.
>
> Muestra de Sangre- esta muestra necesita la jeringa (5bs). 
>
> Muestra de orina- necesita un recipiente especial (2bs).
>
> Muestra de heces- necesita un recipiente especial (4bs).
>
> Con respecto al pedido y los diferentes servicios que se están solicitando, se necesita obtener el precio total, ya que cada área contiene diferentes servicios  y cada servicio tiene un precio diferente. Se muestra en el siguiente ejemplo como está compuesta una solicitud y se utilizara el “patrón composite” para calcular recursivamente el precio total de la solitud de análisis y rayos X.
>
> En alguno de estos niveles dependiendo del administrador del laboratorio, se le podrá colocar el precio que verdaderamente necesitamos cobrar de los materiales a usar en el servicio. (Usando el método template del patron Template).
> solicitud(nivel0).
>
> Analisis (nivel 1).
>
>	Hematologia (nivel 2).
>
>		Hemograma Completo (hoja)…….55bs .
>
> // Hemograma Completo (hoja)…….55bs+5 (resultado del método template).
>
>		Reticulositos(hoja)…………………….45bs.
>
>		Factor RH(hoja)……………………….…30bs.
>
>	Coagulograma (nivel 2).
>
>		Coagulacion (hoja)………………………45bs.
>
>	Serologia (nivel 2).
>
>		Chagas(hoja)………………………………..60bs.
>
>		Dengue(hoja)………………………………60bs.
>
> RayosX (nivel 1).
>
>	Radiografia(hoja)…70bs.
>
> Sobre el estado del pedido solicitado, se esta utilizando el “patrón de diseño State. Tenemos el siguiente diagrama de la máquina de estados para comprender la aplicación. 
>
> Tomamos en cuenta que el pedido cuenta con el atributo PRECIO el cual sacaremos como resultado del patrón COMPOSITE.

### Diagrama de Estado

[![Patron Estado](/public/diagrama_estado.PNG)](https://github.com/jesuj/Design-Pattern-Java/tree/main/src/mini_proyecto/State)

### Diagrama de Clase Procedimental

[![Patron Estado](/public/diagrama_dinamico.PNG)](https://github.com/jesuj/Design-Pattern-Java/tree/main/src/mini_proyecto)