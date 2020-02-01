package com.alanpacheco.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.alanpacheco.cursomc.domain.enums.EstadoPagamento;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class PagamentoComBoleto extends Pagamento{
	private static final long serialVersionUUID = 1L;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataDeVencimento;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataDePagamento;
	
	public PagamentoComBoleto() {
	}
	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id,estado,pedido);
		dataDeVencimento = dataVencimento;
		dataDePagamento = dataPagamento;
	}
	
	public Date getDataDeVencimento() {
		return dataDeVencimento;
	}
	public Date getDataDePagamento() {
		return dataDePagamento;
	}
	public void setDataDeVencimento(Date data) {
		dataDeVencimento = data;
	}
	public void setDataDePagamento(Date data) {
		dataDePagamento = data;
	}
	
	

}
