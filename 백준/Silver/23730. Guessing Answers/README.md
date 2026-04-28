# [Silver V] Guessing Answers - 23730

[문제 링크](https://www.acmicpc.net/problem/23730)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 575, 정답: 217, 맞힌 사람: 161, 정답 비율: 37.882%

### 분류

구현, 해 구성하기

### 문제 설명

<p>Yunee did not study for the final exam. So Yunee decided to guess the answers to all problems in the final exam. The final exam consists of $N$ single choice questions numbered from $1$ to $N$, each with a choice of $1$ to $5$.</p>

<p>Yunee gets anxious when the answers to two successive problems are the same. So Yunee always selects an answer different from the answer to the previous problem (except for the first problem). After submitting the answers, Yunee received the grading result, which stated whether each answer was correct.</p>

<p>Given the correct answers to all problems and the $M$ problems that Yunee guessed correctly, reconstruct a possible sequence of Yunee&#39;s answers. It is guaranteed that at least one such sequence exists for each input.</p>

### 입력

<p>The first line contains two integers $N$ and $M$ $(1 \leq N \leq 100,000, 1\leq M \leq N)$. $N$ is the total number of problems. $M$ is the number of problems that Yunee guessed correctly.</p>

<p>The second line contains $N$ integers from $1$ to $5$. The $i$-th integer represents the correct answer to the $i$-th problem.</p>

<p>The third line contains $M$ distinct integers from $1$ to $N$. They represent the $M$ problems that Yunee guessed correctly.</p>

### 출력

<p>Output a possible sequence of Yunee&#39;s answers. Each number should be separated by a blank.</p>