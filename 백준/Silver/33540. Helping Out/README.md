# [Silver V] Helping Out - 33540

[문제 링크](https://www.acmicpc.net/problem/33540)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 122, 정답: 111, 맞힌 사람: 90, 정답 비율: 93.750%

### 분류

자료 구조, 정렬, 집합과 맵, 트리를 사용한 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>For the last couple of years gaming competitions have been very popular at the TU Delft. During every competition, any player can obtain up to $100$ points. However, the administration of these competitions has been absolutely terrible, because the result of every competition was written down on a piece of paper and all these were scattered across the TU Delft. A group of students has managed to find (almost) all of these lists of scores, but they would like to compute the total score of each participant. Given a list of (possibly duplicate) names and their scores, help the students out by creating a list of the total score of each participant, sorted in <strong>alphabetic order</strong>.</p>

### 입력

<p>On the first line an integer $1 \leq n \leq 10^5$. On the next $n$ lines, the name (a string containing no spaces) of person $M$ followed by an integer $1 \leq k \leq 100$, the score of $M$ in any arbitrary competition.</p>

### 출력

<p>The output consists of $m$ lines, where $m$ is the number of unique names in the input. Give in alphabetic order the names of all participants and their total score, separated by a space.</p>