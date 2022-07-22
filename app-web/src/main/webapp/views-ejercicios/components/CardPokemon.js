function CardPokemon(pokemon) {
    const cardPokemon = `
                  <div class="card text-dark bg-info mb-3" style="max-width: 18rem;">
                    <div class="card-body">
                      <div class="card-header d-flex flex-row justify-content-between"><h5 class="card-title">${pokemon.name.toUpperCase()}</h5><div><i class="fa-solid fa-id-card"></i> Id : ${pokemon.id}</div></div>
                      <img src="${pokemon.sprites.other.dream_world.front_default}" class="card-img-top" alt="...">

                      <p class="card-text">
                        <div><i class="fa-solid fa-mountain"></i> Height : ${pokemon.height}</div>
                        <div><i class="bi bi-battery-charging"></i> Base Experience : ${pokemon.base_experience}</div>
                        <div><i class="fa-solid fa-scale-unbalanced"></i> Weight : ${pokemon.weight}</div>
                        </p>
                      <a href="#" class="btn btn-primary">More info...</a>
                    </div>
                  </div>`;
    return cardPokemon;
}

function renderPokemon(pokemon) {
    const divCard = document.getElementById("apis-render");
    divCard.innerHTML = CardPokemon(pokemon);
}