SELECT film_id, title, length, rental_duration, rental_rate, rating 
FROM film
WHERE description LIKE '%Secret Agent%' AND rental_duration >= 5
ORDER BY rental_duration DESC, rental_rate ASC;