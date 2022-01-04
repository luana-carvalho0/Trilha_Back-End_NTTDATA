package trilha.back.financys.testes;


import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import trilha.back.financys.model.Lancamento;
import trilha.back.financys.service.impl.LancamentoServiceImpl;
import trilha.back.financys.service.repositories.LancamentoRepository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class TrilhaBackTestes {

    @Mock
    private LancamentoRepository lancamentoRepository;

    @InjectMocks
    LancamentoServiceImpl lancamentoServiceImpl;

    @Test
    @DisplayName("Deve filtrar os lançamentos pendentes")
    public void filterTest(){

        List<Lancamento> lista = new ArrayList<>();
        Lancamento lancamento = Mockito.mock(Lancamento.class);
        lista.add(lancamento);
        Mockito.when(lancamentoRepository.findAllByDateAndAmountAndPaid("20/09/2021", "revenue", true)).thenReturn(lista);
        Assert.assertNotNull(lancamentoServiceImpl.filter("20/09/2021", "revenue", true));
    }

    @Test
    @DisplayName("Deve filtrar os lançamentos pendentes")
    public void filterTestErro(){

        Exception exception = assertThrows(RuntimeException.class, () ->
                lancamentoServiceImpl.filter(null, null, true));
        assertEquals("Parametros com valores errados", exception.getMessage());
    }

}
