# [Gold III] Wycieczka górska - 26685

[문제 링크](https://www.acmicpc.net/problem/26685)

### 성능 요약

시간 제한: 7 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 10, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Grupa k znajomych podr&oacute;żnik&oacute;w pojechała w G&oacute;ry Bajtowe. Ostatniego dnia postanowili zorganizować wyścig ze schroniska, w kt&oacute;rym się znajdują, na szczyt G&oacute;ry Kratowej.</p>

<p>Każdy znajomy posiada mapę terenu, kt&oacute;ra jest prostokątem podzielonym na n wierszy i m kolumn; łącznie mapa zawiera więc n &middot; m obszar&oacute;w. Schronisko znajduje się w obszarze w lewym g&oacute;rnym rogu mapy, zaś szczyt g&oacute;ry w obszarze w prawym dolnym rogu mapy. G&oacute;ra Kratowa jest słynna z bardzo r&oacute;wnomiernego podejścia &ndash; dla dowolnego obszaru mapy obszary sąsiadujące z nim na mapie od prawej lub od dołu są położone wyżej nad poziomem morza, a obszary sąsiadujące od lewej lub od g&oacute;ry są położone niżej. Ale g&oacute;ra jest r&oacute;wnież znana z wielu niebezpieczeństw, kt&oacute;re czyhają na amator&oacute;w g&oacute;rskich wspinaczek. Niekt&oacute;re obszary są oznaczone na mapie jako bardzo niebezpieczne, gdyż są zamieszkałe przez dzikie zwierzęta &ndash; lepiej więc na nie nie wchodzić. . .</p>

<p>Jesteś opiekunem schroniska u podn&oacute;ża G&oacute;ry Kratowej. Obserwując każdego z k podr&oacute;żnik&oacute;w, udało Ci się każdemu z nich przypisać dwa parametry a<sub>i</sub> i b<sub>i</sub> określające jego prędkość poruszania się po zboczu g&oacute;ry. Dokładniej, i-temu podr&oacute;żnikowi przejście z dowolnego bezpiecznego obszaru do obszaru sąsiadującego bokiem zajmuje a<sub>i</sub> minut, jeśli podr&oacute;żnik idzie do obszaru położonego wyżej, zaś b<sub>i</sub> minut, jeśli idzie on do obszaru położonego niżej. Wiesz też, że każdy z uczestnik&oacute;w wyścigu wybierze najszybszą dla niego trasę ze schroniska na szczyt g&oacute;ry, kt&oacute;ra w całości znajduje się na mapie terenu oraz kt&oacute;ra omija wszystkie niebezpieczne obszary.</p>

<p>Zastanawiasz się, ile czasu zajmie najszybszej osobie dotarcie na szczyt g&oacute;ry oraz ile os&oacute;b wejdzie na szczyt w tym samym momencie, co zwycięzca. Możesz założyć, że istnieje co najmniej jedna bezpieczna trasa ze schroniska na szczyt.</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się trzy dodatnie liczby całkowite n, m oraz k (2 &le; n, m &le; 2000, 1 &le; k &le; 10<sup>6</sup>) oznaczające rozmiar mapy i liczbę znajomych. Kolejne n wierszy zawiera opis kolejnych wierszy mapy od g&oacute;ry do dołu: każdy z nich składa się z napisu zawierającego m znak&oacute;w <code>.</code> (kropka) lub <code>X</code>, oznaczających typy kolejnych obszar&oacute;w w danym wierszu:</p>

<ul>
	<li>Znak <code>.</code> oznacza obszar bezpieczny.</li>
	<li>Znak <code>X</code> oznacza obszar zamieszkały przez dzikie zwierzęta.</li>
</ul>

<p>Kolejne k wierszy opisuje poszczeg&oacute;lnych znajomych; i-ty z nich zawiera dwie liczby całkowite a<sub>i</sub>, b<sub>i</sub> (1 &le; a<sub>i</sub>, b<sub>i</sub> &le; 10<sub>9</sub>) oznaczające odpowiednio czas (w minutach) wchodzenia pod g&oacute;rę i schodzenia w d&oacute;ł i-tego podr&oacute;żnika.</p>

<p>Schronisko znajduje się w lewym g&oacute;rnym rogu mapy, na przecięciu pierwszego wiersza i pierwszej kolumny opisu. Szczyt g&oacute;ry znajduje się w prawym dolnym rogu mapy, na przecięciu n-tego wiersza i m-tej kolumny opisu. Możesz założyć, że obszary zawierające schronisko oraz szczyt g&oacute;ry są bezpieczne oraz że istnieje co najmniej jedna ścieżka pomiędzy tymi obszarami składająca się z samych bezpiecznych obszar&oacute;w.</p>

### 출력

<p>W pierwszym i jedynym wierszu wyjścia należy wypisać dwie liczby: czas zwycięzcy wyścigu w minutach oraz liczbę podr&oacute;żnik&oacute;w, kt&oacute;rzy osiągną dokładnie taki czas.</p>

### 힌트

<p>Wyjaśnienie drugiego przykładu: Istnieje tylko jedna ścieżka ze schroniska na szczyt G&oacute;ry Kratowej. Podążając nią, kolejni podr&oacute;żnicy wejdą na szczyt: po 13 minutach, po 14 minutach, po 13 minutach i po 13 minutach.</p>