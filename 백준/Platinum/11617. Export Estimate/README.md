# [Platinum I] Export Estimate - 11617

[문제 링크](https://www.acmicpc.net/problem/11617)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 103, 정답: 59, 맞힌 사람: 55, 정답 비율: 63.218%

### 분류

그래프 이론, 자료 구조, 분리 집합, 오프라인 쿼리

### 문제 설명

<p>Luka owns a geographic data company that maintains a detailed city map and exports the data to interested parties. Often, clients do not want the complete map. Instead, they want a simplified map containing only major streets.</p>

<p>City map is an undirected graph consisting of n intersections denoted with integers from 1 to n and m two-way streets. Each street is assigned a priority &ndash; a non-negative integer. When requesting a map, the client selects a threshold priority p. The original map is then copied and converted to the exported map using the following procedure:</p>

<ol>
	<li>All streets whose priority is lower than p are deleted.</li>
	<li>For each intersection i from 1, 2, . . . , n (processed in that order):
	<ol>
		<li>If the intersection i is not connected to any streets it is deleted.</li>
		<li>If the intersection i is connected to exactly two different streets x and y leading to intersections a and b both different from i then the intersection i is contracted using the following procedure:
		<ol>
			<li>Streets x and y are deleted.</li>
			<li>Intersection i is deleted.</li>
			<li>New street z connecting intersections a and b is added.</li>
		</ol>
		</li>
	</ol>
	</li>
</ol>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11617.%E2%80%85Export%E2%80%85Estimate/0a9d75a9.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/11617.%E2%80%85Export%E2%80%85Estimate/0a9d75a9.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11617/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:196px; width:545px" /></p>

<p style="text-align: center;">Illustration of the second example with the threshold priority 95</p>

<p>Initially, the map does not contain loops (loop is a street that connects an intersection to itself) or parallel edges (more than one street between the same pair of intersections), but the loops and parallel edges may form during the contraction procedure. Notice that, in the step 2. (b) above, neither x nor y can be a loop (both a and b have to be different from i), but the newly added street z could be a loop (it is possible that a and b are same).</p>

<p>Given a map and a sequence of incoming export requests, for each request find the number of intersections and the number of streets in the exported map.</p>

### 입력

<p>The first line contains two integers n (1 &le; n &le; 300 000) and m (1 &le; m &le; 300 000) &ndash; the number of intersections and the number of streets, respectively. Each of the following m lines contains three integers a, b and p (1 &le; a, b &le; n, 0 &le; p &le; 300 000) which describe a street with priority p connecting intersections a and b. No street connects an intersection to itself. There is at most one street between every two intersections.</p>

<p>The following line contains an integer q (1 &le; q &le; 300 000) &ndash; the number of export requests. The following line contains q integers. The k-th integer t<sub>k</sub> (0 &le; t<sub>k</sub> &le; 300 000) is the threshold priority of the k-th request.</p>

### 출력

<p>Output should consist of q lines. The k-th line should contain two integers &ndash; the number of intersections and the number of streets, respectively, in the exported map for the k-th request.</p>