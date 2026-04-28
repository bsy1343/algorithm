# [Gold IV] Mobile Computing - 3918

[문제 링크](https://www.acmicpc.net/problem/3918)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 8, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

비트마스킹, 브루트포스 알고리즘

### 문제 설명

<p>There is a mysterious planet called Yaen, whose space is 2-dimensional. There are many beautiful stones on the planet, and the Yaen people love to collect them. They bring the stones back home and make nice mobile arts of them to decorate their 2-dimensional living rooms.</p>

<p>In their 2-dimensional world, a mobile is defined recursively as follows:</p>

<ul>
	<li>a stone hung by a string, or</li>
	<li><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3918.%E2%80%85Mobile%E2%80%85Computing/076bf60c.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/3918/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:71px; width:111px" />a rod of length 1 with two sub-mobiles at both ends; the rod is hung by a string at the center of gravity of sub-mobiles. When the weights of the sub-mobiles are n and m, and their distances from the center of gravity are a and b respectively, the equation n &times; a = m &times; b holds.</li>
</ul>

<p>For example, if you got three stones with weights 1, 1, and 2, here are some possible mobiles and their widths:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3918.%E2%80%85Mobile%E2%80%85Computing/af444306.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/3918/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:113px; width:457px" /></p>

<p>Given the weights of stones and the width of the room, your task is to design the widest possible mobile satisfying both of the following conditions.</p>

<ul>
	<li>It uses all the stones.</li>
	<li>Its width is less than the width of the room.</li>
</ul>

<p>You should ignore the widths of stones.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3918.%E2%80%85Mobile%E2%80%85Computing/43d9df5c.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/3918/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:100px; width:140px" />In some cases two sub-mobiles hung from both ends of a rod might overlap (see the figure on the right). Such mobiles are acceptable. The width of the example is (1/3) + 1 + (1/4).</p>

### 입력

<p>The first line of the input gives the number of datasets. Then the specified number of datasets follow. A dataset has the following format.</p>

<pre>
r
s
w<sub>1</sub>
.
.
.
w<sub>s</sub>
</pre>

<p>r is a decimal fraction representing the width of the room, which satisfies 0 &lt;r&lt; 10. s is the number of the stones. You may assume 1 &le; s &le; 6. w<sub>i</sub> is the weight of the i-th stone, which is an integer. You may assume 1 &le; w<sub>i</sub> &le; 1000.</p>

<p>You can assume that no mobiles whose widths are between r &minus; 0.00001 and r + 0.00001 can be made of given stones.</p>

### 출력

<p>For each dataset in the input, one line containing a decimal fraction should be output. The decimal fraction should give the width of the widest possible mobile as defined above. An output line should not contain extra characters such as spaces.</p>

<p>In case there is no mobile which satisfies the requirement, answer &minus;1 instead.</p>

<p>The answer should not have an error greater than 0.00000001. You may output any number of digits after the decimal point, provided that the above accuracy condition is satisfied</p>