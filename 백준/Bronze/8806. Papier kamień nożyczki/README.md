# [Bronze II] Papier kamień nożyczki - 8806

[문제 링크](https://www.acmicpc.net/problem/8806)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 444, 정답: 362, 맞힌 사람: 320, 정답 비율: 80.808%

### 분류

수학, 사칙연산, 확률론

### 문제 설명

<p>Adam i Gosia grają w &quot;Papier kamień nożyczki&quot;.</p>

<p>Gra polega na tym, że każdy z zawodnik&oacute;w jednocześnie wybiera&nbsp;<em>papier</em>,&nbsp;<em>kamień</em>&nbsp;lub&nbsp;<em>nożyczki</em>.</p>

<ul>
	<li>Gracz, kt&oacute;ry wybrał&nbsp;<em>papier</em>&nbsp;wygrywa z tym, kt&oacute;ry wybrał&nbsp;<em>kamień</em>.</li>
	<li>Gracz, kt&oacute;ry wybrał&nbsp;<em>kamień</em>&nbsp;wygrywa z tym, kt&oacute;ry wybrał&nbsp;<em>nożyczki</em>.</li>
	<li>Gracz, kt&oacute;ry wybrał&nbsp;<em>nożyczki</em>&nbsp;wygrywa z tym, kt&oacute;ry wybrał&nbsp;<em>papier</em>.</li>
</ul>

<p>Jeśli oboje wybiorą ten sam ruch gra jest powtarzana do momentu wyłonienia zwycięzcy.</p>

<p>Wiedząc z jakim prawdopodobieństem każdy z graczy wybierze&nbsp;<em>papier</em>,&nbsp;<em>kamień</em>&nbsp;i&nbsp;<em>nożyczki</em>&nbsp;oblicz kto ma większe szanse wygrania pojedynku.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba zestaw&oacute;w testowych&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ).</p>

<p>Pierwsza linia pojedynczego zestawu testowego zawiera liczby&nbsp;<strong>X1 Y1 Z1</strong>&nbsp;( 0 &lt;=&nbsp;<strong>X1</strong>,&nbsp;<strong>Y1, Z1</strong>&nbsp;&lt;= 1,&nbsp;&nbsp;<strong>X1 + Y1 + Z1</strong>&nbsp;= 1) określające z jakim prawdopodobieństwem Adam wybierze&nbsp;<em>papier</em>,&nbsp;<em>kamień</em>&nbsp;i&nbsp;<em>nożyczki</em>. Druga&nbsp;linia zawiera liczby&nbsp;<strong>X2 Y2 Z2</strong>&nbsp;( 0 &lt;=&nbsp;<strong>X2</strong>,&nbsp;<strong>Y2, Z2</strong>&nbsp;</p>

<p>&lt;= 1,&nbsp;&nbsp;<strong>X2 + Y2 + Z2</strong>&nbsp;= 1&nbsp;) określające z jakim prawdopodobieństwem Gosia wybierze&nbsp;<em>papier</em>,&nbsp;<em>kamień</em>&nbsp;i&nbsp;<em>nożyczki</em>.</p>

### 출력

<p>Dla każdego zestawu testowego należy wypisać:</p>

<ul>
	<li>&quot;ADAM&quot; jeśli Adam ma większe szanse na zwycięstwo</li>
	<li>&quot;GOSIA&quot; jeśli Gosia ma większe szansce na zwycięstwo</li>
	<li>&quot;=&quot; jesli Adam i Gosia mają r&oacute;wne szanse na zwycięstwo</li>
</ul>