package br.gov.cesarschool.poo.fidelidade.cartao.negocio;

import java.util.Date;

class LancamentoExtratoPontuacao extends LancamentoExtrato {

	public LancamentoExtratoPontuacao(long numeroCartao, int quantidadePontos, Date dataHoraLancamento) {
		super(numeroCartao, quantidadePontos, dataHoraLancamento);
	}	
		Date data = new Date();
		LancamentoExtratoPontuacao lancamento = new LancamentoExtratoPontuacao(123456789, 100, data);
		
		long numeroCartao = lancamento.getnumeroCartao();
		int quantidadePontos = lancamento.getquantidadePontos();
		Date dataHoraLancamento = lancamento.getdataHoraLancamento(); 
}