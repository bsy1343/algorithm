# [Platinum III] High-quality Tree - 26181

[문제 링크](https://www.acmicpc.net/problem/26181)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 123, 정답: 78, 맞힌 사람: 62, 정답 비율: 65.957%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그리디 알고리즘, 그래프 탐색, 트리, 깊이 우선 탐색, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>The binary search tree is one of the most useful data structures in computer science. Many methods exist to keep them balanced, such as using tree rotations (like in AVL-trees) or randomness (like in treaps). One thing that these methods have in common is that they are all somewhat slow and complicated.</p>

<p>But this is all about to change! Rob the computer scientist has invented a new method to keep rooted binary trees balanced, that is much better than the current state-of-the-art. The main idea is to repeatedly perform an operation Rob calls a <em>robbery</em>. One robbery is to take a leaf from the tree, and remove it. By applying robberies at the right times, Rob is able to keep a tree balanced in $\mathcal{O}(1)$ amortized time.</p>

<p>Some people have criticised Rob&#39;s revolutionary discovery, saying that removing elements from the tree makes the algorithm incorrect. Rob does not agree that this is a big problem; if you plan to store $2 \cdot 10^5$ numbers, you probably do not need all of them. But Rob accepts the criticism and decides to find a way to minimise the number of robberies.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/d68ff38a-4134-4e10-b5b4-d5a6e7cd091c/-/preview/" style="width: 400px; height: 284px;" /></p>

<p style="text-align: center;">Figure H.1: Illustration of Sample Input 2. The tree becomes strongly balanced after removing the three vertices marked in red ($4$, $5$, and $10$); the minimum number of vertices that need to be removed to make the tree strongly balanced.</p>

<p>You are given a rooted binary tree with $n$ vertices. The vertices are numbered from $1$ to $n$, and vertex $1$ is the root. Your task is to find the minimum number of robberies to make the tree <em>strongly balanced</em>, meaning that all of its subtrees are balanced. A rooted binary tree is called balanced if the depth of its left and right subtrees differ by at most one. Recall that a robbery is simply to take a leaf and remove it, and doing so may turn its parent vertex into a leaf. See Figure H.1 for an example.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($1 \leq n \leq 2 \cdot 10^5$), the number of vertices in the tree.</li>
	<li>$n-1$ lines, each with two integers $u$ and $v$ ($1 \leq u, v \leq n$, $u\neq v$), indicating an edge between vertices $u$ and $v$.</li>
</ul>

<p>It is guaranteed that the given edges form a valid binary tree with vertex $1$ as the root. However, the edges can appear in any order and are not directed: $u$ can be the parent of $v$ or the other way around.</p>

### 출력

<p>Output the minimum number of leaves you need to remove to make the tree strongly balanced.</p>