# [Gold II] Słownik - 8814

[문제 링크](https://www.acmicpc.net/problem/8814)

### 성능 요약

시간 제한: 12 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 7, 맞힌 사람: 3, 정답 비율: 27.273%

### 분류

너비 우선 탐색, 자료 구조, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 해시를 사용한 집합과 맵, 정렬, 문자열, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Posiadasz długą listę bezpośrednich tłumaczeń pojedynczych sł&oacute;w z jednego języka na drugi. Wpisy na liście mają postać: Słowo&nbsp;<strong>S1</strong>&nbsp;w jezyku&nbsp;<strong>A</strong>&nbsp;odpowiada słowu&nbsp;<strong>S2</strong>&nbsp;w jezyku&nbsp;<strong>B</strong>.&nbsp;</p>

<p>Twoim zadaniem jest napisanie programu kt&oacute;ry będzie potrafił odpowiadać na pytania typu: Znajdź wszystkie tłumaczenia słowa&nbsp;<strong>S</strong>&nbsp;z języka&nbsp;<strong>A</strong>&nbsp;na język&nbsp;<strong>B</strong>.</p>

<p>Relacja bycia tłumaczeniem jest przechodnia, to znaczy słowo&nbsp;<strong>S2</strong>&nbsp;w języku&nbsp;<strong>B</strong>&nbsp;jest tłumaczeniem słowa&nbsp;<strong>S1</strong>&nbsp;z języka&nbsp;<strong>A</strong>&nbsp;gdy istnieje ciąg kolejnych sł&oacute;w w kolejnych językach, z kt&oacute;rych każde dwa sąsiednie są swoimi bezpośrednimi tłumaczeniami, kt&oacute;ry przeprowadza słowo&nbsp;<strong>S1</strong>&nbsp;w języku&nbsp;<strong>A</strong>&nbsp;na słowo&nbsp;<strong>S2</strong>&nbsp;w języku&nbsp;<strong>B</strong>.</p>

<p>Formalnie, musi istnieć ciąg par sł&oacute;w i język&oacute;w (<strong>X<sub>i</sub></strong>,<strong>J<sub>i</sub></strong>) taki, że (<strong>S1</strong>,<strong>A</strong>) jest bezpośrednim tłumaczeniem (<strong>X<sub>1</sub></strong>,<strong>J<sub>1</sub></strong>), (<strong>X<sub>1</sub></strong>,<strong>J<sub>1</sub></strong>) jest bezpośrednim tłumaczeniem (<strong>X<sub>2</sub></strong>,<strong>J<sub>2</sub></strong>), (<strong>X<sub>2</sub></strong>,<strong>J<sub>2</sub></strong>) jest bezpośrednim tłumaczeniem (<strong>X<sub>3</sub></strong>,<strong>J<sub>3</sub></strong>), ..., (<strong>X<sub>k</sub></strong>,<strong>J<sub>k</sub></strong>) jest bezpośrednim tłumaczeniem (<strong>S2</strong>,<strong>B</strong>).&nbsp;</p>

<p>Relacja bycia bezpośrednim tłumaczeniem jest symetryczna, tj. każda para na liście bezpośrednich tłumaczeń oznacza wzajemną odpowiedniość sł&oacute;w.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba zestaw&oacute;w testowych&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ).</p>

<p>W pierwszej lini pojedynczego testu znajduje się liczba&nbsp;<strong>N</strong>&nbsp;oznaczająca liczbę bezpośrednich tłumaczeń. W następnych&nbsp;<strong>N</strong>&nbsp;(1 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 40000) liniach znajdują się po 4 słowa (<strong>S1</strong>,&nbsp;<strong>A</strong>,&nbsp;<strong>S2</strong>,&nbsp;<strong>B</strong>). W nasŧępnej lini znajduje się liczba&nbsp;<strong>M&nbsp;</strong>(1 &lt;=&nbsp;<strong>M</strong>&nbsp;&lt;= 10000)&nbsp;oznaczająca ilość zapytań.&nbsp;W następnych&nbsp;<strong>M</strong>&nbsp;liniach znajdują się zapytania w postaci 3 sł&oacute;w (<strong>S</strong>,&nbsp;<strong>A</strong>,&nbsp;<strong>B</strong>).</p>

<p>Możesz założyć, że długość najdłuższego słowa kt&oacute;re pojawi się na wejściu nie przekroczy 20 znak&oacute;w. Dodatkowo wszystkie słowa będą składać się tylko z małych liter alfabetu angielskiego.</p>

### 출력

<p>Dla każdego zapytania&nbsp;(<strong>S</strong>,&nbsp;<strong>A</strong>,&nbsp;<strong>B</strong>)&nbsp;wypisz jedną linię zawierającą:</p>

<ul>
	<li>&quot;?&quot; jeśli nie da się wywnioskować tłumaczenia słowa&nbsp;<strong>S</strong>&nbsp;na język&nbsp;<strong>B</strong>.</li>
	<li>Wszystkie tłumaczenia słowa&nbsp;<strong>S</strong>&nbsp;na język<strong>&nbsp;B</strong>&nbsp;w kolejności leksykograficznej, oddzielone przecinkami.&nbsp;</li>
</ul>

<p>Możesz założyć, że nie trzeba będzie wypisywać więcej niż 20 MB danych.</p>