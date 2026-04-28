# [Silver III] Challenge Nine - 24840

[문제 링크](https://www.acmicpc.net/problem/24840)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 335, 정답: 140, 맞힌 사람: 108, 정답 비율: 37.895%

### 분류

수학, 그리디 알고리즘, 정수론

### 문제 설명

<p>Ada gives John a positive integer $N$. She challenges him to construct a new number (without leading zeros), that is a multiple of&nbsp;$9$, by inserting&nbsp;<i>exactly</i>&nbsp;one digit (<code>0</code>&nbsp;&hellip;&hellip;&nbsp;<code>9</code>) anywhere in the given number&nbsp;$N$. It is guaranteed that&nbsp;$N$&nbsp;does not have any leading zeros.</p>

<p>As John prefers smaller numbers, he wants to construct the&nbsp;<i>smallest</i>&nbsp;such number possible. Can you help John?</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$.&nbsp;$T$&nbsp;test cases follow.</p>

<p>Each test case has a single line containing a positive integer&nbsp;$N$: the number Ada gives John.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;$x$&nbsp;is the test case number (starting from 1) and&nbsp;$y$&nbsp;is the new number constructed by John. As mentioned earlier,&nbsp;$y$&nbsp;cannot have leading zeros.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
</ul>

### 힌트

<p>In Sample Case #1, there are only two numbers that can be constructed satisfying the divisibility constraint:&nbsp;$45$&nbsp;and&nbsp;$54$. John chooses the smaller number.</p>

<p>In Sample Case #2,&nbsp;$333$&nbsp;is the only number possible.</p>

<p>In Sample Case #3, there are four possible options -&nbsp;$212121$,&nbsp;$122121$,&nbsp;$121221$&nbsp;and&nbsp;$121212$&nbsp;- out of which the smallest number is&nbsp;$121212$.</p>