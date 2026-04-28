# [Platinum II] Canoes - 26045

[문제 링크](https://www.acmicpc.net/problem/26045)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 16, 맞힌 사람: 12, 정답 비율: 30.000%

### 분류

2-sat, 그래프 이론, 강한 연결 요소

### 문제 설명

<p>Cimrman had built a whole fleet of special weather prediction molybdenum canoes. Each canoe was separately built in its own dry dock. Consequently, the shore is littered with dug out patterns of dry docks, some of them even intersect each other, some of them are separate.</p>

<p>A dry dock is a rectangle with width of one standard unit and its length is a few standard units, always at least two. Each dock runs either in vertical or horizontal direction. Consequently, each two docks run either in a parallel direction or in directions perpendicular to each other. The width of each canoe is the same as the width of the dock and the length of the canoe is just one unit shorter than the length of its dock.</p>

<p>Next week, a hurricane is expected in the area, and Cimrman wants each canoe to be put back to the dock in which it was created. However, it is not immediately clear whether such universal storage plan can be accomplished.</p>

<p>And, by the way, are there any square shaped canoes? Yes, Cimrman is capable of building square molybdenum canoes.</p>

### 입력

<p>The shore with docks is modelled as a rectangular grid, the size of its each elementary square is equal to one standard unit. The first input line contains three positive integers H, W, N (1 &le; H, W &le; 500, 1 &le; N &le; 250 000), giving the height of the grid, the width of the grid and the number of docks in the grid.</p>

<p>Each of the following N lines specifies one dock. The dock is defined by four entries separated by spaces. The first three entries X, Y , K are integers specifying the coordinates (X, Y ) of one end of the dock and the dock length K (number of grid squares occupied by the dock). It holds that 1 &le; X &le; H, 1 &le; Y &le; W, and 2 &le; K &le; 500. The fourth entry on a row is one of characters &ldquo;L&rdquo;, &ldquo;R&rdquo;, &ldquo;U&rdquo;, &ldquo;D&rdquo; and it specifies in which direction runs the dock from its start coordinate (&ldquo;L&rdquo; - Left, &ldquo;R&rdquo; - Right, &ldquo;U&rdquo; - Up, &ldquo;D&rdquo; - Down ). Moreover, no dock runs out of the bounds of the shore, e.g. for a dock which runs Down with one end on coordinates (X, Y ), it additionally holds 1 &le; X + (K &minus; 1) &le; H (and analogously for other directions).</p>

### 출력

<p>Output one line &ldquo;Yes&rdquo; if all canoes can be stored back in their docks or &ldquo;No&rdquo; otherwise.</p>