# [Gold V] Nowhere Money - 5661

[문제 링크](https://www.acmicpc.net/problem/5661)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 10, 맞힌 사람: 9, 정답 비율: 64.286%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 수학

### 문제 설명

<p>In Nowhere town, people use &ldquo;coin and slot&rdquo; as their money. There are 2 types of coins called size1 and size2. Size2 coin is twice the thickness of size1. People stack their coins in slots and use them as money. There are many size of slots. The slot of size $n$ is able to stack up $n$ size1 coins. Only filled-up slot is considered as legal money. The value of each filled-up slot is the distinct ways its can stack coins inside. For example, for size-1 slot, there is only one way to stack a single size1 coin inside. For size-2 slot, there are 2 ways to stack two size1 coins or one size2 coin inside. And for size-5 slot, there are 8 ways to stack coins inside, which can be illustrated as follow: 1 1 1 1 1, 1 1 1 2, 1 1 2 1, 1 2 1 1, 2 1 1 1, 1 2 2, 2 1 2, 2 2 1. So the value of filled up slot with size-1, size-2 and size-5 are 1, 2 and 8 (monetary) units respectively (regardless of the type of coins or the ways they are stacked).</p>

<p>Mr.Thinktwice is an owner of a grocery store in this town. He noticed that customers are likely to go to the shop that can return the (money) change in the form that suits their customer. And from his little survey, he found that most customers would like to get their amount of change in the form according to these 2 simple constraints.</p>

<ol>
	<li>The number of slots is minimum.</li>
	<li>The size of each slot must be different from each other by at least 2. This means that customers does not want any slots with the same size and it will be easier for them to distinguish these differences if the sizes are not too close.</li>
</ol>

<p>So Mr.Thinktwice ask you to write a program that can give him a series of slot sizes for a given amount of change according to the previous constraints. Moreover, the series must be sorted in descending order. For more specific, any amount of change can be written in this formula.</p>

<p>$$ \begin{align*} X &amp; = \sum_{i=1}^{n}{T(s_i)} \\ &amp; = T(s_1) + \cdots + T(s_i) + \cdots + T(s_n)\text{, } s_1 \gg s_2 \gg \cdots \gg \gg s_i \gg \cdots \gg s_n &gt; 0 \end{align*} $$</p>

<p>where</p>

<ul>
	<li>$X$ is an amount of change</li>
	<li>$n$ is the total number of slot.</li>
	<li>$s_i$ is the size of $i$<sup>th</sup> slot. T is a function mapping</li>
	<li>$T$ is a function mapping from a slot size to a number of distinct ways of stacking coins.</li>
	<li>and when $j \gg k \equiv j &ge; k+2$</li>
</ul>

<p>For example:</p>

<p>$$ \begin{align*} 10 &amp; = T(5) + T(2) \\ &amp; = 8 + 2 \\ 1\,000\,000 &amp; = T(29) + T(25) + T(23) + T(11) + T(9) \\ &amp; = 832\,040 + 121\,393 + 46\,368 + 144 + 55 \end{align*}$$</p>

### 입력

<p>Input is a standard input which contains a set of integer. Each line of the input is an amount of change which represents by a positive integer less than or equal to $5 \times 10^{18}$. The input is terminated when the EOF (End-Of-File) is reached.</p>

### 출력

<p>For each amount of change, generate 4 lines of output data. The first line is the amount of change itself. The second line is a series of slot sizes (in descending order) separated by spaces. (The maximum slot size is less than or equal to 90.) The third line is a series of corresponding slot values. The fourth line is a blank line.</p>