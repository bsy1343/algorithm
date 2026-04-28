# [Platinum III] K-Shaped Figures - 26873

[문제 링크](https://www.acmicpc.net/problem/26873)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 28, 정답: 21, 맞힌 사람: 20, 정답 비율: 90.909%

### 분류

수학, 브루트포스 알고리즘, 정렬, 기하학, 조합론, 각도 정렬

### 문제 설명

<p>Let&#39;s say that three segments on a plane form a <em>K-shaped figure</em> if:</p>

<ul>
	<li>two of them share a common endpoint;</li>
	<li>this common endpoint lies strictly inside the third segment;</li>
	<li>these two segments are located on the same side with respect to the third one;</li>
	<li>all three segments are pairwise not collinear.</li>
</ul>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26873.%E2%80%85K-Shaped%E2%80%85Figures/d66280af.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26873.%E2%80%85K-Shaped%E2%80%85Figures/d66280af.png" data-original-src="https://upload.acmicpc.net/b0d70eca-ed01-44cf-b1cc-6ae47628ae39/-/crop/147x220/0,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 74px; height: 110px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26873.%E2%80%85K-Shaped%E2%80%85Figures/951eda9b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26873.%E2%80%85K-Shaped%E2%80%85Figures/951eda9b.png" data-original-src="https://upload.acmicpc.net/b0d70eca-ed01-44cf-b1cc-6ae47628ae39/-/crop/147x220/180,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 74px; height: 110px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26873.%E2%80%85K-Shaped%E2%80%85Figures/cb152a66.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26873.%E2%80%85K-Shaped%E2%80%85Figures/cb152a66.png" data-original-src="https://upload.acmicpc.net/b0d70eca-ed01-44cf-b1cc-6ae47628ae39/-/crop/147x220/361,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 74px; height: 110px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26873.%E2%80%85K-Shaped%E2%80%85Figures/ed778a72.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26873.%E2%80%85K-Shaped%E2%80%85Figures/ed778a72.png" data-original-src="https://upload.acmicpc.net/b0d70eca-ed01-44cf-b1cc-6ae47628ae39/-/crop/147x220/565,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 74px; height: 110px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26873.%E2%80%85K-Shaped%E2%80%85Figures/68940f19.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26873.%E2%80%85K-Shaped%E2%80%85Figures/68940f19.png" data-original-src="https://upload.acmicpc.net/b0d70eca-ed01-44cf-b1cc-6ae47628ae39/-/crop/147x220/746,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 74px; height: 110px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26873.%E2%80%85K-Shaped%E2%80%85Figures/044da52a.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26873.%E2%80%85K-Shaped%E2%80%85Figures/044da52a.png" data-original-src="https://upload.acmicpc.net/b0d70eca-ed01-44cf-b1cc-6ae47628ae39/-/crop/147x220/928,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 74px; height: 110px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26873.%E2%80%85K-Shaped%E2%80%85Figures/2c113fee.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26873.%E2%80%85K-Shaped%E2%80%85Figures/2c113fee.png" data-original-src="https://upload.acmicpc.net/b0d70eca-ed01-44cf-b1cc-6ae47628ae39/-/crop/147x220/1105,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 74px; height: 110px;" /></td>
		</tr>
		<tr>
			<td>$\{AB,CD,CE\}$</td>
			<td>$\{AB,CD,CE\}$</td>
			<td>$\{AB,CD,CE\}$</td>
			<td>$\{AB,CD,CE\}$</td>
			<td>$\{AB,CD,CE\}$</td>
			<td>$\{AB,CD,EF\}$</td>
			<td>$\{AB,AC,AD\}$</td>
		</tr>
		<tr>
			<td colspan="3">Valid K-shaped figures</td>
			<td colspan="4">Invalid K-shaped figures</td>
		</tr>
	</tbody>
</table>

<p>You are given a collection of $n$ segments on the plane. Find the number of triples of segments from this collection that form a K-shaped figure.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 3333$). The description of the test cases follows.</p>

<p>The first line of each test case contains a single integer $n$ --- the number of segments ($3 \le n \le 1000$).</p>

<p>The $i$-th of the following $n$ lines contains four integers $x_{i,1}$, $y_{i,1}$, $x_{i,2}$, $y_{i,2}$ --- the coordinates of endpoints of the $i$-th segment ($-10^6 \le x_{i,1}, y_{i,1}, x_{i,2}, y_{i,2} \le 10^6$). All segments have positive lengths. Some segments may coincide.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $10^4$.</p>

### 출력

<p>For each test case, print a single integer --- the number of triples of segments that form a K-shaped figure.</p>