# [Silver III] A Population of Rabbits - 10622

[문제 링크](https://www.acmicpc.net/problem/10622)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 25, 정답: 12, 맞힌 사람: 11, 정답 비율: 68.750%

### 분류

다이나믹 프로그래밍, 구현, 시뮬레이션

### 문제 설명

<p>A hypothetical population of rabbits follows certain fixed rules.</p>

<ol>
	<li>The population begins in the first month with a pair of newborn rabbits.</li>
	<li>Rabbits reach reproductive age in one month.</li>
	<li>In any month, every rabbit of reproductive age mates with another rabbit of reproductive age.</li>
	<li>One month after two rabbits have mated, the female rabbit gives birth to a male and female rabbit.</li>
	<li>Rabbits die after a given age of D months and not reproducing after R months where R &le; D.</li>
</ol>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/10622.%E2%80%85A%E2%80%85Population%E2%80%85of%E2%80%85Rabbits/87783b42.png" data-original-src="https://www.acmicpc.net/upload/images2/rabbit.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:221px; width:243px" />In the figure on the right, a depiction of a rabbit tree is shown in which rabbits live for three months (meaning that they reproduce only twice before dying). The life of a particular rabbit pair is shown with solid arrows. For example the initial pair starts their life in Month 1, mates in month 2 and a new pair is born in month 3 as a result (the dotted arrow). The original pair mates again in month 3, and a new pair is born in month 4 (dotted arrow). However the original pair dies in month 4 right after giving birth and is therefore not shown in the population of month 4.&nbsp;</p>

### 입력

<p>The input consists of multiple test cases. The first line of input is the number of test cases N (1&le;N&le;100). Each of the following N lines contains positive integers D&le;100, R&le;100, and M&le;20 where D is the number of months after which a rabbit dies, R is the number of month after which a rabbit stops reproducing, and M is the number of months to model.&nbsp;</p>

### 출력

<p>For each test case, print a single line saying &ldquo;Case #n:&rdquo; where n is the test case number followed by a space followed the total number of rabbit pairs that will remain after M months.&nbsp;</p>