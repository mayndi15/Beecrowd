SELECT c.name, o.id FROM orders o
JOIN customers c ON c.id = o.id_customers
WHERE o.orders_date <= '2016-06-30';