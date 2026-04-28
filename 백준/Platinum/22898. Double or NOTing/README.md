# [Platinum I] Double or NOTing - 22898

[문제 링크](https://www.acmicpc.net/problem/22898)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 19, 정답: 7, 맞힌 사람: 7, 정답 비율: 100.000%

### 분류

많은 조건 분기, 구현, 두 포인터

### 문제 설명

<p>You are given a starting non-negative integer $S$ and an ending non-negative integer $E$. Both $S$&nbsp;and $E$ are given by their binary representation (that is, they are given written in base $2$). Your goal is to transform $S$&nbsp;into $E$. The following two operations are available to you:</p>

<ul>
	<li>Double your current value.</li>
	<li>Take the bitwise NOT of your current value. The binary representation of your current value is taken without unnecessary leading zeroes, and any unnecessary leading zeroes produced by the operation are dropped. (The only necessary leading zero is the one in the representation of $0$).</li>
</ul>

<p>For example, by using the double operation, $6$&nbsp;becomes&nbsp;$12$,&nbsp;$0$&nbsp;becomes&nbsp;$0$, and&nbsp;$10$&nbsp;becomes&nbsp;$20$. By using the NOT operation,&nbsp;$0$&nbsp;becomes&nbsp;$1$,&nbsp;$1$&nbsp;becomes&nbsp;$0$,&nbsp;$3=11_2$&nbsp;becomes&nbsp;$0$,&nbsp;$14=1110_2$&nbsp;becomes&nbsp;$1$,&nbsp;$10=1010_2$&nbsp;becomes&nbsp;$5=101_2$, and&nbsp;$5=101_2$&nbsp;becomes&nbsp;$2=10_2$. ($X_2$&nbsp;means the integer whose binary representation is&nbsp;$X$).</p>

<p>You can use these operations as many times as you want in any order. For example, you can transform $S=10001_2$&nbsp;to&nbsp;$E=111_2$&nbsp;using the NOT operation first, then using the double operation twice, and then another NOT operation:</p>

<p>$$10001_2 \overset{\text{NOT}}{\Longrightarrow} 1110_2 \overset{\times 2}{\Longrightarrow} 11100_2 \overset{\times 2}{\Longrightarrow} 111000_2 \overset{\text{NOT}}{\Longrightarrow}111_2\text{.}$$</p>

<p>Determine the smallest number of operations needed to complete the transformation, or say it is impossible to do so.</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$.&nbsp;$T$&nbsp;test cases follow. Each consists of a single line containing two strings&nbsp;$S$&nbsp;and&nbsp;$E$, the binary representations of the starting and ending integers, respectively.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where $x$&nbsp;is the test case number (starting from 1) and&nbsp;$y$&nbsp;is&nbsp;<code>IMPOSSIBLE</code>&nbsp;if there is no way to transform&nbsp;$S$&nbsp;into&nbsp;$E$&nbsp;using the two operations. Otherwise,&nbsp;$y$&nbsp;is the smallest number of operations needed to transform&nbsp;$S$&nbsp;into&nbsp;$E$.</p>

### 제한

<ul>
	<li>$1 \le T \le 100$.</li>
	<li>Each character of&nbsp;$S$&nbsp;is either&nbsp;<code>0</code>&nbsp;or&nbsp;<code>1</code>.</li>
	<li>The first digit of&nbsp;$S$&nbsp;can be&nbsp;<code>0</code>&nbsp;only if the length of&nbsp;$S$&nbsp;is&nbsp;$1$.</li>
	<li>Each character of&nbsp;$E$&nbsp;is either&nbsp;<code>0</code>&nbsp;or&nbsp;<code>1</code>.</li>
	<li>The first digit of&nbsp;$E$&nbsp;can be&nbsp;<code>0</code>&nbsp;only if the length of&nbsp;$E$&nbsp;is&nbsp;$1$.</li>
</ul>

### 힌트

<p>Sample Case #1 is the example shown in the main part of the statement.</p>

<p>These are possible optimal ways of solving Sample Cases #2, #3, and #4, respectively:</p>

<p>$$1011_2 \overset{\text{NOT}}{\Longrightarrow} 100_2 \overset{\times 2}{\Longrightarrow} 1000_2 \overset{\text{NOT}}{\Longrightarrow}111_2\text{,}$$</p>

<p>$$1010_2 \overset{\times 2}{\Longrightarrow} 10100_2 \overset{\text{NOT}}{\Longrightarrow} 1011_2\text{, and}$$</p>

<p>$$0_2 \overset{\text{NOT}}{\Longrightarrow} 1_2\text{.}$$</p>

<p>In Sample Case #5, it is not possible to get from $0_2$ to $101_2$ with any sequence of operations.</p>

<p>In Sample Case #6, we do not need to perform any operations because $S=E$.</p>