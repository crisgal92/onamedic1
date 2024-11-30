package com.example.onamedic1.onamedic1.controller;

import com.example.onamedic1.onamedic1.entity.Cliente;
import com.example.onamedic1.onamedic1.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin (origins = "http://localhost:4200")
@RequestMapping("/clientes")

public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    //Agrega informacion
    @PostMapping
    public Cliente save(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
           /*Forma de poner en el postman con json para hacer las pruebas de la funcion
        {
            no es necesario poner el id y que lo tenemos como llave primaria
            "nombre":"nombre cliente",
                "correo":"correo cliente",
                "descripcion": "mensaje "
       }*/
    }
    //Muestra toda la informacion de la base de datos
    @GetMapping
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }
    //Muestra la informacion de la base de datos por el id del cliente
    @GetMapping("/{id}")
    public Cliente findById(@PathVariable int id) {
        return clienteService.findById(id);
    }
    //Elimina cliente por id
    @DeleteMapping({"/{id}"})
    public void delete(@PathVariable int id) {
        clienteService.deleteByID(id);
    }
    //Actualiza al cliente po rID
    @PutMapping("/{id}")
    public Cliente update(@PathVariable int id, @RequestBody Cliente cliente) {
        Cliente c = clienteService.findById(id);
        c.setNombre(cliente.getNombre());
        c.setCorreo(cliente.getCorreo());
        c.setMensaje(cliente.getMensaje());
        c.setComentario(cliente.getComentario());
        c.setTelefono(cliente.getTelefono());
        return clienteService.save(c);

    }

}
