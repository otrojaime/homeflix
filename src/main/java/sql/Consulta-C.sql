SELECT film.film_id, title, release_year, rating 
FROM film JOIN film_actor ON film.film_id = film_actor.film_id
JOIN actor ON actor.actor_id = film_actor.actor_id
JOIN film_category ON film_category.film_id = film.film_id
WHERE actor.first_name = 'SUSAN' AND actor.last_name = 'DAVIS' AND film_category.category_id = 11 
ORDER BY film.title ASC;