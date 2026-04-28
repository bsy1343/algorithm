# [Silver IV] Out of Sorts - 17858

[문제 링크](https://www.acmicpc.net/problem/17858)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 122, 정답: 69, 맞힌 사람: 35, 정답 비율: 51.471%

### 분류

구현, 브루트포스 알고리즘, 이분 탐색, 시뮬레이션

### 문제 설명

<p>Ann Logan is fascinated with finite sequences of integers. She is particularly interested in sequences of the form x<sub>1</sub>, x<sub>2</sub>, . . . , x<sub>n</sub> where:</p>

<ul>
	<li>x<sub>i</sub> = (ax<sub>i&minus;1</sub> + c) mod m,</li>
	<li>n, m, a, and c are positive integer constants,</li>
	<li>x<sub>0</sub> is a non-negative integer constant, and</li>
	<li>all n values are unique.</li>
</ul>

<p>For example, if n = 5, m = 8, a = 1, c = 3, and x<sub>0</sub> = 3, the sequence is 6, 1, 4, 7, 2 (x<sub>1</sub> = (1 &middot; 3 + 3) mod 8 = 6, x<sub>2</sub> = (1 &middot; 6 + 3) mod 8 = 1, and so on). Note that she does not consider the initial value x0 to be part of the sequence.</p>

<p>Ann wants to be able to quickly determine, for any integer value, whether or not it appears within a finite sequence of this form. Given values of n, m, a, c, and x<sub>0</sub>, she plans to follow this list of steps:</p>

<ol>
	<li>Generate the sequence x<sub>1</sub>, &middot; &middot; &middot; , x<sub>n</sub> and store it in an array.</li>
	<li>Sort the array.</li>
	<li>Perform a binary search of the array for each integer of interest to her.</li>
</ol>

<p>Ann&rsquo;s search algorithm, while not the most efficient possible, is pretty straightforward and understandable to anyone familiar with binary search: after calculating the midpoint mid at each step of the calculation (using mid = (low+high)/2), she first checks whether or not the value at location mid is equal to the search value x. If not, she then narrows the search according to whether x is strictly less than or strictly greater than the value at location mid.</p>

<p>Unfortunately, Ann is absent-minded and she lost her list of steps. She managed to remember the first and last step, but . . . she forgot to sort the array before performing her binary search! Needless to say, this means that many values that are in the (unsorted) array will not be found by a binary search, although surprisingly some can. In the example above, both 4 and 7 can be found with Ann&rsquo;s binary search. How many values can be found for various sequences? Don&rsquo;t botch it up!</p>

### 입력

<p>Input consists of a line containing five integers n, m, a, c, and x<sub>0</sub> (1 &le; n &le; 10<sup>6</sup>, 1 &le; m, a, c &le; 2<sup>31</sup> &minus; 1, 0 &le; x<sub>0</sub> &le; 2<sup>31</sup> &minus; 1), where n is the length of the sequence x<sub>1</sub>, . . . , x<sub>n</sub> to be generated and m, a, c, and x<sub>0</sub> are the constants used for generating the sequence. All values in the generated sequence are guaranteed to be unique.</p>

### 출력

<p>Output the number of sequence values that could be found using Ann&rsquo;s version of binary search, assuming she forgot to sort the sequence.</p>