# [Gold IV] Ciastka - 8828

[문제 링크](https://www.acmicpc.net/problem/8828)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 38, 정답: 18, 맞힌 사람: 14, 정답 비율: 41.176%

### 분류

브루트포스 알고리즘, 정렬, 누적 합

### 문제 설명

<p>Hektor ze Zbyszkiem codziennie rano wybierają się po ciastka. Ciastkarz przygotowuje każdorazowo N ciastek, z kt&oacute;rych każde opisuje jedna liczba naturalna reprezentująca jego jakość. Chłopcy na zmianę wybierają po jednym ciastku, zawsze wybierając najlepsze z dostępnych jeszcze ciastek.</p>

<p>W tym tygodniu na Zbyszka przypada kolej dokonywania pierwszego wyboru, co jest zdaniem Hektora bardzo niesprawiedliwe.&nbsp;Hektor chciałby, żeby przewaga Zbyszka (suma jakości ciastek wybranych przez Zbyszka pomniejszona o sumę jakości ciastek Hektora) była możliwie mała. Aby osiągnąć ten cel postanowił uciec się do drobnej manipulacji.&nbsp;</p>

<p>Hektor zadzwonił wcześnie rano do kończącego pracę ciastkarza i zapytał o ciastka przygotowane na dzisiaj. Ciastkarz bardzo lubi Hektora i może na jego prośbę uzupełnić ten zbi&oacute;r o jeszcze jedno jedno ciastko wybranej przez Hektora jakości.</p>

<p>Znając jakości przygotowanych ciastek i mogąc uzupełnić ten zbi&oacute;r o maksymalnie jedno ciastko dowolnej ( naturalnej ) jakości oblicz minimalną osiągalną przewagę Zbyszka nad Hektorem.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba zestaw&oacute;w testowych Z ( 1 &lt;= Z&lt;= 10 ). Następniepodawane są kolejne zestawy testowe.</p>

<p>Każdy zestaw zaczyna się od liczby naturalnej N ( 1 &lt;= N &lt;= 1000000 ) oznaczającej liczbę ciastek przygotowanych przez ciastkarza.</p>

<p>W drugiej linii zestawu znajduje się N liczb naturalnych A<sub>i&nbsp;</sub>reprezentujących jakości kolejnych ciastek ( 1 &lt;= A<sub>i</sub>&nbsp;&lt;= 1000 ).</p>

### 출력

<p>Dla każdego przypadku testowego wypisz w osobnej linii minimalną r&oacute;żnicę pomiędzy jakością ciastek Zbyszka a jakością ciastek Hektora.</p>