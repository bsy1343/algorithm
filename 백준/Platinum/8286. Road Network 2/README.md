# [Platinum V] Road Network 2 - 8286

[문제 링크](https://www.acmicpc.net/problem/8286)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 396, 정답: 98, 맞힌 사람: 79, 정답 비율: 27.431%

### 분류

그래프 이론, 자료 구조, 그리디 알고리즘, 트리, 해 구성하기, 차수열

### 문제 설명

<p>Byteasar is going for a road trip around Byteland. Unfortunately, he was unable to buy a map of the country. From his friends he learned a few properties of the Bytean road network:</p>

<ul>
	<li>There are n cities in Byteland, numbered 1 through n.</li>
	<li>Each road is bidirectional and connects two different cities.</li>
	<li>Each pair of different cities is connected by exactly one path, consisting of one or&nbsp;more roads, on which no city appears more than once.</li>
	<li>There are exactly d<sub>i</sub> roads starting at the city number i.</li>
</ul>

<p>Byteasar is going to reconstruct the road map of Byteland. The number of possible road networks satisfying the conditions can be quite big, so Byteasar will be satisfied with any correct plan.</p>

### 입력

<p>The first line of input contains one integer n (2 &le; n &le; 2,000,000). The second line contains n integers d<sub>i</sub> (1 &le; di &le; n-1).</p>

### 출력

<p>If no road network plan satisfying the conditions from the input exists, the first and only line of output should contain a single word BRAK - i.e., none in Polish. In the opposite case each of the lines in the output should contain a description of one bidirectional road - two different integers in the range [1, n] denoting the numbers of cities connected by this road. Output each road exactly once. The order of roads and cities connected by roads in the output can be arbitrary.</p>

### 힌트

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8286.%E2%80%85Road%E2%80%85Network%E2%80%852/3b1cc2a5.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8286/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:117px; width:125px" /></p>