# [Silver I] Przeprawa - 8775

[문제 링크](https://www.acmicpc.net/problem/8775)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 36, 정답: 11, 맞힌 사람: 10, 정답 비율: 43.478%

### 분류

그리디 알고리즘, 정렬, 두 포인터

### 문제 설명

<p>Hektor z przyjaci&oacute;łmi postanowił zorganizować wycieczkę na wyspę leżącą na środku pobliskiego jeziora. Aby dostać się na wyspę, należy skorzystać z usług firmy transportowej Ł&oacute;deczka.</p>

<p>Ł&oacute;deczka oferuje przew&oacute;z dwoma rodzajami ł&oacute;dek:</p>

<ul>
	<li>Ł&oacute;dki pierwszego rodzaju pozwalają przewieźć maksymalnie dw&oacute;ch pasażer&oacute;w, przy czym ich łączna waga nie może przekraczać&nbsp;<strong>M</strong>&nbsp;kg. Jednorazowe skorzystanie z takiej łodzi kosztuje&nbsp;<strong>A</strong>&nbsp;zł.</li>
	<li>Ł&oacute;dku drugiego rodzaju mają większą wyporność, ale tylko jedno miejsce pasażerskie. Jednorazowo można taką ł&oacute;dką przewieźć dowolną (jedną) osobę za cenę&nbsp;<strong>B</strong>&nbsp;zł.</li>
</ul>

<p>Znając wagi poszczeg&oacute;lnych uczestnik&oacute;w wyprawy, oblicz minimalny łączny koszt transportu na wyspę wszystkich uczestnik&oacute;w.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) opisująca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>Pierwsza linia opisu zestawu testowego zawiera cztery oddzielone spacjami liczby naturalne&nbsp;<strong>N</strong>,&nbsp;<strong>A</strong>,&nbsp;<strong>B</strong>,<strong>&nbsp;M</strong>&nbsp;( 1 &lt;=&nbsp;<strong>N, M</strong>&nbsp;&lt;= 1000000, 1 &lt;= A, B &lt;= 1000), oznaczające kolejno: liczbę uczestnik&oacute;w wycieczki, koszt jednokrotnego skorzystania z łodzi pierwszego rodzaju, koszt jednokrotnego skorzystania z łodzi drugiego rodzaju oraz maksymalną łączną waga pasażer&oacute;w łodzi pierwszego rodzaju.</p>

<p>W drugiej linii opisu zestawu znajduje się&nbsp;<strong>N</strong>&nbsp;oddzielonych spacjami liczb naturalnych&nbsp;<strong>w<sub>i</sub></strong>&nbsp;( 1 &lt;=<strong>&nbsp;w</strong><strong><sub>i</sub>&nbsp;</strong>&lt;= 1000000)&nbsp;oznaczających wagi kolejnych uczestnik&oacute;w wycieczki.</p>

### 출력

<p>Dla każdego testu należy w osobnej linii wypisać minimalny łączny koszt przeprawy na wyspę wszystkich uczestnik&oacute;w.</p>