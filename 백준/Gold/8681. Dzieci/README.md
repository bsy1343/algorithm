# [Gold V] Dzieci - 8681

[문제 링크](https://www.acmicpc.net/problem/8681)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 46, 정답: 40, 맞힌 사람: 35, 정답 비율: 85.366%

### 분류

그래프 이론, 그래프 탐색, 순열 사이클 분할

### 문제 설명

<p>Dzieci bawią się w pewną zabawę. Na boisku narysowany jest prostokąt jednostkowej szerokości i długości <em>n</em>, podzielony na&nbsp;<em>n</em>&nbsp;kwadratowych p&oacute;l. Na każdym polu wpisana jest liczba naturalna z przedziału od 1&nbsp;do&nbsp;<em>n</em>, każda o innej wartości. Początkowo w każdym z kwadrat&oacute;w stoi jedno dziecko. Co minutę każde z nich przechodzi na pole o numerze napisanym na polu, na kt&oacute;rym obecnie stoi.</p>

<p>Po pewnym czasie dzieci znudziły się tą zabawą i zastanawiają się nad innym problemem. Chciałyby pozmieniać miejscami niekt&oacute;re liczby, napisane na dw&oacute;ch&nbsp;<b>sąsiednich</b>&nbsp;kwadratach, tak aby każde dziecko podczas całej zabawy stało na każdym możliwym polu. Przerysowywanie literek zajmuje trochę czasu, więc zależy im, aby tych zmian było jak najmniej.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 10<sup>6</sup>), oznaczającą liczbę kwadratowych p&oacute;l. Kolejny wiersz zawiera&nbsp;<em>n</em>&nbsp;liczb całkowitych <em>a</em><sub>1</sub>, <em>a</em><sub>2</sub>, ..., <em>a<sub>n</sub></em>&nbsp;(1 &le; <em>a<sub>i</sub></em> &le; <em>n</em>), gdzie&nbsp;<em>a<sub>i</sub></em>&nbsp;oznacza liczbę wpisaną w <em>i</em>-tym kwadratowym polu.</p>

### 출력

<p>Pierwszy i jedyny wiersz standardowego wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną minimalnej liczbie zamian, kt&oacute;re powinny dokonać dzieci.</p>

### 힌트

<p>Wystarczy zamienić miejscami pola numer 3 i 4. Wtedy dzieci będą się zamieniać następująco: 1 &rarr; 3 &rarr; 5 &rarr; 2 &rarr; 4 &rarr; 1.</p>