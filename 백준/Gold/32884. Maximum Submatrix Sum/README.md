# [Gold III] Maximum Submatrix Sum - 32884

[문제 링크](https://www.acmicpc.net/problem/32884)

### 성능 요약

시간 제한: 0.2 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 224, 정답: 65, 맞힌 사람: 46, 정답 비율: 34.848%

### 분류

누적 합, 다이나믹 프로그래밍, 최대 부분 배열 문제

### 문제 설명

<p>You are given an $N \times M$ matrix $A$. Find the maximum sum of any subrectangular submatrix of this matrix.</p>

<p>Here, a <strong>subrectangular submatrix</strong> is defined as a contiguous submatrix formed by selecting any rectangular section of the given matrix $A$, such that the submatrix includes all rows and columns between two specified pairs of indices $(r_1, c_1)$ and $(r_2, c_2)$, where $1 \le r_1 \le r_2 \le N$ and $1 \le c_1 \le c_2 \le M$, plus the case when the submatrix is empty.</p>

### 입력

<p>The first line of input contains two space-separated integers: $N$ and $M$, denoting the size of the matrix. ($1 \le N \le M \le 100\,000;$ $1 \le NM \le 100\,000$)</p>

<p>The next $N$ lines of input contain $NM$ integers, where each line has $M$ space-separated integers, denoting the value of the matrix. Here, the $j$-th integer of the $i$-th line denotes $A_{ij}$. ($-10\,000 \le A_{ij} \le 10\,000$)</p>

### 출력

<p>Output the maximum sum of any subrectangular submatrix on a single line.</p>

### 힌트

<p>(For Sogang students:) Note that this problem is an improvised version that matches the format of a problem in a general programming contest. While in the exam, the original scoring was:</p>

<ul>
	<li>$35$ points for Subtask 1.</li>
	<li>$25$ points for Subtask 2.</li>
	<li>$35$ points for Subtask 3.</li>
	<li>$5$ points for Subtask 4.</li>
</ul>