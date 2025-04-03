document.addEventListener("DOMContentLoaded", function () {
    const addToCartButtons = document.querySelectorAll(".addcart"); // Select all "Add to Cart" buttons

    addToCartButtons.forEach((button) => {
        button.addEventListener("click", function () {
            const card = this.closest(".card"); // Find the closest parent .card container
            
            if (!card) {
                console.error("Card container not found!");
                return;
            }

            const itemNameElement = card.querySelector(".card-front h3");
            const itemPriceElement = card.querySelector(".card-back p:nth-of-type(3)"); // Select the second <p>

            if (!itemNameElement || !itemPriceElement) {
                console.error("Item name or price not found!");
                return;
            }

            const itemName = itemNameElement.textContent.trim();
            const itemPriceText = itemPriceElement.textContent.trim().replace("Price: ₹", "");
            const itemPrice = parseInt(itemPriceText);

            if (isNaN(itemPrice)) {
                console.error("Price is not a number:", itemPriceText);
                return;
            }

            const itemImage = card.querySelector(".card-front img")?.src;
            if (!itemImage) {
                console.error("Item image not found!");
                return;
            }

            let cart = JSON.parse(localStorage.getItem("cart")) || [];

            // Check if item is already in cart
            let existingItem = cart.find(cartItem => cartItem.name === itemName);
            if (existingItem) {
                existingItem.quantity += 1; // Increase quantity
            } else {
                cart.push({ name: itemName, price: itemPrice, quantity: 1, image: itemImage });
            }

            localStorage.setItem("cart", JSON.stringify(cart)); // Save to localStorage
            alert(`${itemName} added to cart!`);
            console.log("Cart updated:", cart);
        });
    });
});
