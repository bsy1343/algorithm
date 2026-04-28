# [Gold II] Eksperyment - 8849

[문제 링크](https://www.acmicpc.net/problem/8849)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 17, 맞힌 사람: 8, 정답 비율: 57.143%

### 분류

그래프 이론, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>Syn pana Wincentego, Witek, razem z kolegami przygotowuje projekt naukowy. Chłopcy konstruują labirynt dla mr&oacute;wek składający się z N p&oacute;l (numerowanych od 0 do N-1) w kt&oacute;rych mr&oacute;wki mogą przebywać i pewnej liczby jednokierunkowych korytarzy łączących te pola.</p>

<p>Witek z kolegami ustalili już, kt&oacute;re pola będą połączone korytarzami i wybrali kierunki niekt&oacute;rych z nich. Gdy labirynt będzie gotowy, chłopcy umieszczą w wybranych polach mr&oacute;wki i zaczekają, aż te zakończą wędrowanie po labiryncie - wtedy będą mogli zbadać w kt&oacute;rych polach zgromadziło się najwięcej owad&oacute;w.</p>

<p>Niestety mr&oacute;wki kt&oacute;rych zachowania badają są niezwykle ruchliwe. Każda z nich będzie poruszać się po labiryncie losowo wybierając korytarze dop&oacute;ki nie znajdzie się w polu bez wyjścia. Chłopcy chcą, aby mimo to prędzej czy p&oacute;źniej eksperyment się zakończył - muszą tak ustalić kierunki pozostałych korytarzy, aby żadna mr&oacute;wka nie była w stanie krążyć po labiryncie bez końca.</p>

### 입력

<p>W pierwszej linii wejścia znajdują się trzy liczby naturalne N, A i B ( 1 &lt;= N, A, B &lt;= 200000).</p>

<p>Następnie podawane jest A linii opisujących korytarze o ustalonym kierunku. W każdej z tych linii znajdują się dwie liczby naturalne S i K, oznaczające odpowiednio - numer pola z kt&oacute;rego wychodzi dany korytarz, i numer pola do kt&oacute;rego dany korytarz prowadzi.</p>

<p>Następnie podawane jest B linii opisujących korytarze o nieustalonym dotąd kierunku. W każdej z tych linii znajdują się dwie liczby naturalne S i K, oznaczające pola, kt&oacute;re łączy dany korytarz.</p>

<p>Dla każdej pary S i K, S będzie r&oacute;żne od K. Dla każdego zestawu testowego będzie istnieć poprawne rozwiązanie.</p>

### 출력

<p>Dla każdego korytarza o nieustalonym dotąd kierunku, w kolejności, w jakiej podawane są na wejściu, wypisz w osobnej linii 0, jeśli korytarz ma prowadzić w kierunku zgodnym z kolejnością podania p&oacute;l S i K na wejściu, lub 1, jeśli kierunek ma być przeciwny.</p>