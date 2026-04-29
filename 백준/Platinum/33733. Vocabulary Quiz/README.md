# [Platinum IV] Vocabulary Quiz - 33733

[문제 링크](https://www.acmicpc.net/problem/33733)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 66, 정답: 47, 맞힌 사람: 41, 정답 비율: 75.926%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 애드 혹, 오프라인 쿼리, 트리

### 문제 설명

<p>Bessie is helping Elsie with her upcoming vocabulary quiz. The words to be tested will be drawn from a bank of $M$ distinct words, where no word in the bank is a prefix of another word in the bank.</p>

<p>While the bank is nonempty, Bessie will select a word from the bank, remove it from the bank, and read it to Elsie one character at a time from left to right. Elsie's task is to tell Bessie once she can uniquely identify it, after which Bessie will stop reading.</p>

<p>Bessie has already decided to read the words from the word bank in the order $w_1,w_2,\dots,w_M$. If Elsie answers as quickly as possible, how many characters of each word will Bessie read?</p>

<p>The words are given in a compressed format. We will first define $N+1$ ($1\le N\le 10^6$) distinct words, and then the word bank will consist of all those words that are not a prefix of another word. The words are defined as follows:</p>

<ul>
	<li>Initially, the $0$th word will be the empty string.</li>
	<li>Then for each $1\le i\le N$, the $i$th word will be equal to the $p_i$th word plus an additional character at the end ($0\le p_i&lt;i$). The characters are chosen such that all $N+1$ words are distinct.</li>
</ul>

### 입력

<p>The first line contains $N$, where $N+1$ is the number of words given in the compressed format.</p>

<p>The next line contains $p_1,p_2,\dots,p_N$ where $p_i$ represents that the $i$-th word is formed by taking the $p_i$-th word and adding a single character to the end.</p>

<p>Let $M$ be the number of words that are not a prefix of some other word. The next $M$ lines will contain $w_1,w_2,\dots,w_M$, meaning that the $w_i$th word will be the $i$th to be read. It is guaranteed that the words to be read form a permutation of the words in the word bank.</p>

### 출력

<p>Output $M$ lines, where the $i$th line contains the number of characters of the $i$th word that Bessie reads.</p>