# [Silver III] gWheels (Small) - 12068

[문제 링크](https://www.acmicpc.net/problem/12068)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 57, 정답: 29, 맞힌 사람: 18, 정답 비율: 45.000%

### 분류

브루트포스 알고리즘, 유클리드 호제법, 수학, 정수론

### 문제 설명

<p>A typical mountain bike has two groups of gears: one group connected to the pedals, and one group connected to the rear tire. A gear group consists of many gears, which usually have different numbers of teeth. A chain connects one of the gears in the pedal gear group to one of the gears in the tire gear group, and this determines the ratio between the cyclist&#39;s pedaling speed and the tire speed. For example, if the chain connects a gear with 5 teeth on the pedals to a gear with 10 teeth on the tires, the ratio will be 1/2, since the cyclist needs to make the pedal gear rotate twice to make the tire rotate once. The cyclist can change the chain to connect any one gear from the pedal group to any one gear from the tire group.</p>

<p>You have just bought a special new mountain bike with&nbsp;<em>three</em>&nbsp;groups of gears: one connected to the pedals, one connected to the tire, and one extra group in between. This mountain bike has two chains; the first chain must always connect one gear from the pedal gear group to one gear on the extra gear group, and the second chain must always connect one gear from the extra gear group to one gear on the tire gear group. Moreover, the two chains cannot both use the same gear from the extra gear group.</p>

<p>Given the numbers of teeth on the available gears on the pedals, extra, and tire groups, is it possible to make the ratio (between pedaling speed and tire speed) be exactly&nbsp;<strong>P/Q</strong>? For a given set of gears, you may need to answer multiple such questions.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each begins with one line with 3 integers&nbsp;<strong>N<sub>p</sub></strong>,&nbsp;<strong>N<sub>e</sub></strong>, and&nbsp;<strong>N<sub>t</sub></strong>, representing the numbers of gears on the pedals, extra, and tire groups. Then, three more lines follow. These contain&nbsp;<strong>N<sub>p</sub></strong>,&nbsp;<strong>N<sub>e</sub></strong>, and&nbsp;<strong>N<sub>t</sub></strong>&nbsp;integers, respectively, representing the numbers of teeth on the different gears on the pedals, extra, and tire gear groups, respectively. (It is guaranteed that the numbers of teeth on the gears within a group are all distinct.) The next line after that consists of one integer,&nbsp;<strong>M</strong>, the number of questions. Finally, there are&nbsp;<strong>M</strong>&nbsp;lines, each with 2 integers,&nbsp;<strong>P</strong>&nbsp;and&nbsp;<strong>Q</strong>, representing the target ratio. (It is not guaranteed that this ratio is a reduced fraction.)</p>

### 출력

<p>For each test case, first output one line containing &quot;Case #x:&quot;, where x is the test case number (starting from 1). Then output one line for each question within the test case, in the order that the questions were presented:&nbsp;<code>Yes</code>&nbsp;if it&#39;s possible to make the ratio&nbsp;<strong>P/Q</strong>, and&nbsp;<code>No</code>&nbsp;if it&#39;s impossible.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le; the number of teeth on each gear &le; 10000.</li>
	<li>1 &le; all values of&nbsp;<strong>P</strong>,&nbsp;<strong>Q</strong>&nbsp;&le; 10<sup>9</sup>.</li>
	<li>1 &le;&nbsp;<strong>M</strong>&nbsp;&le; 10.</li>
	<li>1 &le;&nbsp;<strong>N<sub>p</sub>, N<sub>t</sub></strong>&nbsp;&le; 10.</li>
	<li>2 &le;&nbsp;<strong>N<sub>e</sub></strong>&nbsp;&le; 10.</li>
</ul>

### 힌트

<p>For the first question in the test case, it&#39;s impossible to get the ratio 1/1 since this would require both chains to be on the same gear in the extra gear group, which is not allowed.</p>

<p>For the second question in the test case, you can make the first chain connect the 5-tooth gear on the pedal gear group to the 4-tooth gear on the extra gear group, and make the second chain connect the 6-tooth gear on the extra gear group to the 3-tooth gear on the tire gear group. With this setup, the ratio is 5/2.</p>