let list = [];
let ids = [];
let ratings = [];
let tile = document.getElementById('movieDisplay')

axios.get(`http://localhost:8080/movie/getAll`).then(
    data => {
        for(let i of data.data){

            list.push(i.apiID);
            ids.push(i.id);
            if (i.rating===null){
                ratings.push("N/A");
            } else{
                ratings.push(i.rating)
            }
        }
        showOnPage(list, ids, ratings);
    }
)

function showOnPage(list, ids, ratings){
    for(let i=0;i<list.length;i++){
        let movieTile = document.createElement('div');
        movieTile.className="col-6 col-sm-12 col-lg-6";
        axios.get(`https://api.themoviedb.org/3/movie/${list[i]}?api_key=e8787f4d45be4c1bcdb939f0d6113db5&language=en-UK`).then(
            append => {
                movieTile.innerHTML =
                    '<div class="card card--list">'+
                    '<div class="row">'+
                    '<div class="col-12 col-sm-4">'+
                    '<div class="card__cover">'+
                    `<img src="https://image.tmdb.org/t/p/original${append.data.poster_path}" alt="">`+
                    `<a id="play" href="details2.html?title=${append.data.title}&id=${ids[i]}" class="card__play">`+
                    `<i class="icon ion-ios-play" id="playbutton${ids[i]}"></i>`+
                    '</a>'+
                    '</div>'+
                    '</div>'+
                    '<div class="col-12 col-sm-8">'+
                    '<div class="card__content">'+
                    `<h3 class="card__title"><a id="title" href="#">${append.data.title}</a></h3>`+
                    '<span class="card__category">'+
                    `<a href="#">${append.data.genres[0].name}</a>`+
                    `<a href="#">${append.data.genres[1].name}</a>`+
                    '</span>'+
                    '<div class="card__wrap">'+
                    `<span class="card__rate"><i class="icon ion-ios-star"></i>${append.data.vote_average}</span>`+
                    '<ul class="card__list">'+
                    `<li><a style="color: #ff5860;" id="ageRating" href="classifications.html">${ratings[i]}</a></li>`+
                    '</ul>'+
                    '</div>'+
                    '<div class="card__description">' +
                    `<p>${append.data.overview}</p>`+
                    '</div>'+
                    '</div>'+
                    '</div>'+
                    '</div>';
                tile.appendChild(movieTile);
            }
        )
    }
}

function filterNames(){
    let filterValue = document.getElementById('searchBox').value.toLowerCase();
    let li = movies.getElementsByClassName('card__title')
    let ld = movies.getElementsByClassName('col-6 col-sm-12 col-lg-6')
    console.log(li.length)
    console.log(ld.length)

    for(let i=0;i<li.length;i++){
        let test = li[i].getElementsByTagName('a')[0];
        if(test.innerHTML.toLowerCase().indexOf(filterValue)>-1){
            li[i].style.display='';
            ld[i].style.display=''
        }else{
            li[i].style.display = 'none';
            ld[i].style.display= 'none';
        }
    }
}






