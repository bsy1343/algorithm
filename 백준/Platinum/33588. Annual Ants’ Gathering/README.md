# [Platinum IV] Annual Ants’ Gathering - 33588

[문제 링크](https://www.acmicpc.net/problem/33588)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 21, 정답: 16, 맞힌 사람: 15, 정답 비율: 78.947%

### 분류

그리디 알고리즘, 다이나믹 프로그래밍, 센트로이드, 우선순위 큐, 자료 구조, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Deep within a forest lies an ancient tree, home to $n$ ants living in $n$ tiny houses, indexed from $1$ to $n$, connected by the branches of the tree.</p>

<p>Once a year, all the ants need to gather to watch the EUC. For this, all ants move along the $n - 1$ branches of the tree they live on to meet at the home of one ant.</p>

<p>However, this year the ants could not agree on where to meet and need your help to gather up. You can tell all the ants currently at house $u$ to move to house $v$ if there is a branch directly connecting those two houses. However, the ants ignore your command if there are fewer ants gathered in house $v$ than in house $u$, i.e., if it would be easier for the ants from house $v$ to move. This even holds true if no ant at all is currently in house $v$. You can give this kind of commands as many times as you want.</p>

<p>Is it possible for you to gather all the ants in a single house?</p>

### 입력

<p>The first line contains one integer $n$ ($1 ≤ n ≤ 200\, 000$) — the number of ant homes.</p>

<p>Each of the following $n - 1$ lines contains two integers $u$ and $v$ ($1 ≤ u, v ≤ n$) — there is a branch directly connecting the house $u$ and house $v$.</p>

<p>It is guaranteed that every ant can reach the house of any other ant just by following the branches of the tree.</p>

### 출력

<p>Print <code>YES</code> if it is possible to gather all the ants in a single house. Otherwise, print <code>NO</code>.</p>