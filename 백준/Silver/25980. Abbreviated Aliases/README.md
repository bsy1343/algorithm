# [Silver I] Abbreviated Aliases - 25980

[문제 링크](https://www.acmicpc.net/problem/25980)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 146, 정답: 63, 맞힌 사람: 59, 정답 비율: 56.190%

### 분류

문자열, 정렬

### 문제 설명

<p>You are the owner of a large successful internet site with lots of users. All these users have chosen an alias of exactly $l$ characters for logging into the site. Recently, you noticed that you started running into disk space issues: storing all these aliases takes up a lot of data!</p>

<p>You do not have enough money to buy extra storage, so you are looking for ways to reduce the storage space needed. A friend gives you the following compression idea that might help: instead of storing the full alias for each user, you might get away with only storing a prefix of that alias, as long as no other alias has the same prefix. For example, if you just have the aliases <code>james</code> and <code>jacob</code>, you can store only <code>jam</code> and <code>jac</code> and still be able to identify them both.</p>

<p>This idea sounds quite interesting to you, and you are looking forward to finally having more space available on your disk again. You would like to find out how much space you need to store all aliases using this compression technique.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $n$ and $l$ ($2 \le n \le 10^4$, $1 \le l \le 10^3$), the number of aliases and the length of each alias.</li>
	<li>$n$ lines, each with an alias: a string consisting of exactly $l$ English lowercase characters (<code>a-z</code>). Each alias is unique.</li>
</ul>

### 출력

<p>Output the total number of characters you still need to store if you apply this compression technique.</p>