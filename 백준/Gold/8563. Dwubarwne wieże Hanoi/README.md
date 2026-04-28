# [Gold IV] Dwubarwne wieże Hanoi - 8563

[문제 링크](https://www.acmicpc.net/problem/8563)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 37, 정답: 27, 맞힌 사람: 20, 정답 비율: 74.074%

### 분류

수학, 다이나믹 프로그래밍, 재귀, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>Wieże Hanoi to tradycyjna zabawa-łamigł&oacute;wka polegająca na nakładaniu krążk&oacute;w na słupki. Dysponujemy <em>n</em>&nbsp;krążkami o średnicach 1, 2, ..., <em>n</em>&nbsp;i trzema słupkami, kt&oacute;re nazwiemy <em>A</em>, <em>B</em>&nbsp;i&nbsp;<em>C</em>. Każdy krążek ma w środku dziurkę, kt&oacute;ra pozwala nałożyć krążek na słupek. Początkowo wszystkie krążki znajdują się na słupku <em>A</em>&nbsp;i są ułożone począwszy od największego (na dole) do najmniejszego (na g&oacute;rze). Zabawa polega na przeniesieniu wszystkich krążk&oacute;w na jeden z wolnych słupk&oacute;w (powiedzmy <em>B</em>) zgodnie z następującymi zasadami:</p>

<ul>
	<li>w jednym ruchu wolno nam wziąć jeden krążek leżący na g&oacute;rze na jednym ze słupk&oacute;w i położyć go na g&oacute;rze na innym słupku;</li>
	<li>na każdym słupku zawsze musi być zachowany porządek, tzn. krążki muszą leżeć w kolejności od największego (na dole słupka) do najmniejszego (na g&oacute;rze).</li>
</ul>

<p>Krążki nałożone na jeden słupek nazwiemy wieżą. Podsumowując powyższe zasady, możemy stwierdzić, że:</p>

<ul>
	<li>nie jest możliwe wyciągnięcie krążka ze środka wieży lub włożenie krążka do środka wieży;</li>
	<li>nie wolno brać więcej niż jeden krążek na raz;</li>
	<li>nie wolno kłaść większego krążka na mniejszym.</li>
</ul>

<p>Celem w tej zabawie jest przeniesienie wieży z jednego słupka na drugi w najmniejszej, możliwej liczbie ruch&oacute;w.</p>

<p>Dwubarwne wieże Hanoi, to nieco zmodyfikowana odmiana powyższej układanki. Jak poprzednio mamy trzy słupki i <em>n</em>&nbsp;krążk&oacute;w o średnicach 1, 2, ..., <em>n</em>. Tym razem jednak krążki o średnicach nieparzystych (1, 3, 5, ...) są białe, a krążki o średnicach parzystych (2, 4, 6, ...) są czarne. Celem zabawy jest przeniesienie (zgodnie z podanymi wyżej zasadami) wszystkich krążk&oacute;w białych na słupek <em>B</em>, a krążk&oacute;w czarnych na słupek&nbsp;<em>C</em>.</p>

<p>Napisz program, kt&oacute;ry wyliczy minimalną liczbę ruch&oacute;w, potrzebnych do ułożenia krążk&oacute;w białych na słupku <em>B</em>, a krążk&oacute;w czarnych na słupku <em>C</em>.</p>

### 입력

<p>Program powinien czytać dane z wejścia standardowego. W pierwszym wierszu podana jest liczba <em>n</em>&nbsp;(0 &le; <em>n</em> &le; 1 000), oznaczająca liczbę krążk&oacute;w.</p>

### 출력

<p>Program powinien pisać wynik na wyjście standardowe. Wynikiem powinna być jedna liczba oznaczająca minimalną liczbę ruch&oacute;w potrzebnych do rozdzielenia białych i czarnych krążk&oacute;w.</p>