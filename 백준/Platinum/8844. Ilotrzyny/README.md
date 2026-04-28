# [Platinum IV] Ilotrzyny - 8844

[문제 링크](https://www.acmicpc.net/problem/8844)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 9, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

자료 구조, 포함 배제의 원리, 수학, 세그먼트 트리

### 문제 설명

<p>Poprzedni sprawdzian z matematyki w klasie Hektora obfitował w błędy w obliczeniach. Z tego też powodu nauczyciel postanowił zrobić kartk&oacute;wkę ze &quot;sprawności rachunkowej&quot;. Zdefiniował w tym celu ilotrzyn jako iloczyn trzech liczb. Następnie napisał na tablicy w rzędzie&nbsp;<strong>n</strong>&nbsp;liczb naturalnych i co jakiś czas albo zastępował jakąś liczbę inną (r&oacute;wnież naturalną), albo polecał uczniom napisać na kartce sumę wszystkich ilotrzyn&oacute;w powstałych z r&oacute;żnych (nie co do wartości, lecz umiejscowienia) liczb z zadanego obszaru na tablicy. Było bardzo mało czasu na rachunki, więc teraz Hektor prosi Cię, abyś sprawdził jego wyniki.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba zestaw&oacute;w testowych&nbsp;<strong>Z</strong>&nbsp;(<strong>Z</strong>&nbsp;= 1).</p>

<p>Następnie jedna liczba naturalna&nbsp;<strong>n</strong>&nbsp;(1 &lt;=&nbsp;<strong>n</strong>&nbsp;&lt;= 200000), a w kolejnej linii&nbsp;<strong>n</strong>&nbsp;liczb naturalnych oddzielonych spacjami - początkowe liczby z tablicy. W następnej linii znajduje się liczba naturalna&nbsp;<strong>q</strong>&nbsp;(1 &lt;=&nbsp;<strong>q</strong>&nbsp;&lt;= 200000), liczba czynności wykonanych przez nauczyciela. W kolejnych&nbsp;<strong>q</strong>&nbsp;liniach znajdują się ich opisy:</p>

<ul>
	<li>Z&nbsp;<strong>a</strong>&nbsp;<strong>b</strong>&nbsp;(1 &lt;=&nbsp;<strong>a</strong>&nbsp;&lt;=&nbsp;<strong>n</strong>, 0 &lt;&nbsp;<strong>b</strong>) - oznacza zastąpienie liczby z pozycji&nbsp;<strong>a</strong>&nbsp;liczbą&nbsp;<strong>b</strong></li>
	<li>Q&nbsp;<strong>a</strong>&nbsp;<strong>b</strong>&nbsp;(1 &lt;=&nbsp;<strong>a</strong>&nbsp;&lt;=&nbsp;<strong>b</strong>&nbsp;&lt;=&nbsp;<strong>n</strong>) - oznacza zapytanie o sumę ilotrzyn&oacute;w z liczb znajdujących się na tablicy o indeksach w przedziale [<strong>a</strong>,<strong>b</strong>]</li>
</ul>

<p>W każdym momencie suma wszystkich liczb na tablicy nie będzie przekraczać miliona.</p>

### 출력

<p>Dla każdego zapytania należy wypisać w osobnej linii jedną liczbę naturalną - sumę wszystkich możliwych ilotrzyn&oacute;w utworzonych z r&oacute;żnych (co do umiejscowienia, nie co do wartości) liczb z tablicy o indeksach w przedziale zadanym przez zapytanie.</p>

### 힌트

<p>Na pierwsze zapytanie odpowiadamy wartością:</p>

<p>1*3*2 + 1*3*2 + 1*2*2 + 3*2*2 = 28</p>

<p>W przedziale z drugiego zapytania są tylko dwie liczby, nie da się więc utworzyć żadnego ilotrzynu. Odpowiedzią na trzecie zapytanie jest liczba: 2*3*2 = 12</p>