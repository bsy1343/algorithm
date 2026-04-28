# [Bronze II] Are They All Integers? - 18141

[문제 링크](https://www.acmicpc.net/problem/18141)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 952, 정답: 561, 맞힌 사람: 531, 정답 비율: 59.932%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p>Computing using integers is a dream for every programmer. That is, you do not have to deal with floating point numbers, estimated errors, and etc. We do not even need any floating point units in our computers for divisions!</p>

<p>Your company claimed there is a brand new computational model that solves integer problems efficiently. As a software engineer in this Integer Computing Processors Company (ICPC), you are going to write a validator that checks the following:</p>

<p>Given a list of positive integers A[0], . . . , A[n &minus; 1]. Suppose you pick three different elements arbitrarily of this list, A[i], A[j], A[k] with i, j, k being mutually different. Is it true that (A[i]&minus;A[j])/A[k] is always an integer?</p>

### 입력

<p>The first line of the input contains one integer n indicating the number of positive integers in the list. The second line of the input contains n positive integers A[0], . . . , A[n &minus; 1] separated by blanks.</p>

### 출력

<p>If (A[i]&minus;A[j])/A[k] is always an integer, then output yes. Otherwise output no.</p>

### 제한

<ul>
	<li>3 &le; n &le; 50</li>
	<li>1 &le; A[0] &le; A[1] &le; &middot; &middot; &middot; &le; A[n &minus; 1] &le; 100</li>
</ul>