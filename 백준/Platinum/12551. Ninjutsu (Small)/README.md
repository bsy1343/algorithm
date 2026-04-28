# [Platinum II] Ninjutsu (Small) - 12551

[문제 링크](https://www.acmicpc.net/problem/12551)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 6, 정답: 1, 맞힌 사람: 1, 정답 비율: 16.667%

### 분류

구현, 브루트포스 알고리즘, 정렬, 기하학, 시뮬레이션, 백트래킹, 재귀, 각도 정렬

### 문제 설명

<p>Ninjutsu is the martial art of the mysterious Japanese assassins, ninja. As a beginner in the practice of ninjutsu, your first task is to master the use of the grappling hook.</p>

<p>A grappling hook is a technologically-advanced device consisting of a hook tied to some (very strong and very thin) rope. Proper use of a grappling hook involves throwing the hook at a target and hoping that it catches.</p>

<p>This time, it did! You are now hooked onto a target that is located at (0, 0). Your rope extends to the left, and you&#39;re at the end of it; when you jump, you will start swinging counter-clockwise around the target. There are other targets located to the right and above (0, 0), at (x<sub>i</sub>, y<sub>i</sub>)) with&nbsp;x<sub>i</sub>&nbsp;&ge; 0&nbsp;and&nbsp;y<sub>i</sub>&nbsp;&ge; 0&nbsp;When an interior point of the rope (not either end) contacts one or more targets, the rope will bend around the target closest to its moving end. Ignore your starting velocity; because you are a ninja, it is fast enough that you will continue bending around targets until you are spinning around a single one.</p>

<p>Your rope currently has length&nbsp;<strong>R</strong>, but you may choose to cut it down to any shorter length&nbsp;<strong>r</strong>&nbsp;(including non-integers) before you start swinging. As such, you will start at&nbsp;(-<strong>r</strong>, 0)&nbsp;and swing down (counter-clockwise) toward&nbsp;(0, -<strong>r</strong>).</p>

<p>What is the maximum number of bends you can put into the rope with one swing? A bend happens when your rope touches a target and then rotates some non-zero number of degrees around that target. The rope will always remain perfectly straight (again, this is possible because you are a ninja), except at bends.</p>

<p>Example</p>

<p><img src="%EB%B0%B1%EC%A4%80/Platinum/12551.%E2%80%85Ninjutsu%E2%80%85(Small)/f6f8fd75.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/12551.%E2%80%85Ninjutsu%E2%80%85(Small)/f6f8fd75.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12551/images-34.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="vertical-align:middle" /></p>

<p>In the example above, there are 6 points:</p>

<ul>
	<li>(0, 0),</li>
	<li>(3, 1),</li>
	<li>(12, 4),</li>
	<li>(14, 5),</li>
	<li>(13, 7), and</li>
	<li>(7, 10).</li>
</ul>

<p>You have a rope of length 24. If you do not cut the rope, then you will bend around point&nbsp;(12, 4), then around point&nbsp;(14, 5), then around point&nbsp;(13, 7), and finally, you will be stuck orbiting point&nbsp;(7, 10)&nbsp;with about 0.1705 units of rope remaining. This amounts to a total of 4 bends. Although you touch point&nbsp;(3, 1), it does not contribute a bend because it is collinear with the points&nbsp;(0, 0)&nbsp;and&nbsp;(12, 4).</p>

<p>If, however, you cut the rope by 0.18 units, you will not have enough length to reach point&nbsp;(7, 10)&nbsp;and will instead follow the path</p>

<pre>
(0, 0)--(12, 4)--(14, 5)--(13, 7)--(12, 4)--(14, 5)
</pre>

<p>and will end up orbiting point&nbsp;(14, 5)&nbsp;with about 1.3004 units of rope remaining. This path amounts to 5 bends, in total, and is an optimal solution.</p>

<p><img src="%EB%B0%B1%EC%A4%80/Platinum/12551.%E2%80%85Ninjutsu%E2%80%85(Small)/3266eeec.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/12551.%E2%80%85Ninjutsu%E2%80%85(Small)/3266eeec.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12551/images-33.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="vertical-align:middle" /></p>

<p>Case #1 in the sample input below represents this example.</p>

### 입력

<p>The input will start with a line containing&nbsp;<strong>T</strong>, the number of test cases to follow. Each test case will start with two integers together on a line:&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>R</strong>. The next&nbsp;<strong>N</strong>&nbsp;lines will each contain a pair of integers --&nbsp;<strong>x<sub>i</sub></strong>&nbsp;and&nbsp;<strong>y<sub>i</sub></strong>&nbsp;-- the coordinates of the targets, starting with the target at (0, 0).</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100</li>
	<li>All target coordinates are integers.</li>
	<li>All targets will be at different locations.</li>
	<li>The first target listed will be located at (0, 0).</li>
	<li>There will be at least one value of&nbsp;<strong>r</strong>&nbsp;that gives an optimal solution and has the property that a rope of length&nbsp;<strong>r</strong>&nbsp;- 0.999999&nbsp;also gives the same solution (the same sequence of bends).</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10</li>
	<li>1 &le;&nbsp;<strong>R</strong>&nbsp;&le; 1,000</li>
	<li>0 &le;&nbsp;<strong>x<sub>i</sub></strong>&nbsp;&le; 1,000</li>
	<li>0 &le;&nbsp;<strong>y<sub>i</sub></strong>&nbsp;&le; 1,000</li>
</ul>

<div>&nbsp;</div>

### 출력

<p>For each test case, output a line of the form &quot;Case #<strong>C</strong>:&nbsp;<strong>k</strong>&quot;, where&nbsp;<strong>C</strong>&nbsp;is the 1-based case number, and&nbsp;<strong>k</strong>&nbsp;is the maximum number of bends that can be made in the rope in one swing.</p>

<div>&nbsp;</div>