# [Platinum I] Peterson Polyglot - 21902

[문제 링크](https://www.acmicpc.net/problem/21902)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 5, 맞힌 사람: 5, 정답 비율: 41.667%

### 분류

자료 구조, 작은 집합에서 큰 집합으로 합치는 테크닉, 트리, 트라이

### 문제 설명

<p>Peterson loves to learn new languages, but his favorite hobby is making new ones. Language is a set of words, and word is a sequence of lowercase Latin letters.</p>

<p>Peterson makes new language every morning. It is difficult task to store the whole language, so Peterson have invented new data structure for storing his languages which is called <em>broom</em>. Broom is rooted tree with edges marked with letters. Initially broom is represented by the only vertex --- the root of the broom. When Peterson wants to add new word to the language he stands at the root and processes the letters of new word one by one. Consider that Peterson stands at the vertex $u$. If there is an edge from $u$ marked with current letter, Peterson goes through this edge. Otherwise Peterson adds new edge from $u$ to the new vertex $v$, marks it with the current letter and goes through the new edge. Size of broom is the number of vertices in it.</p>

<p>In the evening after working day Peterson can&#39;t understand the language he made this morning. It is too difficult for bored Peterson and he tries to make it simpler. Simplification of the language is the process of erasing some letters from some words of this language. Formally, Peterson takes some positive integer $p$ and erases $p$-th letter from all the words of this language having length at least $p$. Letters in words are indexed starting by 1. Peterson considers that simplification should change at least one word, i.e. there has to be at least one word of length at least $p$. Peterson tries to make his language as simple as possible, so he wants to choose $p$ such that the size of the broom for his simplified language is as small as possible.</p>

<p>Peterson is pretty annoyed with this task so he asks you for help. Write a program to find the smallest possible size of the broom and integer $p$.</p>

### 입력

<p>The first line of input contains integer $n$ ($2 \le n\le 3 \cdot 10^5$) --- the size of the broom.</p>

<p>Next $n - 1$ lines describe the broom: $i$-th of them contains integers $u_i$, $v_i$ and letter $x_i$ --- describing the edge from $u_i$ to $v_i$ marked with letter $x_i$.</p>

<p>Vertices are numbered from 1 to $n$. All $x_i$ are lowercase latin letters. Vertex 1 is the root of the broom.</p>

<p>Edges describe correct broom which is made from Peterson&#39;s language.</p>

### 출력

<p>The first line of output should contain the minimum possible size of the broom after its simplification. The second line of output should contain integer $p$ to choose. If there are several suitable $p$ values, print the smallest one.</p>

### 제한

<p>Assume that the language is made of words $s_1, s_2, \ldots s_m$. Let $S$ be the total length of the words, i.e. $S = \sum\limits_i{|s_i|}$. And let $L$ be the maximum word length, i.e. $L = \max\limits_i{|s_i|}$.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/7ce16bd1-23e7-4b97-a38f-e2ce34910cf1/-/preview/" style="width: 433px; height: 298px;" /></p>

<p>Broom for initial language from sample test 2. &amp; &amp; Broom after simplification with $p = 2$.</p>

<p>Broom from the second sample test can be built using language &quot;piece&quot;, &quot;of&quot;, &quot;pie&quot;, &quot;pretty&quot;, &quot;prefix&quot;. Its simplification with $p = 2$ obtains the language of words &quot;pece&quot;, &quot;o&quot;, &quot;pe&quot;, &quot;petty&quot;, &quot;pefix&quot;. This language gives us the broom with minimum possible size.</p>