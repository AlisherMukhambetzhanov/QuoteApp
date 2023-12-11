You just download it and run QuoteAppApplication file.
You can test it with postman

1. Create a User:
○ Set the request method to POST.
○ Set the URL to http://localhost:8080/users.
○ In the Body tab, select raw and JSON, and enter a JSON object for the new user. For example:
○ Click Send. You should get a response with the details of the created user.
Example of json:
{
    "name": "John Doe",
    "email": "john.doe@example.com",
    "password": "password123"
}
2. Get a User:
○ Set the request method to GET.
○ Set the URL to http://localhost:8080/users/{id}, replacing {id} with the ID of the user you just created.
○ Click Send. You should get a response with the details of the user.
3. Get All Users:
○ Set the request method to GET.
○ Set the URL to http://localhost:8080/users.
○ Click Send. You should get a response with a list of all users.
4. Create a Quote:
○ Set the request method to POST.
○ Set the URL to http://localhost:8080/quotes.
○ In the Body tab, select raw and JSON, and enter a JSON object for the new quote. For example:
○ Click Send. You should get a response with the details of the created quote.
Example
{
    "content": "This is a test quote.",
    "user": {
        "id": 1
    }
}
5.Get a Quote:
○ Set the request method to GET.
○ Set the URL to http://localhost:8080/quotes/{id}, replacing {id} with the ID of the quote you just created.
○ Click Send. You should get a response with the details of the quote.
6. Get All Quotes:
○ Set the request method to GET.
○ Set the URL to http://localhost:8080/quotes.
○ Click Send. You should get a response with a list of all quotes.
7. Get a Random Quote:
○ Set the request method to GET.
○ Set the URL to http://localhost:8080/quotes/random.
○ Click Send. You should get a response with the details of a random quote.
8. Update a Quote:
○ Set the request method to PUT.
○ Set the URL to http://localhost:8080/quotes/{id}, replacing {id} with the ID of the quote you want to update.
○ In the Body tab, select raw and JSON, and enter a JSON object with the updated quote content. For example:
○ Click Send. You should get a response with the details of the updated quote.
Example
{
    "content": "This is an updated test quote."
}
9. Delete a Quote:
○ Set the request method to DELETE.
○ Set the URL to http://localhost:8080/quotes/{id}, replacing {id} with the ID of the quote you want to delete.
○ Click Send. You should get a response indicating that the quote was deleted.
10. Create a Vote:
○ Set the request method to POST.
○ Set the URL to http://localhost:8080/votes.
○ In the Body tab, select raw and JSON, and enter a JSON object for the new vote. For example:
○ Click Send. You should get a response with the details of the created vote
Example
{
    "type": "UPVOTE",
    "user": {
        "id": 1
    },
    "quote": {
        "id": 1
    }
}
11. Get a Vote:
○ Set the request method to GET.
○ Set the URL to http://localhost:8080/votes/{id}, replacing {id} with the ID of the vote you just created.
○ Click Send. You should get a response with the details of the vote.
12. Get All Votes:
○ Set the request method to GET.
○ Set the URL to http://localhost:8080/votes.
○ Click Send. You should get a response with a list of all votes.
