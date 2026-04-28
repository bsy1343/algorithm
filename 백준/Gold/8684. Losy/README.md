# [Gold IV] Losy - 8684

[문제 링크](https://www.acmicpc.net/problem/8684)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 40, 정답: 22, 맞힌 사람: 18, 정답 비율: 54.545%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>W pewnej szkolnej zabawie przygotowano <em>n</em>&nbsp;koszyk&oacute;w i do każdego z nich wrzucono pewną liczbę los&oacute;w. Niekt&oacute;re z los&oacute;w są wygrywające i za wylosowanie takiego losu dostaje się prawo do opuszczenia jednej godziny lekcyjnej bez usprawiedliwienia.</p>

<p>Kozik szybko obliczył, że chciałby opuścić <em>g</em>&nbsp;godzin w danym roku szkolnym. Powinien więc kupić tyle los&oacute;w, aby mieć pewność, że wśr&oacute;d wszystkich kupionych będzie co najmniej&nbsp;<em>g</em>&nbsp;los&oacute;w wygrywających. Kozik ma jednak ograniczone fundusze, dlatego chciałby zrobić to jak najmniejszym kosztem, czyli kupić jak najmniej los&oacute;w. Zakładamy, że Kozik wie, ile jest w każdym pojemniku los&oacute;w wygrywających, a ile przegrywających.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera dwie liczby całkowite <em>n</em>, <em>g</em>&nbsp;(1 &le; <em>n</em> &le; 10 000, 1 &le; <em>g</em> &le; 1 000), oznaczające odpowiednio liczbę koszyk&oacute;w z losami oraz liczbę godzin, jakie chciałby opuścić Kozik.</p>

<p>W&nbsp;<em>n</em>&nbsp;kolejnych wierszach znajduje się opis kolejnych koszyk&oacute;w. Każdy wiersz zawiera dwie liczby całkowite <em>w<sub>i</sub></em>, <em>p<sub>i</sub></em>&nbsp;(0 &le; <em>w<sub>i</sub></em> &le; 10<sup>9</sup>, 0 &le; <em>p<sub>i</sub></em> &le; 10<sup>9</sup>), oznaczające odpowiednio liczbę los&oacute;w wygrywających oraz przegrywających w <em>i</em>-tym koszyku.</p>

### 출력

<p>Pierwszy i jedyny wiersz standardowego wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną minimalnej liczbie los&oacute;w, jakie powinien kupić Kozik lub jedno słowo&nbsp;<i>NIE</i>, gdy Kozik nie może kupić tylu los&oacute;w, aby opuścić co najmniej <em>g</em>&nbsp;godzin.</p>