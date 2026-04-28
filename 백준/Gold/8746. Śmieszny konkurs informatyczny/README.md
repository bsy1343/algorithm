# [Gold III] Śmieszny konkurs informatyczny - 8746

[문제 링크](https://www.acmicpc.net/problem/8746)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 10, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Olgierd - gł&oacute;wny bohater tego zadania, jest tak samo jak Wy uczniem liceum. Stara sie rozwiązywać zadania na r&oacute;żnych serwisach, aby zostać finalistą Polskiej Olimpiady Informatycznej.</p>

<p>Kolejnym etapem jego przygotowań jest&nbsp;<i>ŚKI - Śmieszny Konkurs Informatyczny</i>. Jak sama nazwa wskazuje, jest to konkurs informatyczny. Na dodatek śmieszny. Konkurs składa się z wielu rund, kt&oacute;re mogą się na siebie dowolnie nakładać czasowo. Na każdą rundę organizatorzy przygotowali jedno zadanie. Olgierd wprawdzie nie zna jeszcze zadań, ale już ustalił sobie, ile czasu poświęci na każdą rundę, oraz ustalił, że jak raz się zabierze za jakieś zadanie, to będzie je robił bez przerwy tyle czasu ile ustalił. W jednej chwili chłopiec może oddać się jedynie jednemu zadaniu i nie zacznie robić żadnego zadania przed rozpoczęciem danej rundy (przecież nie zna zadań) ani nie ma zamiaru robić zadania po zakończeniu rundy w kt&oacute;rej ono było (bo i po co). Jako że zadania na&nbsp;<i>ŚKI</i>&nbsp;są bardzo trudne, to czas, kt&oacute;ry Olgierd poświęci na każdą rundę, jest większy niż połowa czasu trwania całej rundy. Olgierd może robić zadania bez przerwy - nadmiar kawy robi swoje.</p>

<p>Chłopak chciałby wiedzieć, czy może na każde zadanie poświęcić tyle czasu, ile ustalił, ale nie chce marnować swojego cennego czasu na zastanawianie się nad tym, więc powierzył to zadanie konkurencji na&nbsp;<i>ŚKI</i>&nbsp;- czyli Wam.</p>

### 입력

<p>W pierwszej linii znajduje się jedna liczba całkowita <em>z</em>, oznaczająca liczbę zestaw&oacute;w danych do rozpatrzenia.</p>

<p>W pierwszej linii każdego zestawu danych znajduje się jedna liczba całkowita <em>n</em>&nbsp;(1 &le; n &le; 2 &middot; 10<sup>5</sup>), oznaczająca liczbę rund&nbsp;<i>ŚKI</i>. W kolejnych <em>n</em>&nbsp;liniach opis każdej rundy w postaci trzech liczb całkowitych <em>a<sub>i</sub></em>, <em>b<sub>i</sub></em>, <em>c<sub>i</sub></em>&nbsp;(0 &le; <em>a<sub>i</sub></em> &lt; <em>b<sub>i</sub></em> &le; 10<sup>9</sup>, (<em>b<sub>i</sub></em> - <em>a<sub>i</sub></em>) / 2 &le; <em>c<sub>i</sub></em> &le; <em>b<sub>i</sub></em> - <em>a<sub>i</sub></em>), oznaczające że <em>i</em>-ta runda zaczyna się w <em>a<sub>i</sub></em>-tej jednostce czasu, kończy się w&nbsp;<em>b<sub>i</sub></em>-tej jednostce czasu, oraz Olgierd chce poświęcić na tę rundę&nbsp;<em>c<sub>i</sub></em>&nbsp;jednostek czasu. Suma <em>n</em>&nbsp;we wszystkich zestawach danych nie przekroczy 10<sup>6</sup>.</p>

### 출력

<p>Dla każdego zestawu danych jedno słowo &#39;TAK&#39;, jeżeli Olgierd może zrealizować sw&oacute;j plan, bądź &#39;NIE&#39; jeżeli jest to niemożliwe.</p>