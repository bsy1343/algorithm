# [Gold III] Restauracje - 8561

[문제 링크](https://www.acmicpc.net/problem/8561)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 19, 맞힌 사람: 18, 정답 비율: 72.000%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>Bajdonald postanowił uruchomić w Bajtocji sieć restauracji. Jego pragnieniem jest, żeby każdy mieszkaniec m&oacute;gł choćby raz w tygodniu wybrać się do jednej z nich.</p>

<p>Wstępnie zaplanował już, w kt&oacute;rych miastach postawi swoje restauracje. Obawia się jednak, czy z każdego miasta będzie można w rozsądnym czasie dojechać do jakiejkolwiek z nich. Chciałby więc dowiedzieć się, jaką największą odległość trzeba pokonać, żeby dostać się do najbliższej restauracji. Jeśli ta odległość okaże się zbyt duża, będzie musiał zmienić swoje plany.</p>

<p>Miasta w Bajtocji są połączone siecią dwukierunkowych autostrad. Wiadomo, że z każdego miasta można dojechać do każdego innego, choć nie zawsze bezpośrednio. Mieszkańcy Bajtocji żyją tylko w miastach.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia mapę kraju oraz planowane miejsca budowy restauracji,</li>
	<li>wyznaczy maksymalną odległość jaką należy pokonać z pewnego miasta do najbliższej restauracji (to znaczy, spośr&oacute;d wszystkich odległości pomiędzy miastami a najbliższymi restauracjami, należy znaleźć tę największą),</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszym wierszu wejścia znajdują się trzy liczby całkowite <em>n</em>, <em>k</em>&nbsp;i <em>m</em>, 1 &le; <em>n</em>, <em>k</em> &le; 1 000, 1 &le; <em>m</em> &le; 30 000, oddzielone pojedynczymi odstępami, określające odpowiednio - liczbę miast w Bajtocji, liczbę planowanych restauracji oraz liczbę autostrad. Miasta są ponumerowane od 1&nbsp;do <em>n</em>.</p>

<p>W każdym z kolejnych <em>k</em>&nbsp;wierszy znajduje się jedna liczba - numer miasta, w kt&oacute;rym ma być zbudowana restauracja. W każdym z następnych <em>m</em>&nbsp;wierszy znajdują się trzy liczby całkowite <em>a</em>, <em>b</em>&nbsp;i <em>d</em>, oddzielone pojedynczymi odstępami. Liczby te opisują jedną autostradę - autostrada łączy miasta <em>a</em>&nbsp;i <em>b</em>&nbsp;(<em>a</em> &ne; <em>b</em>), a jej długość wynosi <em>d</em>&nbsp;km, 1 &le; <em>d</em> &le; 1 000.</p>

### 출력

<p>W jedynym wierszu standardowego wyjścia powinna zostać zapisana jedna liczba całkowita, r&oacute;wna maksymalnej odlegości (w kilometrach) pomiędzy pewnym miastem, a najbliżej położoną restauracją.</p>