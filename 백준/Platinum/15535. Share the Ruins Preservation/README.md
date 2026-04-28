# [Platinum II] Share the Ruins Preservation - 15535

[문제 링크](https://www.acmicpc.net/problem/15535)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 42, 정답: 20, 맞힌 사람: 18, 정답 비율: 47.368%

### 분류

볼록 껍질, 기하학

### 문제 설명

<p>Two organizations International Community for Preservation of Constructions (ICPC) and Japanese Archaeologist Group (JAG) engage in ruins preservation. Recently, many ruins were found in a certain zone. The two organizations decided to share the preservation of the ruins by assigning some of the ruins to ICPC and the other ruins to JAG.</p>

<p>Now, ICPC and JAG make a rule for assignment as follows:</p>

<ol>
	<li>Draw a vertical straight line from the north to the south, avoiding to intersect ruins.</li>
	<li>Ruins located to the west of the line are preserved by ICPC. On the other hand, ruins located to the east of the line are preserved by JAG. (It is possible that no ruins are located to the east/west of the line; in this case, ICPC/JAG will preserve no ruins.)</li>
</ol>

<p>A problem is where to draw a straight line. For each organization, the way to preserve its assigned ruins is to make exactly one fence such that all the assigned ruins are in the region surrounded by the fence. Furthermore, they should minimize the length of such a fence for their budget. If the surrounded areas are vast, expensive costs will be needed to maintain the inside of areas. Therefore, they want to minimize the total preservation cost, i.e. the sum of the areas surrounded by two fences. Your task is to write a program computing the minimum sum of the areas surrounded by two fences, yielded by drawing an appropriate straight line.</p>

### 입력

<p>The input consists of a single test case.</p>

<pre>
N
x<sub>1</sub> y<sub>1</sub>
...
x<sub>N</sub> y<sub>N</sub></pre>

<p>The first line contains an integer N (1 &le; N &le; 100,000), which is the number of founded ruins. The following N lines represent the location of the ruins. The i-th line of them consists of two integers x<sub>i</sub> and y<sub>i</sub>, which indicate the location of the i-th ruin is x<sub>i</sub> east and y<sub>i</sub> north from a certain location in the zone. You can assume the following things for the ruins:</p>

<ul>
	<li>&minus;10<sup>9</sup> &le; x<sub>i</sub>, y<sub>i</sub> &le; 10<sup>9</sup></li>
	<li>You can ignore the sizes of ruins. That is, you can assume ruins are points.</li>
	<li>No pair of ruins has the same location.</li>
</ul>

### 출력

<p>Print the minimum total preservation cost yielded by drawing an appropriate straight line. You should round off the cost to the nearest integer.</p>