<!doctype html>
<html lang="en">
<head>
    <title>APIS - LIST</title>
    <%@include file="header.jsp" %>
    <script>
        function findPokemons() {
            axios.get("https://pokeapi.co/api/v2/pokemon/ditto")
                .then(function (response) {
                    //console.log(response.data);
                    let data = response.data;

                    Object.keys(data).map((key, index) => {
                        //console.log("KEY", key);
                        //data[key] = data[key];
                        switch (key) {
                            case "name":
                                data[key] = data[key];
                                break;
                            case "sprites":
                                data[key] = data[key];
                                break;
                            case "height":
                                data[key] = data[key];
                                break;
                            case "base_experience":
                                data[key] = data[key];
                                break;
                            case "id":
                                data[key] = data[key];
                                break;
                            case "weight":
                                data[key] = data[key];
                                break;
                            default:
                                delete data[key];
                                break;
                        }
                    });

                    console.log("DATA MAP", data);

                    renderPokemon(data);
                })
                .catch(function (error) {
                    console.log(error);
                })
                .then(function () {
                    console.log("Buscando lista de usuarios");
                })
        }


        async function findCovid(page = 1) {
            const response = await axios.get("https://api.covidtracking.com/v1/us/daily.json");

            let data = response.data;
            data.sort((a, b) => (a.positive > b.positive) ? -1 : 1);

            let state = {
                'querySet': data,
                'page': page,
                'rows': 30,
                'window': 30
            }
            data = pagination(state.querySet, state.page, state.rows);
            renderCovid(data.querySet, data.currentPage, data.pages, data.trimStart);
        }

        async function findJsonPlaceHolder() {
            const response = await axios.get('http://jsonplaceholder.typicode.com/comments');
            let data = response.data;
            let pattern = /\.[a-zA-Z]{2,6}$/;
            correo = 'prueba@casa.xy';
            //console.log(data);
            let result = data.reduce((accumulator, object) => (accumulator[object.email.match(pattern)[0]] ?
                accumulator[object.email.match(pattern)[0]] += 1 :
                accumulator[object.email.match(pattern)[0]] = 1, accumulator), {});
            renderJsonPlaceHolder(result);
            console.log(result);
        }




        function doVoid() {

        }


    </script>
</head>
<body>
<%@include file="navbar.jsp" %>
<div class="container">
    <div class="row">
        <div class="col-12">
            <div id="apis-render"></div>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</body>
<script type="text/javascript" src="<%=request.getContextPath()%>/views-ejercicios/components/CardPokemon.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/views-ejercicios/components/TableCovid.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/views-ejercicios/components/Paginator.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/views-ejercicios/components/JsonPlaceHolder.js"></script>
</html>