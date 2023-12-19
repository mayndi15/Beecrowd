SELECT c.name FROM customers c
JOIN legal_person lp ON lp.id_customers = c.id;