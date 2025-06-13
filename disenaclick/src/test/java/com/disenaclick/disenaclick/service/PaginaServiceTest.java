package com.disenaclick.disenaclick.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.disenaclick.disenaclick.model.Pagina;
import com.disenaclick.disenaclick.repository.PaginaRepository;

@SpringBootTest
public class PaginaServiceTest {

    @Autowired
    private PaginaService paginaService;

    @MockBean
    private PaginaRepository paginaRepository;

    private Pagina createPagina(){
        return new Pagina(1,"mantra",new LocalDate(),new usuario
            

        )
    }


}
