# [Gold II] Conservation - 3414

[문제 링크](https://www.acmicpc.net/problem/3414)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 149, 정답: 62, 맞힌 사람: 50, 정답 비율: 51.020%

### 분류

그래프 이론, 그리디 알고리즘, 그래프 탐색, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>The most famous painting in Byteland&mdash;a portrait of a lady with a computer mouse by Leonardo da Bitci&mdash;needs to be conserved. The work will be conducted in two narrowly specialized laboratories. The conservation process has been divided into several stages. For each of them, we know the laboratory in which it will take place.</p>

<p>Transporting the very precious and fragile painting introduces additional risk; therefore, it should be avoided whenever possible. Ideally, all the work in the first laboratory would be done, and then the painting would be moved to the second one. Unfortunately, there are several dependencies between the conservation stages&mdash;some of them need to be completed before others may begin. Your task is to find an ordering of conservation stages that minimizes the number of times the painting needs to be moved from one laboratory to the other. The conservation can begin in any of the two laboratories.</p>

### 입력

<p>The first line of the input contains the number of test cases T. The descriptions of the test cases follow:</p>

<p>The first line of each test case contains two space-separated integers n and m (1 &le; n &le; 100 000, 0 &le; m &le; 1 000 000)&mdash;the number of conservation stages and the number of dependencies between them. In the next line there are n space-separated integers&mdash;the i-th of them is 1 if the i-th conservation stage will take place in the first laboratory, and 2 otherwise. The following m lines contain pairs of integers i, j (1 &le; i, j &le; n), denoting that the i-th stage has to be completed before the j-th.</p>

<p>You may assume that it is always possible to order the conservation stages so that all the dependencies are satisfied.</p>

### 출력

<p>Print the answers to the test cases in the order in which they appear in the input. For each test case, output a single line containing the minimal number of times the painting needs to be transported between the laboratories.</p>