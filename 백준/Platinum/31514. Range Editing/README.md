# [Platinum I] Range Editing - 31514

[문제 링크](https://www.acmicpc.net/problem/31514)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 63, 정답: 27, 맞힌 사람: 23, 정답 비율: 44.231%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You are editing a list of spreadsheet cells. Initially all cells are empty. You can perform two types of operations:</p>

<ol>
	<li>Select a consecutive range of cells and change their values to a positive integer of your choice. All these cells get the same value after this operation.</li>
	<li>Select a consecutive range of cells and delete their values. All these cells become empty after this operation.</li>
</ol>

<p>Given the final cell values that you would like to have in the spreadsheet, calculate the minimum number of editing operations required to obtain those values.</p>

### 입력

<p>The first line of input contains a single integer $n$ ($1 \leq n \leq 800$), which is the number of cells you are editing. The cells are number from $1$ to $n$.</p>

<p>Each of the next $n$ lines contains a single integer between $0$ and $10^9$ inclusive. The integer on the $i^{\text{th}}$ line is $0$ if cell $i$ should be empty after all operations. Otherwise, it is a positive integer that is the final value of cell $i$.</p>

### 출력

<p>Output a single integer, which the minimum number of editing operations required.</p>