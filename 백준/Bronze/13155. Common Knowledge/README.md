# [Bronze I] Common Knowledge - 13155

[문제 링크](https://www.acmicpc.net/problem/13155)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 245, 정답: 222, 맞힌 사람: 206, 정답 비율: 93.636%

### 분류

수학, 조합론

### 문제 설명

<p>Alice and Bob play some game in which they score points. Each of the two has an n-digit scoreboard which depicts numbers in base 10 (with leading zeroes). The digits 0 to 9 are displayed on a seven-segment display in the following fashion:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/13155.%E2%80%85Common%E2%80%85Knowledge/4ed87036.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13155/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:59px; width:271px" /></p>

<p>For some odd reason, the two players cannot see the scoreboards entirely. Alice can only see the lower half of her own scoreboard and the upper half of Bob&rsquo;s scoreboard. Bob can only see the upper half of his scoreboard and the upper half of Alice&rsquo;s scoreboard. Here, &lsquo;half&rsquo; is meant to include the horizontal segments in the digits&rsquo; centers: they can be seen by both players at all times. For example, if one sees the upper half of an eight, one can conclude that the digit is not a zero.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/13155.%E2%80%85Common%E2%80%85Knowledge/4abdd811.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13155/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:168px; width:496px" /></p>

<p style="text-align: center;">Figure I.1: An example situation for n = 4.</p>

<p>A pair of n-digit scores is called fully known if both players know both scores (i.e. all 2n digits) by looking at the displays with their restricted vision. The players cannot communicate.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with an integer n (1 &le; n &le; 20), where n is the number of digits.</li>
</ul>

### 출력

<p>Output the number of score pairs that can be displayed on two n-digit scoreboards and are fully known by both players.</p>