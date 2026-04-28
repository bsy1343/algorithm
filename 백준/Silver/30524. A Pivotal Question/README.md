# [Silver II] A Pivotal Question - 30524

[문제 링크](https://www.acmicpc.net/problem/30524)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 103, 정답: 49, 맞힌 사람: 41, 정답 비율: 51.899%

### 분류

수학, 정렬, 누적 합

### 문제 설명

<p>Quicksort is a recursive sorting algorithm developed in 1959 by Tony Hoare. One of the major steps in the algorithm is the <em>partition\/</em> step: given an element $p$ in the array (the <em>pivot\/</em> element) rearrange the elements in the array as shown below where all the values in $X_L$ are $\leq p$ and all elements in $X_R$ are $&gt; p$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/c9651717-7428-44b4-914f-7e07132351c9/-/preview/" style="width: 280px; height: 41px;" /></p>

<p>Figure A.1 below shows an array before and after it&#39;s been partitioned with the pivot element $13$. Note that the elements in $X_L$ and $X_R$ are typically not in sorted order and either one of them could be empty.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/2c710065-8851-4085-886e-40a0b2532ff0/-/preview/" style="width: 575px; height: 41px;" /></p>

<p style="text-align: center;">Figure A.1: An array before and after a partition</p>

<p>How a partition is executed and how a pivot element is selected are fascinating questions but are not of interest to us. What we would like you to do is the following: given an array, determine all the values that could be the pivot value assuming the array has been partitioned, or determine that the array has not been partitioned.</p>

### 입력

<p>Input starts with a positive integer $n$ $(1\leq n\leq 10^6)$ denoting the size of the array. Following this are $n$ positive integers indicating the values in the array. All values are unique and $\leq 10^6$.</p>

### 출력

<p>Output $m =$ the number of values in the array that could have served as pivot values to partition the array, followed by the pivot values in the order that they appear in the input. If $m &gt; 100$ just output the first 100 of these pivot values. Note that a value of $m=0$ indicates that the array is not partitioned.</p>