# [Gold II] Skarb - 7953

[문제 링크](https://www.acmicpc.net/problem/7953)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 8, 맞힌 사람: 7, 정답 비율: 58.333%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>W starej karczmie nabyłeś właśnie mapę, kt&oacute;ra ma Cię doprowadzić do fantastycznego skarbu Montezumy. Okazało się, że Aztekowie ukryli skarb na płaskowyżu w Andach &ndash; kraju Ink&oacute;w. Płaskowyż ma kształt prostokąta i zawiera wiele niebezpiecznych rozpadlin. Na mapie jest zaznaczona pozycja, z kt&oacute;rej należy rozpocząć poszukiwania oraz pozycja skarbu.</p>

<p>Mapa podana jest jako tablica w &times; k znak&oacute;w. Z danego pola możemy przejść na pole po lewej, po prawej, w g&oacute;rę lub w d&oacute;ł. Chcemy znaleźć drogę do skarbu tak, aby ominąć rozpadliny. Ponadto musi być ona najkr&oacute;tsza. Aby odkrywca skarbu nie został objęty klątwą Montezumy musi dotrzeć do skarbu taką spośr&oacute;d najkr&oacute;tszych dr&oacute;g, kt&oacute;ra po zapisaniu jako ciąg znak&oacute;w <code>L</code>, <code>P</code>, <code>G</code>, <code>D</code> (odpowiadających odpowiednio ruchom w lewo, prawo, g&oacute;rę i d&oacute;ł) jest pierwsza w porządku leksykograficznym.</p>

<p>Jako informatyk uważasz, że szukanie jej ręcznie byłoby zbyt nużące i chcesz napisać program, kt&oacute;ry to zrobi.</p>

### 입력

<p>Pierwsza linia wejścia zawiera małą liczbę całkowitą z &ndash; liczbę zestaw&oacute;w danych występujących kolejno po sobie. Opis jednego zestawu jest następujący:</p>

<p>W pierwszym wierszu zawiera on dwie liczby całkowite w i k (1 &le; w, k &le; 1000). Jest to odpowiednio liczba wierszy i kolumn mapy. Każdy z następnych w wierszy zawiera k znak&oacute;w &ndash; jest to zawartość mapy. Znaczenie znak&oacute;w jest następujące:</p>

<ul>
	<li><code>.</code> - zwykły fragment płaskowyżu</li>
	<li><code>X</code> - fragment płaskowyżu zawierający rozpadlinę</li>
	<li><code>S</code> - Twoja pozycja startowa</li>
	<li><code>*</code> - pozycja skarbu</li>
</ul>

### 출력

<p>Dla każdego zestawu danych wypisz jedną linię zawierającą opis najkr&oacute;tszej drogi z pozycji startowej do skarbu. Jeżeli jest wiele takich dr&oacute;g to wypisz pierwszą w kolejności leksykograficznej. Gdy do skarbu nie można dotrzeć z pozycji startowej wypisz słowo BRAK.</p>