# [Gold IV] Seven-segment Display (Small) - 12206

[문제 링크](https://www.acmicpc.net/problem/12206)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 21, 맞힌 사람: 18, 정답 비율: 60.000%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Tom is a boy whose dream is to become a scientist, he invented a lot in his spare time. He came up with a great idea several days ago: to make a stopwatch by himself! So he bought a seven-segment display immediately.</p>

<p>The seven elements of the display are all light-emitting diodes (LEDs) and can be lit in different combinations to represent the arabic numerals like:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12206.%E2%80%85Seven-segment%E2%80%85Display%E2%80%85(Small)/249449fe.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12206.%E2%80%85Seven-segment%E2%80%85Display%E2%80%85(Small)/249449fe.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12206/images-69.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:69px; width:429px" /></p>

<p>However, just when he finished the programs and tried to test the stopwatch, some of the LEDs turned out to be broken! Some of the segments can never be lit while others worked fine. So the display kept on producing some ambiguous states all the time...</p>

<p>Tom has recorded a continuous sequence of states which were produced by the display and is curious about whether it is possible to understand what this display was doing. He thinks the first step is to determine the state which the display will show&nbsp;<strong>next</strong>, could you help him?</p>

<p>Please note that the display works well despite those broken segments, which means that the display will keep on counting down&nbsp;<strong>cyclically</strong>&nbsp;starting from a certain number (can be any one of 0-9 since we don&#39;t know where this record starts from). &#39;Cyclically&#39; here means that each time when the display reaches 0, it will keep on counting down starting from 9 again.</p>

<p>For convenience, we refer the seven segments of the display by the letters A to G as the picture below:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12206.%E2%80%85Seven-segment%E2%80%85Display%E2%80%85(Small)/f95afb0e.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12206.%E2%80%85Seven-segment%E2%80%85Display%E2%80%85(Small)/f95afb0e.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12206/images-70.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:93px; width:53px" /></p>

<p>For example, if the record of states is like:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12206.%E2%80%85Seven-segment%E2%80%85Display%E2%80%85(Small)/b2435a03.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12206.%E2%80%85Seven-segment%E2%80%85Display%E2%80%85(Small)/b2435a03.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12206/images-71.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:69px; width:213px" /></p>

<p>It&#39;s not that hard to figure out that ONLY segment B is broken and the sequence of states the display is trying to produce is simply &quot;9 -&gt; 8 -&gt; 7 -&gt; 6 -&gt; 5&quot;. Then the next number should be 4, but considering of the brokenness of segment B, the next state should be:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12206.%E2%80%85Seven-segment%E2%80%85Display%E2%80%85(Small)/c9bfca68.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12206.%E2%80%85Seven-segment%E2%80%85Display%E2%80%85(Small)/c9bfca68.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12206/images-72.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:69px; width:40px" /></p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. Each test case is a line containing an integer <strong>N</strong> which is the number of states Tom recorded and a list of the <strong>N</strong> states separated by spaces. Each state is encoded into a 7-character string represent the display of segment A-G, from the left to the right. Characters in the string can either be &#39;1&#39; or &#39;0&#39;, denoting the corresponding segment is on or off, respectively.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 2000.</li>
	<li><span style="line-height:1.6em">1 &le; </span><strong style="line-height:1.6em">N</strong><span style="line-height:1.6em"> &le; 5.</span></li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1). If the input unambiguously determines the next state of the display, y should be that next state (in the same format as the input). Otherwise, y should be &quot;ERROR!&quot;.</p>