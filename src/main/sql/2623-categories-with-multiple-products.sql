SELECT pd.name, c.name FROM products pd 
JOIN categories c ON c.id = pd.id_categories
WHERE pd.amount > 100
AND c.id BETWEEN 1 AND 9 
ORDER BY c.id ASC;