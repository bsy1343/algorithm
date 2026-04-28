# [Platinum V] Nice Numbers - 14768

[문제 링크](https://www.acmicpc.net/problem/14768)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 27, 정답: 12, 맞힌 사람: 12, 정답 비율: 52.174%

### 분류

자료 구조, 그리디 알고리즘, 스택

### 문제 설명

<p>If you are familiar with the game 2048, this problem may make sense right away.</p>

<p>Either way, we will define our own one-dimensional version of the game:</p>

<p>You are given a list of numbers containing only powers of 2. You can &ldquo;compress&rdquo; this list by &ldquo;pushing&rdquo; it to the right. If two identical numbers are next to each other, push will cause them to merge. The &ldquo;merge&rdquo; in this context means that the two numbers are replaced by their sum. Each number can be merged only once&mdash;if they can merge with either of their neighbors, they merge with the one to the right. This process is evaluated from the right. For example, the list [2, 2, 2, 2] will become [4, 4] after one push. For another example, given a list [2, 2, 2], after a push, we end up with a new list [2, 4] and we cannot change it further by &ldquo;pushing&rdquo;.</p>

<p>Now, some of these lists, after some number of pushes, may end up with a single element. Using the example: [8, 2, 2, 4] &rArr; [8, 4, 4] &rArr; [8, 8] &rArr; [16].</p>

<p>If the list can be reduced to a single element list only by &ldquo;pushing&rdquo;, we call such a list nice.</p>

<p>Your task is to take a given list and make it nice by adding some (maybe zero) elements from {2, 4, 8}. To make this problem a bit easier, the initial list can contain only numbers in the set {2, 4, 8}.</p>

### 입력

<p>The first line of input contains a single positive integer T &le; 100 indicating the number of test cases. Next T lines each contains a string of length 1 &le; L &le; 100, composed entirely of digits from the set {2, 4, 8} (our representation of the given list).</p>

### 출력

<p>For each test case, output a line containing the shortest nice list built out of the input list by inserting zero or more of digits from the set {2, 4, 8}. If there are multiple optimal solutions, output the lexicographically smallest one.</p>