window.onload = function () {
    const cartContainer = document.querySelector(".cartpagecontent");
    const cartPage = document.querySelector(".cartpage");
    const orderNowButton = document.querySelector(".btn"); // Select the Order Now button
    const totalPriceElement = document.createElement("h2");
    totalPriceElement.id = "total-price";
    cartPage.insertBefore(totalPriceElement, cartContainer);

    let cart = JSON.parse(localStorage.getItem("cart")) || [];

    function updateCartDisplay() {
        cartContainer.innerHTML = "";
        cartPage.insertBefore(totalPriceElement, cartContainer);
        let totalPrice = 0;

        if (cart.length === 0) {
            cartContainer.innerHTML = `<p>Your cart is empty.</p>`;
            totalPriceElement.textContent = `Total Price: ₹0`;
            return;
        }

        cart.forEach((item, index) => {
            const cartItem = document.createElement("div");
            cartItem.classList.add("cartbox");

            const cartBoxPic = document.createElement("div");
            cartBoxPic.classList.add("cartboxpic");
            cartBoxPic.style.backgroundImage = `url('${item.image}')`;

            cartItem.innerHTML = `
                <div class="cartboxdetails">
                    <h4>Item</h4><p>${item.name}</p>
                    <h4>Quantity</h4>
                    <div class="quantity-controls">
                        <button class="decrease" data-index="${index}">−</button>
                        <p>${item.quantity}</p>
                        <button class="increase" data-index="${index}">+</button>
                    </div>
                    <h4>Price</h4><p>₹${item.price * item.quantity}</p>
                    <i class="fa-solid fa-trash-can remove" data-index="${index}"></i>
                </div>
            `;

            cartItem.prepend(cartBoxPic);
            cartContainer.appendChild(cartItem);
            totalPrice += item.price * item.quantity;
        });

        totalPriceElement.textContent = `Total Price: ₹${totalPrice}`;
    }

    cartContainer.addEventListener("click", function (event) {
        const index = event.target.getAttribute("data-index");

        if (event.target.classList.contains("remove")) {
            cart.splice(index, 1);
        } else if (event.target.classList.contains("increase")) {
            cart[index].quantity += 1;
        } else if (event.target.classList.contains("decrease")) {
            if (cart[index].quantity > 1) {
                cart[index].quantity -= 1;
            } else {
                cart.splice(index, 1);
            }
        }

        localStorage.setItem("cart", JSON.stringify(cart));
        updateCartDisplay();
    });

    orderNowButton.addEventListener("click", function () {
        if (cart.length === 0) {
            alert("Your cart is empty!");
            return;
        }

        alert("Order Completed! ✅");
        localStorage.removeItem("cart"); // Clear the cart from storage
        cart = []; // Reset the cart array
        updateCartDisplay(); // Refresh the cart UI
    });

    updateCartDisplay();
};
