 const prizes = [
    '3 пиццы',
    'Пицца 25 см и напиток',
    'Пицца 25 см и напиток',
    'Пицца 25 см и напиток',
    '2 фирменных закуски',
    '2 фирменных закуски',
    '2 фирменных закуски',
    '2 фирменных закуски',
    'Додстер и напиток',
    'Додстер и напиток',
    'Додстер и напиток',
    'Додстер и напиток',
    'Додстер и напиток',
    'Додстер и напиток',
    'Дэнвич и напиток',
    'Дэнвич и напиток',
    'Дэнвич и напиток',
    'Дэнвич и напиток',
    'Дэнвич и напиток',
    'Дэнвич и напиток',
];

const prizesPhoto = [
    'https://downloader.disk.yandex.ru/preview/99ded29545ee39c2707b5b76fb061774e36c592aae3d7e9e1ba1cc393266b27b/65d76b1f/UjXlypKtFdbeVm5kf-szPj03VBkWSIw--zCAGEIeikqVejTV705HG65ny10bXcP5DghxqS1OwTMDPC5VUvKrNw%3D%3D?uid=0&filename=3%20пиццы.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=0&tknv=v2&size=2880x1594',
    'https://downloader.disk.yandex.ru/preview/c72e846d24ea4e490d1a6b0d4956ebcb821baa138ed5d05af5487cc7465df255/65d76b1f/Y6YDc5JAGCEkvdXmeROmabodrnngAvXtZmQlBtuTlvheGvE6GmODVjGHgA8jP6Yr5GOXw75faq55c_mc7InAow%3D%3D?uid=0&filename=пицца%2025%20см%20и%20напиток.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=0&tknv=v2&size=2880x1594',
    'https://downloader.disk.yandex.ru/preview/c72e846d24ea4e490d1a6b0d4956ebcb821baa138ed5d05af5487cc7465df255/65d76b1f/Y6YDc5JAGCEkvdXmeROmabodrnngAvXtZmQlBtuTlvheGvE6GmODVjGHgA8jP6Yr5GOXw75faq55c_mc7InAow%3D%3D?uid=0&filename=пицца%2025%20см%20и%20напиток.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=0&tknv=v2&size=2880x1594',
    'https://downloader.disk.yandex.ru/preview/c72e846d24ea4e490d1a6b0d4956ebcb821baa138ed5d05af5487cc7465df255/65d76b1f/Y6YDc5JAGCEkvdXmeROmabodrnngAvXtZmQlBtuTlvheGvE6GmODVjGHgA8jP6Yr5GOXw75faq55c_mc7InAow%3D%3D?uid=0&filename=пицца%2025%20см%20и%20напиток.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=0&tknv=v2&size=2880x1594',
    'https://downloader.disk.yandex.ru/preview/b9be2537fbc034fe58cecfce0d7d0284ede70dec84e5c86dd3a98441b558e2ed/65d76b1f/HCC5XmGPYzR6okR-VXoxfwyBeot_7N4puaBZmpnN1a1hDMtcIsGM17Kyl9p0Q3lvGibVF7nD1FhP8ROvOGKxzw%3D%3D?uid=0&filename=2%20фирменных%20закуски.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=0&tknv=v2&size=2880x1594',
    'https://downloader.disk.yandex.ru/preview/b9be2537fbc034fe58cecfce0d7d0284ede70dec84e5c86dd3a98441b558e2ed/65d76b1f/HCC5XmGPYzR6okR-VXoxfwyBeot_7N4puaBZmpnN1a1hDMtcIsGM17Kyl9p0Q3lvGibVF7nD1FhP8ROvOGKxzw%3D%3D?uid=0&filename=2%20фирменных%20закуски.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=0&tknv=v2&size=2880x1594',
    'https://downloader.disk.yandex.ru/preview/b9be2537fbc034fe58cecfce0d7d0284ede70dec84e5c86dd3a98441b558e2ed/65d76b1f/HCC5XmGPYzR6okR-VXoxfwyBeot_7N4puaBZmpnN1a1hDMtcIsGM17Kyl9p0Q3lvGibVF7nD1FhP8ROvOGKxzw%3D%3D?uid=0&filename=2%20фирменных%20закуски.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=0&tknv=v2&size=2880x1594',
    'https://downloader.disk.yandex.ru/preview/b9be2537fbc034fe58cecfce0d7d0284ede70dec84e5c86dd3a98441b558e2ed/65d76b1f/HCC5XmGPYzR6okR-VXoxfwyBeot_7N4puaBZmpnN1a1hDMtcIsGM17Kyl9p0Q3lvGibVF7nD1FhP8ROvOGKxzw%3D%3D?uid=0&filename=2%20фирменных%20закуски.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=0&tknv=v2&size=2880x1594',
    'https://downloader.disk.yandex.ru/preview/ab400fb2ffc7e69ab334e350eab3af08dc8620d672c0d452ee0922c2c5ea99bf/65d76b1f/l0KrsoDEGU6eXtf6IobtR6wrOCguX6qGn5ioK1o3AZdDpEmsAxgl48m-MS3yPML1YhKmY0j2SF4r0A1IsRhhIw%3D%3D?uid=0&filename=додстер%20и%20напиток.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=0&tknv=v2&size=2880x1594',
    'https://downloader.disk.yandex.ru/preview/ab400fb2ffc7e69ab334e350eab3af08dc8620d672c0d452ee0922c2c5ea99bf/65d76b1f/l0KrsoDEGU6eXtf6IobtR6wrOCguX6qGn5ioK1o3AZdDpEmsAxgl48m-MS3yPML1YhKmY0j2SF4r0A1IsRhhIw%3D%3D?uid=0&filename=додстер%20и%20напиток.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=0&tknv=v2&size=2880x1594',
    'https://downloader.disk.yandex.ru/preview/ab400fb2ffc7e69ab334e350eab3af08dc8620d672c0d452ee0922c2c5ea99bf/65d76b1f/l0KrsoDEGU6eXtf6IobtR6wrOCguX6qGn5ioK1o3AZdDpEmsAxgl48m-MS3yPML1YhKmY0j2SF4r0A1IsRhhIw%3D%3D?uid=0&filename=додстер%20и%20напиток.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=0&tknv=v2&size=2880x1594',
    'https://downloader.disk.yandex.ru/preview/ab400fb2ffc7e69ab334e350eab3af08dc8620d672c0d452ee0922c2c5ea99bf/65d76b1f/l0KrsoDEGU6eXtf6IobtR6wrOCguX6qGn5ioK1o3AZdDpEmsAxgl48m-MS3yPML1YhKmY0j2SF4r0A1IsRhhIw%3D%3D?uid=0&filename=додстер%20и%20напиток.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=0&tknv=v2&size=2880x1594',
    'https://downloader.disk.yandex.ru/preview/ab400fb2ffc7e69ab334e350eab3af08dc8620d672c0d452ee0922c2c5ea99bf/65d76b1f/l0KrsoDEGU6eXtf6IobtR6wrOCguX6qGn5ioK1o3AZdDpEmsAxgl48m-MS3yPML1YhKmY0j2SF4r0A1IsRhhIw%3D%3D?uid=0&filename=додстер%20и%20напиток.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=0&tknv=v2&size=2880x1594',
    'https://downloader.disk.yandex.ru/preview/ab400fb2ffc7e69ab334e350eab3af08dc8620d672c0d452ee0922c2c5ea99bf/65d76b1f/l0KrsoDEGU6eXtf6IobtR6wrOCguX6qGn5ioK1o3AZdDpEmsAxgl48m-MS3yPML1YhKmY0j2SF4r0A1IsRhhIw%3D%3D?uid=0&filename=додстер%20и%20напиток.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=0&tknv=v2&size=2880x1594',
    'https://2.downloader.disk.yandex.ru/preview/ed932566a6284dd0429cecf8ad07d7e931b34fc2ba282cba656dfc3073b79225/inf/9jlhgXAFfeYF3EEOt4p-GMt__r86w2QqDfkJdEmLU1bs6auw21m5dAFYKh1ABfrTFLjxmvxVVP_zl6FmsRmZgg%3D%3D?uid=1329271429&filename=дэнвич%20и%20напиток.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=1329271429&tknv=v2&size=2880x1594',
    'https://2.downloader.disk.yandex.ru/preview/ed932566a6284dd0429cecf8ad07d7e931b34fc2ba282cba656dfc3073b79225/inf/9jlhgXAFfeYF3EEOt4p-GMt__r86w2QqDfkJdEmLU1bs6auw21m5dAFYKh1ABfrTFLjxmvxVVP_zl6FmsRmZgg%3D%3D?uid=1329271429&filename=дэнвич%20и%20напиток.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=1329271429&tknv=v2&size=2880x1594',
    'https://2.downloader.disk.yandex.ru/preview/ed932566a6284dd0429cecf8ad07d7e931b34fc2ba282cba656dfc3073b79225/inf/9jlhgXAFfeYF3EEOt4p-GMt__r86w2QqDfkJdEmLU1bs6auw21m5dAFYKh1ABfrTFLjxmvxVVP_zl6FmsRmZgg%3D%3D?uid=1329271429&filename=дэнвич%20и%20напиток.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=1329271429&tknv=v2&size=2880x1594',
    'https://2.downloader.disk.yandex.ru/preview/ed932566a6284dd0429cecf8ad07d7e931b34fc2ba282cba656dfc3073b79225/inf/9jlhgXAFfeYF3EEOt4p-GMt__r86w2QqDfkJdEmLU1bs6auw21m5dAFYKh1ABfrTFLjxmvxVVP_zl6FmsRmZgg%3D%3D?uid=1329271429&filename=дэнвич%20и%20напиток.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=1329271429&tknv=v2&size=2880x1594',
    'https://2.downloader.disk.yandex.ru/preview/ed932566a6284dd0429cecf8ad07d7e931b34fc2ba282cba656dfc3073b79225/inf/9jlhgXAFfeYF3EEOt4p-GMt__r86w2QqDfkJdEmLU1bs6auw21m5dAFYKh1ABfrTFLjxmvxVVP_zl6FmsRmZgg%3D%3D?uid=1329271429&filename=дэнвич%20и%20напиток.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=1329271429&tknv=v2&size=2880x1594',
    'https://2.downloader.disk.yandex.ru/preview/ed932566a6284dd0429cecf8ad07d7e931b34fc2ba282cba656dfc3073b79225/inf/9jlhgXAFfeYF3EEOt4p-GMt__r86w2QqDfkJdEmLU1bs6auw21m5dAFYKh1ABfrTFLjxmvxVVP_zl6FmsRmZgg%3D%3D?uid=1329271429&filename=дэнвич%20и%20напиток.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=1329271429&tknv=v2&size=2880x1594'
];

function startRoulette(targetName, targetPhoto) {
    let result = document.getElementById("result");

    var image = document.createElement('img');
    image.src = targetPhoto;

    let interval = setInterval(function() {
        let randomNumber = Math.floor(Math.random() * prizes.length);
        result.textContent = prizes[randomNumber];

        if (prizes[randomNumber] === targetName) {
            clearInterval(interval);
            result.appendChild(image);
        }
    }, 350);
}