# [Silver IV] Dwie wieże - 8675

[문제 링크](https://www.acmicpc.net/problem/8675)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 113, 정답: 70, 맞힌 사람: 41, 정답 비율: 54.667%

### 분류

그리디 알고리즘, 누적 합, 두 포인터

### 문제 설명

<p>Mały Bajtek otrzymał od dziadka zestaw klock&oacute;w. Każdy klocek ma pewną wysokość. Bajtek stawia klocki na sobie i w ten spob&oacute;b powstaje wieżyczka. Bajtek wybudował dwie wieżyczki, wykorzystując wszystkie swoje klocki.</p>

<p>Zastanawia się teraz, ile minimalnie klock&oacute;w musi zdjąć z wieżyczek, aby obie miały r&oacute;wną wysokość. Bajtek może zdejmować klocki tylko z szczyt&oacute;w wieżyczek oraz nie może dokładać nowych klock&oacute;w. W szczeg&oacute;lności, Bajek może zdjąć wszystkie klocki ze wieżyczek - wtedy będą miały wysokości r&oacute;wne 0 i będą r&oacute;wne.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera dwie liczby całkowite <em>n</em>, <em>m</em>&nbsp;(1 &le; <em>n</em>, <em>m</em> &le; 10<sup>6</sup>), oznaczające odpowiednio liczbę klock&oacute;w, z kt&oacute;rych zbudowana jest pierwsza oraz druga wieżyczka.</p>

<p>Drugi wiersz zawiera <em>n</em>&nbsp;liczb całkowitych <em>a</em><sub>1</sub>, <em>a</em><sub>2</sub>, ..., <em>a<sub>n</sub></em>&nbsp;(1 &le; <em>a<sub>i</sub></em> &le; 10<sup>9</sup>), gdzie&nbsp;<em>a<sub>i</sub></em>&nbsp;oznacza wysokość <em>i</em>-tego klocka w pierwszej wieżyczce (<em>a</em><sub>1</sub>&nbsp;to klocek znajdujący się na samym dole,&nbsp;<em>a<sub>n</sub></em>&nbsp;to klocek znajdujący się na wierzchołku pierwszej wieżyczki).</p>

<p>Trzeci wiersz zawiera <em>m</em>&nbsp;liczb całkowitych&nbsp;<em>b</em><sub>1</sub>, <em>b</em><sub>2</sub>, ..., <em>b<sub>m</sub></em>&nbsp;(1 &le; <em>b<sub>i</sub></em> &le; 10<sup>9</sup>), gdzie&nbsp;<em>b<sub>i</sub></em>&nbsp;oznacza wysokość <em>i</em>-tego klocka w drugiej wieżyczce.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną minimalnej liczbie klock&oacute;w, jakie Bajtek powinien zdjąć z wieżyczek, aby były tej samej wysokości.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/6ee8c62d-c276-454f-9210-1c6df9b137a4/-/preview/" /></p>