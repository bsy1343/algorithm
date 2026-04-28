# [Platinum II] LJEPOTICA - 17147

[문제 링크](https://www.acmicpc.net/problem/17147)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 512 MB

### 통계

제출: 25, 정답: 17, 맞힌 사람: 17, 정답 비율: 80.952%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Beauty and the Geek is a reality television series advertised as connecting female beauties and male geeks with the goal of creating &quot;The Ultimate Social Experiment&quot;. This task is advertised as connecting reality TV and competitive programming with the goal of creating a fun task.</p>

<p>Our hero is a beauty Ena, trapped in a complete binary tree of depth N. Each node of the tree has a value: root of the tree has a value of 1, and for each node with a value of x, its left child has a value of 2x, and its right child has a value of 2x + 1. Ena can move from a node to one of its two children, heading for the exit which is located in one of the leaves (nodes of depth N, with no children).</p>

<p>Ena knows an exact path from the root to the exit leaf. More precisely, she knows the correct sequence of N &ndash; 1 moves, each of them being &ldquo;left&ldquo; or &ldquo;right&ldquo;, which would guide her from the root to the exit leaf. Unfortunately, Ena is not sure which side is left and which side is right. Therefore, during her trip, she changed her mind exactly K times about the meaning of &ldquo;left&rdquo; and &ldquo;right&rdquo;. When she changes her mind, she moves accordingly until the end of the trip (a leaf node) or until the next change of mind. Ena&#39;s change of mind can happen only once before each move in the tree (including the first one). Also, nobody knows whether Ena had correct sides in mind while entering the root of the tree.</p>

<p>The producers of the TV show will save the lost Ena if you, her geek partner, answer correctly to the following question: What is the sum of leaf values where Ena can finish her trip, considering only leaves with values of at least A and at most B?</p>

### 입력

<p>The first line contains integers N and K from the task description (2 &le; N &le; 1000, 0 &le; K &le; N &ndash; 1).</p>

<p>In the second line there is a word containing N &ndash; 1 characters &lsquo;L&rsquo; (left) and &lsquo;R&rsquo; (right) representing the correct path from the root to the exit leaf.</p>

<p>The third line contains the number A from the task description, in binary form without leading zeros.</p>

<p>The fourth line contains the number B from the task description, in binary form without leading zeros.</p>

<p>Ena will be able to finish in leaves A and B.</p>

### 출력

<p>Output the required sum as a decimal integer modulo 1 000 000 007.</p>