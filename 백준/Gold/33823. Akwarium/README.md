# [Gold V] Akwarium - 33823

[문제 링크](https://www.acmicpc.net/problem/33823)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 22, 정답: 14, 맞힌 사람: 9, 정답 비율: 64.286%

### 분류

브루트포스 알고리즘, 수학, 정수론

### 문제 설명

<p>Postanowiłeś/aś kupić nowe akwarium dla swojej złotej rybki. W sklepie z akwariami masz bardzo duży wybór: możesz kupić prostopadłościenne akwarium o podstawie $a$ na $b$ oraz wysokości $h$ dla dowolnych całkowitych dodatnich wymiarów $a$, $b$ i $h$.</p>

<p>Twoja rybka lubi robić poranne ćwiczenia i na rozgrzewkę pływa w tę i z powrotem po jednej z przekątnych akwarium. Długość przekątnej akwarium wyraża się wzorem $\sqrt{ a^2 + b^2 + h^2}$.</p>

<p>Aby ułatwić rybce obliczenia, ile przepłynęła danego dnia, chcesz, aby długość przekątnej również wyrażała się liczbą całkowitą. Zbyt duże akwarium też nie wchodzi w rachubę, więc długość jego przekątnej musi wynosić co najwyżej $n$.</p>

<p>Ile różnych akwariów spełnia wszystkie wymagania? Dwa akwaria uznajemy za różne, jeśli mają inną wysokość lub inną nieuporządkowaną parę $\{a, b\}$ (akwarium o podstawie $a$ na $b$ i wysokości $h$ oraz akwarium o podstawie $b$ na $a$ i wysokości $h$ są takie same).</p>

<p><strong>Ze względu na specyfikę zadania, dzielenie się na forum testami do tego zadania jest zabronione!</strong></p>

### 입력

<p>W jedynym wierszu znajduje się liczba $n$ ($1 ≤ n ≤ 5000$), oznaczająca ograniczenie na przekątną akwarium.</p>

### 출력

<p>Na wyjście należy wypisać jedną liczbę całkowitą – liczbę różnych akwariów spełniających warunki zadania.</p>

### 힌트

<p>Możliwe są następujące akwaria:</p>

<ul>
	<li>Podstawa $1$ na $2$, wysokość $2$, przekątna $3$.</li>
	<li>Podstawa $2$ na $2$, wysokość $1$, przekątna $3$.</li>
	<li>Podstawa $2$ na $4$, wysokość $4$, przekątna $6$.</li>
	<li>Podstawa $4$ na $4$, wysokość $2$, przekątna $6$.</li>
	<li>Podstawa $2$ na $3$, wysokość $6$, przekątna $7$.</li>
	<li>Podstawa $2$ na $6$, wysokość $3$, przekątna $7$.</li>
	<li>Podstawa $3$ na $6$, wysokość $2$, przekątna $7$.</li>
</ul>