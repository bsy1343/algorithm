# [Silver IV] Hexagonal Tiles - 5705

[문제 링크](https://www.acmicpc.net/problem/5705)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 350, 정답: 257, 맞힌 사람: 198, 정답 비율: 72.263%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The path to Mary&rsquo;s school is a straight line paved with hexagonal tiles. The picture below shows an example of the path with 12 numbered tiles.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/5705.%E2%80%85Hexagonal%E2%80%85Tiles/4b5d7234.png" data-original-src="https://www.acmicpc.net/upload/images2/hexa(1).png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:139px; width:387px" /></p>

<p>Mary loves mathematics. When going to school, she steps on the tiles of that path following these rules:</p>

<ul>
	<li>She always starts from the tile with the smiling face (as nothing matches starting anything with a smile!). This tile is always present at the beginning of the path. The other tiles are numbered consecutively, in ascending order, starting from 1, as shown in the figure.</li>
	<li>She is not allowed to go back, that is, she must not step on a tile which bears a lower number than the tile she is on (when decided to go to school, there she goes!).</li>
	<li>She always steps from a tile to a neighboring one (no jumps in order to keep out of harm&rsquo;s way!).</li>
	<li>She must always finish on the highest numbered tile.&nbsp;</li>
</ul>

<p>When classes are over, she is so tired that she avoids the path and walks on the lawn.</p>

<p>Mary does not want to repeat any sequence of steps on the tiles and she would like to know, if the path is paved with N numbered tiles and a tile with the face, how many days will it take to make each possible sequence once.</p>

<p>For example, five days will be needed for her to try all possible step sequences if the path has N = 4 tiles, one day for each of the sequences: 1-2-3-4, 1-2-4, 1-3-4, 2-3-4 and 2-4.</p>

<p>Write a program to determine how many different step sequences there are for a path with a given number N of tiles.</p>

### 입력

<p>The input contains several test cases. Each test case is composed by a line containing an integer N(1 &le; N &le; 40), the number of tiles in the path.</p>

<p>The last test case is followed by a line containing a single zero.</p>

### 출력

<p>For each test case, print a line containing a single integer, the number of different step sequences.</p>