# [Gold I] Left Out - 17195

[문제 링크](https://www.acmicpc.net/problem/17195)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 385, 정답: 143, 맞힌 사람: 114, 정답 비율: 36.306%

### 분류

그리디 알고리즘, 구현

### 문제 설명

<p>Farmer John is attempting to take a photograph of his herd of cows. From past experience, he knows this particular endeavor never usually ends well.</p>

<p>This time, Farmer John has purchased an expensive drone in order to take an aerial photo. To make the photo look as good as possible, he wants his cows all to be facing the same direction when the photo is taken. The cows are currently arranged in an $N \times N$ grid ($2 \leq N \leq 1000$) inside a fenced-in square pasture, for example:</p>

<pre>
RLR
RRL
LLR
</pre>

<p>Here, an &#39;R&#39; means a cow facing right, and an &#39;L&#39; means a cow facing left. Since the cows are packed together, Farmer John cannot walk up to an individual cow to make it turn around. All he can do is shout at any row or column of cows to turn around, causing L&#39;s to change to R&#39;s and R&#39;s to L&#39;s within the row or column in question. Farmer John can yell at as many rows or columns as he wants, even at the same row or column more than once.</p>

<p>As expected, Farmer John observes that he is unable to make his cows all face one common direction. The best he can do is get all but one of the cows to face the same direction. Please determine the identity of such a cow.</p>

### 입력

<p>The first line contains $N$. The next $N$ lines describe rows $1 \ldots N$ in the grid of cows, each containing a string of length $N$.</p>

### 출력

<p>Print the row and column index of a cow such that if that cow were flipped, Farmer John could make all his cows face the same direction. If no such cow exists, print -1. If multiple such cows exist, print the one with the smallest row index, or if multiple such cows have the same smallest row index, print the one with the smallest column index.</p>

### 힌트

<p>In the example above, the cow in row 1, column 1 (the upper-left corner) is the offending cow, since Farmer John can shout at row 2 and column 3 to make all other cows face left, with just this cow facing right.</p>