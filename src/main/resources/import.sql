-- DIREITOS, LICENSA E ISENÇÃO DE RESPONSABILIDADE:
-- Este arquivo é parte integrante, indivisível, inseparável de um projeto particular, o qual tem seu uso expressamente
-- exclusivo à seu autor, Ronaldo Marques (ronaldomarques@email.com / http://ronaldomarques.dev);
-- É vetado qualquer utilização, venda, aluguél, distribuição, em partes ou integral deste projeto;
-- Este projeto tem finalidade exclusiva de demonstração de conhecimento e habilidades no desenvolvimento de software
-- para apresentação no processo de recrutamento da empresa Dryve.com.br;
-- Sendo assim, o autor deste projeto não reconhece nem assume qualquer responsabilidade pela utilização do mesmo,
-- tão pouco por qualquer possível reflexos ou consequência de tal utilização.
-- ---
-- RIGHTS, LICENSE AND DISCLAIMER:
-- This file is an integral, indivisible, inseparable part of a particular project, which has its use expressly
-- exclusive to its author, Ronaldo Marques (ronaldomarques@email.com / http://ronaldomarques.dev);
-- Any use, sale, rental, distribution, in parts or integral of this project is prohibited;
-- This project has the sole purpose of demonstrating knowledge and skills in software development
-- for presentation in the recruitment process of Dryve.com.br;
-- Therefore, the author of this project does not recognize or assume any responsibility for the use of it,
-- neither for any possible reflexes or consequence of such use.
-- ---
-- @author		Ronaldo Marques.
-- @since		20210317.
-- @last_change	20210413.
-- @version		0.2.0-beta.
-- @category	DML, DDL, SQL Script for data generation and data imports, para feed applications's tables during tests phase.



-- A baixo, alimentação básica inicial das tabelas:

INSERT INTO brand (id, name) VALUES ('ca43ec74-5bb0-4288-ab11-5df094ca4dc4', 'FIAT');

INSERT INTO brand (id, name) VALUES ('c0225595-e293-477b-8758-384872470f00', 'FORD');

INSERT INTO model (id, name, brand_id) VALUES ('5bc16064-d3ee-4aed-a264-a914233d0c4f', 'TORO 2.0 DIESEL', 'ca43ec74-5bb0-4288-ab11-5df094ca4dc4');

INSERT INTO model (id, name, brand_id) VALUES ('e16e9ed4-43c6-4882-9f2f-12ca5aad6e7e', 'ARGO 1.0 Flex', 'ca43ec74-5bb0-4288-ab11-5df094ca4dc4');

INSERT INTO model (id, name, brand_id) VALUES ('c08f77df-c6e0-4e73-a378-42bb83361266', 'Onix 1.0 Turbo Flex', 'c0225595-e293-477b-8758-384872470f00');

INSERT INTO model (id, name, brand_id) VALUES ('deaf80e7-600c-4a35-af52-1fc7f1e967a8', 'EcoSport 1.6 Flex', 'c0225595-e293-477b-8758-384872470f00');



INSERT INTO model_year (id, model_id, year, kbb_id) VALUES ('9d31e563-9d09-4ce8-8ab5-c5177f51d92f', '5bc16064-d3ee-4aed-a264-a914233d0c4f', 2020, 1);

INSERT INTO model_year (id, model_id, year, kbb_id) VALUES ('b9824542-0d28-4e09-92df-53379e8b3b22', '5bc16064-d3ee-4aed-a264-a914233d0c4f', 2021, 2);

INSERT INTO model_year (id, model_id, year, kbb_id) VALUES ('f78e6d41-c620-4a76-a0a4-eb19f45c623e', 'e16e9ed4-43c6-4882-9f2f-12ca5aad6e7e', 2020, 3);

INSERT INTO model_year (id, model_id, year, kbb_id) VALUES ('609c2dbf-c563-486a-8660-f4a17fe63818','e16e9ed4-43c6-4882-9f2f-12ca5aad6e7e', 2021, 4);

INSERT INTO model_year (id, model_id, year, kbb_id) VALUES ('88748742-ed8c-467c-8990-963bfd617a0e', 'c08f77df-c6e0-4e73-a378-42bb83361266', 2020, 5);

INSERT INTO model_year (id, model_id, year, kbb_id) VALUES ('d9f4ec9e-35db-4ec2-9cab-1bf6a0011557', 'c08f77df-c6e0-4e73-a378-42bb83361266', 2021, 6);

INSERT INTO model_year (id, model_id, year, kbb_id) VALUES ('2dc1afe8-7851-4edc-9b91-a507c692483b', 'deaf80e7-600c-4a35-af52-1fc7f1e967a8', 2020, 7);

INSERT INTO model_year (id, model_id, year, kbb_id) VALUES ('6aa4d860-f5a8-439a-ab50-fda16b45549c', 'deaf80e7-600c-4a35-af52-1fc7f1e967a8', 2021, 8);



-- A baixo, minhas (particulares) linhas de script para adicionar alguns exemplos-TESTE de "veículo-anunciado":

-- Soon 'price_kbb' must not be inset, it should come from BKK API consulting.
-- On de application 'registry_date' is set by the system.
 
INSERT INTO motor_vehicle (plate, model_year_id, price_adv, price_kbb, registry_date, status) VALUES ('ASD1234', '9d31e563-9d09-4ce8-8ab5-c5177f51d92f', 100000.55, 99999.55, '2021-03-15', 0);

INSERT INTO motor_vehicle (plate, model_year_id, price_adv, price_kbb, registry_date, status) VALUES ('Z1X2C34', 'b9824542-0d28-4e09-92df-53379e8b3b22', 100002.55, 100001.55, '2021-03-15', 1);

INSERT INTO motor_vehicle (plate, model_year_id, price_adv, price_kbb, registry_date, status) VALUES ('Q3W2E10', 'f78e6d41-c620-4a76-a0a4-eb19f45c623e', 100004.55, 100003.55, '2021-03-20', 1);

INSERT INTO motor_vehicle (plate, model_year_id, price_adv, price_kbb, registry_date, status) VALUES ('OUTRA', '2dc1afe8-7851-4edc-9b91-a507c692483b', 100006.55, 100005.55, '2021-03-25', 1);


--