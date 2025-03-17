const API_URL = 'http://localhost:8080/api/comic';
const BUY_API_URL = 'http://localhost:8080/api/buy';


async function listComics() {
    const response = await fetch(API_URL);
    const comics = await response.json();
    const list = document.getElementById('comicList');
    list.innerHTML = '';

    comics.forEach(comic => {
        let item = document.createElement('div');
        item.classList.add('comic-item');

        item.innerHTML = `
            <div class="imageExample">
                <p>imagen comic 50x200</p>
            </div>
            <p class="comic-id">ID: <span>${comic.idComic}</span></p>
            <p class="comic-name">Nombre: <span>${comic.nameComic}</span></p>
            <p class="comic-edition">Edición: <span>${comic.editionComic}</span></p>
            <p class="comic-description">Descripción: <span>${comic.descriptionComic}</span></p>
            <p class="comic-date">Fecha de Publicación: <span>${comic.publishDate}</span></p>
            <p class="comic-price">Precio: $<span>${comic.price}</span></p>
        `;

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

async function createBuy() {
    const today = new Date();
    const formattedDate = `${today.getFullYear()}-${String(today.getMonth() + 1).padStart(2, '0')}-${String(today.getDate()).padStart(2, '0')}`;
    
    const buy = {
        nameClient: document.getElementById('nameClient').value,
        meansPayment: document.getElementById('meansPayment').value,
        buyhDate: formattedDate
    };
    const response = await fetch(BUY_API_URL, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(buy)
    });
    const data = await response.json();
    document.getElementById('buyIdDisplay').textContent = `Compra creada con ID: ${data.idBuy}`;
}

async function listBuy() {
    const id = document.getElementById('buyId').value;
    const response = await fetch(`${BUY_API_URL}/${id}`);
    const buy = await response.json();
    const list = document.getElementById('buyList');
    list.innerHTML = '';
    let item = document.createElement('li');
    const formattedDate = buy.buyhDate ? buy.buyhDate.split('T')[0] : 'Fecha no disponible';
    item.innerHTML = `<strong>ID:</strong> ${buy.idBuy} <br>
                      <strong>Cliente:</strong> ${buy.nameClient} <br>
                      <strong>Método de pago:</strong> ${buy.meansPayment} <br>
                      <strong>Fecha:</strong> ${formattedDate} <br>
                      <strong>Cómics Comprados:</strong> ${buy.listComicsToBuy.length > 0 ? buy.listComicsToBuy.map(comic => `<br> - ID: ${comic.id} - Cantidad: ${comic.cantComics} - Precio: ${comic.priceBuy}`).join('') : 'Ninguno'}`;
    list.appendChild(item);
}


async function addComicToBuy() {
    const buyId = document.getElementById('buyIdAdd').value;
    const comicId = document.getElementById('comicIdAdd').value;
    const cantComics = parseInt(document.getElementById('cantComics').value);
    
    const response = await fetch(`${BUY_API_URL}/comic/${buyId}/${comicId}/${cantComics}`, {
        method: 'PUT',
        headers: { 'Content-Type': 'application/json' }
    });
    const data = await response.json();
    document.getElementById('addComicResult').textContent = `Cómic agregado: ID: ${data.id}, Cantidad: ${data.cantComics}, Precio: ${data.priceBuy}`;
}



async function deleteComicFromBuy() {
    const buyId = document.getElementById('buyIdDelete').value;
    const comicId = document.getElementById('comicIdDelete').value;
    const response = await fetch(`${BUY_API_URL}/comic/${buyId}/${comicId}`, {
        method: 'DELETE'
    });
    if (response.ok) {
        const data = await response.json();
        document.getElementById('deleteComicResult').textContent = `Cómic eliminado: ID: ${data.id}, Cantidad: ${data.cantComics}, Precio: ${data.priceBuy}`;
    } else {
        document.getElementById('deleteComicResult').textContent = `Error: El cómic no se encontró en la compra.`;
    }
}