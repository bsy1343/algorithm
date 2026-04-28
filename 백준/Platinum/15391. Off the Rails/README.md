# [Platinum III] Off the Rails - 15391

[문제 링크](https://www.acmicpc.net/problem/15391)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

(분류 없음)

### 문제 설명

<p>The Country of Everlasting is planning to build a rail line that will connect its cities. During their planning stage, they have decided that the route where the rail line will pass should minimize the distance between the cities and the rail line. During the canvassing of materials, the engineers involved found out that it will be best if they buy pre-fabricated guideways from the country of Forever. However, the only available prefabricated guideways are the straight guideways. If the selected route is not a straight line (for example, the figure below), then they will need to buy several pre-fabricated guideways. They can buy guideways of different lengths.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15391.%E2%80%85Off%E2%80%85the%E2%80%85Rails/5c1293ce.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15391/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:161px; width:550px" /></p>

<p>The problem now is that there is an overhead cost C for each pre-fabricated guideway imported from Forever. So they have to design the route such that the value a + bC is minimized, where:</p>

<ul>
	<li>a is the sum of the squares of the lengths of the vertical segments from each city to the rail line.</li>
	<li>b is the number of pre-fabricated lines. Also, remember the following:</li>
	<li>The sequence of segments need not be connected.</li>
	<li>No pre-fabricated line must be positioned vertically.</li>
	<li>No vertical line intersects two pre-fabricated lines at different points in their interior.</li>
</ul>

### 입력

<p>The first line of input contains T, the number of test cases.</p>

<p>The first line of each test case contains two numbers separated by a space: the integer n and the real number C. The next n lines describe the cities.</p>

<p>The ith subsequent line contains two integers xi and yi denoting the coordinates of the ith city.</p>

<p>Constraints</p>

<ul>
	<li>1 &le; T &le; 200</li>
	<li>1 &le; n &le; 1000</li>
	<li>&minus;1000 &le; x<sub>i</sub>, y<sub>i</sub> &le; 1000</li>
	<li>0 &lt; C &le; 10000.000</li>
	<li>C will be given with at most 3 decimal places</li>
	<li>x<sub>1</sub> &lt; x<sub>2</sub> &lt; x<sub>3</sub> &lt; ... &lt; x<sub>n</sub></li>
</ul>

### 출력

<p>For each test case, output a single line containing a single real number: the optimal value of a + bC. Your solution must be accurate to within an absolute error of 10<sup>&minus;2</sup> from the correct answer.</p>