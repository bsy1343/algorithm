# [Platinum III] Jungle Job - 30498

[문제 링크](https://www.acmicpc.net/problem/30498)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 50, 정답: 40, 맞힌 사람: 36, 정답 비율: 78.261%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Your local jungle is being taken over by monkeys! Trees are quickly being colonized by them! As a Brave Ape Pictures Collector, this is your chance of taking sooo many pictures of primates that for sure will amaze your colleagues.</p>

<p>In particular, each day, one new monkey discovers your favourite tree containing $n$ branches. From your long experience observing primates, you know two things. First, each branch of the tree only has room for a single monkey. Second, monkeys are very social animals and always stick together in groups, that is, the branches they occupy form a single connected component.</p>

<p>This particular invasive species of monkeys happens to be new to you and you have not yet learned to distinguish them from each other. Still you wonder: how many different pictures of the monkey colony could you take on each day, until the tree is full of monkeys?</p>

<p>As an example, consider the first sample case, visualized in Figure J.1. On the third day, there are four different pictures you can take of the monkey colony.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30498.%E2%80%85Jungle%E2%80%85Job/f3a674dd.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/30498.%E2%80%85Jungle%E2%80%85Job/f3a674dd.png" data-original-src="https://upload.acmicpc.net/3923eee3-e60d-4594-8337-b9401de50071/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 768px; height: 222px;" /></p>

<p style="text-align: center;">Figure J.1: Visualization of the first sample case on the third day. Branches are connected if they overlap (note the small gap between branches $1$ and $2$, and between branches $3$ and $4$).</p>

<p style="text-align: center;">Monkey image from <a href="https://www.freevector.com/flat-brown-monkey-25484">freevector.com</a></p>

<p>Given the exact structure of your favourite tree, determine for each day from $1$ to $n$ the number of different sets of branches the monkeys could occupy on that day, modulo $10^9+7$.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($1\leq n\leq 1000$), the number of branches in the tree.</li>
	<li>$n-1$ lines, the $i$th of which (\(1\leq i\leq n-1\)) contains an integer $p_i$ ($0\leq p_i&lt;i$), indicating that branch $i$ is connected to the upper end of branch $p_i$.</li>
</ul>

<p>The branches are numbered from $0$ to $n-1$, inclusive. Branch $0$ is connected to the roots of the tree and can also host a single monkey.</p>

### 출력

<p>Output $n$ integers. The $k$th integer should be the number of connected subtrees that consist of exactly $k$ branches, modulo $10^9+7$.</p>