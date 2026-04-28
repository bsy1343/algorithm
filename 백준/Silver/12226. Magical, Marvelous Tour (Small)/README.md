# [Silver II] Magical, Marvelous Tour (Small) - 12226

[문제 링크](https://www.acmicpc.net/problem/12226)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 10, 맞힌 사람: 10, 정답 비율: 76.923%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>The mysterious owner of an electronics factory has decided to do something very intriguing. She has hidden <em>golden transistors</em> inside seven electronic devices, and the people who buy those devices will be invited to a magical, marvelous tour of the factory.</p>

<p>Arnar and Solveig have received a tip that there is a golden transistor hidden inside one device in their local electronics store. First they pooled their money together and bought all the devices, then placed them in a straight line, numbering the devices 0 to <strong>N</strong>-1. Each device has some number of transistors in it. Then they agreed on a strategy to decide who gets the golden transistor:</p>

<p>First, Arnar will select a range [a, b] (inclusive) of the devices, where 0&nbsp;&le;&nbsp;a&nbsp;&le;&nbsp;b&nbsp;&lt;&nbsp;N. Next, Solveig will choose which one set of devices she wants to take:</p>

<ul>
	<li>If a &gt; 0, she may take all the devices in the range [0, a-1].</li>
	<li>If b &lt; <strong>N</strong>-1, she may take all the devices in the range [b+1, N-1].</li>
	<li>She may always choose to take all the devices in the range [a, b].</li>
</ul>

<p>Once Solveig has chosen one of the sets of devices, Arnar takes all the devices she did not take.</p>

<p>For example, if there are 3 devices and Arnar selects the range [1, 1], Solveig may choose to take the range [0, 0], the range [1, 1] or the range [2, 2]. On the other hand, if Arnar selects the range [1, 2], then Solveig may choose to take the range [0, 0] or the range [1, 2].</p>

<p>Given how many transistors are in each device, and that Arnar and Solveig will each try to maximize their probability of getting the golden transistor (which is maximized by taking electronics with the maximum number of transistors), what is Arnar&#39;s probability of getting the golden transistor and thus winning the magical, marvelous tour?</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> lines follow. Each line contains five numbers: <strong>N</strong>, <strong>p</strong>, <strong>q</strong>, <strong>r</strong> and <strong>s</strong>. This indicates that there are <strong>N</strong> devices, and the i<sup>th</sup> device contains ((i * <strong>p</strong> + <strong>q</strong>) MOD <strong>r</strong> + <strong>s</strong>) transistors. Remember that the devices are numbered from 0 to <strong>N</strong>-1.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li>1 &le; <strong>p</strong> &le; 10<sup>6</sup>.</li>
	<li>1 &le; <strong>q</strong> &le; 10<sup>6</sup>.</li>
	<li>1 &le; <strong>r</strong> &le; 10<sup>6</sup>.</li>
	<li>1 &le; <strong>s</strong> &le; 10<sup>6</sup>.</li>
	<li>1 &le; <strong>N</strong> &le; 1000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is Arnar&#39;s probability of winning the magical, marvelous tour.</p>

<p>y will be considered correct if it is within an absolute or relative error of 10<sup>-9</sup> of the correct answer.</p>

### 힌트

<p>Note that the last sample case does not meet the limits for the Small dataset. You could have a correct solution for the Small dataset that returns the wrong answer, or runs for a very long time, on the last sample case.</p>

<p>Explanation of Sample Cases</p>

<p>In the first sample case, there is one electronic device with one transistor. Arnar must select the range [0, 0], and Solveig must choose to take all the devices in the range [0, 0]. Arnar can&#39;t possibly win the magical, marvelous tour.</p>

<p>In the second sample case, there are ten electronic devices, with the following numbers of transistors: [2, 5, 1, 4, 7, 3, 6, 2, 5, 1]. Arnar will choose the range [4, 5], which contains the devices with 7 and 3 transistors. Solveig will choose the range [6, 9], which contains the devices with 6, 2, 5 and 1 transistors, leaving Arnar with the first six devices, and a probability of 22/36 of winning the tour.</p>

<p>In the third sample case, the devices have 101 and 1 transistors.</p>

<p>In the fourth sample case, the devices have the following numbers of transistors: [103, 120, 114, 108, 102, 119, 113, 107, 101, 118, 112, 106, 100, 117, 111, 105, 122, 116, 110, 104].</p>

<p>In the fifth sample case, the devices have the following numbers of transistors: [1999999, 1999998, 1999997, 1999996, 1999995, 1999994, 1999993, 1999992, 1999991, 1999990].</p>

<p>In the sixth sample case, the devices both have 1 transistor.</p>

<p>In the seventh sample case, the devices have the following numbers of transistors: [100, 1, 2].</p>