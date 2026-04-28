# [Gold II] Reakcje chemiczne - 8622

[문제 링크](https://www.acmicpc.net/problem/8622)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 10, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

방향 비순환 그래프, 그래프 이론, 위상 정렬

### 문제 설명

<p>Bajtek od niedawna uczy się chemii i bardzo go ten przedmiot zafascynował. Postanowił nawet stworzyć własne laboratorium. Już skompletował pewien zestaw związk&oacute;w chemicznych oraz narzędzi do przeprowadzania r&oacute;żnych reakcji. Chciałby teraz pomnożyć swoje zasoby i jest ciekaw, ile r&oacute;żnych związk&oacute;w chemicznych, jakich jeszcze nie posiada, jest w stanie wyprodukować przy użyciu tego, co ma do dyspozycji.</p>

<p>Ponieważ jednak matematyka nie jest jego dobrą stroną, Bajtek poprosił Ciebie o napisanie programu, kt&oacute;ry wyznaczy liczbę tych związk&oacute;w. Dla uproszczenia zakładamy, że każdy spośr&oacute;d już skompletowanych związk&oacute;w chemicznych Bajtek posiada w nieskończonej ilości.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia opis posiadanych przez Bajtka związk&oacute;w chemicznych oraz reakcji, jakie jest on w stanie przeprowadzić,</li>
	<li>wyznaczy liczbę związk&oacute;w chemicznych, kt&oacute;rych Bajtek jeszcze nie ma, ale kt&oacute;re jest w stanie wyprodukować,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszym wierszu wejścia znajdują się trzy liczby całkowite $n$, $k$&nbsp;oraz $r$&nbsp;($1 &le; n &le; 1\,000\,000$, $1 &le; k &le; n$, $1 &le; r &le; 100\,000$), pooddzielane pojedynczymi odstępami i oznaczające odpowiednio: liczbę znanych Bajtkowi związk&oacute;w chemicznych, liczbę związk&oacute;w chemicznych posiadanych przez Bajtka oraz liczbę reakcji, jakie jest on w stanie przeprowadzić. W drugim wierszu znajduje się $k$&nbsp;liczb całkowitych $a_i$&nbsp;($1 &le; a_i &le; n$), pooddzielanych pojedynczymi odstępami i oznaczających numery związk&oacute;w chemicznych posiadanych przez Bajtka. Numery te są parami r&oacute;żne.</p>

<p>W każdym z następnych $r$&nbsp;wierszy znajduje się opis jednej reakcji, jaką potrafi wykonać Bajtek. Opis każdej reakcji składa się z opisu jej substrat&oacute;w (związk&oacute;w chemicznych potrzebnych jako składniki do jej przeprowadzenia) oraz następującego po nim opisu produkt&oacute;w. Opis substrat&oacute;w składa się z liczby całkowitej $s_j$&nbsp;($1 &le; s_j &le; 10$) oznaczającej liczbę substrat&oacute;w tej reakcji, po kt&oacute;rej następuje $s_j$&nbsp;numer&oacute;w związk&oacute;w chemicznych, potrzebnych do przeprowadzenia reakcji. Następnie w tym samym wierszu znajduje się opis produkt&oacute;w. Składa się on z liczby całkowitej $p_j$&nbsp;($1 &le; p_j &le; 10$), oznaczającej liczbę produkt&oacute;w reakcji, po kt&oacute;rej następuje $p_j$&nbsp;numer&oacute;w związk&oacute;w chemicznych, jakie otrzymuje się po przeprowadzeniu $j$-tej reakcji. Każdy z numer&oacute;w związk&oacute;w chemicznych uczestniczących w reakcji (zar&oacute;wno substrat&oacute;w, jak i produkt&oacute;w) jest liczbą całkowitą z zakresu od $1$&nbsp;do $n$&nbsp;włącznie. Numery substrat&oacute;w dowolnej reakcji są parami r&oacute;żne; podobnie numery produkt&oacute;w też są parami r&oacute;żne. Może się jednak zdarzyć, że jakiś związek jest jednocześnie substratem i produktem reakcji (może on w&oacute;wczas być jej katalizatorem). Wszystkie liczby występujące w opisie jednej reakcji są pooddzielane pojedynczymi odstępami.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę całkowitą, oznaczającą liczbę związk&oacute;w chemicznych, kt&oacute;rych Bajtek jeszcze nie posiada, ale potrafi wyprodukować z już posiadanych związk&oacute;w za pomocą odpowiednich reakcji chemicznych.</p>

### 힌트

<p>W powyższym przykładzie Bajtek potrafi przeprowadzić następujące reakcje:</p>

<ol>
	<li>$1 + 2 \rarr 3 + 4$</li>
	<li>$4 + 1 \rarr 3$</li>
	<li>$2 + 3 \rarr 2 + 1 + 5$</li>
	<li>$5 + 6 \rarr 1 + 8 + 2$</li>
</ol>

<p>Na początku posiada on związki $1$&nbsp;i $2$, przy użyciu pierwszej reakcji może otrzymać związki $3$&nbsp;oraz $4$, a następnie, przeprowadzając trzecią reakcję, może wyprodukować związek $5$. Natomiast związk&oacute;w $6$, $7$&nbsp;ani $8$&nbsp;nie jest on w stanie otrzymać.</p>