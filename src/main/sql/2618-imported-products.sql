SELECT pd.name, pv.name, c.name FROM categories c 
JOIN products pd ON pd.id_categories = c.id 
JOIN providers pv ON pd.id_providers = pv.id
WHERE pv.name LIKE 'Sansul SA' AND c.name LIKE 'Imported';