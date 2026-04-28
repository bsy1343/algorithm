# [Gold IV] Promotion - 8054

[문제 링크](https://www.acmicpc.net/problem/8054)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 47, 정답: 16, 맞힌 사람: 12, 정답 비율: 41.379%

### 분류

자료 구조, 집합과 맵, 우선순위 큐

### 문제 설명

<p>Great Bytelandish net of supermarkets asked you for writing a program simulating costs of the promotion being prepared.</p>

<p>The promotion has to obey the following rules:</p>

<ul>
	<li>A customer, who wants to participate in the promotion, writes on the bill, paid by himself, his personal details and throws it to a special ballot box.</li>
	<li>At the end of every day of the promotion, two bills are taken out from the ballot box:
	<ul>
		<li>the first bill amounting to the greatest sum is chosen,</li>
		<li>then the bill amounting to the least sum is chosen;</li>
	</ul>
	</li>
	<li>The customer, who has paid the greatest bill, gets a money prize equal to the difference between the sum on his bill and the sum on the bill amounting to the least sum.</li>
	<li>To avoid multiple prizes for one purchase, both bills selected accordingly to the above rules, do not return to the ballot box, but all remaining bills still participate in promotion.</li>
</ul>

<p>Turnovers of the supermarket are very big, thus an assumption can be made, that at the end of every day, before taking out bills amounting to the greatest and the least sum, there are at least 2 bills in the ballot box.</p>

<p>Your task is to compute on the basis of information about prices on bills thrown to the ballot box on each day of promotion, what will be the total cost of prizes during the whole promotion.</p>

<p>
Write a program which:</p>

<ul>
	<li>reads from the standard input a list of prices on bills thrown to the ballot box on each day of the promotion,</li>
	<li>computes the total cost of prizes paid in consecutive days of promotion,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>The first line of the standard input contains one positive integer n, where 1 &le; n &le; 5,000, which is the duration of promotion in days.</p>

<p>Each of the next n lines consists of a sequence of non-negative integers separated by single spaces. Numbers in the (i+1)-th line of the file represent prices on bills thrown to the ballot box on the i-th day of promotion. The first integer in the line is k, 0 &le; k &le; 10<sup>5</sup>, the number of bills from the day, and the next &nbsp;numbers are positive integers standing for the prices on bills; none of these numbers is greater than 10<sup>6</sup>.</p>

<p>The total number of bills thrown to the ballot box during the whole promotion does not exceed 10<sup>6</sup>.</p>

### 출력

<p>The standard output should contain exactly one integer, which is equal to the total cost of prizes paid during the whole promotion.</p>

<p>&nbsp;</p>