package trilha.back.financys.testes;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.MethodParameter;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableArgumentResolver;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import trilha.back.financys.service.controller.LancamentoController;
import trilha.back.financys.service.impl.LancamentoServiceImpl;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
public class TestesController {

    MockMvc mockMvc;

    @Mock
    LancamentoServiceImpl lancamentoServiceImpl;

    @InjectMocks
    LancamentoController lancamentoController;

    @BeforeEach
    void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(lancamentoController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setViewResolvers((s,locale) -> new MappingJackson2JsonView())
                .build();
    }

    @Test
    public void filterLancamentoErroController() throws Exception {
        Mockito.when(lancamentoServiceImpl.filter(null, null, false)).thenThrow(RuntimeException.class);
        mockMvc.perform(get("/lancamentos/filter")
                        .param("datalancamento", "null")
                        .param("amount", "null")
                        .param("paid", "false").contentType("Application/Json"))
                .andExpect(status().isNoContent());

    }

    @Test
    public void filterLancamentoController() throws Exception {
        this.mockMvc.perform(get("/lancamentos/filter")
                        .param("datalançamento", "20/09/2021")
                        .param("amount", "revenue")
                        .param("paid", "true").contentType("Application/Json"))
                .andExpect(status().isOk());
    }


}
