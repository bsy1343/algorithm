# [Silver IV] Szkoła - 33820

[문제 링크](https://www.acmicpc.net/problem/33820)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 25, 정답: 17, 맞힌 사람: 12, 정답 비율: 66.667%

### 분류

브루트포스 알고리즘, 정렬

### 문제 설명

<p>Algolina i Bajtazar przeprowadzają się do Bajtowa i szukają dla siebie nowego lokum. W Bajtowie jest tylko jedna, długa droga, przy której stoi $n$ budynków. Ponumerujmy je liczbami od $1$ do $n$. Część z nich oferuje mieszkania na wynajem, ale niektóre z nich są w pełni zamieszkałe (o takich budynkach będziemy mówić, że są zajęte).</p>

<p>Zajęte budynki możemy opisać za pomocą $m$ <strong>rozłącznych</strong> przedziałów numerów $[l_i , r_i ]$. Oznacza to, że jeśli numer budynku $x$ spełnia $l_i ≤ x ≤ r_i$, to budynek o numerze $x$ jest zajęty.</p>

<p>Algolina i Bajtazar muszą rozważyć wiele czynników przy wyborze ich lokum, a jednym z nich jest bliskość szkoły, do której będzie chodził ich syn Bajtek. Szkoła ta znajduje się w budynku o numerze $s$ (gwarantujemy, że ten budynek jest zajęty).</p>

<p>Bajtek jest jeszcze mały i rodzice nie chcą, aby musiał zbyt daleko jechać do szkoły. Z tego powodu chcą wybrać wolny budynek, który leży jak najbliżej przyszłej szkoły Bajtka. Zakładamy, że odległości między kolejnymi budynkami są zawsze takie same. To oznacza, że rodzice Bajtka chcą znaleźć budynek o numerze $p$, taki że $|s - p|$ jest jak najmniejsze.</p>

### 입력

<p>W pierwszym wierszu znajdują się trzy liczby całkowite $n$, $m$ oraz $s$ ($2 ≤ n ≤ 10^{12}$, $1 ≤ m ≤ 1000$, $1 ≤ s ≤ n$), oznaczające odpowiednio: liczbę budynków w Bajtowie, liczbę przedziałów numerów zajętych budynków oraz numer budynku, w którym znajduje się przyszła szkoła Bajtka.</p>

<p>W następnych $m$ wierszach znajdują się opisy kolejnych przedziałów numerów zajętych budynków, gdzie $i$-ty z tych opisów składa się z dwóch liczb całkowitych $l_i$, $r_i$ ($1 ≤ l_i ≤ r_i ≤ n$). Dla każdej pary $i$, $j$ ($1 ≤ i &lt; j ≤ m$) zachodzi $r_i &lt; l_j$ lub $r_j &lt; l_i$, co oznacza, że podane przedziały są rozłączne. Dodatkowo gwarantujemy, że w Bajtowie istnieje budynek, który jest wolny.</p>

### 출력

<p>Na wyjściu powinna znaleźć się jedna liczba całkowita $p$ oznaczająca numer budynku, w którym powinni zamieszkać Algolina i Bajtazar, aby zminimalizować $|s - p|$. Jeśli istnieje wiele takich liczb $p$, należy wypisać tę, która jest najmniejsza.</p>

### 힌트

<p>Wyjaśnienie przykładów: W pierwszym przykładzie budynki o numerach $p = 4$ oraz $p = 10$ są najbliższymi do szkoły, wolnymi budynkami. Zatem odpowiedź to $p = 4$, ponieważ z wielu wartości $p$ minimalizujących $|s - p|$ mamy wybrać tę najmniejszą.</p>

<p>W drugim przykładzie jedyny wolny budynek osiągający najmniejszą odległość do szkoły (równą $5$) to budynek o numerze $14$.</p>