async function fetchTrades() {
    const data = await fetch("https://localhost:8080/api/v1/trades");
    console.log(data);
    const dataJson = await data.json();
    console.log(data);
    for(const trade of dataJson) {
        const element = document.createElement("div");
        el.innerHTML = "----------<br/>";
        for(const property of trade) {
            el.innerHTML += '${property} of this hero is: ${hero(property)}<br/>';

        el.innerHTML = "----------<br/>";
        tradesSection.appendChild(el);
    }
}

fetchTrades();

async function positions(event) {
    event.preventDefault();
    const tradeStrategy = document.getElementsById("tradeStrategy");
    const tradeProfit = document.getElementsById("tradeProfit");

    const name = trading

    const TradingDTO = {
        strategy: tradeStrategy.value,
        profit: tradeProfit.value
    }

    const initialRequestObj = {
        method: "POST",
        headers: {
            "Content type": "application/json"
        },
        body: TradingDTO
    }

    await fetch("http://localhost:8080/api/v1/trading", initialRequestObj);

    await fetchTrades();

}

}