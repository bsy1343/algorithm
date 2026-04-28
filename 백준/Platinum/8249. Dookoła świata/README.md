# [Platinum I] Dookoła świata - 8249

[문제 링크](https://www.acmicpc.net/problem/8249)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 5, 맞힌 사람: 5, 정답 비율: 27.778%

### 분류

데이크스트라, 그래프 이론, 그리디 알고리즘, 최단 경로

### 문제 설명

<p>Jacek chce oblecieć świat dookoła. Niestety nie ma zbyt wielu pieniędzy, wobec czego chce to zrobić jak najtaniej. Jacek zorientował się, że stosunkowo tanie są loty Bajtolinii Lotniczych, dlatego sprawdził wszystkie połączenia w ich ofercie. Siedzi teraz nad mapą i kombinuje. Pom&oacute;ż mu!</p>

<p>Dane Jacka to lista <em>n</em>&nbsp;miast oraz lista <em>m</em>&nbsp;połączeń między tymi miastami. Dla każdego z miast Jacek zna jego&nbsp;<a href="http://pl.wikipedia.org/wiki/D%C5%82ugo%C5%9B%C4%87_geograficzna">długość geograficzną</a>. Każdy z lot&oacute;w łączy dwa miasta i umożliwia podr&oacute;ż w obydw&oacute;ch kierunkach - jeśli z miasta <em>a</em>&nbsp;do miasta <em>b</em>&nbsp;możemy dolecieć za <em>x</em>&nbsp;bajtalar&oacute;w, to podr&oacute;ż z miasta <em>b</em>&nbsp;do miasta <em>a</em>&nbsp;r&oacute;wnież jest możliwa i kosztuje <em>x</em>&nbsp;bajtalar&oacute;w.</p>

<p>Dla każdego połączenia wiemy, czy samoloty wykonujące to połączenie lecą na zach&oacute;d, czy też na wsch&oacute;d (zakładamy, że żadne dwa miasta nie mają tej samej długości geograficznej). Każdy samolot leci cały czas wprost do celu, a trasa żadnego lotu nie prowadzi nad biegunem i nie okrąża Ziemi w pełni (tj. samolot przebywa mniej niż 360&deg;&nbsp;długości geograficznej).</p>

<p>Powstał jeszcze jeden problem. Co to znaczy &quot;oblecieć świat dookoła&quot;? Jacek ustalił, że chce, aby podczas całej podr&oacute;ży łączna liczba stopni długości geograficznej przebytych na wsch&oacute;d była&nbsp;<i>r&oacute;żna</i>&nbsp;od liczby stopni przebytych w kierunku zachodnim. Jacek planuje rozpocząć i zakończyć podr&oacute;ż w swoim rodzinnym mieście.</p>

<p>Rozważmy następujące przykłady (zakładamy w nich, że wszystkie loty są w rozsądnym kierunku, tj. w tym, w kt&oacute;rym przelatujemy mniej niż 180 stopni):</p>

<ul>
	<li>lot Warszawa (21&deg;E) - Moskwa (37&deg;E) - Tokio (139&deg;E) - Los Angeles (118&deg;W) - Nowy Jork (73&deg;W) - Warszawa (21&deg;E) jest lotem dookoła świata (w trakcie całej podr&oacute;ży lecimy na wsch&oacute;d);</li>
	<li>lot Warszawa (21&deg;E) - Moskwa (37&deg;E) - Tokio (139&deg;E) - Los Angeles (118&deg;W) - Miami (80&deg;W) - Kair (31&deg;E) - Dublin (6&deg;W) - Warszawa (21&deg;E) też jest lotem dookoła świata (na wsch&oacute;d lecimy ponad 360&deg;, zaś na zach&oacute;d jedynie w trakcie lotu z Kairu do Dublina);</li>
	<li>lot Warszawa (21&deg;E) - Moskwa (37&deg;E) - Singapur (103&deg;E) - Los Angeles (118&deg;W) - Miami (80&deg;W) - Kair (31&deg;E) - Delhi (77&deg;E) - Sydney (151&deg;E) - Buenos Aires (58&deg;W) - Johannesburg (28&deg;E) - Warszawa (21&deg;E) jest lotem dookoła świata (na wsch&oacute;d przebywamy ponad 720&deg;, zaś na zach&oacute;d jedynie kilka stopni w trakcie lotu z Johannesburga do Warszawy);</li>
	<li>lot Warszawa (21&deg;E) - Moskwa (37&deg;E) - Singapur (103&deg;E) - Los Angeles (118&deg;W) - Miami (80&deg;W) - Kair (31&deg;E) - Johannesburg (28&deg;E) - Buenos Aires (58&deg;W) - Sydney (151&deg;E) - Delhi (77&deg;E) - Kij&oacute;w (30&deg;E) - Warszawa (21&deg;E)&nbsp;<i>nie</i>&nbsp;jest lotem dookoła świata (liczba stopni przebytych w kierunku wschodnim jest dokładnie taka sama, jak liczba stopni przelecianych na zach&oacute;d).</li>
</ul>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie liczby całkowite <em>n</em>&nbsp;i <em>m</em>&nbsp;(2 &le; <em>n</em> &le; 100 000, 1 &le; <em>m</em> &le; 200 000) oznaczające odpowiednio liczbę miast na mapie Jacka oraz liczbę lot&oacute;w dostępnych w Bajtoliniach Lotniczych. Miasta są ponumerowane liczbami od 1&nbsp;do <em>n</em>. Jacek rozpoczyna podr&oacute;ż w mieście numer 1. W drugim wierszu znajdują się wsp&oacute;łrzędne kolejnych miast podane jako ciąg liczb całkowitych <em>w</em><sub>1</sub>, ..., <em>w<sub>n</sub></em>&nbsp;(0 &le; <em>w<sub>i</sub></em> &le; 1 296 000). Liczba <em>w<sub>i</sub></em>&nbsp;oznacza, ile sekund geograficznych na wsch&oacute;d od południka zerowego leży miasto numer&nbsp;<em>i</em>&nbsp;(1&nbsp;sekunda to 1 / 3600&nbsp;stopnia). Żadne dwa miasta nie mają tej samej długości geograficznej.</p>

<p>Każdy z kolejnych <em>m</em>&nbsp;wierszy opisuje jeden lot. W <em>i</em>-tym z tych wierszy znajdują się cztery liczby całkowite <em>a<sub>i</sub></em>, <em>b<sub>i</sub></em>, <em>x<sub>i</sub></em>, <em>k<sub>i</sub></em>&nbsp;(1 &le; <em>a<sub>i</sub></em>, <em>b<sub>i</sub></em> &le; <em>n</em>, <em>a<sub>i</sub></em> &ne; <em>b<sub>i</sub></em>, 1 &le; <em>x<sub>i</sub></em> &le; 5 000, <em>k<sub>i</sub></em> &isin; {-1, 1}). Oznaczają one, że Bajtolinie oferują przeloty pomiędzy miastami numer <em>a<sub>i</sub></em>&nbsp;oraz&nbsp;<em>b<sub>i</sub></em>&nbsp;w cenie <em>x<sub>i</sub></em>&nbsp;bajtalar&oacute;w i trasa lotu z miasta&nbsp;<em>a<sub>i</sub></em>&nbsp;do miasta&nbsp;<em>b<sub>i</sub></em>&nbsp;prowadzi na wsch&oacute;d (gdy&nbsp;<em>k<sub>i</sub></em>&nbsp;= 1) lub na zach&oacute;d (gdy&nbsp;<em>k<sub>i</sub></em>&nbsp;= -1). Trasa lotu powrotnego prowadzi w przeciwnym kierunku.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście koszt (w bajtalarach) najtańszej podr&oacute;ży dookoła świata, kt&oacute;ra rozpoczyna się i kończy się w mieście numer 1. Jeśli takiej podr&oacute;ży nie ma, program powinien wypisać -1.</p>