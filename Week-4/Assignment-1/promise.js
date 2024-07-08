function delayedResultPromise(n1, n2, delayTime) {
    return new Promise((resolve, reject) => {
        const result = n1 + n2;
        setTimeout(() => resolve(result), delayTime);
    })
}
delayedResultPromise(4, 5, 3000).then(console.log);
delayedResultPromise(2, 3, 2000).then(console.log);
delayedResultPromise(2, 2, 1000).then(console.log);
// 9 (4+5) will be shown in the console after 3 seconds