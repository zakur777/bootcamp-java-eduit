function renderCovid(data, currentPage, pages, trimStart) {
    const divTable = document.getElementById("apis-render");
    console.log('DESDE COVID');
    let table = `<div class="table-responsive">
                <table class="table table-striped ">
                    <thead>
                    <tr>
                        <td>#</th>
                        <td>date</th>
                        <td>states</th>
                        <td class="table-danger">positive</th>
                        <td>negative</th>
                        <td>pending</th>
                        <td>hospitalizedCurrently</th>
                        <td>onVentilatorCurrently</th>
                    </tr>
                    </thead>
                    <tbody>`;
    for(let i = 0; i < data.length; i++) {
        table += `<tr>
                        <th scope="row">${(i+1+trimStart)}</th>
                        <td>${data[i].date}</th>
                        <td>${data[i].states}</th>
                        <td class="table-danger">${data[i].positive}</th>
                        <td>${data[i].negative}</th>
                        <td>${data[i].pending}</th>
                        <td>${data[i].hospitalizedCurrently}</th>
                        <td>${data[i].onVentilatorCurrently}</th>
                    </tr>`;
    }
    table += `</tbody>
                </table>
                ${renderPaginator(pages, currentPage)}
            </div>`;
    divTable.innerHTML = table;
    let fin = 'FIN DEADE COVID';
    console.log(fin);
}
