SELECT pd.name, pv.name FROM products pd
JOIN providers pv on pv.id = pd.id_providers
JOIN categories c on c.id = pd.id_categories
WHERE c.id = 6;