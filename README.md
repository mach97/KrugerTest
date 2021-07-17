Challenge Técnico- CANTERITA

Como gerente de proyectos, solicito la implementación de una aplicación (Simple) tanto Front-end como Back-end para la simulación de un cliente que realiza un pedido en un Restaurante, con la finalidad de poder evaluar habilidades, conocimientos y aptitudes de los aspirantes a desarrolladores en Kruger Corp Ecuador.
El challenge está dividido en 2 partes:
1.	(Back-end) Se les entregará una aplicación simple REST creada con Spring Boot, Spring Data JPA, Lombok, en un .zip(restaurant-order-main).   
Actualmente, la aplicación puede traer una orden ejecutando un request GET en `/orders/{id}`, donde `{id}` es el identificador de la orden, está utilizando la base de datos “H2” de desarrollo, ver imagen.

 

Su tarea es añadir detalles a la orden con id{1}, la aplicación debe soportar estos requests: 
1)	POST at /orders/{1}/details - que debería guardar una nuevo detalle para la orden con {id} pasada
2)	GET at /orders/{1}/details - que debería retornar todos los detalles de una orden con {id} pasada.
Nota.: Si no desean utilizar la aplicación REST creada con Spring Boot .zip(restaurant-order-main) para el backend pueden utilizar otras tecnologías de vanguardia.

2.	(Front-end) es una aplicación/móvil usando Flutter, su tarea es mostrar un pedido con todos sus detalles, mostrar un botón de búsqueda, filtro el {id} de la orden. Ver imagen


Nota.: Si no desean utilizar Flutter para el frontend pueden utilizar otras tecnologías de vanguardia como Reactjs, Vuejs, Angular .etc para mostrar la información solicitada.


¿Que tomamos en cuenta al revisar el challenge?
1.	El código entregado tiene que funcionar y cumplir con lo solicitado.
2.	Las instrucciones y documentación deben ser prolijas y claras.
3.	Debe cumplir con los requisitos técnicos solicitados (incluir las librerías/frameworks específicos, test unitarios, instrucciones para correrlo, documentación, etc).
¿Qué hacer si tengo dudas sobre algo de lo pedido?
Ponte en contacto con la persona que te envió el challenge, es preferible aclarar dudas antes de enviar mal el challenge y también nos ayuda a mejorar las consignas.
¿Cómo envío el challenge?
Debes dejar tu código en un repo git público o uno al cual podamos acceder y luego enviarle la información a la persona que te envió este examen (url y datos de acceso).
