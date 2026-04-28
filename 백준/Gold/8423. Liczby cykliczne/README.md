# [Gold I] Liczby cykliczne - 8423

[문제 링크](https://www.acmicpc.net/problem/8423)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 39, 정답: 14, 맞힌 사람: 11, 정답 비율: 42.308%

### 분류

수학, 정수론

### 문제 설명

<p>Ponieważ bajtoccy naukowcy chcą się zawsze prezentować jak najlepiej i wykazywać wieloma osiągnięciami, Międzymiastowe K&oacute;łko Bajtockich Sumator&oacute;w postanowiło zademonstrować swoje intelektualne możliwości i wyznaczyć jak najwięcej tzw. ,,liczb cyklicznych&#39;&#39;. Dodatkowo postanowiono nie korzystać z żadnych urządzeń elektrycznych, co niestety wydłużyło czas pracy K&oacute;łka, gdyż nie można było używać nawet lamp do oświetlania sal w nocy.</p>

<p>Niestety członkowie MKBS pracują już od tygodnia, a praca niespecjalnie posuwa się do przodu. Ponieważ do K&oacute;łka należy pewien Bardzo Ważny Bajtota, bez kt&oacute;rego funkcjonowanie państwa jest mocno utrudnione, życie w Bajtocji zostało sparaliżowane. Niestety skutkiem tego zastoju jest r&oacute;wnież to, że mieszkańcy kt&oacute;rzy nie mogą normalnie funkcjonować, nie wymyślają nowych zadań do rozwiązywania, a to z kolei nie najlepiej wr&oacute;ży Olimpiadzie Informatycznej. Napisz program, kt&oacute;ry pomoże członkom K&oacute;łka i przywr&oacute;ci normalny porządek w państwie. Nie przejmuj się zbytnio, że członkowie postanowili nie używać urządzeń elektrycznych - to Ty użyjesz komputera, a nie oni.</p>

<p>Niech&nbsp;<i>k</i>&nbsp;będzie ustaloną dodatnią liczbą całkowitą, natomiast A dodatnią liczbą całkowitą, kt&oacute;rej zapis dziesiętny składa się z&nbsp;<i>k</i>&nbsp;cyfr, przy czym dopuszczamy, żeby najbardziej znaczące cyfry były zerami. Dwie liczby&nbsp;<i>A</i>&nbsp;= (<i>a</i><sub>1</sub>,&nbsp;<i>a</i><sub>2</sub>,&nbsp;...,&nbsp;<i>a</i><sub>k</sub>)<sub>10</sub>&nbsp;i&nbsp;<i>B</i>&nbsp;= (<i>b</i><sub>1</sub>,&nbsp;<i>b</i><sub>2</sub>,&nbsp;...,&nbsp;<i>b</i><sub>k</sub>)<sub>10</sub>&nbsp;(cyfry na pozycji&nbsp;<i>k</i>&nbsp;są najmniej znaczące, a cyfry na pozycji&nbsp;1&nbsp;najbardziej znaczące) nazywamy cyklicznie r&oacute;wnymi, gdy istnieje&nbsp;1 &le;&nbsp;<i>l</i> &le;&nbsp;<i>k</i>&nbsp;takie, że:</p>

<p style="text-align: center;">(<i>a</i><sub>1</sub>,&nbsp;<i>a</i><sub>2</sub>,&nbsp;...,&nbsp;<i>a</i><sub>k</sub>)<sub>10</sub>&nbsp;= (<i>b</i><sub>l</sub>,&nbsp;<i>b</i><sub>l+1</sub>,&nbsp;...,&nbsp;<i>b</i><sub>k</sub>,&nbsp;<i>b</i><sub>1</sub>,&nbsp;<i>b</i><sub>2</sub>,&nbsp;...,&nbsp;<i>b</i><sub>l-1</sub>)<sub>10</sub></p>

<p>to znaczy, gdy wartość liczby&nbsp;<i>A</i>&nbsp;jest r&oacute;wna wartości liczby&nbsp;<i>B</i>&nbsp;po przesunięciu cyfr cyklicznie w lewo o&nbsp;<i>l</i>&nbsp;- 1&nbsp;pozycji. Liczbę&nbsp;<i>A</i>&nbsp;o&nbsp;<i>k</i>&nbsp;cyfrach nazywamy liczbą cykliczną, jeżeli wszystkie pary liczb ze zbioru&nbsp;{1<sup>&nbsp;.&nbsp;</sup><i>A</i>,&nbsp;2<sup>&nbsp;.&nbsp;</sup><i>A</i>,&nbsp;...,&nbsp;<i>k</i><sup>&nbsp;.&nbsp;</sup><i>A</i>}&nbsp;są cyklicznie r&oacute;wne. Rodziną liczby cyklicznej&nbsp;<i>A</i>&nbsp;nazywamy wszystkie liczby&nbsp;1<sup>&nbsp;.&nbsp;</sup><i>A</i>,&nbsp;2<sup>&nbsp;.&nbsp;</sup><i>A</i>,&nbsp;...,&nbsp;<i>k</i><sup>&nbsp;.&nbsp;</sup><i>A</i>.</p>

<p>Napisz program kt&oacute;ry:</p>

<ul>
	<li>wczyta dodatnią liczbę całkowitą&nbsp;<i>n</i>,</li>
	<li>dla liczby&nbsp;<i>n</i>&nbsp;wyznaczy najmniejszą liczbę&nbsp;<i>B</i> &ge;&nbsp;<i>n</i>, dla kt&oacute;rej istnieje&nbsp;<i>k</i>&nbsp;&ge;&nbsp;1&nbsp;takie, że&nbsp;<i>B</i>&nbsp;należy do rodziny pewnej&nbsp;<i>k</i>-cyfrowej liczby cyklicznej&nbsp;<i>A</i>&nbsp;lub stwierdzi, że takie&nbsp;<i>B</i>&nbsp;nie istnieje,</li>
	<li>wypisze obliczoną liczbę&nbsp;<i>B</i>&nbsp;lub słowo BRAK, gdy takiej liczby nie ma.</li>
</ul>

### 입력

<p>W pierwszym i jedynym wierszu wejścia znajduje się jedna liczba naturalna&nbsp;<i>n</i>,&nbsp;1 &le;&nbsp;<i>n</i> &le;&nbsp;10<sup>17</sup>.</p>

### 출력

<p>W pierwszym i jedynym wierszu wyjścia powinna się znajdować dokładnie jedna liczba całkowita&nbsp;<i>B</i>&nbsp;- liczba będąca rozwiązaniem zadania lub słowo&nbsp;<code>BRAK</code>, jeżeli taka liczba nie istnieje.</p>