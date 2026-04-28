# [Platinum II] Balanced Trees - 16024

[문제 링크](https://www.acmicpc.net/problem/16024)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 113, 정답: 56, 맞힌 사람: 38, 정답 비율: 43.678%

### 분류

다이나믹 프로그래밍, 자료 구조, 집합과 맵, 해시를 사용한 집합과 맵, 조화수

### 문제 설명

<p>Trees have many fascinating properties. While this is primarily true for trees in nature, the concept of trees in math and computer science is also interesting. A particular kind of tree, a perfectly balanced tree, is defined as follows.</p>

<p>Every perfectly balanced tree has a positive integer weight. A perfectly balanced tree of weight 1 always consists of a single node. Otherwise, if the weight of a perfectly balanced tree is w and w &ge; 2, then the tree consists of a root node with branches to k subtrees, such that 2 &le; k &le; w. In this case, all k subtrees must be completely identical, and be perfectly balanced themselves.</p>

<p>In particular, all k subtrees must have the same weight. This common weight must be the maximum integer value such that the sum of the weights of all k subtrees does not exceed w, the weight of the overall tree. For example, if a perfectly balanced tree of weight 8 has 3 subtrees, then each subtree would have weight 2, since 2 + 2 + 2 = 6 &le; 8.</p>

<p>Given N, find the number of perfectly balanced trees with weight N.</p>

### 입력

<p>The input will be a single line containing the integer N (1 &le; N &le; 10<sup>9</sup>).</p>

### 출력

<p>Output a single integer, the number of perfectly balanced trees with weight N.</p>