# [Platinum II] Fiolki - 10145

[문제 링크](https://www.acmicpc.net/problem/10145)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 17, 정답: 2, 맞힌 사람: 2, 정답 비율: 28.571%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 트리, 집합과 맵, 깊이 우선 탐색, 분리 집합, 최소 공통 조상, 작은 집합에서 큰 집합으로 합치는 테크닉

### 문제 설명

<p>Bajtazar jest chemikiem. Przeprowadza eksperyment, kt&oacute;rego celem jest uzyskanie specyfiku X - mikstury rozwiązującej wszelkie problemy ludzkości.</p>

<p>Bajtazar posiada <em>n</em>&nbsp;fiolek ponumerowanych liczbami od 1&nbsp;do <em>n</em>, w kt&oacute;rych znajdują się r&oacute;żne płynne substancje. Fiolka o numerze <em>i</em>&nbsp;zawiera całkowitą liczbę gram&oacute;w substancji <em>i</em>. Aby uzyskać specyfik X, należy wykonać sekwencję <em>m</em>&nbsp;krok&oacute;w. Każdy krok polega na przelaniu całej zawartości pewnej fiolki do innej (możemy przy tym założyć, że fiolki mają odpowiednio dużą pojemność, a także, że przy przelewaniu nie uronimy ani kropli). Fiolka, z kt&oacute;rej przelano substancję, jest odstawiana na p&oacute;łkę i nie jest wykorzystywana w dalszej części eksperymentu.</p>

<p>O pewnych parach substancji wiadomo, że reagują ze sobą, tworząc związek chemiczny, kt&oacute;ry wytrąca się w postaci osadu. Dla każdej takiej reakcji, na jeden gram pierwszej substancji przypada jeden gram drugiej, a w jej wyniku powstają dwa gramy osadu. Reakcja trwa, dop&oacute;ki kt&oacute;ryś z jej substrat&oacute;w się nie skończy. Wytrącony osad nie reaguje z żadną substancją i do końca eksperymentu przylega do ścianki fiolki, w kt&oacute;rej powstał. Pewne reakcje dokonują się szybciej niż inne - jeśli wiele substancji znajdzie się naraz w jednym roztworze, reakcje pomiędzy parami substancji wykonują się w ustalonej, znanej Bajtazarowi kolejności. Po każdym kroku Bajtazar czeka, aż substancje w docelowej fiolce przereagują, i dopiero wtedy wykonuje kolejny krok.</p>

<p>Bajtazar zastanawia się, czy sekwencja krok&oacute;w prowadząca do uzyskania specyfiku X jest optymalna. Chciałby wiedzieć, jaka część substrat&oacute;w marnuje się w wyniku wykonania wszystkich krok&oacute;w. Poprosił Cię zatem o pomoc w znalezieniu łącznej liczby gram&oacute;w wytrąconego osadu.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera trzy liczby całkowite <em>n</em>, <em>m</em>&nbsp;oraz <em>k</em>&nbsp;(0 &le; <em>m</em> &lt; <em>n</em> &le; 200 000, 0 &le; <em>k</em> &le; 500 000), oznaczające kolejno: liczbę fiolek (a więc także liczbę r&oacute;żnych substancji), długość sekwencji krok&oacute;w eksperymentu oraz liczbę par substancji, kt&oacute;rej ze sobą reagują, wytrącając osad.</p>

<p>W drugim wierszu znajduje się ciąg <em>n</em>&nbsp;liczb całkowitych <em>g<sub>1</sub></em>, <em>g<sub>2</sub></em>, ..., <em>g<sub>n</sub></em>&nbsp;(1 &le; <em>g<sub>i</sub></em> &le; 10<sup>9</sup>), określających początkową liczbę gram&oacute;w substancji <em>i</em>&nbsp;w fiolce numer <em>i</em>.</p>

<p>W kolejnych <em>m</em>&nbsp;wierszach znajduje się opis sekwencji krok&oacute;w prowadzących do uzyskania specyfiku X: <em>i</em>-ty z tych wierszy zawiera dwie liczby całkowite <em>a<sub>i</sub></em>, <em>b<sub>i</sub></em>&nbsp;(1 &le; <em>a<sub>i</sub></em>, <em>b<sub>i</sub></em> &le; <em>n</em>, <em>a<sub>i</sub></em> &ne; <em>b<sub>i</sub></em>), oznaczające, że <em>i</em>-ty krok polega na przelaniu zawartości fiolki numer&nbsp;<em>a<sub>i</sub></em>&nbsp;do fiolki numer <em>b<sub>i</sub></em>. Można założyć, że jeśli w pewnym kroku wylewamy zawartość fiolki, to ta fiolka nie zostanie użyta w żadnym z kolejnych krok&oacute;w.</p>

<p>W następnych <em>k</em>&nbsp;wierszach znajduje się opis par substancji, kt&oacute;re reagują ze sobą, tworząc osad: <em>i</em>-ty z tych wierszy zawiera dwie liczby całkowite <em>c<sub>i</sub></em>, <em>d<sub>i</sub></em>&nbsp;(1 &le; <em>c<sub>i</sub></em>, <em>d<sub>i</sub></em> &le; <em>n</em>, <em>c<sub>i</sub></em> &ne; <em>d<sub>i</sub></em>) oznaczające, że jeśli substancje <em>c<sub>i</sub></em>&nbsp;i <em>d<sub>i</sub></em>&nbsp;znajdą się jednocześnie w jednej fiolce, to zajdzie między nimi reakcja i wytrąci się osad. Pary substancji podane są w kolejności zgodnej z priorytetem wykonywania reakcji, tzn. w przypadku, gdy w fiolce znajdą się się co najmniej dwie pary reagujących ze sobą substancji, w pierwszej kolejności rozpocznie się (i całkowicie zakończy) reakcja pary substancji podanej na wejściu najwcześniej. Żadna nieuporządkowana para liczb (<em>c<sub>i</sub></em>, <em>d<sub>i</sub></em>)&nbsp;nie powt&oacute;rzy się wśr&oacute;d tych <em>k</em>&nbsp;wierszy.</p>

### 출력

<p>W jedynym wierszu wyjścia powinna się znaleźć jedna liczba całkowita, oznaczająca łączną liczbę gram&oacute;w wytrąconego osadu po wykonaniu całej sekwencji krok&oacute;w eksperymentu.</p>