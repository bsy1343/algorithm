# [Silver V] Kratki - 8722

[문제 링크](https://www.acmicpc.net/problem/8722)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 189, 정답: 61, 맞힌 사람: 43, 정답 비율: 28.105%

### 분류

수학, 기하학

### 문제 설명

<p>Jaś ma wiele czystych białych kartek papieru. Kartki mają r&oacute;żne wielkości. Jaś postanowił przerobić pewną białą kartkę na kartkę w kratkę &ndash; czyli chciałby dorysować pewną liczbę pionowych kresek i pewną liczbę poziomych kresek (r&oacute;wnoległych do bok&oacute;w kartki), kt&oacute;re podzielą kartkę na małe prostokąty.</p>

<p>Jaś musi jednak zachować odstęp <em>d</em> milimetr&oacute;w pomiędzy kolejnymi liniami, zaś odległość linii od dowolnego boku musi wynosić co najmniej 1 milimetr. Jaś chciałby wybrać taką kartkę, kt&oacute;rą będzie m&oacute;gł podzielić na jak największą liczbę prostokąt&oacute;w (prostokąty utworzone pomiędzy pierwszą linią a bokiem kartki r&oacute;wnież liczymy). Ze wszystkich kartek, kt&oacute;re będzie m&oacute;gł podzielić na taką samą liczbę prostokąt&oacute;w, chciałby wybrać kartkę o największej powierzchni. Znajdź tą powierzchnię.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera dwie liczby całkowite <em>n</em>, <em>d</em> (1 &le; <em>n</em> &le; 10<sup>6</sup>, 1 &le; <em>d</em> &le; 100), oznaczające odpowiednio liczbę białych kartek Jasia oraz minimalny odstęp pomiędzy liniami. Następnych <em>n</em> wierszy zawiera opisy kolejnych kartek papieru. Każdy z wierszy składa się z dw&oacute;ch liczb całkowitych <em>a<sub>i</sub></em>, <em>b<sub>i</sub></em> (2 &le; <em>a<sub>i</sub></em>, <em>b<sub>i</sub></em> &le; 10<sup>4</sup>), oznaczających odpowiednio długość i szerokość <em>i</em>-tej kartki.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę oznaczającą powierzchnię kartki, kt&oacute;rą powinien wybrać Jaś.</p>