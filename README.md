# Cricket Players API

This project is a Spring Boot application that manages cricket player data, allowing for CRUD operations and querying based on specific criteria.

## Technologies Used

- Java 17
- Spring Boot 2.7.x
- Spring Data JPA
- H2 Database (in-memory)
- Maven


APIs

1. Create Player Data
Endpoint: POST /api/players/create

Request Body:

json
{
    "name": "Player Name",
    "team": "Team Name",
    "runs": 1000
}


2. Retrieve Top 10 Players Based on Runs
Endpoint: GET /api/players/top10



Example Request: GET /api/players/top10

Response: Returns a list of top N players sorted by runs.

3. Retrieve Data According to User Search
Endpoint: GET /api/players/search

Query Parameter: keyword

Example Request: GET /api/players/search?keyword=Virat

Response: Returns player details that match the specified name.

4. Delete Player
Endpoint: DELETE /api/players/{id}

Path Variable: id (required)

Example Request: DELETE /api/players/1

Response: Returns a success message upon deletion.

5. Retrieve All Players
Endpoint: GET /api/players/all


Response: Returns a list of all players in the database.
