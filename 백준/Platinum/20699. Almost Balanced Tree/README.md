# [Platinum IV] Almost Balanced Tree - 20699

[문제 링크](https://www.acmicpc.net/problem/20699)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 110, 정답: 42, 맞힌 사람: 34, 정답 비율: 37.778%

### 분류

그리디 알고리즘, 애드 혹, 해 구성하기, 재귀

### 문제 설명

<p>Consider a binary tree, each node has a weight equal to 1 or 2. The weight of a subtree is the sum of weights of all nodes in the subtree. The weight of an empty tree is 0.</p>

<p>The binary tree is <em>almost balanced</em> if for each node, the difference of weights of its children subtrees is at most 1 (if one of the children is missing, its weight is considered to be 0).</p>

<p>Here is an example of an almost balanced binary tree:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20699.%E2%80%85Almost%E2%80%85Balanced%E2%80%85Tree/3f2851ca.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/20699.%E2%80%85Almost%E2%80%85Balanced%E2%80%85Tree/3f2851ca.png" data-original-src="https://upload.acmicpc.net/074e4bbc-b079-4e48-938a-0e0e5bc57dcf/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 275px; height: 141px;" /></p>

<p>Your task is to build any almost balanced binary tree with exactly $A$ nodes of weight 1 and $B$ nodes of weight 2, or to say that it is impossible.</p>

### 입력

<p>The input contains two non-negative integers $A$ and $B$ ($1\le A+B\le 100\,000$).</p>

### 출력

<p>Assign indices from 1 to $A+B$ to the nodes of your tree, node 1 should be the root of the tree. Output $A+B$ lines, one for each node. Each line should contain three integers --- the weight of the node, and the indices of the left and the right children of the node. If the corresponding child is missing, output 0 instead.</p>

<p>If it is impossible to construct an almost balanced tree, output $-1$.</p>

<p>If there are multiple possible answers, output any one of them.</p>