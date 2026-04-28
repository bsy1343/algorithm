# [Platinum V] Hot Dogs in Manhattan - 5429

[문제 링크](https://www.acmicpc.net/problem/5429)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 71, 정답: 20, 맞힌 사람: 16, 정답 비율: 34.043%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 애드 혹, 이분 탐색, 너비 우선 탐색, 매개 변수 탐색

### 문제 설명

<p>The two friends Barack and Mitt have both decided to set up their own hot dog stand in Manhattan. They wish to find the two optimal locations for their stands.</p>

<p>First of all, they both want to put their stand at an intersection, since that gives them maximum exposure. Also, this being Manhattan, there are already quite a few stands in the city, also at intersections. If they put up a stand close to another (or each other&rsquo;s) stand, they might not get that many customers. They would therefore like to put their stands as far from other stands as possible.</p>

<p>We model Manhattan as a finite square grid, consisting of w vertical streets and h horizontal streets. The vertical streets run from x = 0 to x = w &minus; 1, while horizontal streets run from y = 0 to y = h&minus;1. All pairs of consecutive parallel streets are separated by the same distance, which we set as the unit distance. The distance between two intersections (x<sub>1</sub>, y<sub>1</sub>) and (x<sub>2</sub>, y<sub>2</sub>) is then given by |x<sub>1</sub> &minus; x<sub>2</sub>| + |y<sub>1</sub> &minus; y<sub>2</sub>|.</p>

<p>We indicate an intersection&rsquo;s suitability by its privacy, which is the minimum of all distances from this intersection to all other hot dog stands. Barack and Mitt would like to find two intersections with the maximum amount of privacy, i.e. such that the smallest of the two privacies is as large as possible. Note that the privacy of Barack&rsquo;s location can be determined by the distance to Mitt&rsquo;s location and vice versa.</p>

### 입력

<p>On the first line one positive number: the number of test cases, at most 100. After that per test case:</p>

<ul>
	<li>one line with three space-separated integers n, w and h (0 &le; n &le; 1 000 and 2 &le; w, h &le; 1 000): the number of hot dog stands already in place and the number of vertical and horizontal streets, respectively.</li>
	<li>n lines, each with two space-separated integers x<sub>i</sub> and y<sub>i</sub> (0 &le; x<sub>i</sub> &lt; w and 0 &le; y<sub>i</sub> &lt; h): the intersection where the i-th hot dog stand is located.</li>
</ul>

<p>All hot dog stands are at different intersections. At least two intersections do not contain a stand.</p>

### 출력

<p>Per test case:</p>

<ul>
	<li>one line with one integer: the maximum privacy that Barack and Mitt can both obtain.</li>
</ul>

### 힌트

<p>These sample cases are illustrated below. Only for the first case, the optimal placement of the two new stands is given (indicated by the dashed outlines).</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5429.%E2%80%85Hot%E2%80%85Dogs%E2%80%85in%E2%80%85Manhattan/09d88096.png" data-original-src="https://www.acmicpc.net/upload/images2/hotdog.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:512px; width:555px" /></p>