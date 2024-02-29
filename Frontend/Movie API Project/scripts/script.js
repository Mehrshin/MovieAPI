const HOST = "http://localhost:8090";




function getAllMovies() {
    $.ajax({
        method: "get",
        url: `${HOST}/movies/`,
    })
        .done((response) => {
            const data = response;
            const cardContainer = document.getElementById("movie-cardgroup");
            $.each(data, function (index, item) {
                if (index % 5 === 0) {
                    // Create a new row for every 5 cards
                    // cardContainer.append($(`<div class="row ">
                    // <div class="col-xl-1"></div>`));
                }
                const card = document.createElement("div");
                card.className = "card";
                card.innerHTML = `
                        <div class="card-body d-flex flex-column mt-auto">
                            <h5 class="card-title" id="first-movie">${item.title}</h5>
                            <p class="card-text">Genre: ${item.genre}</p>
                            <p class="card-text">Released Year: ${item.year}</p>
                            <p class="card-text">Rating: ${item.rating}</p>
                            <p class="card-text">Director: ${item.director}</p>
                            <p class="card-text">Cast:${item.cast}</p>
                            <div class="card-footer d-grid gap-2 mt-auto">
                                <button type="button" data-href="#" class="btn btn-dark btn-sm">Update</button>
                                <button type="button" data-href="#" class="btn btn-dark btn-sm">Delete</button>
                            </div>
                            <p class="card-text"><small class="text-body-secondary">Last updated 3 mins ago</small></p>
                        </div>
                `;
                cardContainer.appendChild(card);
            });
            ;
        })
        .fail((xhrObj) => {
            alert(xhrObj);
        });
}



function createMovie() {
    const title = document.getElementById("movie-title").value;
    const genre = document.getElementById("movie-genre").value;
    const year = document.getElementById("movie-year").value;
    const rating = document.getElementById("movie-rating").value;
    const director = document.getElementById("movie-director").value;
    const cast = document.getElementById("movie-cast").value;
    // const picName = document.getElementById("movie-poster").files[0].name;
    // alert(picName);

    $.ajax({
        method: "post",
        url: `${HOST}/movies/`,
        data: JSON.stringify({
            'title': title,
            'genre': genre,
            'year': year,
            'rating': rating,
            'director': director,
            'cast': cast,
            // 'picName': picName,
        }),
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
    })
        .done((response) => {
            alert('movie created')
        })
        .fail((xhrObj) => {
            if (xhrObj && xhrObj.responseJSON && xhrObj.responseJSON.message)
                alert(xhrObj.responseJSON.message);
            if (xhrObj && xhrObj.responseText) {
                alert(xhrObj.responseText);
            }
        });
}
