# [Platinum V] The Deer Hunter - 30264

[문제 링크](https://www.acmicpc.net/problem/30264)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 4, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

구현, 그래프 이론, 그래프 탐색, 기하학, 많은 조건 분기, 격자 그래프, 물리학, 플러드 필

### 문제 설명

<p>P-22 had a nice diet of deer, rabbits, and various other animals available in Griffith Park. In return, attacks on pets seem to have been extremely rare &mdash; though he is a prime suspect in the killing of an elderly koala from the Los Angeles Zoo in 2016. Hunting deer is not easy: they are generally very alert, so you have to carefully sneak up on them, and if they hear/smell you before you pounce, you have to run faster so you catch them before they get to safety.</p>

<p>We model this as follows: the hunting area is a rectangle, on which P-22 can move horizontally or vertically (but not diagonally) while sneaking. You are given the positions of P-22 and the grazing deer. We assume that both are at the center of their respective squares. Each square is either silent or noisy. So long as P-22 stays on silent squares, the deer does not notice him. As soon as he steps on a noisy square, the deer will start running. To be precise, we model this as follows: while P-22 is sneaking, each step starts and ends with him being in the center of the corresponding square. When he steps onto a noisy square, he makes a noise when his center is in the center of the square (not when he touches the edge).</p>

<p>When the deer starts running, it runs along a straight line (geometric, ignoring the square pattern of the map) away from P-22. The deer runs at speed v<sub>D</sub>. As soon as the deer starts running, so does P-22, at speed v<sub>P</sub>, following the deer in a straight line. If P-22 catches up with the deer before it reaches the edge of the area, he has his lunch and dinner. Otherwise, he goes hungry. We assume that the deer reaches the edge of the area when its center touches the outside boundary of the area, geometrically speaking.</p>

<p>Because running fast is hard work (much harder than sneaking stealthily), you are to find what is the shortest running part of the hunt that P-22 can guarantee himself, while still catching the deer, of course.</p>

### 입력

<p>The first line contains a number 1 &le; K &le; 100, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of a data set consists of two integers 1 &le; X, Y &le; 1000 and two floating point numbers v<sub>P</sub>, v<sub>D</sub> &gt; 0. X and Y are the width and height of the hunting area. v<sub>P</sub>, v<sub>D</sub> are the running speeds of P-22 and the deer.</p>

<p>This is followed by Y lines, each a string of of X characters. Character x of line y gives information about the square in position x of row y. It can be one of the following four characters: (1) A dot &lsquo;.&rsquo; is silent terrain. (2) A hash &lsquo;#&rsquo; is noisy terrain. (3) The character &lsquo;P&rsquo; is the starting location of P-22. (4) The character &lsquo;D&rsquo; is the starting location of the deer. Implicitly, both starting locations are silent. There will always be exactly one &lsquo;P&rsquo; and one &lsquo;D&rsquo; in each input.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number.</p>

<p>Then, output the minimum duration of the running part of a successful hunt, rounded to two decimals. If P-22 cannot catch the deer, output -1 instead. Recall that the actual location of P-22 and the deer is the middle of their square, and the escape location is the outer edge of the area.</p>

<p>Each data set should be followed by a blank line.</p>