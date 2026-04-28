# [Platinum II] Bracket Euler Tour - 18504

[문제 링크](https://www.acmicpc.net/problem/18504)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 84, 정답: 20, 맞힌 사람: 20, 정답 비율: 23.810%

### 분류

오일러 경로, 그래프 이론

### 문제 설명

<p>You are given an undirected graph with n vertices and m edges. Each vertex has a bracket (either opening &ldquo;(&rdquo; or closing &ldquo;)&rdquo;) associated with it.</p>

<p>You have to find an Euler tour in this graph such that its vertices (written in traversal order) form a correct bracket sequence.</p>

<p>A correct bracket sequence is a sequence of brackets that can be transformed into a correct arithmetic expression by inserting characters &ldquo;1&rdquo; and &ldquo;+&rdquo; between the original characters of the sequence. For example, bracket sequences &ldquo;()()&rdquo;, &ldquo;(())&rdquo; are correct (the resulting expressions are &ldquo;(1)+(1)&rdquo; and &ldquo;((1+1)+1)&rdquo;), while &ldquo;)(&rdquo; and &ldquo;()(&rdquo; are not.</p>

<p>An Euler tour of an undirected graph is a cycle which visits every edge in this graph exactly once. It is allowed to visit the same vertex multiple times, though.</p>

### 입력

<p>The first line contains two integers n and m (1 &le; n, m &le; 2 &middot; 10<sup>5</sup>), the number of vertices and edges respectively.</p>

<p>Each of the following m lines contains two integers v<sub>i</sub> and u<sub>i</sub> (1 &le; v<sub>i</sub>, u<sub>i</sub> &le; n), meaning that there is an undirected edge between vertices v<sub>i</sub> and u<sub>i</sub>. Note that self-loops and multiple edges are allowed.</p>

<p>The last line of the input contains a string of n round brackets, where the i-th bracket is associated with vertex i.</p>

### 출력

<p>If there is no Euler tour in the given graph that forms a correct bracket sequence, print &ldquo;No&rdquo; in the first line.</p>

<p>Otherwise, print &ldquo;Yes&rdquo; in the first line. In the second line, print a sequence of vertices that form an Euler tour and also a correct bracket sequence. If there are multiple solutions, print any of them.</p>