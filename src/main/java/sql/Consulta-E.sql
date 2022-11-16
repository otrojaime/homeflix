SELECT actor.first_name, actor.last_name, COUNT(*) 
FROM film JOIN film_actor ON film.film_id = film_actor.film_id
JOIN actor ON actor.actor_id = film_actor.actor_id
WHERE rating IN('G','PG','PG-13')
GROUP BY actor.first_name, actor.last_name ORDER BY COUNT(*) DESC;