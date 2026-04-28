# [Platinum III] Baner - 8854

[문제 링크](https://www.acmicpc.net/problem/8854)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 128 MB

### 통계

제출: 2, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 누적 합, 문자열

### 문제 설명

<p>Jak co roku zbliża się wielkie święto szydełkowania organizowane przez pana J&oacute;zefa. Pan Wincenty (biegły w sztuce szydełkowania) postanowił w ramach sąsiedzkiej pomocy przygotować baner reklamujący to wydarzenie. Niestety, pan Wincenty pomylił się znacznie w treści wyszydełkowanego tekstu.</p>

<p>Witek postanowił pom&oacute;c tacie i naprawić baner. W celu naprawienia banera może wykonywać dwa rodzaje opracji.</p>

<ul>
	<li>Usunięcie, polegające na usunięciu z banera ciągu kolejnych liter</li>
	<li>Dodanie, polegające na wstawieniu na początku, na końcu, lub pomiędzy dwie litery banera ciągu liter</li>
</ul>

<p>Każda z operacji trwa X + SY minut, gdzie S oznacza długość ciągu liter wstawianego lub usuwanego z banera. Oblicz najkr&oacute;tszy możliwy czas naprawy banera.</p>

### 입력

<p>Pierwsza linia zawiera liczbę naturalną L - liczbę zestaw&oacute;w testowych. Następnie podawany jest opis kolejnych zestaw&oacute;w.</p>

<p>Opis każdego zestawu składa się z trzech linii. W pierwszej znajduje się liczba naturalna D1 i słowo S1. S1 to początkowa treść baneru, a D1 - długość słowa S1 (1&lt;=D1 &lt;=1000). W drugiej linii następuje analogiczny opis docelowej treści baneru. W trzeciej linii znajdują się dwie, podane z dokładnością do 6 cyfr po przecinku liczby rzeczywiste X i Y (0&lt;=X,Y&lt;=100).&nbsp; Zar&oacute;wno S1 jak i S2 składają się wyłącznie z dużych liter alfabetu angielskiego.</p>

### 출력

<p>Dla każdego zestawu należy wypisać w osobnej linii opisany w treści minimalny czas naprawy z dokładnością do 6 cyfr po przecinku.</p>