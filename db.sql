INSERT INTO ARES_ENTITY (ico, json_data) VALUES 
('123456', '{"name": "Company A", "address": "123 Street, City", "employees": 50}'),
('789012', '{"name": "Company B", "address": "456 Avenue, City", "employees": 200}'),
('345678', '{"name": "Company C", "address": "789 Boulevard, City", "employees": 150}');


// docker exec -it postgresql-container bash psql -U root -d aresproxydb -f /db.sql