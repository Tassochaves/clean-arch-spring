-- V1_criar_tabela_eventos
CREATE TABLE Eventos (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao TEXT,
    identificador VARCHAR(255) NOT NULL UNIQUE,
    local_evento VARCHAR(255) NOT NULL,
    organizador VARCHAR(255) NOT NULL,
    data_inicio TIMESTAMP NOT NULL,
    data_fim TIMESTAMP NOT NULL,
    tipo_evento VARCHAR(50) NOT NULL
)