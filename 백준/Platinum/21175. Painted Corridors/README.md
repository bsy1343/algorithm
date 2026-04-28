# [Platinum II] Painted Corridors - 21175

[문제 링크](https://www.acmicpc.net/problem/21175)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 14, 맞힌 사람: 11, 정답 비율: 28.947%

### 분류

그래프 이론, 그래프 탐색, 많은 조건 분기, 깊이 우선 탐색, 플러드 필

### 문제 설명

<p>The Institute of Colorfully Painted Corridors is planning the construction of a new building. The building has numerous junctions, and corridors that each connect a pair of junctions. The corridors will be painted by amazing new painting robots that drive along the corridors and paint all the walls as they go. The architect has specified the colors of some of the corridors, which may be red, orange, yellow, green, blue, or purple. However, there is only a budget for three painting robots, so there will be a single robot for each primary color (red, yellow, or blue). In addition, these robots are the cheapest possible version, and cannot turn their paint sprayer off (though they can go as fast or as slow as desired with no problems; they can even stop moving entirely).</p>

<p>If a corridor needs to be painted a secondary color (orange, green, or purple), in order for the paints to mix properly, the two robots with the appropriate primary colors must travel down the corridor in the same direction at the same time to create the correct color. The color mixing rules are: <em>orange</em> = <em>red</em> + <em>yellow</em>, <em>green</em> = <em>yellow</em> + <em>blue</em>, and <em>purple</em> = <em>red</em> + <em>blue</em>. A corridor that is unspecified in the plan may be painted any color, or left unpainted.</p>

<p>Corridors may be painted multiple times, provided that each time they are painted with the correct color. Corridors with no specified color can be painted multiple times with different colors. All corridors can be travelled along in both directions. The robots may end up at any junctions after painting all the corridors.</p>

<p>Given the architect&rsquo;s design, is it possible for the painting robots to paint the corridors the desired colors?</p>

### 입력

<p>The first line of input contains five integers, $n$ ($2 \le n \le 100$), $m$ ($1 \le m \le \frac{n \cdot (n-1)}{2}$),&nbsp;$r$, $b$ and $y$ ($1 \le r, b, y \le n$), where $n$ is the number of junctions, $m$ is the number of corridors, and $r$, $b$ and $y$ are the initial junctions of the red, blue, and yellow painting robots respectively. Junctions are numbered $1$ through $n$. Each of the next $m$ lines contains two integers $i$, $j$ ($1 \le i &lt; j \le n$), and a single character $c$ which is one of <code>R</code>, <code>O</code>, <code>Y</code>, <code>G</code>, <code>B</code>, <code>P</code>, <code>X</code>. The integers $i$, $j$ indicate that there is a corridor between junction $i$ and junction $j$, with $c$ indicating the desired color. (<code>R</code>, <code>O</code>, <code>Y</code>, <code>G</code>, <code>B</code>, <code>P</code>, <code>X</code>, corresponding to Red, Orange, Yellow, Green, Blue, Purple, and Unspecified, respectively.) There is at most one corridor between each pair of junctions.</p>

### 출력

<p>Output a single integer, $1$ if it is possible to paint the corridors as described and $0$ otherwise.</p>