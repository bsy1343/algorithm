# [Bronze III] Test - 8815

[문제 링크](https://www.acmicpc.net/problem/8815)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 657, 정답: 445, 맞힌 사람: 387, 정답 비율: 66.609%

### 분류

수학, 문자열, 사칙연산

### 문제 설명

<p>Hektor lubi kartk&oacute;wki w formie test&oacute;w w kt&oacute;rych każde pytanie ma cztery możliwe odpowiedzi ( A, B, C lub D ). Kiedy nie zna prawidłowych odpowiedzi, zamiast strzelać, zaznacza odpowiedzi według schematu:</p>

<ol>
	<li>W pierwszym zadaniu odpowiedź A</li>
	<li>W drugim zadaniu kolejna litera w stosunku do poprzednio wybranej, ( B )</li>
	<li>W trzecim zadaniu kolejna litera w stosunku do poprzednio wybranej, ( C )</li>
	<li>W czwartym zadaniu &quot;o jeden mniejsza&quot; litera w stosunku do poprzednio wybranej ( B )</li>
</ol>

<p>A następnie do końca testu powtarza punkty 2,3,4 ( choć konkretne litery w nawiasie oczywiście się zmieniają).</p>

<ul>
	<li>Kolejna litera po A to B</li>
	<li>Kolejna litera po B to C</li>
	<li>Kolejna litera po C to D</li>
	<li>Kolejna litera po D to A</li>
</ul>

<ul>
	<li>Litera o jeden mniejsza od A to D</li>
	<li>Litera o jeden mniejsza od B to A</li>
	<li>Litera o jeden mniejsza od C to B</li>
	<li>Litera o jeden mniejsza od D to C</li>
</ul>

<p>Tak więc na pierwsze 12 pytań Hektor będzie odpowiadał kolejno: ABCBCDCDADAB.</p>

<p>Jak odpowie na&nbsp;<strong>N</strong>-te pytanie?&nbsp;</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba zestaw&oacute;w testowych&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 1 0 ).</p>

<p>W każdej z kolejnych&nbsp;<strong>Z</strong>&nbsp;linii znajduje się jedna liczba całkowita,&nbsp;<strong>N</strong>&nbsp;( 1 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 10<sup>9</sup>).</p>

### 출력

<p>Dla każdego zestawu należy wypisać jak odpowiedział Hektor na&nbsp;<strong>N</strong>-te pytanie.</p>