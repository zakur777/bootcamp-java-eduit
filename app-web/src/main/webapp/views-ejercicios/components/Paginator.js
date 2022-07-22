function pagination(querySet, page, rows) {
    let trimStart = (page -1) * rows;
    let trimEnd = trimStart + rows;
    let trimeData = querySet.slice(trimStart, trimEnd);
    let pages = Math.round(querySet.length / rows);
    return {
        'querySet': trimeData,
        'pages': pages,
        'currentPage': page,
        'trimStart': trimStart
    }
}

function renderPaginator(pages, currentPage) {
    let listRow = `<nav aria-label="...">
                    <ul class="pagination">
                        <li class="page-item ${currentPage === 1 ? 'disabled': ''}">
                                <a class="page-link" onclick="findCovid(${currentPage-1})" href="javascript:doVoid()" tabindex="-1" aria-disabled="true">Previous</a>
                        </li>`;

    for (let i = 0; i <= pages - 1; i++) {
        let page = i + 1;
        listRow += `
                <li class="page-item ${currentPage === (i+1) ? 'active' : ''}">
                    <a onClick="findCovid(${page})" class="page-link" href="javascript:doVoid()">${page}</a>
                </li>
                `;
    }

    listRow += `<li class="page-item ${currentPage === pages ? 'disabled': ''}">
                            <a class="page-link" onclick="findCovid(${currentPage+1})" href="javascript:doVoid()">Next</a>
                        </li>
                    </ul>
                </nav>`;
    return listRow;
}