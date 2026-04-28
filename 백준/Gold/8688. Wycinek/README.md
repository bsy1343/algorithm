# [Gold II] Wycinek - 8688

[문제 링크](https://www.acmicpc.net/problem/8688)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 7, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

누적 합

### 문제 설명

<p>Jasio znalazł na strychu bardzo starą rolkę papieru, na kt&oacute;rej jego pradziadek wypisał ciąg liczb całkowitych. Do zabawy, kt&oacute;rą niedawno wymyślił, potrzebny jest mu taki wycinek rolki papieru, na kt&oacute;rym suma wszystkich liczb będzie wynosiła <em>s</em>. Niepotrzebne kawałki wyrzuci do kosza. Jasio nie chce jednak wyrzucić za dużo z pamiątki po pradziadku, dlatego chciałby, aby szukany wycinek był jak najdłuższy.</p>

<p>Zakładamy, że każda liczba znajduje się na wycinku długości 1, para sąsiednich liczb na wycinku długości 2, itd.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera dwie liczby całkowite <em>n</em>, <em>s</em>&nbsp;(1 &le; <em>n</em> &le; 10<sup>6</sup>, |<em>s</em>| &le; 10<sup>6</sup>), oznaczające odpowiednio długość rolki oraz sumę liczb, ktorą powinien posiadać wycinek. Kolejny wiersz wejścia zawiera ciąg <em>n</em>&nbsp;liczb całkowitych <em>x</em><sub>1</sub>, <em>x</em><sub>2</sub>, ..., <em>x<sub>n</sub></em>&nbsp;(|<em>x<sub>i</sub></em>| &le; 10<sup>6</sup>), gdzie&nbsp;<em>x<sub>i</sub></em>&nbsp;oznacza wartość <em>i</em>-tej liczby wpisanej na rolce papieru.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną długości najdłuższego możliwego do uzyskania wycinka lub jedno słowo&nbsp;<i>BRAK</i>, gdy wycinek o sumie <em>s</em>&nbsp;nie istnieje.</p>