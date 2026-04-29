# [Platinum IV] Farmer's Field - 8399

[문제 링크](https://www.acmicpc.net/problem/8399)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 43, 정답: 7, 맞힌 사람: 7, 정답 비율: 17.949%

### 분류

자료 구조, 덱, 덱을 이용한 구간 최댓값 트릭

### 문제 설명

<p>This time Byteland has a rectangular shape <em>a</em>&nbsp;meters wide and <em>b</em>&nbsp;meters high. Byteasar is a farmer and has his own field, which consists of unitary squares. Moreover, the common part of every horizontal layer of unitary squares and the Byteasar&#39;s field is connected (although the whole field may not be connected).</p>

<p>The king of Byteland gave a decree, which obliged every farmer to give a rectangular shape area <em>c</em>&nbsp;meters wide and <em>d</em>&nbsp;meters high (positioned horizontally or vertically), consisting of unitary squares, into king&#39;s possession. The position of this rectangle will be chosen by the king. Byteasar hopes, that there are a lot of possible positions of such rectangle, so the greedy king will not be able to make his decision fast. Help Byteasar and find the number of possible positions of the area (that lies inside Byteasar&#39;s field), that Byteasar can lose.</p>

<p>Write a program which:</p>

<ul>
	<li>reads the description of Byteasar&#39;s field and the dimensions of the rectangular area that must be given to the king,</li>
	<li>computes the number of possible positions of such an area on Byteasar&#39;s field,</li>
	<li>writes the answer to the standard output.</li>
</ul>

### 입력

<p>The first line of the standard input contains four integers <em>a</em>, <em>b</em>, <em>c</em>&nbsp;and <em>d</em>&nbsp;(1 &le; <em>a</em>, <em>b</em>, <em>c</em>, <em>d</em> &le; 5 000 000). The numbers denote respectively: dimensions of the Byteasar&#39;s field and dimensions of the area that must be given to the king. In the following <em>b</em>&nbsp;lines there are descriptions of the consecutive horizontal layers of farmer&#39;s field. Each description consists of two integers <em>x</em>&nbsp;and <em>l</em>&nbsp;(1 &le; <em>x</em> &le; <em>a</em>, 0 &le; <em>l</em> &le; <em>a</em>, <em>x</em> + <em>l</em> &le; <em>a</em> + 1) - the fragment of the field in this layer begins <em>x</em> - 1&nbsp;meters from the left border of Byteland and consists of <em>l</em>&nbsp;unitary squares.</p>

### 출력

<p>One integer is to be written to the standard output. This integer should be the number of possible positions of the <em>c</em>&nbsp;meters wide and <em>d</em>&nbsp;meters high rectangular area inside Byteasar&#39;s field.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8399.%E2%80%85Farmer's%E2%80%85Field/58a27a74.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8399.%E2%80%85Farmer's%E2%80%85Field/e9185b48.jpg" data-original-src="https://boja.mercury.kr/assets/problem/8399-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p align="center">This figure depicts the field from the sample input (dark color represents area belonging to the field).</p>

<p>We encourage C++ programmers to use&nbsp;<code>STL</code>&nbsp;data structures cautiously due to the data size. Improper usage may cause in exceeding time or memory limit.</p>