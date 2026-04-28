# [Platinum III] Hyper-minimum - 11831

[문제 링크](https://www.acmicpc.net/problem/11831)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 14, 정답: 11, 맞힌 사람: 9, 정답 비율: 75.000%

### 분류

구현, 다이나믹 프로그래밍, 자료 구조, 덱, 슬라이딩 윈도우, 덱을 이용한 구간 최댓값 트릭, 단조 큐를 이용한 최적화

### 문제 설명

<p>There is a 4-dimensional array X, each index of which is in interval from 1 to N. Your task is to construct new 4-dimensional array Y , elements of which can be calculated using the next formula: Y [i<sub>1</sub>, i<sub>2</sub>, i<sub>3</sub>, i<sub>4</sub>] = min(X[j<sub>1</sub>, j<sub>2</sub>, j<sub>3</sub>, j<sub>4</sub>]), where 1 &le; i<sub>k</sub> &le; N &minus; M + 1, i<sub>k</sub> &le; j<sub>k</sub> &le; i<sub>k</sub> + M &minus; 1, and M is given.</p>

### 입력

<p>First line of the input file contains N and M (1 &le; M &le; N). Next lines of the input file contain elements of array X. The number of elements will be not more than 1500000 and elements will be integers not exceeding 10<sup>9</sup> by absolute value. They are given in such order, that the array can be read using following pseudocode:</p>

<pre>
for i = 1 to N:
    for j = 1 to N:
        for k = 1 to N:
            for l = 1 to N:
                read X[i, j, k, l]</pre>

### 출력

<p>Output array Y in the same format as the X was given.</p>