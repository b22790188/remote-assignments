function delayedResultPromise(n1, n2, delayTime) {
    return new Promise((resolve, reject) => {
        const result = n1 + n2;
        setTimeout(() => resolve(result), delayTime);
    })
}

async function main() {
    // your code here, you should call delayedResultPromise here and get the result using async/await.
    try {
        const result = await delayedResultPromise(5, 4, 3000);
        console.log(result);
    } catch (err) {
        console.error(err);
    }
}

main();
// result will be shown in the console after <delayTime> seconds