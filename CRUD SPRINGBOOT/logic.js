const API_URL = 'http://localhost:8080/api/comic';


async function listComics() {
    const response = await fetch(API_URL);
    const comics = await response.json();
    const list = document.getElementById('comicList');
    list.innerHTML = '';
    comics.forEach(comic => {
        let item = document.createElement('li');
        item.textContent = `ID: ${comic.idComic} - Nombre: ${comic.nameComic} - Edición: ${comic.editionComic} - Descripción: ${comic.descriptionComic} - Fecha de Publicación: ${comic.publishDate} - Precio: ${comic.price}`;
        list.appendChild(item);
    });
}

async function createComic() {
    const comic = {
        nameComic: document.getElementById('nameComic').value,
        editionComic: parseInt(document.getElementById('editionComic').value),
        descriptionComic: document.getElementById('descriptionComic').value,
        publishDate: document.getElementById('publishDate').value,
        price: parseFloat(document.getElementById('price').value)
    };
    await fetch(API_URL, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(comic)
    });
    listComics();
}

async function updateComic() {
    const id = document.getElementById('comicId').value;
    const comic = {
        nameComic: document.getElementById('updateNameComic').value,
        editionComic: parseInt(document.getElementById('updateEditionComic').value),
        descriptionComic: document.getElementById('updateDescriptionComic').value,
        publishDate: document.getElementById('updatePublishDate').value,
        price: parseFloat(document.getElementById('updatePrice').value)
    };
    await fetch(`${API_URL}/${id}`, {
        method: 'PUT',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(comic)
    });
    listComics();
}

async function deleteComic() {
    const id = document.getElementById('deleteComicId').value;
    await fetch(`${API_URL}/${id}`, { method: 'DELETE' });
    listComics();
}