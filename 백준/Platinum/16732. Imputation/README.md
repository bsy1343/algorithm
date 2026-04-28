# [Platinum IV] Imputation - 16732

[문제 링크](https://www.acmicpc.net/problem/16732)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 44, 정답: 19, 맞힌 사람: 17, 정답 비율: 43.590%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Leila is a Bioinformatician, interested in studying Bacterial evolution. In one experiment on a special type of Bacteria, she started from a single bacterium, put it on a plate, and monitored the bacterial division, until she obtained a population of k bacteria. During the process, she carefully reported the evolutionary relations between bacteria. Precisely, for each bacterium, she reported its parent bacterium.</p>

<p>In the next step, she extracted DNA sequences of k bacteria in the final population, by NGS technology. Each DNA sequence is represented as a string of length m from the alphabet set {A, T, C, G}.</p>

<p>The NGS technology has a drawback: it produces a lot of missing values. So, there are a lot of unknown characters indicated by &lsquo;?&rsquo; in the extracted sequences. Considering the evolutionary relationship between bacteria, Leila wants to impute the missing values. Among all possible imputations, she wants to find the minimum cost imputation from an evolutionary perspective.</p>

<p>The problem is defined as follows. A rooted tree T is given, and for each leaf v of T, a string b<sub>v</sub> of length m from the character set {A, T, C, G, ?} is given. A transition cost matrix ∆ is also given, where ∆(x, y) (x, y &isin; {A, T, C, G}) represents the cost of a transition from an x character to a y character, from a parent to its child.</p>

<p>A feasible imputation, assigns a string s<sub>u</sub> of length m from the character set {A, T, C, G} to each vertex u, where for each leaf v of T, s<sub>v</sub> is equal to bv except for &lsquo;?&rsquo; characters in bv. The evolutionary cost of an imputation is defined as the sum of evolutionary costs of all edges. The evolutionary cost of an edge between parent u and child w, is defined as &Sigma;<sup>m</sup><sub>i=1</sub> ∆(s<sub>u</sub>[i], s<sub>w</sub>[i]), where s<sub>u</sub>[i] is the i-th character of s<sub>u</sub>.</p>

<p>Leila wants to find a feasible imputation for T, which has the minimum evolutionary cost among all feasible imputations. The tree T, transition cost matrix ∆, and a string b<sub>v</sub> for each leaf v are given. You should write a program to compute the minimum evolutionary cost of feasible imputations.</p>

### 입력

<p>The first line of the input contains an integer n (2 ⩽ n ⩽ 10, 000) denoting the number of vertices of T. The vertices of T are numbered from 1 to n. The root of the tree is numbered 1. The root is never considered as a leaf, even if it has only one child. The next n &minus; 1 lines describe the edges of T; each line contains two endpoints of an edge separated by spaces. In the next four lines, the evolutionary cost matrix ∆ is given; each line is for one row of ∆. Rows (corresponding to a parent) and columns (corresponding to a child) of ∆ are ordered to respectively represent characters A, T, C and G. All entries of ∆ are non-negative integers not more than 10<sup>6</sup>. The next line just contains k, the number of leaves. Finally, each leaf v (its number) and its bv which is a string of size m (1 &le; m &le; 200) appear in one line.</p>

### 출력

<p>In one line, print the minimum evolutionary cost of feasible imputations.</p>