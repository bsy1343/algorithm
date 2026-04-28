# [Silver II] Sum of Subrectangle Areas - 15837

[문제 링크](https://www.acmicpc.net/problem/15837)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 238, 정답: 112, 맞힌 사람: 77, 정답 비율: 44.253%

### 분류

수학, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>The following code snippet calculates the sum of the areas of all the sub rectangular grid in a rectangular grid from (0,0) to (N,N). Find an efficient way to compute that.</p>

<pre>
sum = 0
for r1 = 0 to N-1
  for c1 = 0 to N-1
    for r2 = r1+1 to N
      for c2 = r2+1 to N
        sum = sum + (r2-r1)*(c2-c1)
print(sum)</pre>

### 입력

<p>Input starts with T the number of test cases. Each test case consists of a single integer N.</p>

### 출력

<p>For each test output the sum (as computed above). Please note that even though N will fit into 64 bit integer, the sum may not be.</p>