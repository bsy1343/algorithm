# [Silver V] Substring Permutation - 16588

[문제 링크](https://www.acmicpc.net/problem/16588)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 148, 정답: 95, 맞힌 사람: 77, 정답 비율: 70.000%

### 분류

문자열

### 문제 설명

<p>Given two strings S and P, there are several ways to find whether P appears as a substring of S. The simplest one would be directly checking whether P is equal to any substring of S. As there can be O(|S|) substring of S of length |P|, this approach has O(|S| &times; |P|) time complexity. There is also a more sophisticated way by using knuth-morris-pratt (KMP) algorithm to solve this problem in O(|S| + |P|).</p>

<p>In this problem, you are challenged to a similar problem.</p>

<p>Given two strings S and P. Let &Pi;(S) be the set containing all strings which are permutations of S, and &Pi;(P) be the set containing all strings which are permutations of P. Determine whether there exists a string p &isin; &Pi;(P) and a string s &isin; &Pi;(S), such that p appears as a substring of s.</p>

<p>For example, let S = guru and P = rug. Then, &Pi;(S) = {gruu, guru, guur, rguu, rugu, ruug, ugru,ugur, urgu, urug, uugr, uurg}, and &Pi;(P) = {gru, gur, rgu, rug, ugr, urg}. Observe that the string rug in &Pi;(P) appears as a substring of the string rugu in &Pi;(S), i.e. [rug]u. In this example, you can also find another hp, si which satisfies the requirement, e.g., hgru, gruui, hgru, ugrui, hurg, uurgi, hgur, gurui, etc.</p>

### 입력

<p>Input contains two lines. The first line contains a string S (1 &le; |S| &le; 100000). The second line contains a string P (1 &le; |P| &le; |S| &le; 100000). Both S and P contains only lowercase alphabetical character (a-z).</p>

### 출력

<p>Output in a line &ldquo;YES&rdquo; (without quotes) if there exists a string p &isin; &Pi;(P) and a string s &isin; &Pi;(S), such that p appears as a substring of s; otherwise, output &ldquo;NO&rdquo; (without quotes).</p>