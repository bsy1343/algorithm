# [Silver I] Ustawiony turniej - 8565

[문제 링크](https://www.acmicpc.net/problem/8565)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 30, 정답: 11, 맞힌 사람: 8, 정답 비율: 38.095%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 강한 연결 요소

### 문제 설명

<p>Turniejem nazwiemy cykl rozgrywek pomiędzy <em>n</em>&nbsp;zawodnikami, w kt&oacute;rym po każdym meczu pomiędzy dwoma zawodnikami przegrywający odpada z dalszych rozgrywek, a wygrywający pozostaje w turnieju (każdy mecz musi zostać rozstrzygnięty, nie ma remis&oacute;w). Turniej kończy się, gdy pozostanie w nim dokładnie jeden zawodnik - zwycięzca. Wyznaczenie harmonogramu spotkań w turnieju należy do Naczelnej Federacji Sportowej (NFS). Członkowie tej federacji mają prawo wskazać, kt&oacute;rzy zawodnicy rozgrywają pierwszy mecz. Następnie, gdy znany jest już wynik pierwszego spotkania, wskazują, kt&oacute;rzy zawodnicy (z pozostałych w turnieju) spotykają się w drugim meczu. Następnie wyznaczają przeciwnik&oacute;w w trzecim meczu, itd. aż w turnieju pozostanie tylko jeden zawodnik. Łatwo zauważyć, że o zwycięstwie w turnieju decyduje nie tylko wytrenowanie i umiejętności zawodnik&oacute;w, ale r&oacute;wnież &quot;szczęście&quot; - tzn. harmonogram rozgrywek. Wiedzą o tym r&oacute;wnież członkowie NFS. Ponadto to wysokie gremium wykorzystało odpowiednio okres trening&oacute;w, obserwując uważnie osiągnięcia zawodnik&oacute;w i szacując ich szansę w nadchodzącym turnieju. W chwili obecnej, u progu sezonu, wiadomo już, że wyniki ewentualnych spotkań pomiędzy pewnymi zawodnikami są z g&oacute;ry przesądzone. Dysponując taką informacją, NFS zastanawia się, czy można ułożyć harmonogram spotkań w ten spos&oacute;b, by doprowadzić do wygranej pewnego, wybranego zawodnika&nbsp;<em>x</em>, tzn. tak zaplanować mecze, by <em>x</em>&nbsp;spotykał się tylko z takimi przeciwnikami, z kt&oacute;rymi na pewno wygra (to oczywiście sprawi, że&nbsp;<em>x</em>&nbsp;wygra cały turniej). Gdyby się to udało, to powiemy, że&nbsp;<b><i>turniej jest ustawiony dla zawodnika</i></b>&nbsp;<em>x</em>.</p>

<p>Twoim zadaniem jest napisanie programu, kt&oacute;ry pozwoli wyznaczyć grupę zawodnik&oacute;w (ich liczbę), dla kt&oacute;rych można ustawić turniej.</p>

### 입력

<p>Program powinien czytać dane ze standardowego wejścia. W pierwszym wierszu podana jest liczba <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 1 000), kt&oacute;ra oznacza liczbę zawodnik&oacute;w biorących udział w turnieju. Zawodnik&oacute;w będziemy oznaczać liczbami 1, 2, ..., <em>n</em>. W następnym wierszu podana jest lista zawodnik&oacute;w, kt&oacute;rzy na pewno wygrywają w bezpośrednim spotkaniu z zawodnikiem 1. Lista składa się z liczby <em>m</em>&nbsp;(oznaczającej liczbę zawodnik&oacute;w &quot;lepszych&quot; od zawodnika 1) i następujących po niej numer&oacute;w zawodnik&oacute;w <em>n</em><sub>1</sub>, <em>n</em><sub>2</sub>, ..., <em>n<sub>m</sub></em>. Wszystkie te liczby oddzielone są pojedynczymi odstępami. W kolejnych wierszach podane są analogiczne listy dla zawodnik&oacute;w 2, 3, ..., <em>n</em>.</p>

<ul>
	<li><b><i>Uwaga 1:</i></b>&nbsp;Fakt, że zawodnik <em>a</em>&nbsp;przegrałby z zawodnikiem <em>b</em>, a&nbsp;<em>b</em>&nbsp;z <em>c</em>, nie musi oznaczać, że <em>a</em>&nbsp;przegrałby z <em>c</em>, gdyby doszło do bezpośredniego spotkania między nimi.</li>
	<li><b><i>Uwaga 2:</i></b>&nbsp;W danych nie ma takich paradoksalnych sytacji, że zawodnik <em>a</em>&nbsp;znajduje się na liście lepszych od zawodnika <em>b</em>&nbsp;i jednocześnie zawodnik&nbsp;<em>b</em>&nbsp;jest na liście zawodnika <em>a</em>.</li>
</ul>

### 출력

<p>Program powinien wypisać wynik na standardowe wyjście. Wynikiem powinna być jedna liczba oznaczająca liczbę zawodnik&oacute;w, dla kt&oacute;rych można &quot;ustawić&quot; turniej.</p>