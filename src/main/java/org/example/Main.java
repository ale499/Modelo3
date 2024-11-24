package org.example;


import org.example.entidades.*;
import org.example.repositorio.InMemoryRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InMemoryRepository<Cliente> repoCliente=new InMemoryRepository<>();
        InMemoryRepository<Pedido> repoPedido=new InMemoryRepository<>();
        InMemoryRepository<DetallePedido> repoDetalles=new InMemoryRepository<>();
        InMemoryRepository<Imagenes> repoImagenes=new InMemoryRepository<>();
        InMemoryRepository<Articulo> repoArticulos=new InMemoryRepository<>();
        InMemoryRepository<UnidadMedida> repoUnidadMeida=new InMemoryRepository<>();

        //Creo los clientes y los guardo
        Cliente cliente1= Cliente.builder()
                .nombre("carlos")
                .apellido("pereira")
                .email("carlos.pereira@gmail.com")
                .fechaNacimiento(LocalDate.of(2000,3,3))
                .telefono("+54-261-777-777")
                .build();
        repoCliente.save(cliente1);

        Cliente cliente2 = Cliente.builder()
                .nombre("María")
                .apellido("Gómez")
                .email("maria.gomez@gmail.com")
                .fechaNacimiento(LocalDate.of(1995, 7, 15))
                .telefono("+54-261-888-888")
                .build();
        repoCliente.save(cliente2);

        Cliente cliente3 = Cliente.builder()
                .nombre("Jorge")
                .apellido("Martínez")
                .email("jorge.martinez@gmail.com")
                .fechaNacimiento(LocalDate.of(1988, 11, 22))
                .telefono("+54-261-999-999")
                .build();
        repoCliente.save(cliente3);

        //Creo las unidades de medida y los guardo
        UnidadMedida ochoPorciones= UnidadMedida.builder()
                .denominacion("8 porciones")
                .build();
        repoUnidadMeida.save(ochoPorciones);

        UnidadMedida unLitro = UnidadMedida.builder()
                .denominacion("1 litro")
                .build();
        repoUnidadMeida.save(unLitro);

        UnidadMedida cuatroPorciones = UnidadMedida.builder()
                .denominacion("4 porciones")
                .build();
        repoUnidadMeida.save(cuatroPorciones);

        //Creo las imagenes y los guardo
        Imagenes imagen1= Imagenes.builder()
                .nombre("pizza grande hawaiana")
                .url("imagen-pizzaGrandeHawaiana.jpg")
                .build();
        repoImagenes.save(imagen1);

        Imagenes imagen2 = Imagenes.builder()
                .nombre("pizza grande napolitana")
                .url("imagen-pizzaGrandeNapolitana.jpg")
                .build();
        repoImagenes.save(imagen2);

        Imagenes imagen3 = Imagenes.builder()
                .nombre("pizza grande muzza")
                .url("imagen-pizzaGrandeMuzza.jpg")
                .build();
        repoImagenes.save(imagen3);

        Imagenes imagen4 = Imagenes.builder()
                .nombre("pizza chica hawaiana")
                .url("imagen-pizzaChicaHawaiana.jpg")
                .build();
        repoImagenes.save(imagen4);

        Imagenes imagen5 = Imagenes.builder()
                .nombre("pizza chica napolitana")
                .url("imagen-pizzaChicaNapolitana.jpg")
                .build();
        repoImagenes.save(imagen5);

        Imagenes imagen6 = Imagenes.builder()
                .nombre("pizza chica muzza")
                .url("imagen-pizzaChicaMuzza.jpg")
                .build();
        repoImagenes.save(imagen6);

        Imagenes imagen7 = Imagenes.builder()
                .nombre("cerveza andes")
                .url("imagen-cervezaAndes.jpg")
                .build();
        repoImagenes.save(imagen7);

        Imagenes imagen8 = Imagenes.builder()
                .nombre("cerveza quilmes")
                .url("imagen-cervezaQuilmes.jpg")
                .build();
        repoImagenes.save(imagen8);

        //Creo los articulos y los guardo
        Articulo pizzaGrandeHawaiana= Articulo.builder()
                .unidadMedida(ochoPorciones)
                .denominacion("pizza grande hawaiana")
                .imagen(imagen1)
                .precioCompra(10D)
                .precioVenta(200D)
                .stockActual(15)
                .stockMaximo(30)
                .tiempoMinutos(15)
                .build();
        repoArticulos.save(pizzaGrandeHawaiana);

        Articulo pizzaChicaHawaiana = Articulo.builder()
                .unidadMedida(cuatroPorciones)
                .denominacion("pizza chica hawaiana")
                .imagen(imagen4)
                .precioCompra(7D)
                .precioVenta(150D)
                .stockActual(20)
                .stockMaximo(40)
                .tiempoMinutos(10)
                .build();
        repoArticulos.save(pizzaChicaHawaiana);

        Articulo pizzaGrandeNapolitana = Articulo.builder()
                .unidadMedida(ochoPorciones)
                .denominacion("pizza grande napolitana")
                .imagen(imagen2)
                .precioCompra(12D)
                .precioVenta(220D)
                .stockActual(10)
                .stockMaximo(25)
                .tiempoMinutos(15)
                .build();
        repoArticulos.save(pizzaGrandeNapolitana);

        Articulo pizzaChicaNapolitana = Articulo.builder()
                .unidadMedida(cuatroPorciones)
                .denominacion("pizza chica napolitana")
                .imagen(imagen5)
                .precioCompra(8D)
                .precioVenta(160D)
                .stockActual(18)
                .stockMaximo(35)
                .tiempoMinutos(10)
                .build();
        repoArticulos.save(pizzaChicaNapolitana);

        Articulo pizzaGrandeMuzza = Articulo.builder()
                .unidadMedida(ochoPorciones)
                .denominacion("pizza grande muzza")
                .imagen(imagen3)
                .precioCompra(9D)
                .precioVenta(180D)
                .stockActual(12)
                .stockMaximo(30)
                .tiempoMinutos(15)
                .build();
        repoArticulos.save(pizzaGrandeMuzza);

        Articulo pizzaChicaMuzza = Articulo.builder()
                .unidadMedida(cuatroPorciones)
                .denominacion("pizza chica muzza")
                .imagen(imagen6)
                .precioCompra(6D)
                .precioVenta(140D)
                .stockActual(22)
                .stockMaximo(40)
                .tiempoMinutos(10)
                .build();
        repoArticulos.save(pizzaChicaMuzza);

        Articulo cervezaAndes = Articulo.builder()
                .unidadMedida(unLitro)
                .denominacion("cerveza andes")
                .imagen(imagen7)
                .precioCompra(5D)
                .precioVenta(100D)
                .stockActual(50)
                .stockMaximo(100)
                .tiempoMinutos(0)
                .build();
        repoArticulos.save(cervezaAndes);

        Articulo cervezaQuilmes = Articulo.builder()
                .unidadMedida(unLitro)
                .denominacion("cerveza quilmes")
                .imagen(imagen8)
                .precioCompra(5D)
                .precioVenta(100D)
                .stockActual(45)
                .stockMaximo(100)
                .tiempoMinutos(0)
                .build();
        repoArticulos.save(cervezaQuilmes);

        //Pedido cliente 1
        DetallePedido detalle1= DetallePedido.builder()
                .articulo(pizzaGrandeMuzza)
                .cantidad(1)
                .subTotal(pizzaGrandeMuzza.getPrecioVenta())
                .build();
        repoDetalles.save(detalle1);

        DetallePedido detalle2= DetallePedido.builder()
                .articulo(cervezaQuilmes)
                .cantidad(1)
                .subTotal(cervezaQuilmes.getPrecioVenta())
                .build();
        repoDetalles.save(detalle2);

        HashSet<DetallePedido>detalles1= new HashSet<>(Arrays.asList(detalle1,detalle2));

        Pedido pedidoCliente1= Pedido.builder()
                .fechaPedido(LocalDate.now())
                .tipoEnvio(TipoEnvio.pedidosYa)
                .formatoPago(FormatoPago.billeteraVirtual)
                .horaFinalizacion(LocalTime.of(22,30))
                .estado(Estado.preparando)
                .detallePedidos(detalles1)
                .build();
        pedidoCliente1.setCostoTotal(pedidoCliente1.sacarCostoTotal(pedidoCliente1.getDetallePedidos()));
        pedidoCliente1.setTotal(pedidoCliente1.sacarPrecioTotal(pedidoCliente1.getDetallePedidos()));
        repoPedido.save(pedidoCliente1);

        cliente1.setHace(new HashSet<>(Arrays.asList(pedidoCliente1)));

        //Actualizo el repo con el pedido del cliente hecho
        repoCliente.genericUpdate(1L,cliente1);

        //Muestro los datos del pedido del cliente 1
        System.out.println("--------------------------------------------------");
        Cliente clienteElegido=repoCliente.findById(1L).get();
        clienteElegido.mostrarPedido(clienteElegido,1);
        System.out.println("--------------------------------------------------");

        // Detalles del pedido del cliente 2
        DetallePedido detalle3 = DetallePedido.builder()
                .articulo(cervezaQuilmes)
                .cantidad(3)
                .subTotal(cervezaQuilmes.getPrecioVenta() * 3)
                .build();
        repoDetalles.save(detalle3);

        DetallePedido detalle4 = DetallePedido.builder()
                .articulo(pizzaChicaHawaiana)
                .cantidad(1)
                .subTotal(pizzaChicaHawaiana.getPrecioVenta())
                .build();
        repoDetalles.save(detalle4);

        HashSet<DetallePedido> detalles2 = new HashSet<>(Arrays.asList(detalle3, detalle4));

        Pedido pedidoCliente2 = Pedido.builder()
                .fechaPedido(LocalDate.now())
                .tipoEnvio(TipoEnvio.deliveryLocal)
                .formatoPago(FormatoPago.credito)
                .horaFinalizacion(LocalTime.of(21, 45))
                .estado(Estado.preparando)
                .detallePedidos(detalles2)
                .build();
        pedidoCliente2.setCostoTotal(pedidoCliente2.sacarCostoTotal(pedidoCliente2.getDetallePedidos()));
        pedidoCliente2.setTotal(pedidoCliente2.sacarPrecioTotal(pedidoCliente2.getDetallePedidos()));
        repoPedido.save(pedidoCliente2);

        // Asociar el pedido al cliente 2 y guardar
        cliente2.setHace(new HashSet<>(Arrays.asList(pedidoCliente2)));
        repoCliente.genericUpdate(2L, cliente2);

        // Mostrar datos del pedido del cliente 2
        System.out.println("--------------------------------------------------");
        Cliente clienteElegido2 = repoCliente.findById(2L).get();
        clienteElegido2.mostrarPedido(clienteElegido2,1);
        System.out.println("--------------------------------------------------");

        // Detalles del pedido del cliente 3
        DetallePedido detalle5 = DetallePedido.builder()
                .articulo(pizzaGrandeHawaiana)
                .cantidad(1)
                .subTotal(pizzaGrandeHawaiana.getPrecioVenta())
                .build();
        repoDetalles.save(detalle5);

        DetallePedido detalle6 = DetallePedido.builder()
                .articulo(pizzaChicaMuzza)
                .cantidad(1)
                .subTotal(pizzaChicaMuzza.getPrecioVenta())
                .build();
        repoDetalles.save(detalle6);

        DetallePedido detalle7 = DetallePedido.builder()
                .articulo(pizzaGrandeNapolitana)
                .cantidad(1)
                .subTotal(pizzaGrandeNapolitana.getPrecioVenta())
                .build();
        repoDetalles.save(detalle7);

        DetallePedido detalle8 = DetallePedido.builder()
                .articulo(cervezaAndes)
                .cantidad(2)
                .subTotal(cervezaAndes.getPrecioVenta() * 2)
                .build();
        repoDetalles.save(detalle8);

        HashSet<DetallePedido> detalles3 = new HashSet<>(Arrays.asList(detalle5, detalle6, detalle7, detalle8));

        Pedido pedidoCliente3 = Pedido.builder()
                .fechaPedido(LocalDate.now())
                .tipoEnvio(TipoEnvio.pedidosYa)
                .formatoPago(FormatoPago.efectivo)
                .horaFinalizacion(LocalTime.of(22, 15))
                .estado(Estado.preparando)
                .detallePedidos(detalles3)
                .build();
        pedidoCliente3.setCostoTotal(pedidoCliente3.sacarCostoTotal(pedidoCliente3.getDetallePedidos()));
        pedidoCliente3.setTotal(pedidoCliente3.sacarPrecioTotal(pedidoCliente3.getDetallePedidos()));
        repoPedido.save(pedidoCliente3);

        // Asociar el pedido al cliente 3 y guardar
        cliente3.setHace(new HashSet<>(Arrays.asList(pedidoCliente3)));
        repoCliente.genericUpdate(3L, cliente3);

        // Mostrar datos del pedido del cliente 3
        System.out.println("--------------------------------------------------");
        Cliente clienteElegido3 = repoCliente.findById(3L).get();
        clienteElegido3.mostrarPedido(clienteElegido3,1);
        System.out.println("--------------------------------------------------");

        //Otro pedido cliente 1
        // Detalles del nuevo pedido del cliente 1
        DetallePedido detalle9 = DetallePedido.builder()
                .articulo(pizzaChicaMuzza)
                .cantidad(1)
                .subTotal(pizzaChicaMuzza.getPrecioVenta())
                .build();
        repoDetalles.save(detalle9);

        DetallePedido detalle10 = DetallePedido.builder()
                .articulo(cervezaAndes)
                .cantidad(1)
                .subTotal(cervezaAndes.getPrecioVenta())
                .build();
        repoDetalles.save(detalle10);

        HashSet<DetallePedido> detalles4 = new HashSet<>(Arrays.asList(detalle9, detalle10));

        // Crear el nuevo pedido del cliente 1
        Pedido nuevoPedidoCliente1 = Pedido.builder()
                .fechaPedido(LocalDate.now())
                .tipoEnvio(TipoEnvio.pedidosYa)
                .formatoPago(FormatoPago.billeteraVirtual)
                .horaFinalizacion(LocalTime.now().plusHours(1))
                .estado(Estado.preparando)
                .detallePedidos(detalles4)
                .build();
        nuevoPedidoCliente1.setCostoTotal(nuevoPedidoCliente1.sacarCostoTotal(nuevoPedidoCliente1.getDetallePedidos()));
        nuevoPedidoCliente1.setTotal(nuevoPedidoCliente1.sacarPrecioTotal(nuevoPedidoCliente1.getDetallePedidos()));
        repoPedido.save(nuevoPedidoCliente1);

        // Obtener el cliente 1, agregar el nuevo pedido y guardar
        Cliente cliente1Actualizado = repoCliente.findById(1L).get();
        cliente1Actualizado.getHace().add(nuevoPedidoCliente1);
        repoCliente.genericUpdate(1L, cliente1Actualizado);

        // Mostrar los datos del nuevo pedido del cliente 1
        System.out.println("--------------------------------------------------");
        Cliente clienteElegido4 = repoCliente.findById(1L).get();
        clienteElegido4.mostrarPedido(clienteElegido4,2);
        System.out.println("--------------------------------------------------");

        //Mostrar la cantidad de veces que el cliente realizo un pedido
        System.out.println("--------------------------------------------------");
        Cliente clienteElegido5 = repoCliente.findById(1L).get();
        clienteElegido5.pedidosCliente(clienteElegido5);
        System.out.println("--------------------------------------------------");

        //Mostrar el menu
        System.out.println("--------------------------------------------------");
        List<Articulo> articulos = repoArticulos.findAll();
        Articulo.mostrarMenu(articulos);
        System.out.println("--------------------------------------------------");



    }
}
