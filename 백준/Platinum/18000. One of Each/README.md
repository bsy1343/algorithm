# [Platinum III] One of Each - 18000

[문제 링크](https://www.acmicpc.net/problem/18000)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 196, 정답: 82, 맞힌 사람: 73, 정답 비율: 49.660%

### 분류

자료 구조, 그리디 알고리즘

### 문제 설명

<p>You are given a sequence of <em>n</em> integers <em>X</em> = [<em>x</em><sub>1</sub>, <em>x</em><sub>2</sub>, ..., <em>x<sub>n</sub></em>] and an integer <em>k</em>. It is guaranteed that 1 &le; <em>x<sub>i</sub></em>&nbsp;&le; <em>k</em>, and every integer from 1 to <em>k</em> appears in the list <em>X</em> at least once.</p>

<p>Find the lexicographically smallest subsequence of <em>X</em> that contains each integer from 1 to <em>k</em> exactly once.</p>

### 입력

<p>The first line of input contains two integers <em>n</em> and <em>k</em> (1 &le; <em>k</em> &le; <em>n</em> &le; 2 ∙ 10<sup>5</sup>), where <em>n</em> is the size of the sequence, and the sequence consists only of integers from 1 to <em>k</em>.</p>

<p>Each of the next <em>n</em> lines contains a single integer <em>x<sub>i</sub></em> (1 &le; <em>x<sub>i</sub></em> &le; <em>k</em>). These are the values of the sequence <em>X</em> in order. It is guaranteed that every value from 1 to <em>k</em> will appear at least once in the sequence <em>X</em>.</p>

### 출력

<p>Output a sequence of integers on a single line, separated by spaces. This is the lexicographically smallest subsequence of <em>X</em> that contains every value from 1 to <em>k</em>.</p>