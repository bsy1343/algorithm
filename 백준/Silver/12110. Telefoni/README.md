# [Silver III] Telefoni - 12110

[문제 링크](https://www.acmicpc.net/problem/12110)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 137, 정답: 89, 맞힌 사람: 76, 정답 비율: 66.087%

### 분류

그리디 알고리즘

### 문제 설명

<p>There are N desks in a room, placed from left to right, one next to each other. Some desks have phones on them, whereas some desks are empty. All phones are broken, so the phone on the ith desk will ring if the phone at jth desk rings, which is at most D desks away from the ith desk. In other words, it holds |j - i| &le; D. The first and the last desk will always have a phone on them. In the beginning the leftmost phone rings. What is the minimal amount of new phones to be placed on the desks so that the last phone rings?</p>

### 입력

<p>The first line of input contains two positive integers, N (1 &le; N &le; 300 000) and D (1 &le; D &le; N). The following line contains N numbers 0 or 1. If the ith number is 1, then the ith desk from the left has a phone on it, otherwise the ith desk is empty.</p>

### 출력

<p>The first and only line of output must contain the required minimal number of phones.</p>

### 힌트

<p>In test cases worth 40 points in total, it will hold 1 &le; N &le; 20.</p>