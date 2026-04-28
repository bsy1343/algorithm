# [Silver V] Ornitolog 2 - 26713

[문제 링크](https://www.acmicpc.net/problem/26713)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 61, 정답: 37, 맞힌 사람: 25, 정답 비율: 60.976%

### 분류

그리디 알고리즘

### 문제 설명

<p>Pliszka alternująca (Motacilla alterna) to gatunek ptaka z rodziny pliszkowatych. Wyr&oacute;żnia go charakterystyczny śpiew, w kt&oacute;rym wysokość tonu kolejnych dźwięk&oacute;w naprzemiennie rośnie i maleje. Dla przykładu, jeżeli będziemy reprezentować wysokości dźwięk&oacute;w za pomocą liczb całkowitych, to pliszka alternująca może zaśpiewać [2, 1, 3] i [4, 5, &minus;6, &minus;5], ale nie [1, 2, 3, 2] i [6, 5, 5, 4]. W celu nagrania tych fascynujących stworzeń ornitolog Bajtazar pozostawił sw&oacute;j dyktafon na kilka dni w lesie. Teraz zastanawia się, czy nagrane dźwięki są podobne do śpiewu pliszki.</p>

<p>Napisz program, kt&oacute;ry dla danego ciągu wysokości dźwięk&oacute;w wyznaczy minimalną liczbę jego wyraz&oacute;w, kt&oacute;re trzeba zmienić na dźwięk o dowolnej całkowitoliczbowej wysokości z przedziału [&minus;10<sup>9</sup>, 10<sup>9</sup>], żeby ciąg przedstawiał możliwy śpiew pliszki alternującej.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajduje się jedna liczba całkowita n (3 &le; n &le; 50 000), oznaczająca długość nagrania.</p>

<p>Kolejny wiersz zawiera n liczb całkowitych a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> (&minus;1 000 000 &le; a<sub>i</sub> &le; 1 000 000), gdzie ai jest wysokością i-tego dźwięku w nagraniu.</p>

### 출력

<p>Na wyjściu powinna znaleźć się jedna liczba całkowita, oznaczająca minimalną liczbę zmienionych dźwięk&oacute;w.</p>

### 힌트

<p>Wyjaśnienie przykład&oacute;w: W pierwszym teście przykładowym, aby ciąg m&oacute;gł zostać zaśpiewany przez pliszkę alternującą, wystarczy zmienić czwarty wyraz ciągu, na przykład na &minus;1. W drugim teście przykładowym trzeba zmienić co najmniej dwa wyrazy, otrzymując na przykład ciąg [&minus;1 000 001, &minus;1 000 000, &minus;1 000 002, &minus;1 000 000].</p>