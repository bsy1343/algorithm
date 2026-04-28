# [Gold II] Judge’s Mistake - 16109

[문제 링크](https://www.acmicpc.net/problem/16109)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 121, 정답: 28, 맞힌 사람: 23, 정답 비율: 23.232%

### 분류

그래프 이론, 그리디 알고리즘

### 문제 설명

<p>Setting problems for programming competitions takes a long time. Several months ago, the judges sent out a call for problems and Kevin replied with the problem in Figure J.1.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/f718304b-c0f2-4862-b319-15d710083313/-/preview/" style="width: 565px; height: 523px;" /></p>

<p style="text-align: center;">Figure J.1: The original problem that Kevin proposed.</p>

<p>This problem was going to be used at the Divisionals contest until we (the judges) messed up. While writing our solutions, one of us accidentally sorted the integers in the official input. We were able to determine the values of C and R, but we are unable to determine the order of the remaining 3R integers.</p>

<p>Rather than attempting to reconstruct the original data, we will ask a slightly different question. These 3R integers could correspond to many different road networks. Out of all possible road networks that the data could represent, what is the smallest output for the original problem? (That is, what is the cheapest maintenance plan over all possible road networks that may be represented?)</p>

### 입력

<p>The input starts with a line containing two integers C (2 &le; C &le; 100 000), which is the number of cities, and R (1 &le; R &le; 100 000), which is the number of roads.</p>

<p>The second line contains 3R integers, which are the u, v and w values from the original problem in Figure J.1. Each of these values is between 1 and 100 000 inclusive. These integers are in nondecreasing order.</p>

<p>It is guaranteed that the input corresponds to at least one possible road network that satisfies the constraints from the original problem.</p>

### 출력

<p>Display the cost of the cheapest maintenance plan over all possible road networks that may be represented.</p>