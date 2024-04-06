(() => {
    // state variables
    let toDoListArray = [];
    // ui variables
    const form = document.querySelector(".form");
    const input = form.querySelector(".form__input");
    const ul = document.querySelector(".toDoList");

    // event listeners
    form.addEventListener('submit', e => {
        // prevent default behaviour - Page reload
        e.preventDefault();
        // give item a unique ID
        let itemId = String(Date.now());
        // get/assign input value
        let toDoItem = input.value;
        //pass ID and item into functions
        addItemToDOM(itemId , toDoItem);
        addItemToArray(itemId, toDoItem);
        // clear the input box. (this is default behaviour but we got rid of that)
        input.value = '';
    });

    ul.addEventListener('click', e => {
        let id = e.target.getAttribute('data-id')
        if (!id) return // user clicked in something else
        //pass id through to functions
        toggleItemCompleted(id);
    });

    // functions
    function addItemToDOM(itemId, toDoItem) {
        // create an li
        const li = document.createElement('li')
        li.setAttribute("data-id", itemId);
        // add toDoItem text to li
        li.innerText = toDoItem
        // add li to the DOM
        ul.appendChild(li);
    }

    function addItemToArray(itemId, toDoItem) {
        // add item to array as an object with an ID so we can find and delete it later
        toDoListArray.push({ itemId, toDoItem, completed: false });
        console.log(toDoListArray)
    }

    function toggleItemCompleted(id) {
        // Find the item in the array by ID
        const itemIndex = toDoListArray.findIndex(item => item.itemId === id);
        if (itemIndex !== -1) {
            // Toggle the completed status
            toDoListArray[itemIndex].completed = !toDoListArray[itemIndex].completed;
            // Update the DOM to reflect the completed status
            const li = document.querySelector('[data-id="' + id + '"]');
            li.classList.toggle('completed');
        }
    }

})();
