function canviarTema() {
    const body = document.body;
    const currentBgColor = body.style.backgroundColor;
    const newBgColor = currentBgColor === 'black' ? '#f9f9f9' : 'black';
    const newTextColor = newBgColor === 'black' ? 'white' : '#333';

    body.style.transition = 'background-color 0.5s, color 0.5s'; 
    body.style.backgroundColor = newBgColor;
    body.style.color = newTextColor;
}

function mostrarPreu(paquet) {
    const preus = {
        'Bàsic': '500€ - Ideal per projectes petits.',
        'Avançat': '900€ - Per webs amb més funcionalitats.',
        'Premium': '1500€ - Tot inclòs, amb disseny únic.'
    };
    const preuElement = document.getElementById('preu-dinamico');
    preuElement.innerText = preus[paquet];
}

function mostrarMissatge(disseny) {
    const missatge = document.createElement('div');
    missatge.className = 'missatge';
    missatge.innerText = `Has seleccionat el disseny: ${disseny}`;
    document.body.appendChild(missatge);

    setTimeout(() => {
        document.body.removeChild(missatge);
    }, 3000);
}

function navegar(pagina) {
    alert(`Estàs a la pàgina de ${pagina}`);
}


function iniciarContadorReversa() {
    const contador = document.getElementById('contador-reversa');
    let count = 1000; 

    const countdown = setInterval(() => {
        if (count > 0) {
            contador.innerText = `Temps restant: ${count}`;
            count--;
        } else {
            clearInterval(countdown);
            contador.innerText = 'Temps finalitzat!';
        }
    }, 1000); 
}

document.addEventListener('DOMContentLoaded', iniciarContadorReversa);
