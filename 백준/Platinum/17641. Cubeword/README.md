# [Platinum II] Cubeword - 17641

[문제 링크](https://www.acmicpc.net/problem/17641)

### 성능 요약

시간 제한: 1.1 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 34, 맞힌 사람: 24, 정답 비율: 50.000%

### 분류

수학, 애드 혹, 조합론, 이분 그래프

### 문제 설명

<p>A cubeword is a special type of a crossword. When building a cubeword, you start by choosing a positive integer a: the side length of the cube. Then, you build a big cube consisting of a &times; a &times; a unit cubes. This big cube has 12 edges. Then, you discard all unit cubes that do not touch the edges of the big cube. The figure below shows the object you will get for a = 6.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17641.%E2%80%85Cubeword/71d55a0f.png" data-original-src="https://upload.acmicpc.net/9d8d8b62-cb34-4b48-b40b-1a8beb472c26/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 129px; height: 117px;" /></p>

<p>Finally, you assign a letter to each of the unit cubes in the object. You must get a meaningful word along each edge of the big cube. Each edge can be read in either direction, and it is sufficient if one of the two directions of reading gives a meaningful word.</p>

<p>The figure below shows the object for a = 6 in which some unit cubes already have assigned letters. You can already read the words &lsquo;<code>SUBMIT</code>&rsquo;, &lsquo;<code>ACCEPT</code>&rsquo; and &lsquo;<code>TURING</code>&rsquo; along three edges of the big cube.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17641.%E2%80%85Cubeword/0d04122a.png" data-original-src="https://upload.acmicpc.net/7dd8f9aa-80b1-4c01-8724-367dae096109/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 282px; height: 252px;" /></p>

<p>You are given a list of valid words. Each word from the wordlist may appear on arbitrarily many edges of a valid cubeword. Find and report the number of different cubewords that can be constructed, modulo 998, 244, 353.</p>

<p>If one cubeword can be obtained from another by rotation or mirroring, they are considered distinct.</p>

### 입력

<p>The first line contains a single integer n (1 &le; n &le; 100, 000) &ndash; the number of words.</p>

<p>Then, n lines follow. Each of these lines contains one word that can appear on the edges of the big cube. The length of each word is between 3 and 10, inclusive.</p>

<p>It is guaranteed that all words are different.</p>

### 출력

<p>Output a single integer, the number of distinct cubewords for the given list of valid words modulo 998, 244, 353.</p>

### 힌트

<p>In the first sample, the only possibility is for the word &ldquo;<code>radar</code>&rdquo; to be on each edge of the cube.</p>

<p>In the second sample, there are two cubes, which are just rotations of each other &ndash; the word &ldquo;<code>robot</code>&rdquo; is on every edge, and the difference between the two cubes is whether the lower left front corner contains &lsquo;<code>r</code>&rsquo; or &lsquo;<code>t</code>&rsquo;.</p>

<p>The third sample is similar to the second one. The fact that we can read the word on each edge in both directions does not affect the answer.</p>

<p>In the fourth sample, there is one cube with the word &ldquo;<code>bob</code>&rdquo; on each edge. There are also 212 = 4096 cubes with the word &ldquo;<code>baobab</code>&rdquo; on each edge. (For each of the 12 edges, we have two possible directions in which the word &ldquo;<code>baobab</code>&rdquo; can appear.)</p>