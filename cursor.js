document.addEventListener("DOMContentLoaded", () => {
    const cursorDiv = document.createElement("div");
    cursorDiv.innerHTML = `
        <div class="cursor-wrapper">
            <div class="cursor" id="cursor"></div>
            <div class="cursor-trail" id="cursor-trail"></div>
        </div>
    `;
    document.body.insertAdjacentHTML("beforeend", cursorDiv.innerHTML);

    const cursor = document.getElementById("cursor");
    const cursorTrail = document.getElementById("cursor-trail");

    document.addEventListener("mousemove", (e) => {
        cursor.style.transform = `translate(${e.clientX}px, ${e.clientY}px)`;
        cursorTrail.style.transform = `translate(${e.clientX - 5}px, ${e.clientY - 5}px)`;
    });

    document.querySelectorAll("a, button, submit, input").forEach((element) => {
        element.addEventListener("mouseenter", () => {
            cursor.classList.add("hover");
            cursorTrail.classList.add("hover");
        });

        element.addEventListener("mouseleave", () => {
            cursor.classList.remove("hover");
            cursorTrail.classList.remove("hover");
        });
    });
});
