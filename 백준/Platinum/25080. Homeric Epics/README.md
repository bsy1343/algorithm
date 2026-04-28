# [Platinum V] Homeric Epics - 25080

[문제 링크](https://www.acmicpc.net/problem/25080)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 2, 맞힌 사람: 2, 정답 비율: 40.000%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐, 트리

### 문제 설명

<p>In&nbsp;<em>Homeric Epics</em>&nbsp;there are&nbsp;$n$&nbsp;different words numbered from&nbsp;$1$&nbsp;to&nbsp;$n$. The&nbsp;$i$-th word appears&nbsp;$w_i$&nbsp;times in the text. Allison wants to substitute the&nbsp;$i$-th word with a&nbsp;$k$-ary string&nbsp;$s_i$, satisfying the following constraint: for any&nbsp;$1 \le i,j \le n$,&nbsp;$i \ne j$,&nbsp;$s_i$&nbsp;is not the prefix of&nbsp;$s_j$.</p>

<p>Allison wants to know how to choose&nbsp;$s_i$&nbsp;so that the resulting text has minimum length. Under the assumption that the total length of the text is minimal, Allison wants to know what is the shortest possible length of the longest&nbsp;$s_i$.</p>

<p>A string is called a&nbsp;$k$-ary string if and only if its characters are in&nbsp;$\{0, 1, \dots, k-1\}$.</p>

<p>A string&nbsp;$s_1$&nbsp;is said to be a prefix of&nbsp;$s_2$&nbsp;if and only if there exists&nbsp;$1 \le t \le m$&nbsp;such that&nbsp;$s_1 = s_2[1 \dots t]$&nbsp;where&nbsp;$m$&nbsp;is the length of&nbsp;$s_2$&nbsp;and&nbsp;$s_2[1 \dots t]$&nbsp;represents the substring of&nbsp;$s_2$&nbsp;formed by the first&nbsp;$t$&nbsp;characters.</p>

### 입력

<p>The first line of the input file contains two integers&nbsp;$n,k$&nbsp;separated by one space, denoting there are&nbsp;$n$&nbsp;words in total and we need to substitute the words with a&nbsp;$k$-ary string.</p>

<p>In the following&nbsp;$n$&nbsp;lines, the&nbsp;$(i+1)$-th line has a nonnegative integer&nbsp;$w_i$&nbsp;denoting the number of times the&nbsp;$i$-th word has occurred.</p>

### 출력

<p>The output consists of two lines. The first line is an integer denoting the minimum length of the&nbsp;<em>Homeric Epics</em>&nbsp;after substitution. The second line is an integer denoting the minimum length of the longest string&nbsp;$s_i$&nbsp;given the total length is minimum.</p>

### 제한

<ul>
	<li>$3 &le; n &le; 100\,000$</li>
	<li>$2 &le; k &le; 9$</li>
	<li>$0 &lt; w_i \le 10^{11}$</li>
</ul>