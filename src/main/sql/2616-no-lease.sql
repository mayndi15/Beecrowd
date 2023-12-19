SELECT c.id, c.name FROM locations l
RIGHT JOIN customers c ON c.id = l.id_customers
WHERE l.id IS NULL ORDER BY c.id;