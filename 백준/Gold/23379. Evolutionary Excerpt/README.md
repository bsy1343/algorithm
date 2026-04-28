# [Gold II] Evolutionary Excerpt - 23379

[문제 링크](https://www.acmicpc.net/problem/23379)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 290, 정답: 74, 맞힌 사람: 62, 정답 비율: 24.900%

### 분류

수학, 다이나믹 프로그래밍, 애드 혹, 확률론, 최장 공통 부분 수열 문제

### 문제 설명

<p>Being a renowned Bacteria and Protein Collector, you are leading research into the spread of bacteria and virus proteins. As part of this research, public locations spread over the entire world have been swabbed for DNA samples.</p>

<p>The sequenced DNA samples have just come back from the lab, and you would now like to prove your hypothesis that even though the samples have been taken in different continents, they are still related. &nbsp;However, as it turns out, they are not related. In fact, the samples are independent uniformly random DNA sequences containing characters in &quot;<code>ACGT</code>&quot;. &nbsp;This means that each character in each sequence has a probability of exactly $25\%$ of being each of &#39;<code>A</code>&#39;, &#39;<code>C</code>&#39;, &#39;<code>G</code>&#39;, or &#39;<code>T</code>&#39;.</p>

<p>Nevertheless, you would still like to convince your colleagues that the samples are related. You decided that two pieces of DNA are <em>related</em> when they share at least half of their code: if the sequences both have length $n$ they are related when they share a common subsequence<sup>1</sup>&nbsp;of length at least $\frac 12 n$.</p>

<p>Given two independent uniformly random DNA sequences $A$ and $B$, your task is to find a common subsequence to prove that they are related. You already did some analysis, and confirmed that the probability of failure is in fact less than $10^{-1000}$ per instance when $n=10^6$.</p>

<p><sup>1</sup>A sequence $S$ is a <em>subsequence</em> of a sequence $A$ when $S$ can be obtained from $A$ by deleting some or none of the elements of $A$ while preserving the order of the remaining elements.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$, the length of the DNA sequences.</li>
	<li>One line with a string $A$ consisting of $n$ independent uniformly random characters in &quot;<code>ACGT</code>&quot;.</li>
	<li>One line with a string $B$ consisting of $n$ independent uniformly random characters in &quot;<code>ACGT</code>&quot;.</li>
</ul>

<p>Your submission will be run on exactly $100$ test cases, all of which will have $n=10^6$. The samples are smaller and for illustration only.</p>

<p>Each of your submissions will be run on new random test cases.</p>

<p>A testing tool is provided to run your submission on large random inputs. It does not verify the correctness of your answer.</p>

### 출력

<p>Output a common subsequence of length at least $\frac 12 n$.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>