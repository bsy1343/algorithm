# [Bronze II] Check the Check - 15406

[문제 링크](https://www.acmicpc.net/problem/15406)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 189, 정답: 149, 맞힌 사람: 120, 정답 비율: 76.923%

### 분류

수학, 구현, 문자열, 사칙연산

### 문제 설명

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/15406.%E2%80%85Check%E2%80%85the%E2%80%85Check/db26d7ca.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/15406.%E2%80%85Check%E2%80%85the%E2%80%85Check/db26d7ca.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15406/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:222px; width:166px" /></p>

<p>As a tourist in Paris, you were told you should always carefully check the itemized bill (also called check) that is presented to you at the end of a meal with the list of what you ordered and the total price. Indeed, it is not uncommon for these bills to be handwritten, and for the total to be computed by hand by the waiter. You definitely do not want to overpay for your meal, and will protest if there is a mistake in the restaurant&rsquo;s favor. However, if the restaurant gives you a discount, you will not complain about it.</p>

<p>Write a program that decides whether you should pay the total amount presented on the check, or protest about the check.</p>

### 입력

<p>The input is formed of 2n + 2 lines:</p>

<ul>
	<li>lines 2k + 1 for 0 &le; k &le; n &minus; 1 consist of the name of the ordered dish d<sub>k</sub>;</li>
	<li>lines 2k + 2 for 0 &le; k &le; n &minus; 1 consist of the integer price p<sub>k</sub> of d<sub>k</sub> in euros, and the number c<sub>k</sub> of orders for d<sub>k</sub>, separated by a space;</li>
	<li>line 2n + 1 consists of the word &ldquo;TOTAL&rdquo;;</li>
	<li>line 2n + 2 consists of the integer total T in euros computed by the waiter.</li>
</ul>

<p>Limits</p>

<ul>
	<li>For every 0 &le; k &le; n &minus; 1:
	<ul>
		<li>d<sub>k</sub> has at most 1 000 characters, and is never equal to &ldquo;TOTAL&rdquo;;</li>
		<li>0 &le; p<sub>k</sub> &le; 1 000;</li>
		<li>0 &le; c<sub>k</sub> &le; 10;</li>
	</ul>
	</li>
	<li>0 &le; n &le; 100 000;</li>
	<li>T &le; 2 000 000 000.</li>
</ul>

### 출력

<p>The output should consist of a single line, whose content is either &ldquo;PAY&rdquo; (if the displayed total is less than or equal to the actual total) or &ldquo;PROTEST&rdquo; (otherwise).</p>