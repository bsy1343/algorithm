# [Silver II] Drabina - 8672

[문제 링크](https://www.acmicpc.net/problem/8672)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 120, 정답: 49, 맞힌 사람: 40, 정답 비율: 43.011%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Bajtek wchodzi na drabinę. Może on jednym krokiem wejść jeden szczebelek wyżej lub dwa szczebelki wyżej. Zastanawiamy się, na ile r&oacute;żnych sposob&oacute;w może on wejść na szczyt (ostatni szczebelek) drabiny.</p>

<p>Liczba tych sposob&oacute;w może być bardzo duża, więc interesuje nas tylko reszta z dzielenia przez liczbę 2<em><sup>p</sup></em>.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera jedną liczbę całkowitą <em>z</em>&nbsp;(1 &le; <em>z</em> &le; 10<sup>6</sup>), oznaczającą liczbę zestaw&oacute;w danych. Kolejnych <em>z</em>&nbsp;wierszy zawiera po dwie liczby całkowite <em>s</em>, <em>p</em>&nbsp;(1 &le; <em>s</em> &le; 10<sup>6</sup>, 1 &le; <em>p</em> &le; 30), oznaczające odpowiednio liczbę szczebelk&oacute;w drabiny i wartość <em>p</em>&nbsp;z treści zadania.</p>

### 출력

<p>Dla każdego zestawu danych powinna się znaleźć w nowej linii jedna liczba całkowita, r&oacute;wna liczbie sposob&oacute;w dojścia na szczyt drabiny modulo (reszta z dzielenia) 2<em><sup>p</sup></em>.</p>