SELECT pd.name FROM products pd
JOIN providers pv ON pv.id = pd.id_providers
WHERE pv.name LIKE 'P%' 
AND pd.amount BETWEEN 10 AND 20;