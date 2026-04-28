# [Gold III] Podzielność - 8777

[문제 링크](https://www.acmicpc.net/problem/8777)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 3, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

방향 비순환 그래프, 그래프 이론, 위상 정렬

### 문제 설명

<p>Hektor uwielbia zadawać Wiktorowi wszelkiej maści zagadki. Dziś Wiktora czeka zadanie szczeg&oacute;lnie trudne, bo jego kolega wymyślił zupełnie nowy rodzaj łamigł&oacute;wek.</p>

<p>Hektor napisał na kartce&nbsp;<strong>N</strong>&nbsp;r&oacute;żnych niezerowych liczb naturalnych i każdą z nich otoczył k&oacute;łkiem. Następnie narysował strzałki prowadzące od liczby&nbsp;<strong>a</strong>&nbsp;do liczby&nbsp;<strong>b</strong>&nbsp;dla każdej pary takich liczb (<strong>a</strong>,<strong>b</strong>), że&nbsp;<strong>a</strong>&nbsp;dzieli&nbsp;<strong>b</strong>. Na końcu Hektor zamazał liczby wpisane do k&oacute;łek.</p>

<p>Łamigł&oacute;wka polega na znalezieniu&nbsp;<strong>N</strong>&nbsp;r&oacute;żnych niezerowych liczb naturalnych i przypisaniu ich do p&oacute;l tak, aby narysowane przez Hektora strzałki się zgadzały, tj. łączyły wszystkie te (i żadne inne) pary liczb, w kt&oacute;rych liczba na początku strzałki dzieli liczbę na końcu strzałki.</p>

<p>Uwaga: Wszystkie liczby w znalezionym rozwiązaniu muszą mieć nie więcej niż tysiąc cyfr&nbsp;(przy czym gwarantujemy, że dla każdych spełniających ograniczenia danych wejściowych, dla kt&oacute;rych istnieje poprawne rozwiązanie, istnieje r&oacute;wnież poprawne rozwiązanie w kt&oacute;rym wszystkie liczby mają nie więcej niż&nbsp;<strong>sto</strong>&nbsp;cyfr, więc jest to ograniczenie dość luźne).&nbsp;</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) opisująca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>Pierwsza linia zestawu składa się z liczb&nbsp;<strong>N</strong>&nbsp;oraz&nbsp;<strong>M</strong>&nbsp;( 1 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 50, 0 &lt;=&nbsp;<strong>M</strong>&nbsp;), oznaczających kolejno liczbę k&oacute;łek do uzupełnienia oraz liczbę strzałek narysowanych przez Hektora. W kolejnych&nbsp;<strong>M</strong>&nbsp;wierszach opisane są strzałki. Opis strzałki składa się z dw&oacute;ch r&oacute;żnych, oddzielonych od siebie spacją liczb naturalnych&nbsp;<strong>a</strong>&nbsp;i&nbsp;<strong>b&nbsp;</strong>( 1 &lt;=&nbsp;<strong>a</strong>,&nbsp;<strong>b</strong>&nbsp;&lt;=&nbsp;<strong>N</strong>,&nbsp;<strong>a</strong>&nbsp;r&oacute;żne od&nbsp;<strong>b</strong>), oznaczających odpowiednio: numer początkowego k&oacute;łka strzałki i numer końcowego k&oacute;łka strzałki.&nbsp;Lista nie będzie zawierać powtarzających się strzałek.</p>

### 출력

<p>Dla każdego zestawu, jeśli istnieje spos&oacute;b prawidłowego przypisania liczb do k&oacute;łek, należy w pierwszej linii wypisać słowo &quot;TAK&quot;, a następnie w&nbsp;<strong>N</strong>&nbsp;kolejnych liniach wypisać liczby przyporządkowane do poszczeg&oacute;lnych p&oacute;l, w kolejności od pierwszego do&nbsp;<strong>N</strong>-tego pola. Każda wypisana liczba musi mieć nie więcej niż tysiąc cyfr.&nbsp;</p>

<p>Jeśli rozwiązanie nie istnieje, należy w osobnej linii wypisać słowo &quot;NIE&quot;.</p>