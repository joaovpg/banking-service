package com.joaovpg.agencias.service.http;

import com.joaovpg.agencias.domain.http.AgenciaHttp;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/situacao-cadastral")
@RegisterRestClient
public interface SituacaoCadastralHttpService {

    @GET
    @Path("{cnpj}")
    AgenciaHttp buscarPorCnpj(String cnpj);
}
