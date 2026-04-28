# [Bronze IV] Triple Sevens - 31518

[문제 링크](https://www.acmicpc.net/problem/31518)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 1147, 정답: 906, 맞힌 사람: 826, 정답 비율: 80.350%

### 분류

구현

### 문제 설명

<p>Eddy is overseeing construction of some new slot machines. His slot machines consist of three wheels, each of which can show one of several different digits. When activated, each wheel shows a random digit. The goal is for all wheels to be able to show the digit $7$.</p>

<p>A slot machine is good if each wheel is capable of showing the digit $7$, and bad otherwise. For a given slot machine, determine if it is good or bad.</p>

### 입력

<p>The first line contains a single integer $n$ $(1 \leq n \leq 10)$, which is the number of different digits on each wheel. Each wheel has the same number of digits.</p>

<p>Each of the next three lines contains $n$ distinct digits (in the range from $0$ to $9$). These are the digits on each of the three wheels.</p>

### 출력

<p>Output a single integer, which is $777$ if the slot machine is good, $0$ otherwise.</p>