# [Platinum III] The Bus - 7971

[문제 링크](https://www.acmicpc.net/problem/7971)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 32, 맞힌 사람: 30, 정답 비율: 76.923%

### 분류

값 / 좌표 압축, 자료 구조, 세그먼트 트리

### 문제 설명

<p>The streets of Byte City form a regular, chessboardlike network - they are either north-south or west-east directed. We shall call them NS- and WE-streets. Furthermore, each street crosses the whole city. Every NS-street intersects every WE- one and vice versa. The NS-streets are numbered from 1 to n, starting from the westernmost. The WE-streets are numbered from 1 to m, beginning with the southernmost. Each intersection of the j&rsquo;th NS-street with the &#39;th WE-street is denoted by a pair of numbers (i,j) (for 1 &le; i &le; n, 1 &le; j &le; m).</p>

<p>There is a bus line in Byte City, with intersections serving as bus stops. The bus begins its itinerary by the (1,1) intersection, and finishes by the (n,m) intersection. Moreover, the bus may only travel in the eastern and/or northern direction.</p>

<p>There are passengers awaiting the bus by some of the intersections. The bus driver wants to choose his route in a way that allows him to take as many of them as possible. (We shall make an assumption that the interior of the bus is spacious enough to take all of the awaiting passengers, regardless of the route chosen.)</p>

<p>Write a programme which:</p>

<ul>
	<li>reads from the standard input a description of the road network and the number of passengers waiting at each intersection,</li>
	<li>finds, how many passengers the bus can take at the most,</li>
	<li>writes the outcome to the standard output.</li>
</ul>

### 입력

<p>The first line of the standard input contains three positive integers n, m and k - denoting the number of NS-streets, the number of WE-streets and the number of intersections by which the passengers await the bus, respectively (1 &le; n &le; 10<sub>9</sub>, 1 &le; m &le; 10<sub>9</sub>, 1 &le; k &le; 10<sub>5</sub>).</p>

<p>The following k lines describe the deployment of passengers awaiting the bus, a single line per intersection. In the (i+1)&rsquo;st line there are three positive integers x<sub>i</sub>, y<sub>i</sub> and p<sub>i</sub>, separated by single spaces, 1 &le; x<sub>i</sub> &le; n, 1 &le; y<sub>i</sub> &le; m, 1 &le; p<sub>i</sub> &le; 10<sup>6</sup>. A triplet of this form signifies that by the intersection (x<sub>i</sub>,y<sub>i</sub>)p<sub>i</sub> passengers await the bus. Each intersection is described in the input data once at the most. The total number of passengers waiting for the bus does not exceed 1,000,000,000.</p>

### 출력

<p>Your programme should write to the standard output one line containing a single integer - the greatest number of passengers the bus can take.</p>

### 힌트

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7971/1.gif" style="height:310px; width:351px" /></p>