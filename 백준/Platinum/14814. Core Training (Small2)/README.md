# [Platinum II] Core Training (Small2) - 14814

[문제 링크](https://www.acmicpc.net/problem/14814)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 6, 맞힌 사람: 6, 정답 비율: 50.000%

### 분류

(분류 없음)

### 문제 설명

<p>Writing Code Jam problems is hard, so we have built an AI to come up with new ideas. To make the AI as creative as possible, we have given it&nbsp;<strong>N</strong>&nbsp;different &quot;cores&quot;, each of which has its own &quot;personality&quot;. However, just like people, these cores may become distracted or corrupt or may refuse to work; the i-th core has a&nbsp;<em>success probability</em>&nbsp;<strong>P<sub>i</sub></strong>&nbsp;of functioning properly. As long as at least&nbsp;<strong>K</strong>&nbsp;of the cores function properly, the AI will function properly. Otherwise, it will probably become evil and trap us in a maze of fiendish puzzles of its own design. And who knows what it might do to Code Jam &mdash; it might just write a bunch of tough probability problems!</p>

<p>To prevent this from happening, we plan to train one or more of the cores to become more reliable. We have a total of&nbsp;<strong>U</strong>&nbsp;&quot;training units&quot; that we can use to improve the cores. Spending X units on the i-th core will add X to its success probability. We can divide up the units among the cores however we like, and it is possible that one or more cores may not receive any units. Of course, a core&#39;s success probability cannot be increased above 1.</p>

<p>If we assign the training units to maximize the probability that the AI will function properly, what is that probability?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow; each consists of three lines. The first line contains two integers&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>K</strong>: the total number of cores, and the minimum number of cores that must succeed for the AI to function properly. The second line contains one rational&nbsp;<strong>U</strong>: the number of training units. The third line contains&nbsp;<strong>N</strong>&nbsp;rational numbers&nbsp;<strong>P<sub>i</sub></strong>; the i-th of these gives the probability that the i-th core will function properly. All of these probabilities are specified to exactly four decimal places of precision.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 50.</li>
	<li>For all i, 0.0000 &le;&nbsp;<strong>P<sub>i</sub></strong>&nbsp;&le; 1.0000.</li>
	<li>0.0000 &le;&nbsp;<strong>U</strong>&nbsp;&le;&nbsp;<strong>N</strong>&nbsp;- the sum of all&nbsp;<strong>P<sub>i</sub></strong>. (There will not be more training units than can be used.)</li>
	<li>1 &le;&nbsp;<strong>K</strong>&nbsp;&le;&nbsp;<strong>N</strong>.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the probability that the AI will function properly if the training units are assigned optimally.&nbsp;<code>y</code>&nbsp;will be considered correct if it is within an absolute or relative error of 10<sup>-6</sup>&nbsp;of the correct answer.</p>

### 힌트

<p>Note that the last two sample cases would not appear in Small dataset 1.</p>

<p>In Sample Case #1, we have enough training units to spend to give all cores a success probability of 1, so the AI will certainly function properly.</p>

<p>In Sample Case #2, both of the cores must function properly for the AI to function properly, so we must give each core at least some training units. The best option turns out to be to train each one up to 0.5. Then the probability that the AI functions properly is 0.5 &times; 0.5 = 0.25. Any other assignment is inferior; for instance, if we train one core to 0.9 and the other core to 0.1, the probability of success is only 0.9 &times; 0.1 = 0.09.</p>

<p>In Sample Case #3, we have no training units to spend, and at least one of the two cores must function properly for the AI to function properly. We can approach this by first calculating the probability that the AI does&nbsp;<em>not</em>&nbsp;function properly, which happens only if both cores fail to function properly. The probability that both cores fail is (1 - 0.9) &times; (1 - 0.8) = 0.02. So the probability that at least one core functions properly, and thus that the AI functions properly, is 1 - 0.02 = 0.98.</p>

<p>In Sample Case #4, the optimal strategy is to give all the training units to the second core. That makes the probability of at least one core functioning properly 1 - (0.6 &times; 0.4) = 0.76. All other options are inferior; for example, giving all the training units to the first core only yields 0.75, and dividing them equally among the cores gives 0.7525.</p>