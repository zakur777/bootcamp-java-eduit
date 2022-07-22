function renderJsonPlaceHolder(data) {
    const divTable = document.getElementById('apis-render');
    let keys = Object.keys(data);
    console.log(keys);

    let table = `<div class="table-responsive">
                <table class="table table-striped ">
                    <thead>
                    <tr>
                          <th scope="col">Domain</th>
                          <th scope="col">Ocurrences</th>
                </tr>
                    </thead>
                    <tbody>`;
    for (let i = 0; i<keys.length; i++) {
        table += `<tr>
                              <td>${keys[i]}</td>
                              <td>${data[keys[i]]}</td>
                    </tr>`;
    }
    table += `</tbody>
                </table>
            </div>`;
    divTable.innerHTML = table;
}