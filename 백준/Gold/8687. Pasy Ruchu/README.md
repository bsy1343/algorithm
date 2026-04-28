# [Gold IV] Pasy Ruchu - 8687

[문제 링크](https://www.acmicpc.net/problem/8687)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 174, 정답: 46, 맞힌 사람: 29, 정답 비율: 25.000%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 0-1 너비 우선 탐색

### 문제 설명

<p>Dawno temu w Bajtocji wybudowano autostradę o <em>n</em>&nbsp;pasach ruchu, łączącą dwa miasta <em>A</em>&nbsp;i <em>B</em>. Droga była jednak tak uczęszczana, że niekt&oacute;re jej fragmenty stały się nieprzejezdne.</p>

<p>Bajtek, mieszkaniec miasta&nbsp;<em>A</em>, nie lubi zbyt wiele razy kręcić kierownicą. Zastanawia się, jak dojechać do miasta&nbsp;<em>B</em>, zmieniając pasy ruchu minimalną liczbę razy.</p>

<p>Bajtek może rozpocząć swoją podr&oacute;ż z dowolnego pasa ruchu i zakończyć r&oacute;wnież na dowolnym. Zgodnie z obowiązującymi zasadami ruchu drogowego na autostradzie nie wolno zawracać ani cofać.</p>

### 입력

<p>Pierwszym wiersz standardowego wejścia zawiera dwie liczby całkowite <em>n</em>&nbsp;i <em>m</em>&nbsp;(1 &le; <em>n</em>, <em>m</em> &le; 1 000). W&nbsp;<em>n</em>&nbsp;następnych wierszach znajdują się opisy kolejnych pas&oacute;w ruchu. Każdy z takich wierszy zawiera <em>m</em>&nbsp;liczb całkowitych: 0&nbsp;to przejezdny fragment autostrady, natomiast 1&nbsp;to nieprzejezdny.</p>

### 출력

<p>Pierwszy i jedyny wiersz standardowego wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną minimalnej liczbie zmian pas&oacute;w ruchu, lub jedno słowo&nbsp;<i>NIE</i>, jeśli przejazd przez autostradę jest niemożliwy.</p>