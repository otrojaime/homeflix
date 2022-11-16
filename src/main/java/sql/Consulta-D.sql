SELECT rating, COUNT(*) FROM film 
JOIN language ON film.original_language_id = language.language_id 
WHERE language.language_id = 5 
GROUP BY rating ORDER BY COUNT(*) DESC; 