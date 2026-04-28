# [Silver II] Architektura niezależna - 8783

[문제 링크](https://www.acmicpc.net/problem/8783)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 116, 정답: 53, 맞힌 사람: 48, 정답 비율: 48.000%

### 분류

너비 우선 탐색, 깊이 우선 탐색, 플러드 필, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Monika jest artystką - architektem. Każdy z zaprojektowanych przez nią budynk&oacute;w to dzieło sztuki. Monika jest pełna pasji i tworzy jeden projekt za drugim, zawsze jednak realizuje własne pomysły, w og&oacute;le nie projektując budynk&oacute;w na zam&oacute;wienie.</p>

<p>Jak jednak wiadomo, trzeba z czegoś żyć. Monika postanowiła sprzedawać swoje prace zainteresowanym, nie łamiąc przy tym swoich zasad - jeśli ktoś chce kupić od Moniki projekt, musi liczyć na to, że stworzyła już kiedyś coś, co będzie odpowiadało jego potrzebom.&nbsp;Aby ułatwić przeszukiwanie zbioru projekt&oacute;w pod kątem potrzeb klienta, Monika chciałaby sprawnie obliczyć powierzchnię każdego z zaprojektowanych przez siebie budynk&oacute;w.</p>

<p>Każdy projekt ma postać regularnej siatki na planie kwadratu o wymiarach&nbsp;<strong>N</strong>&nbsp;wierszy na&nbsp;<strong>N</strong>&nbsp;kolumn, zawierającej&nbsp;<strong>N</strong><sup>2</sup>&nbsp;p&oacute;l, z kt&oacute;rych każde jest albo wolnym polem, albo ścianą budynku. Wolne pola oznaczamy znakiem kropki (&#39;.&#39;), natomiast ściany budynku znakiem hash (&#39;#&#39;) (por. przykład).</p>

<p>Ściany budynku tworzą łamaną zamkniętą bez samoprzecięć - każde pole zawierające ścianę sąsiaduje (od g&oacute;ry, dołu, z prawej lub lewej strony) z dokładnie dwoma polami zawierającymi ściany, kt&oacute;re stanowią sąsiad&oacute;w danego pola na łamanej opisującej kształt budynku.</p>

<p>Znając projekt budynku oblicz jego powierzchnię, tj. łączną liczbę p&oacute;l stanowiących ścianę budynku oraz wolnych p&oacute;l wewnątrz budynku.</p>

### 입력

<p>W pierwszej linii znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) opisująca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>W pierwszej linii opisu pojedynczego zestawu testowego znajduje się jedna liczba naturalna&nbsp;<strong>N</strong>&nbsp;( 3 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 1000 ) oznaczająca wymiary projektu Moniki. W&nbsp;<strong>N</strong>&nbsp;kolejnych liniach podawany jest opis projektu wg opisanej w treści zadania składni.</p>

### 출력

<p>Dla każdego zestawu testowego należy w osobnej linii wypisać powierzchnię budynku opisywanego przez projekt.</p>