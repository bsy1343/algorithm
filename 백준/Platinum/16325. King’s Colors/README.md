# [Platinum IV] King’s Colors - 16325

[문제 링크](https://www.acmicpc.net/problem/16325)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 177, 정답: 99, 맞힌 사람: 81, 정답 비율: 67.500%

### 분류

수학, 조합론, 포함 배제의 원리

### 문제 설명

<p>Far, far away, there is the mystical Kingdom of Trees (more formally, &ldquo;Royal Commonwealth of Connected Undirected Simple Acyclic Graphs&rdquo;). The King there is very sad because his kingdom is not accepted as a sovereign state in the United Nations. In order to become a member, he needs to make a flag the UN can put on their website.</p>

<p>The flag will of course consist of the King&rsquo;s favorite tree, which contains n nodes. The King would be happy to just have the tree colored in black and white, but for the sake of his wife the Queen, he decided that the tree will contain all the favorite colors of their k children (they all have distinct favorite colors). Clearly, no two neighboring nodes can have the same color, but otherwise any coloring of the tree using exactly the k colors would make a feasible flag candidate.</p>

<p>How many different flags are possible?</p>

### 입력

<p>The first line contains two integers n and k (2 &le; k &le; n &le; 2 500), where n is the number of nodes in the King&rsquo;s favorite tree and k is the number of children. Then follow n &minus; 1 lines describing the edges in the tree; the i&rsquo;th of these lines contains a non-negative integer p<sub>i</sub> &lt; i, meaning that node p<sub>i</sub> is the parent of i.</p>

<p>The nodes are numbered from 0 to n &minus; 1 and the tree is rooted at node 0. Note that the embedding of the tree on the flag is already fixed, the only thing that remains is to assign colors.</p>

### 출력

<p>Output the number of different possible color assignments. The number can be quite big, so the King has requested to know the answer modulo 1 000 000 007.</p>