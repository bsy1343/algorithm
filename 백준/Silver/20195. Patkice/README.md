# [Silver I] Patkice - 20195

[문제 링크](https://www.acmicpc.net/problem/20195)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 112, 정답: 53, 맞힌 사람: 45, 정답 비율: 45.455%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Not so long ago, in a distant tropical land, there lived three rubber ducks. One hot summer day while they were lying on the beach, the ducks decided to travel to a nearby island. Since the ducks like adventures, they decided to travel carried by ocean currents in an old black umbrella.</p>

<p>Since the ducks are experienced ocean explorers, before the voyage they will check out a map of ocean currents. On the map, the island where the ducks live is marked by a letter &#39;o&#39;. The ducks can start their voyage in any of the four directions: north &ndash; N, east &ndash; E, west &ndash; W and south &ndash; S.</p>

<p>Ocean currents in these seas move in one of the four directions, and are marked on the map in the following way: west-east &#39;&lt;&#39;, east-west &#39;&gt;&#39;, north-south &#39;v&#39; and south-north &#39;^&#39;. When the ducks are located on a cell with a current, they will move one cell in the direction of the current. Ocean currents in these seas are special, as they never lead outside of the map and they don&rsquo;t form vortexes (places where the ducks would move in circles if they followed the current).</p>

<p>Calm sea is marked by a dot &#39;.&#39;. If the currents bring the ducks to a cell with calm sea or back to the starting island, they won&rsquo;t be able to continue the voyage. The island that the ducks want to visit is marked by a letter &#39;x&#39;.</p>

<p>The ducks don&rsquo;t want to stop their beach party. They kindly ask you to tell them if it&rsquo;s possible for them to get to the other island, and if it is, in which direction should they start their voyage. Since one of the ducks gets very seasick, they ask you to choose the direction that will make the voyage as short as possible. If there are multiple directions that yield the same minimal travel time, you should choose the one that is alphabetically first.</p>

### 입력

<p>The first line contains integers r and s (3 &le; r, s &le; 100), the number of rows and columns of the map.</p>

<p>Each of the next r lines contains s characters from the set &#39;o&lt;&gt;v^.x&#39;, that represent the map of ocean currents. There will always be exactly one character &#39;o&#39; and exactly one character &#39;x&#39; on the map. The character &#39;o&#39; will never be located in the first or last row nor column.</p>

### 출력

<p>If the ducks can&rsquo;t reach the other island, print :(.</p>

<p>Otherwise, print :) in the first line. In the second line, print the start direction (N for north, E for east, W for west or S for south).</p>

### 힌트

<p>In the first example, if the ducks start their voyage in any direction but east, they will end up in calm sea and won&rsquo;t reach the other island.</p>

<p>In the second example, the ducks will reach the other island if they start by going north or south. They choose the south way, since it&rsquo;s shorter.</p>