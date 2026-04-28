# [Gold IV] Portal Kombat - 8838

[문제 링크](https://www.acmicpc.net/problem/8838)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 41, 정답: 22, 맞힌 사람: 16, 정답 비율: 61.538%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐, 스택

### 문제 설명

<p>Ulubioną grą komputerową Hektora jest Portal Kombat - gra, w kt&oacute;rej gracz wciela się w postać wojownika toczącego pojedynki ze sterowanymi komputerowo przeciwnikami. Każda postać w grze (zar&oacute;wno Hektor, jak i jego przeciwnicy) ma określoną siłę.</p>

<p>Siła komputerowych przeciwnik&oacute;w jest niezmienna i znana Hektorowi przez cały czas rozgrywki. Siła Hektora rośnie wraz z kolejnymi zwycięstwami. Konkretnie - w każdej rundzie Hektor wybiera przeciwnika z kt&oacute;rym chce stoczyć pojedynek.</p>

<ul>
	<li>Jeśli Hektor jest silniejszy, wygrywa pojedynek. Jego przeciwnik odpada z gry, a siła Hektora zwiększa się o siłę pokonanego przeciwnika.</li>
	<li>Jeśli siła Hektora i jego przeciwnika jest r&oacute;wna, pojedynek kończy się remisem i nic się nie dzieje.</li>
	<li>Jeśli Hektor jest słabszy - przegrywa grę.</li>
</ul>

<p>Znając siłę Hektora i każdego z jego przeciwnik&oacute;w, oblicz ile minimalnie rund musi upłynąć, zanim Hektor pokona najsilniejszego przeciwnika.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba zestaw&oacute;w testowych Z ( 1 &lt;= Z &lt;= 10 ). Następnie opisywane są kolejne zestawy testowe.</p>

<p>W pierwszej linii zestawu testowego znajdują się dwie liczby naturalne P i N ( 1 &lt;= P, N &lt;= 1000000 ). P to początkowa siła Hektora, N oznacza liczbę jego przeciwnik&oacute;w.&nbsp;</p>

<p>W drugiej linii zestawu testowego znajduje się N liczb naturalnych X<sub>i</sub>&nbsp;( 1 &lt;= X<sub>i</sub>&nbsp;&lt;= 1000000 ), oznaczających siłę przeciwnik&oacute;w. Liczby X<sub>i</sub>&nbsp;podane są w&nbsp;<strong>kolejności niemalejącej</strong>.</p>

### 출력

<p>Dla każdego zestawu należy w osobnej linii wypisać minimalną liczbę rund potrzebną do pokonania najsilniejszego przeciwnika, lub słowo &quot;NIE&quot;, jeśli Hektor w żaden spos&oacute;b nie będzie w stanie tego zrobić.</p>