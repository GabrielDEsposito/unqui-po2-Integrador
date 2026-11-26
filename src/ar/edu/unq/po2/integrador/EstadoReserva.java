package ar.edu.unq.po2.integrador;

public interface EstadoReserva {
	TipoEstado tipo();
	void notificar(ObservadorReserva obs, Reserva reserva, EstadoReserva anterior, EstadoReserva nuevo) ;
	void agregarServicio(Reserva reserva, ItemCatalogo item);
	void quitarServicio(Reserva reserva, ItemCatalogo item);
	void confirmar(Reserva reserva);
	void hacerCheckIn(Reserva reserva);
	void iniciar(Reserva reserva);
	void finalizar(Reserva reserva);
	void cancelar(Reserva reserva);
}
