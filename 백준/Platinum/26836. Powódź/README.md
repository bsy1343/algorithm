# [Platinum III] Powódź - 26836

[문제 링크](https://www.acmicpc.net/problem/26836)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 9, 맞힌 사람: 8, 정답 비율: 50.000%

### 분류

조합론, 자료 구조, 분리 집합, 다이나믹 프로그래밍, 수학

### 문제 설명

<p>Bajtocję często nawiedzają ulewne deszcze, co szczeg&oacute;lnie doskwiera lokalnym rolnikom. Ich kwadratowe pola ułożone są obok siebie na planie prostokąta o wymiarach m &times; n (m wierszy po n p&oacute;l, w sumie mn p&oacute;l). Rolnik&oacute;w najbardziej boli sytuacja, gdy woda z deszczu, kt&oacute;ry spadł na pole sąsiada, przeleje się na ich pole. W związku z tym wybudowali na granicach p&oacute;l r&oacute;żnorakie zapory, kt&oacute;re dumnie nazwali tamami. Pomiędzy każdą parą sąsiednich p&oacute;l istnieje tama o wysokości od 1 do H milimetr&oacute;w. Zakładamy, że wszystkie granice zewnętrzne prostokąta są ogrodzone tamami o wysokości H milimetr&oacute;w.</p>

<p>Interesuje nas, jak może wyglądać poziom wody na polach po bardzo ulewnym deszczu. Dla uproszczenia, interesują nas jedynie sytuacje, gdy poziom wody (w milimetrach) na każdym polu jest liczbą całkowitą pomiędzy 0 a H. Zauważmy, że dla każdej pary sąsiadujących p&oacute;l, pomiędzy kt&oacute;rymi wybudowano tamę o wysokości h milimetr&oacute;w, poziomy wody na obu polach są r&oacute;wne lub oba nie większe niż h milimetr&oacute;w. W innym przypadku, woda z pola o wyższym poziomie (większym niż h milimetr&oacute;w) przelałaby się przez tamę na drugie pole.</p>

<p>Napisz program, kt&oacute;ry obliczy, ile jest r&oacute;żnych scenariuszy powodzi. Dwa scenariusze uważamy za r&oacute;żne, jeśli istnieje choć jedno pole, kt&oacute;re ma r&oacute;żny poziom wody w tych scenariuszach. Wynik może być bardzo duży, dlatego podaj resztę z dzielenia wyniku przez 1 000 000 007.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera trzy liczby całkowite m, n, H (m, n, H &ge; 1), oznaczające wymiary prostokąta oraz maksymalny możliwy poziom wody w milimetrach.</p>

<p>Jeśli n &gt; 1, to następne m wierszy zawiera po n&minus;1 liczb całkowitych. Liczba i-ta w j-tym wierszu oznacza wysokość tamy pomiędzy polami o numerach i oraz i + 1 leżącymi w j-tym wierszu.</p>

<p>Jeśli m &gt; 1, to kolejne m &minus; 1 wierszy zawiera po n liczb całkowitych. Liczba i-ta w wierszu j-tym oznacza wysokość tamy pomiędzy polami j i j + 1 leżącymi w i-tej kolumnie.</p>

### 출력

<p>Na standardowe wyjście należy wypisać jedną liczbę całkowitą, oznaczającą liczbę możliwych scenariuszy powodzi modulo 1 000 000 007.</p>

### 제한

<ul>
	<li>mn &le; 500 000</li>
	<li>H &le; 10<sup>9</sup></li>
</ul>

### 힌트

<p>Wyjaśnienie do przykładu: Poziom wody na wszystkich polach może być r&oacute;wny 2 (1 możliwość) albo każde z p&oacute;l niezależnie może mieć poziom wody r&oacute;wny 0 lub 1 (2<sup>6</sup> = 64 możliwości).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26836.%E2%80%85Pow%C3%B3d%C5%BA/a78984e7.png" data-original-src="https://upload.acmicpc.net/388954cd-2238-44e7-b392-d6eea9f635a5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 128px; height: 187px;" /></p>