# [Platinum IV] 정렬 - 2832

[문제 링크](https://www.acmicpc.net/problem/2832)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 385, 정답: 110, 맞힌 사람: 86, 정답 비율: 47.253%

### 분류

자료 구조, 세그먼트 트리, 분할 정복

### 문제 설명

<p>상근이는 다음과 같은 정렬 알고리즘을 만들었다.</p>

<pre>
reverse-sort(sequence a)
    while (A is not in nondecreasing order)
        partition a into the minimum number of slopes
        for every slope with length greater than one
            reverse(slope)</pre>

<p>여기서 slope란 감소하는 a의 연속 부분 수열이다. reverse는 그 구간의 순서를 뒤집는다.</p>

<p>1부터 N으로 이루어진 길이가 N인 순열이 주어진다. 처음에 순열의 slope의 길이는 모두 짝수이다. reverse를 몇 번 호출하는지 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 N이 주어진다. (2 &le; N &le; 100,000) 둘째 줄에는 정렬해야 하는 순열이 주어진다.</p>

### 출력

<p>첫째 줄에 reverse를 몇 번 호출하는지 출력한다.</p>