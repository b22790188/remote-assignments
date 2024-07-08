function ajax(src, callback) {
    let xhr = new XMLHttpRequest();
    xhr.open('GET', src);

    xhr.onload = function () {
        if (xhr.status === 200) {
            let data = JSON.parse(xhr.responseText);
            callback(data);
        } else {
            console.error("Get data failed");
        }
    }

    xhr.send();
}

function render(data) {
    /**
     * iterate over each item in response, and get each key and value in item as a
     * paragraph element.
     */
    for (const item of data) {

        const listItem = document.createElement('li');
        for (const key in item) {
            const descriptionElement = document.createElement('p');
            descriptionElement.textContent = `${key}: ${item[key]}`;

            listItem.appendChild(descriptionElement);
        }

        document.getElementById('item-list').appendChild(listItem);
    }
}

ajax(
    'https://remote-assignment.s3.ap-northeast-1.amazonaws.com/products',
    function (response) {
        render(response);
    }
); // you should get