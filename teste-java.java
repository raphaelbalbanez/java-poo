package br.gov.cesarschool.poo.fidelidade.cartao.negocio;

import java.util.Date;

public class LancamentoExtrato {

	private long numeroCartao;
	private int quantidadePontos;
	private Date dataHoraLancamento;
	public LancamentoExtrato(long numeroCartao, int quantidadePontos, Date dataHoraLancamento){
		super();
		this.numeroCartao=numeroCartao;
		this.quantidadePontos=quantidadePontos;
		this.dataHoraLancamento=dataHoraLancamento;
	}
	
	public long getnumeroCartao() {
		return numeroCartao;
	}
	public int getquantidadePontos() {
		return quantidadePontos;
	}
	public Date getdataHoraLancamento() {
		return dataHoraLancamento;
	}

}