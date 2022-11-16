SELECT title, length, release_year, rental_rate,  special_features
FROM film
WHERE rating = 'R'
ORDER BY length DESC LIMIT 10;