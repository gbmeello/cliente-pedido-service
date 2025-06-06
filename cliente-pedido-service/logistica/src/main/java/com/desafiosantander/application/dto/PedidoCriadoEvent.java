package com.desafiosantander.application.dto;

public class PedidoCriadoEvent {

    private Long id;
    private Long clienteId;
    private String status;

    // Construtor padrão obrigatório para Jackson
    public PedidoCriadoEvent() {}

    // (Opcional) Construtor com argumentos
    public PedidoCriadoEvent(Long id, Long clienteId, String status) {
        this.id = id;
        this.clienteId = clienteId;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getClienteId() { return clienteId; }
    public void setClienteId(Long clienteId) { this.clienteId = clienteId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "PedidoCriadoEvent{id=" + id + ", clienteId=" + clienteId + ", status='" + status + "'}";
    }
}
