const timeParagraph = document.getElementById("time");

function updateTime() {
    timeParagraph.innerHTML = new Date().toISOString();
}

updateTime();

const SECOND = 1000;
const MINUTE = 60 * SECOND;
const HOUR = 60 * MINUTE;

// setTimeout(updateTime, 5 * SECOND);

// setInterval(updateTime, SECOND);


setTimeout(function () {
    setInterval(updateTime, SECOND);
}, 5 * SECOND)










