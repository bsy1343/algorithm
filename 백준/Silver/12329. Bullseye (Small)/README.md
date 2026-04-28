# [Silver III] Bullseye (Small) - 12329

[문제 링크](https://www.acmicpc.net/problem/12329)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 57, 정답: 49, 맞힌 사람: 44, 정답 비율: 88.000%

### 분류

수학, 브루트포스 알고리즘, 기하학

### 문제 설명

<p>Maria has been hired by the Ghastly Chemicals Junkies (GCJ) company to help them manufacture&nbsp;<strong>bullseyes</strong>. A&nbsp;<strong>bullseye</strong>&nbsp;consists of a number of concentric rings (rings that are centered at the same point), and it usually represents an archery target. GCJ is interested in manufacturing black-and-white bullseyes.&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/12329.%E2%80%85Bullseye%E2%80%85(Small)/dc45e9f1.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12329/images-53.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:222px; width:224px" /></p>

<p>Maria starts with&nbsp;<strong>t</strong>&nbsp;millilitres of black paint, which she will use to draw rings of thickness 1cm (one centimetre). A ring of thickness 1cm is the space between two concentric circles whose radii differ by 1cm.</p>

<p>Maria draws the first black ring around a white circle of radius&nbsp;<strong>r</strong>&nbsp;cm. Then she repeats the following process for as long as she has enough paint to do so:</p>

<ol>
	<li>Maria imagines a white ring of thickness 1cm around the last black ring.</li>
	<li>Then she draws a new black ring of thickness 1cm around that white ring.</li>
</ol>

<p>Note that each &quot;white ring&quot; is simply the space between two black rings.</p>

<p>The area of a disk with radius 1cm is&nbsp;<strong>&pi;</strong>&nbsp;cm<sup>2</sup>. One millilitre of paint is required to cover area&nbsp;<strong>&pi;</strong>&nbsp;cm<sup>2</sup>. What is the maximum number of black rings that Maria can draw? Please note that:</p>

<ul>
	<li>Maria only draws complete rings. If the remaining paint is not enough to draw a complete black ring, she stops painting immediately.</li>
	<li>There will always be enough paint to draw at least one black ring.</li>
</ul>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. Each test case consists of a line containing two space separated integers: <strong>r</strong> and <strong>t</strong>.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 1000.</li>
	<li>1 &le; <strong>r</strong>, <strong>t</strong> &le; 1000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>x</strong>: <strong>y</strong>&quot;, where <strong>x</strong> is the case number (starting from 1) and <strong>y</strong> is the maximum number of black rings that Maria can draw.</p>