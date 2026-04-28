# [Silver V] Islands in the Data Stream - 9468

[문제 링크](https://www.acmicpc.net/problem/9468)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 272, 정답: 239, 맞힌 사람: 217, 정답 비율: 90.041%

### 분류

구현, 브루트포스 알고리즘, 애드 혹

### 문제 설명

<p>Given a sequence of integers a1, a2, a3, &hellip;, an, an island in the sequence is a contiguous subsequence for which each element is greater than the elements immediately before and after the subsequence. In the examples below, each island in the sequence has a bracket below it. The bracket for an island contained within another island is below the bracket of the containing island.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/9468.%E2%80%85Islands%E2%80%85in%E2%80%85the%E2%80%85Data%E2%80%85Stream/bf7c8e3c.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/9468.%E2%80%85Islands%E2%80%85in%E2%80%85the%E2%80%85Data%E2%80%85Stream/bf7c8e3c.png" data-original-src="https://www.acmicpc.net/upload/images/ids.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:197px; width:342px" /></p>

<p>Write a program that takes as input a sequence of 15 non-negative integers, in which each integer differs from the previous integer by at most 1, and outputs the number of islands in the sequence.</p>

### 입력

<p>The first line of input contains a single integer P, (1 &le; P &le; 1000), which is the number of data sets that follow. Each data set should be processed identically and independently.</p>

<p>Each data set consists of a single line of input. It contains the data set number, K, followed by 15 non-negative integers separated by a single space. The first and last integers in the sequence will be 0. Each integer will differ from the previous integer by at most 1.</p>

### 출력

<p>For each data set there is one line of output. The single output line consists of the data set number, K, followed by a single space followed by the number of islands in the sequence.</p>