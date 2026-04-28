# [Silver III] Pamięć doskonała - 8784

[문제 링크](https://www.acmicpc.net/problem/8784)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 41, 정답: 24, 맞힌 사람: 21, 정답 비율: 56.757%

### 분류

수학, 해 구성하기, 사칙연산

### 문제 설명

<p>Hektor z Wiktorem mają nowe, fascynujące hobby - zapamiętywanie długich ciąg&oacute;w liczb całkowitych. Każdy z chłopc&oacute;w wyspecjalizował się w zapamiętywaniu konkretnego rodzaju ciąg&oacute;w. Hektor najbardziej lubi palindromy, tj. ciągi kt&oacute;re na odpowiadających sobie przeciwnych pozycjach (pierwsza z ostatnią, druga z przedostatnią, etc.) mają te same liczby. Wiktor natomiast jest specjalistą od antypalindrom&oacute;w, tj. ciąg&oacute;w, kt&oacute;re na odpowiadających sobie przeciwnych pozycjach (pierwsza z ostatnią, druga z przedostatnią, etc.) mają przeciwne (tj. sumujące się do zera) liczby.</p>

<p>Ostatnio chłopcy zaczęli zastanawiać się nad tym, jakie możliwości otwiera przed nimi połączenie ich zdolności. Gdyby tak potrafili rozkładać dowolny ciąg liczb całkowitych na sumę palindromu i antypalindromu, każdy z nich m&oacute;głby zapamiętać ciąg swojego ulubionego rodzaju, a razem bez trudu potrafiliby odtworzyć początkowy ciąg!</p>

<p>Dla zadanego ciągu liczb całkowitych <strong>S</strong> o parzystej długości <strong>N </strong>oblicz dwa ciągi <strong>P</strong> i <strong>A</strong>, każdy długości <strong>N</strong>, takie, że <strong>P</strong> jest palindromem, <strong>A</strong> jest antypalindromem, a po wysumowaniu element&oacute;w <strong>P</strong> i <strong>A</strong> na odpowiadających sobie pozycjach, otrzymujemy ciąg <strong>S</strong>.</p>

### 입력

<p>W pierwszej linii znajduje się liczba naturalna <strong>Z</strong> ( 1 &lt;= <strong>Z</strong> &lt;= 10 ) opisująca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>W pierwszej linii opisu zestawu znajduje się jedna niezerowa parzysta liczba naturalna <strong>N</strong> ( 1 &lt;= <strong>N</strong> &lt;= 1000000 ) oznaczająca długość ciągu <strong>S</strong>.</p>

<p>W drugiej linii opisu zestawu znajduje się <strong>N</strong> liczb całkowitych <strong>s<sub>i</sub></strong> ( -1000000 &lt;= <strong>s<sub>i</sub></strong> &lt;= 1000000 ) opisujących kolejne elementy ciągu <strong>S</strong>.</p>

### 출력

<p>Dla każdego zestawu:</p>

<ul>
	<li>Jeśli zadany ciąg <strong>S</strong> da się rozłożyć na sumę opisanych w treści ciąg&oacute;w <strong>P</strong> i <strong>A</strong>, należy wypisać w pierwszej linii ciąg <strong>P</strong> (oddzielając poszczeg&oacute;lne elementy spacjami), a w drugiej linii ciąg <strong>A</strong>.</li>
	<li>W przeciwnym wypadku należy w jedynej linii wypisać słowo &quot;NIE&quot;.</li>
</ul>