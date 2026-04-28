# [Silver III] Flag with Stars - 21625

[문제 링크](https://www.acmicpc.net/problem/21625)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 15, 맞힌 사람: 9, 정답 비율: 40.909%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p>Andrew started playing a new multiplayer online game. He needs to create a flag to be different from other players.</p>

<p>Andrew decided that there should be $n$ stars on the flag forming a figure just like on the US one:</p>

<ul>
	<li>The stars should be arranged in horizontal rows, placed one below the other.</li>
	<li>The difference of number of stars in any two rows must not be greater than one.</li>
	<li>If there are two rows with different number of stars, then the number of stars in any two adjacent rows must be different.</li>
</ul>

<p>Andrew doesn&#39;t want the flag to be too long or too wide, so he is interested in the minimum possible absolute difference of the number of rows and the maximum number of stars in a row.</p>

### 입력

<p>The only line of input contains an integer $n$ --- the number of stars ($1 \le n \le 10^{12}$).</p>

### 출력

<p>Output a single integer --- the minimum possible absolute difference of the number of rows and the maximum number of stars in a row.</p>

### 힌트

<p>An example of the optimal arrangement of the stars in the fourth test case:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/21625.%E2%80%85Flag%E2%80%85with%E2%80%85Stars/64b8c192.png" data-original-src="https://upload.acmicpc.net/e45471dd-6efb-47b3-9754-7b0c9acb3945/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 343px;" /></p>