# [Silver I] Kitten on a Tree - 24780

[문제 링크](https://www.acmicpc.net/problem/24780)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 93, 정답: 73, 맞힌 사람: 65, 정답 비율: 79.268%

### 분류

그래프 이론, 문자열, 그래프 탐색, 트리, 깊이 우선 탐색, 파싱

### 문제 설명

<p><img alt="" src="https://upload.acmicpc.net/1852811f-919d-4a86-a135-fa59643391e0/-/preview/" style="width: 346px; height: 300px; float: right;" />Ouch! A kitten got stuck on a tree. &nbsp;Fortunately, the tree&#39;s branches are numbered. Given a description of a tree and the position of the kitten, can you write a program to help the kitten down?</p>

### 입력

<p>The input is a description of a single tree. The first line contains an integer $K$, denoting the branch on which the kitten got stuck. The next lines each contain two or more integers $a, b_1, b_2, \ldots$. Each such line denotes a branching: the kitten can reach $a$ from $b_1, b_2, \ldots$ on its way down. Thus, $a$ will be closer to the root than any of the $b_i$. The description ends with a line containing <code>-1</code>. Each branch $b_i$ will appear on exactly one line. All branch numbers are in the range $1..100$, though not necessarily contiguous. You are guaranteed that there is a path from every listed branch to the root. The kitten will sit on a branch that has a number that is different than the root.</p>

<p>The illustration above corresponds to the sample input.</p>

### 출력

<p>Output the path to the ground, starting with the branch on which the kitten sits.</p>